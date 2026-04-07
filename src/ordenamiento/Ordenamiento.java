package ordenamiento;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Ordenamiento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Cuantos numeros desea generar: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100);
        }
        
        int arr2[] = Arrays.copyOf(arr, arr.length);

        System.out.println("Arreglo generado: " + Arrays.toString(arr));
        ordenar(arr);
        ordenarConSort(arr2);
        System.out.println("Arreglo ordenado con Arrays.sort: " + Arrays.toString(arr2));
    }

    private static void ordenar(int v[]) {
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[i] > v[j]) {
                    int temp = v[i];
                    v[i] = v[j];
                    v[j] = temp;
                }
            }
        }
    }
    private static void ordenarConSort(int v[]) {
        Arrays.sort(v);
    }
}