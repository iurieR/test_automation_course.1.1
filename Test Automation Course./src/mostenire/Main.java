package mostenire;

import com.sun.javafx.scene.control.skin.LabeledSkinBase;

public class Main {

    public static void main(String[] args) {
        Masina primaMasina = new Masina("roz", 4, "bmw");
        Vehicol primuVehicol = new Vehicol("verde", 4);
        Masina aDouaMasina = new Masina("gri", 4, "audi");
        primuVehicol.afiseazaDetaliiVehicul();
        primaMasina.afiseazaDetaliiVehicul();
        aDouaMasina.afiseazaDetaliiVehicul();


    }
}