package Spalio12;

import java.util.Scanner;
import java.util.Random;

public class Uzd11 {
    static Random random = new Random();
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sk = scan.nextInt();
        if(sk > 7) {
            int num = random.nextInt(8)+1;
            int[] anArray = new int[num];
            anArray[0] = num;
            anArray[num-1] = num;
            System.out.println(anArray.length + "-" + anArray[0] + "-" + anArray[num-1]);
        }
        else {
            int[] anArray = new int[sk];
            anArray[0] = sk;
            anArray[sk-1] = sk;
            System.out.println(anArray.length + "-" + anArray[0] + "-" + anArray[sk-1]);
        }
    }
}
