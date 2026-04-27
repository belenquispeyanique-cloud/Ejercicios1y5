
package agregacioncomposicion1;

public class Biblioteca {
    private String nombre;
    private int cantLibros;
    private Libro[] libros;

    // Constructor
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.cantLibros = 0;
        this.libros = new Libro[100]; // capacidad fija
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantLibros() {
        return cantLibros;
    }

    // Agregar libro
    public void agregarLibro(Libro libro) {
        if (cantLibros < libros.length) {
            libros[cantLibros] = libro;
            cantLibros++;
        } else {
            System.out.println("No se pueden agregar más libros.");
        }
    }

    // Buscar libro por nombre
    public void buscarLibro(String nombre) {
        boolean encontrado = false;

        for (int i = 0; i < cantLibros; i++) {
            if (libros[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Libro encontrado en biblioteca: " + this.nombre);
                libros[i].mostrar();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El libro no se encuentra en la biblioteca: " + this.nombre);
        }
    }
}