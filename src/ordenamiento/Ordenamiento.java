package ordenamiento;

import java.util.Scanner;
import java.util.Arrays;

public class Ordenamiento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números desea ingresar?: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor #" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        ordenar(arr);
        System.out.println("Arreglo ordenado: " + Arrays.toString(arr));
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
}