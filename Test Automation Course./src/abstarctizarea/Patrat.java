package abstarctizarea;

public abstract class Patrat extends FormaGeometrica {

    private int latura;

    public int getLatura() {
        return latura;
    }

    public void setLatura(int latura) {
        this.latura = latura;
    }

    public Patrat(int latura) {
        this.latura = latura;
    }

    @Override
    double calculArie() {
        return latura * latura;
    }
}
