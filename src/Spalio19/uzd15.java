package Spalio19;

import java.util.Scanner;

public class uzd15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arrSize = scan.nextInt();
        int[] numArr = new int[arrSize];
        for(int i = arrSize - 1; i >= 0; i--){
           if(i % 2 == 0) {
               numArr[i] = i;
           }
           else {numArr[i] = -i;}
            System.out.println(i + " " + numArr[i]);
        }
        for(int i = 0; i < arrSize; i++) {
            if(numArr[i] % 3 == 0) {
                numArr[i] *= 2;
            }
        }
        for(int i = arrSize - 1; i >= 0; i=i-2){
            System.out.println(numArr[i]);
            System.out.println(numArr[i-1]);
        }
    }
}
