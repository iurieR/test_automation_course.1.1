package mostenire;

public class Vehicol {

    public String culoare;
    public Integer nrRoti;

    public Vehicol(String culoare, Integer nrRoti) {
        this.culoare = culoare;
        this.nrRoti = nrRoti;

    }

    public void afiseazaDetaliiVehicul() {
        System.out.println("culoare este:" + culoare);
        System.out.println("numarul de roti:" + nrRoti);
    }
}
