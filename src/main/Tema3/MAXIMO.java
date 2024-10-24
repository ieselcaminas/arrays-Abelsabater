package Tema3;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.*;

public class MAXIMO {

    public static int Maximo(int num) {
        Scanner sc= new Scanner(System.in);
        int n;
        int max =0;
        int [] numero= new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Dime un numero");
            n=sc.nextInt();
            numero[i]=n;
            if(numero[i]>max){
                max=numero[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("El mes gran es "+Maximo(10));
    }
}