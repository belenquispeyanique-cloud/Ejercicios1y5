
package AgregacionComposicion2;

public class Perro extends Animal {
    private boolean requiereBozal;
    private boolean ladraFuerte;

    public Perro(String nombre, int edad, String duenio, boolean requiereBozal, boolean ladraFuerte) {
        super(nombre, edad, duenio);
        this.requiereBozal = requiereBozal;
        this.ladraFuerte = ladraFuerte;
    }

    public boolean isRequiereBozal() {
        return requiereBozal;
    }

    public boolean isLadraFuerte() {
        return ladraFuerte;
    }
}
