package topic5;

public class Cerc extends FiguraGeometrica {
    private int raza;

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }

    @Override
    double returneazaPerimetru() {
        return (2 * 3.14) * raza;
    }

    @Override
    double returneazaAria() {
        return raza * raza * 3.14;
    }
}
