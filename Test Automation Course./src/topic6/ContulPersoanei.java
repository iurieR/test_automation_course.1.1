package topic6;

public class ContulPersoanei {
    private String numePersoana;
    private String id;
    private double sumaCurenta;

    public ContulPersoanei(String numePersoana, String id, double sumaCurenta) {
        this.numePersoana = numePersoana;
        this.id = id;
        this.sumaCurenta = sumaCurenta;
    }

    public String getNumePersoana() {
        return numePersoana;
    }

    public void setNumePersoana(String numePersoana) {
        this.numePersoana = numePersoana;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSumaCurenta() {
        return sumaCurenta;
    }

    public void setSumaCurenta(double sumaCurenta) {
        this.sumaCurenta = sumaCurenta;
    }

    public void sustragereDeBani(double suma) {
        if (sumaCurenta > suma && suma > 0)
            this.sumaCurenta = sumaCurenta - suma;
        else {
            throw new IllegalArgumentException("suma introdusa este gresita");

        }

    }

    public void transferCatrePersoana(double suma, ContulPersoanei persoana) {
        try {
            if (suma > 0 && suma <= sumaCurenta) {
                this.sumaCurenta -= suma;
                persoana.sumaCurenta += suma;
            } else {
                throw new IllegalArgumentException("Suma solicitata e mai mare ca cea curenta");
            }
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Operatiunea a fost finalizata!");
        }
    }

}
