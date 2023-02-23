package abstarctizarea;

public class Triunghi extends FormaGeometrica {
    private double inaltime;
    private double baza;

    public double getInaltime() {
        return inaltime;
    }

    public void setInaltime(int inaltime) {
        this.inaltime = inaltime;
    }

    public double getBaza() {
        return baza;
    }

    public void setBaza(double baza) {
        this.baza = baza;
    }

    public Triunghi(double inaltime, double baza) {
        this.inaltime = inaltime;
        this.baza = baza;
    }

    @Override
    double calculArie() {
        return (inaltime * baza) / 2;
    }
}