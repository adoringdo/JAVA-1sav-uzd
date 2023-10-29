package Homework;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class savD1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String lotNum;
        boolean ticket = false;

        for(int tries = 1; !ticket; tries++) {
            lotNum = scan.nextLine();
            boolean dublicates = false;
            boolean allNum = true;

            if (lotNum.length() != 6) {
                System.out.println("Neteisingas loterijos numeris, iveskite dar karta");
                tries--;
                continue;
            } else {
                for (int i = 0; i < 6; i++) {
                    if (lotNum.charAt(i) < 48 || lotNum.charAt(i) > 57) {
                        allNum = false;
                        break;
                    }
                }
            }

            if (allNum) {
                for (int a = 0; !dublicates && a < 6; a++) {
                    char checkChar = lotNum.charAt(a);
                    for (int i = 0; i < 6; i++) {
                        if (a != i) {
                            if (checkChar == lotNum.charAt(i)) {
                                dublicates = true;
                            }
                        }
                    }
                }
                int firstHalf = Character.getNumericValue(lotNum.charAt(0)) + Character.getNumericValue(lotNum.charAt(1))
                        + Character.getNumericValue(lotNum.charAt(2));
                int secondHalf = Character.getNumericValue(lotNum.charAt(3)) + Character.getNumericValue(lotNum.charAt(4))
                        + Character.getNumericValue(lotNum.charAt(5));
                if (firstHalf == secondHalf && !dublicates) {
                    ticket = true;
                    System.out.println("Jusu bilietas numeriu " + lotNum + " yra laimingas!");
                    System.out.println("Bandymu: " + tries);
                } else {
                    System.out.println("Bilietas nelaimingas! Bandykite dar karta");
                }
            }
            else {
                System.out.println("Neteisingas loterijos numeris, iveskite dar karta");
                tries--;
                continue;
            }
        }
    }
}
