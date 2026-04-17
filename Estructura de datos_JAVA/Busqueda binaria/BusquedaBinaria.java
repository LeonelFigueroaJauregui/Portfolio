
/**
 *
 * @author Leonel
 */
import java.util.Scanner;


public class BusquedaBinaria {

    public static void main(String[] args) {
        // 1. Arreglo de datos alfanumericos ORDENADO 
        String[] datos = {"A10", "B22", "C35", "D40", "E55", "F60", "G71", "H88", "I90", "J99"};
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- Buscador Binario de Registros ---");
        System.out.print("Arreglo actual: ");
        imprimirArreglo(datos);
        
        // 2. Solicitar y validar la entrada del usuario
        System.out.print("\nIngrese el valor alfanumerico a buscar: ");
        String valorBuscado = sc.nextLine().trim();
        
        if (valorBuscado.isEmpty()) {
            System.out.println("Error: No se ingreso un valor válido.");
        } else {
            // 3. Ejecución del algoritmo
            int resultado = ejecutarBusquedaBinaria(datos, valorBuscado);
            
            // 4. Mostrar resultados
            if (resultado != -1) {
                System.out.println("\n ¡Exito! El valor '" + valorBuscado + "' fue encontrado.");
                System.out.println(" Posicion en el arreglo (indice): " + resultado);
            } else {
                System.out.println("\n El valor '" + valorBuscado + "' no existe en el registro.");
            }
        }
        
        sc.close();
    }

    /**
     * Algoritmo de Búsqueda Binaria para Strings.
     * Divide el arreglo en mitades sucesivamente para localizar el elemento.
     */
    public static int ejecutarBusquedaBinaria(String[] arreglo, String objetivo) {
        int inicio = 0;
        int fin = arreglo.length - 1;

        while (inicio <= fin) {
            // Calculamos el punto medio
            int medio = inicio + (fin - inicio) / 2;
            
            // Comparamos el objetivo con el elemento del medio
            // compareTo devuelve 0 si son iguales
            int comparacion = objetivo.compareTo(arreglo[medio]);

            if (comparacion == 0) {
                return medio; // Valor encontrado
            }

            if (comparacion > 0) {
                // Si el objetivo es "mayor", ignoramos la mitad izquierda
                inicio = medio + 1;
            } else {
                // Si el objetivo es "menor", ignoramos la mitad derecha
                fin = medio - 1;
            }
        }

        return -1; // Valor no encontrado
    }

    public static void imprimirArreglo(String[] arreglo) {
        System.out.print("[");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + (i == arreglo.length - 1 ? "" : ", "));
        }
        System.out.println("]");
    }
}
  

