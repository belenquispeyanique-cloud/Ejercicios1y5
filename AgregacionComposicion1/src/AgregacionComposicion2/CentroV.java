
package AgregacionComposicion2;
import java.util.Arrays;

public class CentroV {
    private String nombre;
    private int cantPerros;
    private int cantGatos;
    private Perro[] perros;
    private Gato[] gatos;

    public CentroV(String nombre) {
        this.nombre = nombre;
        perros = new Perro[100];
        gatos = new Gato[100];
        cantPerros = 0;
        cantGatos = 0;
    }

    public void agregarPerro(Perro p) {
        if (cantPerros < perros.length) {
            perros[cantPerros++] = p;
        }
    }

    public void agregarGato(Gato g) {
        if (cantGatos < gatos.length) {
            gatos[cantGatos++] = g;
        }
    }

    
    public void ordenarPerros() {
        Arrays.sort(perros, 0, cantPerros, (p1, p2) -> {
            if (p1.getEdad() != p2.getEdad()) {
                return p1.getEdad() - p2.getEdad(); // edad asc
            }
            int cmp = p1.getNombreDuenio().compareToIgnoreCase(p2.getNombreDuenio());
            if (cmp != 0) return cmp;
            return p1.getNombre().compareToIgnoreCase(p2.getNombre());
        });
    }

    
    public void ordenarGatos() {
        Arrays.sort(gatos, 0, cantGatos, (g1, g2) -> {
            if (g1.isTomaLeche() != g2.isTomaLeche()) {
                return g1.isTomaLeche() ? -1 : 1; 
            }
            if (g1.getEdad() != g2.getEdad()) {
                return g2.getEdad() - g1.getEdad(); 
            }
            return g1.getNombre().compareToIgnoreCase(g2.getNombre());
        });
    }

    
    public void contarAnimalesPorDuenio() {
        for (int i = 0; i < cantPerros; i++) {
            String duenio = perros[i].getNombreDuenio();
            int contador = 0;

            for (int j = 0; j < cantPerros; j++) {
                if (perros[j].getNombreDuenio().equalsIgnoreCase(duenio)) {
                    contador++;
                }
            }

            for (int j = 0; j < cantGatos; j++) {
                if (gatos[j].getNombreDuenio().equalsIgnoreCase(duenio)) {
                    contador++;
                }
            }

            if (contador > 1) {
                System.out.println("El dueño " + duenio + " tiene " + contador + " animales.");
            }
        }
    }

    public void mostrar() {
        System.out.println("Centro: " + nombre);
        System.out.println("Perros: " + cantPerros);
        System.out.println("Gatos: " + cantGatos);
    }
}
