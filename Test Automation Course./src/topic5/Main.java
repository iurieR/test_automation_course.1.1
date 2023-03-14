package topic5;

public class Main {
    public static void main(String[] args) {
        Cerc cerc1 = new Cerc();
        cerc1.setRaza(5);
        System.out.println("Aria cercului cu raza "+cerc1.getRaza()+" este :"+ cerc1.returneazaAria());
        Patrat patrat1 = new Patrat();
        patrat1.setLungimeLatura(7);
        System.out.println("aria patratului cu lungimea laturei"+patrat1.getLungimeLatura()+"este "+patrat1.returneazaAria());
        System.out.println("perimetrul patratului este "+patrat1.returneazaPerimetru());
        Romb romb1 = new Romb();
    }
}
