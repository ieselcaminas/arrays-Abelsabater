package Tema3;

import java.util.Arrays;
import java.util.Scanner;

public class MEDIA_ARRAY {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double [] notes;
        double nota;
        notes=new double [10];
        double notatotal = 0;
        for (int i = 0; i < notes.length; i++) {
            System.out.println("Dime una nota");
            nota= sc.nextDouble();
            notes[i]=nota;
            notatotal+=nota;
        }
        System.out.println("Les notes son: "+ Arrays.toString(notes));
        System.out.println("La mitjana es "+(notatotal/10));
    }
}