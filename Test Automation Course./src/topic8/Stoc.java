package topic8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stoc {
    private int stocId;
    private String adresaMagazin;
    private List<Carte> cartileDinStoc;

    public Stoc(int stocId, String adresaMagazin, List<Carte> cartileDinStoc) {
        this.stocId = stocId;
        this.adresaMagazin = adresaMagazin;
        this.cartileDinStoc = cartileDinStoc;
    }

    public List<Carte> getCartileDinStoc() {
        return cartileDinStoc;
    }

    public void adaugareCarteInStoc(Carte carte) {
        cartileDinStoc.add(carte);

    }

    public void stergeCarteaDinStoc(Carte carte) {
        cartileDinStoc.remove(carte);

    }

    public boolean existaCarteInStoc(Carte carte) {
        return cartileDinStoc.contains(carte);

    }

    public int numarulDeCartiInStoc() {
        return cartileDinStoc.size();

    }

    public boolean esteStoculGol() {
        return cartileDinStoc.isEmpty();

    }


}
