package Spalio5;

import java.util.Scanner;

public class Uzd7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if (year % 4 != 0) {
            System.out.println(year+" is a common year!");
        }
        else if (year % 100 != 0){
            System.out.println(year+" is a leap year!");
        }
        else if (year % 400 != 0) {
            System.out.println(year+" is a common year!");
        }
        else {
            System.out.println(year+" is a leap year!");
        }
    }
}
