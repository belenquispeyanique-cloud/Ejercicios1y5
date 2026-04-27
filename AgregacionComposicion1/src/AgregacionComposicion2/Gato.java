
package AgregacionComposicion2;

public class Gato extends Animal {
    private boolean cazaRatones;
    private boolean tomaLeche;

    public Gato(String nombre, int edad, String duenio, boolean cazaRatones, boolean tomaLeche) {
        super(nombre, edad, duenio);
        this.cazaRatones = cazaRatones;
        this.tomaLeche = tomaLeche;
    }

    public boolean isTomaLeche() {
        return tomaLeche;
    }
}