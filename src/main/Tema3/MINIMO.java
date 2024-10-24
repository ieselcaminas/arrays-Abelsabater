package Tema3;

import java.util.Scanner;

public class MINIMO {
    public static int Minimo(int num) {
        Scanner sc= new Scanner(System.in);
        int n;
        int min =1000000000;
        int [] numero= new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Dime un numero");
            n=sc.nextInt();
            numero[i]=n;
            if(numero[i]<min){
                min=numero[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        System.out.println("El mes petit es "+Minimo(10));
    }
}