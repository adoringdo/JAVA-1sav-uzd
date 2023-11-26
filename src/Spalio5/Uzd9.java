package Spalio5;

import java.util.Random;

public class Uzd9 {
    static Random random = new Random();
    public static void main(String[] args) {

        int a = random.nextInt(100)+1;
        int b = random.nextInt(100)+1;
        int c = random.nextInt(100)+1;
        int x;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        if (b > a) {
            x = b;
        }
        else if (c > b && c > a) {
            x = c;
        }
        else {
            x = a;
        }
        System.out.println(x);
    }
}
