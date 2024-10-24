package Tema3;

import java.util.Scanner;

public class DNI {
    public static void main(String[] args) {
        int DNI;
        Scanner sc=new Scanner(System.in);
        String [] resto={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        System.out.println("Dime els numeros del DNI i te direm la lletra");
        DNI= sc.nextInt();
        int operacio= DNI%23;
        switch (operacio){
            case 0:
                System.out.println(DNI+resto[0]);
                break;
            case 1:
                System.out.println(DNI+resto[1]);
                break;
            case 2:
                System.out.println(DNI+resto[2]);
                break;
            case 3:
                System.out.println(DNI+resto[3]);
                break;
            case 4:
                System.out.println(DNI+resto[4]);
                break;
            case 5:
                System.out.println(DNI+resto[5]);
                break;
            case 6:
                System.out.println(DNI+resto[6]);
                break;
            case 7:
                System.out.println(DNI+resto[7]);
                break;
            case 8:
                System.out.println(DNI+resto[8]);
                break;
            case 9:
                System.out.println(DNI+resto[9]);
                break;
            case 10:
                System.out.println(DNI+resto[10]);
                break;
            case 11:
                System.out.println(DNI+resto[11]);
                break;
            case 12:
                System.out.println(DNI+resto[12]);
                break;
            case 13:
                System.out.println(DNI+resto[13]);
                break;
            case 14:
                System.out.println(DNI+resto[14]);
                break;
            case 15:
                System.out.println(DNI+resto[15]);
                break;
            case 16:
                System.out.println(DNI+resto[16]);
                break;
            case 17:
                System.out.println(DNI+resto[17]);
                break;
            case 18:
                System.out.println(DNI+resto[18]);
                break;
            case 19:
                System.out.println(DNI+resto[19]);
                break;
            case 20:
                System.out.println(DNI+resto[20]);
                break;
            case 21:
                System.out.println(DNI+resto[21]);
                break;
            case 22:
                System.out.println(DNI+resto[22]);
                break;
        }
    }
}
