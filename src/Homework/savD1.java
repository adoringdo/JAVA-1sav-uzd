package Homework;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class savD1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //bilieto numeriui naudoju string jei pirmas skaicius 0
        String lotNum;
        boolean ticket = false;

        //ciklas bilietu nr ivesti tol kol bilietas nelaimingas
        for(int tries = 1; !ticket; tries++) {
            lotNum = scan.nextLine();
            //ar skaiciai kartojasi
            boolean dublicates = false;
            //ar visi simboliai skaiciai
            boolean allNum = true;


            //jei bil. nr ne 6 simboliu griztam i ciklo pradzia
            if (lotNum.length() != 6) {
                System.out.println("Neteisingas loterijos numeris, iveskite dar karta");
                tries--; //atimame viena is bandymu, nes neteisingas bil. nr nera bandymas
                continue;
            }
            //jei bl. nr 6 simboliu tikriname ar visi simboliai skaiciai
            else {
                for (int i = 0; i < 6; i++) {
                    if (lotNum.charAt(i) < 48 || lotNum.charAt(i) > 57) {
                        allNum = false;
                        break;
                    }
                }
            }

            //jei bl. nr visi skaiciai tikriname ar bilietas laimingas
            if (allNum) {
                //tikriname ar skaiciai bl. nr kartojasi
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

                //skaiciuojame pirmu triju ir paskutiniu triju sk sumas
                int firstHalf = Character.getNumericValue(lotNum.charAt(0)) + Character.getNumericValue(lotNum.charAt(1))
                        + Character.getNumericValue(lotNum.charAt(2));
                int secondHalf = Character.getNumericValue(lotNum.charAt(3)) + Character.getNumericValue(lotNum.charAt(4))
                        + Character.getNumericValue(lotNum.charAt(5));

               //jei sumos sutampa ir nera pasikartojanciu sk bilietas laimingas ciklas baigiamas
                if (firstHalf == secondHalf && !dublicates) {
                    ticket = true;
                    System.out.println("Jusu bilietas numeriu " + lotNum + " yra laimingas!");
                    System.out.println("Bandymu: " + tries);
                }
                //jei bilietas nelaimingas griztame i ciklo pradzia
                else {
                    System.out.println("Bilietas nelaimingas! Bandykite dar karta");
                }
            }
            //jei bl. nr ne visi simboliai yra skaiciai griztame i ciklo pradzia
            else {
                System.out.println("Neteisingas loterijos numeris, iveskite dar karta");
                tries--;
                continue;
            }
        }
    }
}
