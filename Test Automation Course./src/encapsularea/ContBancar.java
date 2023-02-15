package encapsularea;

public class ContBancar {


    private Long numarCont;
    private Double sold;

    public ContBancar(Long numarCont,Double sold) {
        this.numarCont = numarCont;
        this.sold = sold;
    }

    public Long getNumarCont() {
        return numarCont;
    }

    public Double getSold() {
        return sold;
    }

    public void setNumarCont(Long numarCont) {
        this.numarCont = numarCont;
    }

    public void setSold(Double sold) {
        this.sold = sold;
    }

    @Override
    public String toString() {
        return "ContBancar{" +
                "numarCont=" + numarCont +
                ", sold=" + sold +
                '}';
    }
}
