package encapsularea;

public class Main {
    public static void main(String[] args) {
        ContBancar iurie=new ContBancar(345655L,200.3);
        System.out.println(iurie);
        iurie.getNumarCont();
        iurie.setSold(250.8);
        System.out.println(iurie);

    }

}
