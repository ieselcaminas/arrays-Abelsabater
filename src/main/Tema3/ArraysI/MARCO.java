package Tema3.ArraysI;

import java.util.Scanner;

public class MARCO {
    public static int caracteresmaximo(String[] cadena) {
        int ncaractermaximo=0;
        for (int i = 0; i < cadena.length; i++) {
            if(cadena[i].length()>ncaractermaximo){
                ncaractermaximo=cadena[i].length();
            }
        }
        return ncaractermaximo;
    }
    public static String Marco1(int caracteres){
        String marco1="****";
        for (int i = 0; i < caracteres; i++) {
            marco1+="*";
        }
        return marco1;
    }

    public static String Marco2(String cadena, int marco1){
            String marco2="* "+cadena;
            for (int j = cadena.length(); j < marco1+1; j++) {
                marco2=marco2+" ";
            }
             return marco2+"*";
        }
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        String[] cadena= new String[5];
        for (int i = 0; i < cadena.length; i++) {
            System.out.println("Dime una palabra");
            cadena[i]= sc.next();
        }
        int maxim= caracteresmaximo(cadena);
        System.out.println(Marco1(maxim));
        for (int i = 0; i < cadena.length; i++) {
            System.out.println(Marco2(cadena[i],maxim));
        }
        System.out.println(Marco1(maxim));
    }
}
