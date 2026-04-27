
package AgregacionComposicion2;

public class PrincipalV {
    public static void main(String[] args) {

        CentroV c1 = new CentroV("Vet Norte");
        CentroV c2 = new CentroV("Vet Sur");

        // Centro 1
        c1.agregarPerro(new Perro("Firulais", 5, "Juan", true, true));
        c1.agregarPerro(new Perro("Max", 3, "Ana", false, false));

        c1.agregarGato(new Gato("Michi", 2, "Juan", true, true));
        c1.agregarGato(new Gato("Luna", 4, "Pedro", false, false));

        // Centro 2
        c2.agregarPerro(new Perro("Rocky", 6, "Luis", true, true));
        c2.agregarPerro(new Perro("Toby", 2, "Luis", false, true));

        c2.agregarGato(new Gato("Nina", 1, "Carlos", true, true));
        c2.agregarGato(new Gato("Simba", 5, "Carlos", false, false));

        // Ordenamientos
        c1.ordenarPerros();
        c1.ordenarGatos();

        // Verificación
        c1.contarAnimalesPorDuenio();
        c2.contarAnimalesPorDuenio();

        // Mostrar
        c1.mostrar();
        c2.mostrar();
    }
}
