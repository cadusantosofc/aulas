package br.com.etec.biblioteca.model;

public class ClasseDados {
	
	String tituloAt;
	String autorAt;
	int paginasAt;
	
	public ClasseDados (String title, String author, int pages) {
		this.tituloAt = title;
		this.autorAt = author;
		this.paginasAt = pages;
	}
	
	// Getters (Pegar)
	public String getTitulo() {
		return tituloAt;
	}
	
	public String getAutor() {
		return autorAt;
	}
	
	public int getPaginas() {
		return paginasAt;
	}
	
	// Setters (Alterar)
		public void setTitulo(String titulo) {
			this.tituloAt = titulo;
		}
		
		public void setAutor(String author) {
			this.autorAt = author;
		}
		
		public void setPaginas(int pages) {
			this.paginasAt = pages;
		}

}
