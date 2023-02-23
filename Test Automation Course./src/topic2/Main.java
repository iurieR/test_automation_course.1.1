package topic2;

public class Main {
    public static void main(String[] args) {
        Persoana Vlad = new Persoana();
        Vlad.gen = 'M';
        Vlad.greutate = 80.1d;
        Vlad.virsta = 25;
        System.out.println("sexul lui Vlad este " + Vlad.gen + ", greutate este " + Vlad.greutate);
        System.out.println("Vlad are : " + Vlad.virsta + "ani");
    }
}
