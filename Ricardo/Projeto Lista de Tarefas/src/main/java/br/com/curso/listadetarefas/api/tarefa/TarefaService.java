package br.com.curso.listadetarefas.api.tarefa;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional; // Importe esta classe

@Service // Spring: Marca como um componente de serviço
public class TarefaService {

    private final TarefaRepository tarefaRepository;

    // Injeção de dependência via construtor (prática recomendada)
    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    public List<Tarefa> listarTodas() {
        return tarefaRepository.findAll();
    }

    // ... (dentro da classe TarefaService)

    // ... (método listarTodas existente)

    public Tarefa criarTarefa(Tarefa tarefa) {
        // Aqui poderíamos adicionar regras de negócio,
        // como validações, antes de salvar.
        return tarefaRepository.save(tarefa);
    }

     public Optional<Tarefa> atualizarTarefa(Long id, Tarefa tarefaAtualizada) {
        // Busca a tarefa pelo ID para garantir que ela existe
        return tarefaRepository.findById(id)
            .map(tarefaExistente -> {
                tarefaExistente.setTitulo(tarefaAtualizada.getTitulo());
                tarefaExistente.setDescricao(tarefaAtualizada.getDescricao());
                tarefaExistente.setConcluida(tarefaAtualizada.isConcluida());
                return tarefaRepository.save(tarefaExistente);
            });
    }

    // ... (dentro da classe TarefaService)

    public boolean deletarTarefa(Long id) {
        if (tarefaRepository.existsById(id)) {
            tarefaRepository.deleteById(id);
            return true; // Deletado com sucesso
        }
        return false; // Tarefa não encontrada
    }

    public Tarefa salvar(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    public Optional<Tarefa> findById(Long id) {
        return tarefaRepository.findById(id);
    }

    public Optional<Tarefa> atualizarStatusTarefa(Long id) {
        return tarefaRepository.findById(id)
            .map(tarefa -> {
                tarefa.setConcluida(!tarefa.isConcluida());
                return tarefaRepository.save(tarefa);
            });
    }
}