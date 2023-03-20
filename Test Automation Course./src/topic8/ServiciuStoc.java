package topic8;

import java.util.ArrayList;
import java.util.List;

public class ServiciuStoc {
    public static void main(String[] args) {
        Carte Nr1 = new Carte("Titlu1", "Autor1", 1, 100);
        Carte Nr2 = new Carte("Titlu2", "Autor2", 2, 200);
        Carte Nr3 = new Carte("Titlu3", "Autor3", 3, 300);
        Carte Nr4 = new Carte("Titlu4", "Autor4", 4, 400);
        Carte Nr5 = new Carte("Titlu5", "Autor4", 5, 500);

        List<Carte> stoc1Carti = new ArrayList<>();
        stoc1Carti.add(Nr1);
        stoc1Carti.add(Nr3);
        stoc1Carti.add(Nr2);
        List<Carte> stoc2Carti = new ArrayList<>();
        stoc2Carti.add(Nr4);
        stoc2Carti.add(Nr5);

        List<Stoc> stocList = new ArrayList<>();

        Stoc telecentru = new Stoc(1, "Miorita 1", stoc1Carti);
        telecentru.adaugareCarteInStoc(Nr4);
        Stoc centru = new Stoc(2, "Puskin 1", stoc2Carti);

        stocList.add(telecentru);
        stocList.add(centru);


        System.out.println("la magazinul de la telecentru sunt :" + telecentru.numarulDeCartiInStoc() + " carti");
        System.out.println("stocul est gol?" + telecentru.esteStoculGol());
        System.out.println("la magazinul din centru sunt :" + centru.numarulDeCartiInStoc() + " carti");


    }
}
