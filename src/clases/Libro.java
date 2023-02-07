package clases;

import java.util.ArrayList;

public class Libro {
	private String titulo;
	private long isbn;
	private int anoPublicacion;
	
	private ArrayList <Pagina> paginas = new ArrayList <Pagina>();
	
	public Libro(String titulo, long isbn, int anoPublicacion) {
		super();
		this.titulo = titulo;
		this.isbn = isbn;
		this.anoPublicacion = anoPublicacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public int getAnoPublicacion() {
		return anoPublicacion;
	}

	public void setAnoPublicacion(int anoPublicacion) {
		this.anoPublicacion = anoPublicacion;
	}

	

	public void addPaginas(String contenido,int numero) {
		Pagina pagina = new Pagina(contenido,numero);
		paginas.add(pagina);
		
	}
	
	private class Pagina{
		private String contenido;
		private int numero;
		
		
		Pagina(String contenido, int numero) {
			this.contenido = contenido;
			this.numero = numero;
		}

		
	}
	
	
	

}
