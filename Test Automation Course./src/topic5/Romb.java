package topic5;

public class Romb extends FiguraGeometrica {
    private int diagonala1;
    private int diagonala2;

    public int getDiagonala1() {
        return diagonala1;
    }

    public void setDiagonala1(int diagonala1) {
        this.diagonala1 = diagonala1;
    }

    public int getDiagonala2() {
        return diagonala2;
    }

    public void setDiagonala2(int diagonala2) {
        this.diagonala2 = diagonala2;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    double returneazaAria() {
        return (diagonala1 * diagonala2) / 2;
    }

    @Override
    double returneazaPerimetru() {
        return 0;
    }
}
