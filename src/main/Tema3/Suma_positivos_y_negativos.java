package Tema3;

public class Suma_positivos_y_negativos {
    public static int SumaPositivos(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                suma += numeros[i];
            }
        }
        return suma;
    }
    public static int SumaNegativos(int[]numeros){
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                suma += numeros[i];
            }
        }
        return suma;
    }
    public static void main(String[] args) {
        int[]numeros={1,2,6,-7,8,-6,5,-7,-9,6};
        System.out.println(SumaPositivos(numeros));
        System.out.println(SumaNegativos(numeros));

    }
}