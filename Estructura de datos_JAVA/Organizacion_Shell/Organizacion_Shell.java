/**
 * Práctica 10: Método de Shell
 * @author Leo
 */
public class Organizacion_Shell {

    public static void main(String[] args) {
        // 1. Arreglo de tamaño fijo (10 espacios)
        String[] nombres = {
            "Leonardo", "beatriz", "Carlos", "ana", "Zacarías", 
            "martha", "Ximena", "Diego", "esteban", "Bernardo"
        };

        // 2. Mostrar original
        System.out.println("--- Práctica 10: Ordenamiento Shell ---");
        System.out.println("\n[Arreglo Original]:");
        imprimirArreglo(nombres);

        // 3. Ejecutar Shell Sort
        shellSort(nombres);

        // 4. Mostrar resultado
        System.out.println("\n[Arreglo Ordenado Alfabeticamente (A-Z)]:");
        imprimirArreglo(nombres);
        System.out.println("\n----------------------------------------");
    }

    public static void shellSort(String[] arreglo) {
        int n = arreglo.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                String temp = arreglo[i];
                int j;
                // Compara ignorando mayúsculas/minúsculas para un orden natural
                for (j = i; j >= gap && arreglo[j - gap].compareToIgnoreCase(temp) > 0; j -= gap) {
                    arreglo[j] = arreglo[j - gap];
                }
                arreglo[j] = temp;
            }
        }
    }

    public static void imprimirArreglo(String[] arreglo) {
        System.out.print("[ ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + (i < arreglo.length - 1 ? ", " : ""));
        }
        System.out.println(" ]");
    }
}