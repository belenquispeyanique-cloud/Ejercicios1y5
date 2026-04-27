
package AgregacionComposicion2;

public class Animal {
    protected String nombre;
    protected int edad;
    protected String nombreDuenio;

    public Animal(String nombre, int edad, String nombreDuenio) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreDuenio = nombreDuenio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }
    
    @Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", edad=" + edad + ", nombreDuenio=" + nombreDuenio + "]";
	}

	public void mostrar() {
    	System.out.println(toString());
    }
}
