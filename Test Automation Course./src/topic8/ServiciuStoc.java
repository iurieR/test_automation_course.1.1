package topic8;

public class ServiciuStoc {
    public static void main(String[] args) {
        Carte Nr1 = new Carte("Titlu1", "Autor1", 1, 100);
        Carte Nr2 = new Carte("Titlu2", "Autor2", 2, 200);
        Carte Nr3 = new Carte("Titlu3", "Autor3", 3, 300);
        Carte Nr4 = new Carte("Titlu4", "Autor4", 4, 400);
        Carte Nr5 = new Carte("Titlu5", "Autor5", 5, 500);

        Stoc telecentru = new Stoc(1, "Miorita 1");
        telecentru.adaugareCarteInStoc(Nr1);
        telecentru.adaugareCarteInStoc(Nr2);
        telecentru.adaugareCarteInStoc(Nr3);
        System.out.println("la magazinul de la telecentru sunt :" + telecentru.numarulDeCartiInStoc());
        telecentru.stergeCarteaDinStoc(Nr2);
        System.out.println("stocul est gol?" + telecentru.esteStoculGol());
        System.out.println("este care nr4 in stoc " + telecentru.existaCarteInStoc(Nr3));

    }
}
