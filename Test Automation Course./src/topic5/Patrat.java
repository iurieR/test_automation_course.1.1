package topic5;

public class Patrat extends FiguraGeometrica {
    private int lungimeLatura;

    public int getLungimeLatura() {
        return lungimeLatura;
    }

    public void setLungimeLatura(int lungimeLatura) {
        this.lungimeLatura = lungimeLatura;
    }

    @Override
    double returneazaAria() {
        return lungimeLatura * lungimeLatura;
    }

    @Override
    double returneazaPerimetru() {
        return 4 * lungimeLatura;
    }
}
