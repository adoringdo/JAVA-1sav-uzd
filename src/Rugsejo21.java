import java.util.Scanner;

public class Rugsejo21 {
    public static void main(String[] args) {
        // int a = 4;
        // int b = 7;
//        float a = 4;
//        float b = 7;
//        float rez;
//        a++;
//        b--;
//        rez = a * b / 5;
//        System.out.println(rez);

//        String miestas = "Kaunas";
//        char a = miestas.charAt(2);
//        int num = miestas.length();
//        System.out.println(a);
//        System.out.println(num);

//        String s = "Mano vardas Adriana";
//        System.out.println(s.substring(12));
//        System.out.println(s.substring(0,4));

//        String a = "Dramblys";
//        String b = a.substring(2,4);
//        System.out.println(a.replace('a','c'));
//        System.out.println(a.charAt(2));
//        System.out.println(a.indexOf('b'));
//        System.out.println(a.toLowerCase());
//        System.out.println(a.toUpperCase());
//        System.out.println("zuvis".compareTo("akmuo"));
//        System.out.println(" zuvis ".trim());

//        String word = "Namas";
//        System.out.println("__________________________");
//        word = word.replace("s","i");
//        System.out.println(word);
//        word = word.toUpperCase();
//        System.out.println(word);
//        word = word.substring(2,4);
//        System.out.println(word);
//        word += word.toLowerCase();
//        System.out.println(word);
//        word = word.replace("m","n");
//        System.out.println(word);
//        word = Integer.toString(word.indexOf("n"));
//        System.out.println(word);
//        System.out.println("__________________________");

//        String a = "Java Uzduotys!";
//        System.out.println("Tikrasis String = " + a);
//        System.out.println("The character at position " + a.indexOf('J') + " is " + a.charAt(0));
//        System.out.println("The character at position " + a.indexOf('t') + " is " + a.charAt(10));

//        String string1 = "PHP Exercises and";
//        String string2 = "Python Exercises";
//        String string3 = string1 + " " + string2;
//        System.out.println(string3);

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
        System.out.println((a+b)/2);
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("Iveskite keturzenkli skaiciu:");
        int keturSk = scan.nextInt();
        System.out.println(keturSk/1000);
    }
}
