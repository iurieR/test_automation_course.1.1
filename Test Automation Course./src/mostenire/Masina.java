package mostenire;

import mostenire.Vehicol;

public class Masina extends Vehicol {

     private String marca;
    public Masina(String culoare, Integer nrRoti, String marca) {
        super(culoare, nrRoti);
        this.marca = marca;

    }

    @Override
    public void afiseazaDetaliiVehicul() {
        super.afiseazaDetaliiVehicul();
        System.out.println("marca este " + marca);
    }

    public String getMarca() {
        return marca;
    }
}

