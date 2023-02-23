package abstarctizarea;

public class Main {
    public static void main(String[] args) {

        FormaGeometrica patrat1 = new Patrat(5) {
        };
   patrat1.calculArie();
        System.out.println("aria patratului este "+ patrat1.calculArie());
      FormaGeometrica triunghi1= new Triunghi(5,9);
      triunghi1.calculArie();
        System.out.println("aria triunghiului este "+ triunghi1.calculArie());
}

}



