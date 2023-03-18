package topic8;

public class Carte {
    String autor;
    String titlu;
    int numarSerie;
    int pagini;

    public Carte(String autor, String titlu, int numarSerie, int pagini) {
        this.autor = autor;
        this.titlu = titlu;
        this.numarSerie = numarSerie;
        this.pagini = pagini;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitlu() {
        return titlu;
    }

    public int getNumarSerie() {
        return numarSerie;
    }

    public int getPagini() {
        return pagini;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
