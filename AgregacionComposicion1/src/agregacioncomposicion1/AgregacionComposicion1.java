
package agregacioncomposicion1;

public class AgregacionComposicion1 {
    public static void main(String[] args) {

        // Crear bibliotecas
        Biblioteca b1 = new Biblioteca("Biblioteca Central");
        Biblioteca b2 = new Biblioteca("Biblioteca Norte");

        // Crear libros
        Libro l1 = new Libro("Java Básico", "Juan Pérez", 2020);
        Libro l2 = new Libro("Estructuras de Datos", "Ana Gómez", 2018);
        Libro l3 = new Libro("Programación Avanzada", "Luis Díaz", 2022);
        Libro l4 = new Libro("Bases de Datos", "María López", 2019);

        // Agregar libros a bibliotecas
        b1.agregarLibro(l1);
        b1.agregarLibro(l2);

        b2.agregarLibro(l3);
        b2.agregarLibro(l4);

        // Buscar libro
        b1.buscarLibro("Java Básico");
        b2.buscarLibro("Java Básico");

        // Comparar bibliotecas
        if (b1.getCantLibros() > b2.getCantLibros()) {
            System.out.println("La biblioteca con más libros es: " + b1.getNombre());
        } else if (b2.getCantLibros() > b1.getCantLibros()) {
            System.out.println("La biblioteca con más libros es: " + b2.getNombre());
        } else {
            System.out.println("Ambas bibliotecas tienen la misma cantidad de libros:");
            System.out.println(b1.getNombre());
            System.out.println(b2.getNombre());
        }
    }
}