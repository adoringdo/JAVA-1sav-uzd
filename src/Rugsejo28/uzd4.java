package Rugsejo28;

public class uzd4 {
    public static void main(String[] args) {
        String word = "Namas";
        System.out.println("__________________________");
        word = word.replace("s","i");
        System.out.println(word);
        word = word.toUpperCase();
        System.out.println(word);
        word = word.substring(2,4);
        System.out.println(word);
        word += word.toLowerCase();
        System.out.println(word);
        word = word.replace("m","n");
        System.out.println(word);
        word = Integer.toString(word.indexOf("n"));
        System.out.println(word);
        System.out.println("__________________________");
    }
}
