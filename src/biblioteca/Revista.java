package biblioteca;

public class Revista extends Publicacion{
	private int numero;
	
	public Revista(int codigo, String titulo, int anioPublicacion, int numero) {
		super(codigo, titulo, anioPublicacion);
		this.numero=numero;
		System.out.println("Constructor Revista ejecutado");
	}

	@Override
	public String toString() {
		return "Revista [numero=" + numero + "]";
	}
	
	
}
