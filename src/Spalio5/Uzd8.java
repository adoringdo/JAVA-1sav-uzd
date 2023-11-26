package Spalio5;

public class Uzd8 {
    public static void main(String[] args) {
        int skaicius = 7;
        if(skaicius > 0) {
            if(skaicius < 13){
                if(skaicius % 2 == 0){
                    switch (skaicius) {
                        case 2:
                            System.out.println("VASARIS");
                            break;
                        case 4:
                            System.out.println("BALANDIS");
                            break;
                        case 6:
                            System.out.println("BIRZELIS");
                            break;
                        case 8:
                            System.out.println("RUGPJUTIS");
                            break;
                        case 10:
                            System.out.println("SPALIS");
                            break;
                        case 12:
                            System.out.println("GRUODIS");
                            break;
                    }
                }
                else {
                    switch (skaicius) {
                        case 1:
                            System.out.println("Sausis");
                            break;
                        case 3:
                            System.out.println("Kovas");
                            break;
                        case 5:
                            System.out.println("Geguze");
                            break;
                        case 7:
                            System.out.println("Liepa");
                            break;
                        case 9:
                            System.out.println("Rugsejis");
                            break;
                        case 11:
                            System.out.println("Lapkritis");
                            break;
                    }
                }
            }
            else {System.out.println("Netinkamas skaicius");}
        }
        else {
            System.out.println("Netinkamas skaicius");
        }
    }
}
