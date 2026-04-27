
package agregacioncomposicion1;

public class Libro {
    private String nombre;
    private String autor;
    private int anio;

    // Constructor
    public Libro(String nombre, String autor, int anio) {
        this.nombre = nombre;
        this.autor = autor;
        this.anio = anio;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnio() {
        return anio;
    }

	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + ", autor=" + autor + ", anio=" + anio + "]";
	}
    public void mostrar() {
    	System.out.println(toString());
    }

}