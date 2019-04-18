package biblioteca;

public class Libro extends Publicacion implements Prestable{
	private boolean prestado;
	
	public Libro(int codigo, String titulo, int anioPublicacion){
		super(codigo, titulo, anioPublicacion);
		prestado=false;
		System.out.println("Constructor Libro ejecutado");
	}

	@Override
	public String toString() {
		return "Libro [prestado=" + prestado + "]";
	}

	@Override
	public void prestar() {
		prestado=true;
	}

	@Override
	public void devolver() {
		prestado=false;
	}

	@Override
	public boolean prestado() {
		return prestado;
	}
	
	
	
}
