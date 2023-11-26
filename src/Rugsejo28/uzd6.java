package Rugsejo28;

import java.util.Scanner;

public class uzd6 {
    public static void main(String[] args) {
        System.out.println("Pirmoji programa!");
        System.out.println("Mokausi programuoti " + "\"Java\"");
        Scanner scan = new Scanner(System.in);
        System.out.println("Iveskite skaiciu:");
        int sk = scan.nextInt();
        System.out.println("Jus ivedete skaiciu " + sk);
        System.out.println("Iveskite skaiciu a:");
        int a = scan.nextInt();
        System.out.println("Iveskite skaiciu b :");
        int b = scan.nextInt();
        System.out.println(a+b);
        System.out.println(((float)a+b)/2);
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("Iveskite keturzenkli skaiciu:");
        int number = scan.nextInt();
        while (number > 0) {
            System.out.println( number % 10);
            number = number / 10;
        }
    }
}
