package topic3;

import com.sun.deploy.security.SelectableSecurityManager;

public class Operations {

    static void printAritmeticOperations() {
        int a = 4, b = 15;
        System.out.println("volorile initiale  a = 4 , b = 15 ");
        System.out.println("suma a si b este = " + (a + b));
        System.out.println("citul a si b este = " + (a * b));
        System.out.println("restul intre a si b este =" + (a / b));
        System.out.println("diferenta este =" + (a - b));
        System.out.println("restul impartirii este = " + (b % a));
        System.out.println("incrementul lui a este = " + (++a));
        System.out.println("decrementul lui b este = " + (--b));
    }

    static void printLogicOperations() {
        boolean a = true;
        boolean b = false;
        boolean c = false;
        System.out.println("volorile initiale sunt a = true , b = false , c = false");
        System.out.println("a&&b =" + (a && b));
        System.out.println("b||c = " + (b || c));
        System.out.println("!(a&&b) = " + !(a && b));
    }

    static void printRelationarOperations() {
        int a = 23, b = 23;
        System.out.println("volorile initiale  a = 23 , b = 23 ");
        System.out.println("numerle sunt egale?" + (a == b));
        System.out.println("numerele sunt diferite ? " + (a != b));
        System.out.println("este a mai mare ca b ?" + (a > b));
        System.out.println("este a mai mic sau egal cu b ? " + (a <= b));

    }

    static void useForAndWhile() {
        int a = 10;
        System.out.println("A are valoare initiala 10");
        if (a < 11) {
            System.out.println("10 este mai mic ca 11 - TRUE");
        } else {
            System.out.print("FALSE");
        }

        while (a < 12) {
            System.out.println("value of a=" + a);
            a++;
            System.out.println("rezultat acceptat");

        }
        for (int b = 6; b < 10; b++) {
            System.out.println("am terminat exercitiu");
        }
    }
}



