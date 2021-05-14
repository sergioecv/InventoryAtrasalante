
public class obLibro {
	private String titulo;
	private String categoria;
	private String autor;
	private int cantidad;
	
	public obLibro(String titulo, String categoria, String autor){
		this.titulo = titulo;
		this.categoria = categoria;
		this.autor = autor;
	}
    
	public obLibro(int cantidad) {
		cantidad = this.cantidad;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public  void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
	
	
}
