package Tema3;

public class Par_Impar {
    public static int Pares(int[] numeros) {
        int par = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]%2== 0) {
                par ++;
            }
        }
        return par;
    }
    public static int Impares (int[]numeros){
        int impares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]%2!=0) {
                impares ++;
            }
        }
        return impares;
    }
    public static void main(String[] args) {
        int[]numeros={1,2,6,-7,8,-6,5,-7,-9,6};
        System.out.println(Pares(numeros));
        System.out.println(Impares(numeros));

    }
}
