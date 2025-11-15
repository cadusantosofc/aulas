-- Zera tabela (útil para reiniciar dados em ambiente de desenvolvimento)
DELETE FROM TB_TAREFAS;

-- Tarefas de exemplo com descrições mais completas para testes
INSERT INTO TB_TAREFAS (TITULO, DESCRICAO, CONCLUIDA) VALUES 
('Configurar o Backend', 'Criar a entidade Tarefa, o repositório, e testes unitários básicos. Incluir configuração de datasource para ambiente de desenvolvimento.', true),
('Criar a API REST', 'Desenvolver endpoints REST para listar, obter por id, criar, atualizar e remover tarefas. Validar payloads e retornar códigos HTTP apropriados.', false),
('Implementar paginação', 'Adicionar paginação e ordenação no endpoint de listagem para suportar grande volume de tarefas.', false),
('Adicionar autenticação', 'Integrar autenticação JWT e proteger endpoints de criação/edição/exclusão.', false),
('Documentar API', 'Gerar documentação OpenAPI/Swagger com exemplos de request/response e autenticação.', false),
('Criar testes de integração', 'Configurar testes de integração que inicializam o contexto e validam rotas principais.', false),
('Corrigir bug na atualização', 'Resolver problema que causa atualização parcial de campos nulos e garantir audit logs.', true),
('Refatorar camada de serviço', 'Extrair lógica complexa para classes de domínio e adicionar coverage de testes unitários.', false),
('Criar script de seed avançado', 'Gerar dados de exemplo com prioridades, prazos e tags (se a tabela suportar) para testes manuais.', false),
('Limpar tarefas antigas', 'Implementar rotina para arquivar ou remover tarefas concluídas há mais de 90 dias.', true);