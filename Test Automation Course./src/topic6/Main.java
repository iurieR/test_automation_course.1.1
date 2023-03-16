package topic6;

public class Main {
    public static void main(String[] args) {
        ContulPersoanei contul1 = new ContulPersoanei("Arina", "123www", 5550d);
        ContulPersoanei contul2 = new ContulPersoanei("Vlad", "33www", 4000d);

        contul1.sustragereDeBani(-100);
        System.out.println(contul1.getSumaCurenta());
        contul1.transferCatrePersoana(110, contul2);
        System.out.println(contul2.getSumaCurenta());
    }

}
