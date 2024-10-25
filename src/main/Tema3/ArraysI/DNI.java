package Tema3.ArraysI;

import java.util.Scanner;



public class DNI {

    public static String LletraDNI(int DNI){
        String [] Lletra={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        int res=DNI%23;
        return Lletra[res];
    }

    public static void main(String[] args) {
        int DNI;
        Scanner sc=new Scanner(System.in);

        System.out.println("Dime els numeros del DNI i te direm la lletra");
        DNI= sc.nextInt();
        System.out.println(DNI+LletraDNI(DNI));
    }
}
