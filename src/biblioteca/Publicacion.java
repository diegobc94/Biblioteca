package biblioteca;

public class Publicacion {
	private int codigo;
	private String titulo;
	private int anioPublicacion;
	
	public Publicacion(int codigo, String titulo, int anioPublicacion) {
		this.codigo=codigo;
		this.titulo=titulo;
		this.anioPublicacion=anioPublicacion;
		System.out.println("Constructor Publicacion ejecutado");
	}
	
	public static void main(String[] args) {
		Libro libro = new Libro(1, "Cronicas", 1995);
		System.out.println(libro.toString());
		libro.prestar();
		System.out.println(libro.toString());
		libro.devolver();
		System.out.println(libro.toString());
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	@Override
	public String toString() {
		return "Publicacion [codigo=" + codigo + ", titulo=" + titulo + ", anioPublicacion=" + anioPublicacion + "]";
	}
	
	
}
