package Spalio19;

import java.util.Scanner;

public class uzd13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numArr = new int[10];
        for(int i = 0; i < 10; i++) {
            numArr[i] = scan.nextInt();
        }
        int min = numArr[0];
        int max = numArr[0];
        for(int i = 1; i <10; i++) {
            if(numArr[i] < min ) {
                min = numArr[i];
            }
            if(numArr[i] > max ) {
                max = numArr[i];
            }
        }
        System.out.println("Maziausias:" + min);
        System.out.println("Didziausias:" + max);
    }
}
