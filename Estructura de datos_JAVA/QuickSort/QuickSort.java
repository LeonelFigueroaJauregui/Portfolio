
/**
 *
 * @author Leonel
 */
public class QuickSort {

    public static void main(String[] args) {
        
           int A[] = {12, 3, 5, 7, 8, 23, 33, 15};
           
           
             System.out.println("Arreglo desordenado: " + java.util.Arrays.toString(A));
             
             quickSort(A, 0, A.length -1);
             
             System.out.println("Arreglo ordenado: " + java.util.Arrays.toString(A));
        
    }
    
    
    public static void quickSort(int[] array, int inicio, int fin){
        
        if(inicio < fin){
            
            int indicePivote = particion(array, inicio, fin);
            
            
            quickSort(array, inicio, indicePivote - 1); //Sub arreglo izquierdo
             quickSort(array, indicePivote + 1, fin);  //Sub arbol derecho
             
        }
    }
    
    private static int particion(int[] array, int inicio, int fin){
        
        //Seleccionamos el ultimo elemento como pivote
        
        int pivote = array[fin];
        
        //Indice del elemento mas pequeño
        
        int i = (inicio - 1);
        
        
        for(int j = inicio; j < fin; j++){
            
            //Si el elemento actual es menor o igual al pivote
            if (array[j] <= pivote){
                
                i++;
                 
                //Intercambiar array[i] y array[j]
                
                int temp = array[i];
                array[i] = array [j];
                array[j] = temp;
            }
            
        }
        
        // Intercambiar array[i+1] y el pivote (array[fin])
        
        int temp = array [i+1];
        array[i+1] = array[fin];
        array[fin] = temp;
        
        return i + 1; //Retorna la posición del pivote
    }
    }

