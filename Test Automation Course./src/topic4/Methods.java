package topic4;

public class Methods {

    public static int sum(int a, int b) {
        int sum = 0;

        if (a > b) {
            System.out.println("Numerele sunt introduse în ordinea greșită");
            return sum = 0;
        }
        if (a == b) {
            System.out.println("numerele introduse sunt egale: " + b);
            return sum = b;
        }

        for (int i = a + 1; i < b; i++)
            sum += i;
        System.out.println(sum);
        return sum;


    }

    public static void sum(int a) {
        if (a < 0) {
            System.out.println("numarul :" + a + "introdus este negativ");
        }
        int sum = 0;
        int i = 0;
        while (i <= a) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}












