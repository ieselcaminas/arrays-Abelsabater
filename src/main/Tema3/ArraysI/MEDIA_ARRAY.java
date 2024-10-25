package Tema3.ArraysI;

import java.util.Scanner;

public class MEDIA_ARRAY {
    public static double Mitjana(int as){
        double suma = 0;
        double [] notes = new double[as];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < as; i++) {
            System.out.println("Dime una nota");
            notes[i]= sc.nextDouble();
            suma+=notes[i];
        }
        return suma/as;
    }

    public static void main(String[] args) {
        System.out.println("La mitjana es "+Mitjana(10));
    }
}