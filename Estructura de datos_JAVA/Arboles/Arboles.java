import java.util.Scanner;

public class Arboles {

    // ================================================================
    //  Representa cada elemento del árbol con su valor y sus enlaces
    // ================================================================
    static class Nodo {
        private int dato;    // Valor almacenado en el nodo
        private Nodo izdo;   // Enlace al hijo izquierdo
        private Nodo der;    // Enlace al hijo derecho
        private Nodo padre;  // Enlace al nodo padre

        // Constructor
        public Nodo(int dato, Nodo izdo, Nodo der, Nodo padre) {
            this.dato  = dato;
            this.izdo  = izdo;
            this.der   = der;
            this.padre = padre;
        }

        // Getters:
        public int  getDato()  { return dato; }
        public Nodo getIzdo()  { return izdo; }
        public Nodo getDer()   { return der;  }
        public Nodo getPadre() { return padre; }

        // Setters
        public void setDato(int dato)    { this.dato  = dato;  }
        public void setIzdo(Nodo izdo)   { this.izdo  = izdo;  }
        public void setDer(Nodo der)     { this.der   = der;   }
        public void setPadre(Nodo padre) { this.padre = padre; }
    }

    // ================================================================
    
    // ================================================================
    private Nodo raiz;

    // ================================================================
    //  MÉTODO: insertar
    //  Agrega un nuevo valor respetando la regla del ABB:
    //    - menores o iguales van a la IZQUIERDA
    //    - mayores van a la DERECHA
    // ================================================================
    public void insertar(int valor) {

        // Caso especial: el árbol está vacío, el nuevo nodo es la raíz
        if (raiz == null) {
            raiz = new Nodo(valor, null, null, null);
            System.out.println("Raiz creada con valor " + valor + ".");
            return;
        }

        // Recorremos el árbol hasta encontrar el lugar correcto
        Nodo actual = raiz;
        while (true) {

            if (valor <= actual.getDato()) {
                // El valor es menor o igual → buscar por la izquierda
                if (actual.getIzdo() == null) {
                    // Encontramos el hueco: insertamos aquí
                    actual.setIzdo(new Nodo(valor, null, null, actual));
                    System.out.println("Insertado " + valor + " a la izquierda de " + actual.getDato() + ".");
                    break; // Salimos del while, ya terminamos
                }
                // Si no hay hueco, bajamos al hijo izquierdo y seguimos buscando
                actual = actual.getIzdo();

            } else {
                // El valor es mayor → buscar por la derecha
                if (actual.getDer() == null) {
                    // Encontramos el hueco: insertamos aquí
                    actual.setDer(new Nodo(valor, null, null, actual));
                    System.out.println("Insertado " + valor + " a la derecha de " + actual.getDato() + ".");
                    break; // Salimos del while, ya terminamos
                }
                // Si no hay hueco, bajamos al hijo derecho y seguimos buscando
                actual = actual.getDer();
            }
        }
    }

    // ================================================================
    //  RECORRIDO PREORDEN:  Raíz → Izquierda → Derecha
    //  Se visita primero el nodo actual y luego sus subárboles.
    //  Útil para copiar o serializar el árbol.
    // ================================================================
    public void preorden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.getDato() + " "); // 1. Imprimir nodo actual
            preorden(nodo.getIzdo());               // 2. Recorrer subárbol izquierdo
            preorden(nodo.getDer());                // 3. Recorrer subárbol derecho
        }
        // Si nodo es null llegamos a una hoja: no hacemos nada y regresamos
    }

    // ================================================================
    //  RECORRIDO INORDEN:  Izquierda → Raíz → Derecha
    //  Visita los nodos en orden ASCENDENTE (de menor a mayor).
    //  Es el recorrido más útil en un ABB para listar valores ordenados.
    // ================================================================
    public void inorden(Nodo nodo) {
        if (nodo != null) {
            inorden(nodo.getIzdo());                // 1. Recorrer subárbol izquierdo
            System.out.print(nodo.getDato() + " "); // 2. Imprimir nodo actual
            inorden(nodo.getDer());                 // 3. Recorrer subárbol derecho
        }
    }

    // ================================================================
    //  RECORRIDO POSTORDEN:  Izquierda → Derecha → Raíz
    //  Se visita el nodo actual al FINAL, después de sus hijos.
    //  Útil para eliminar o liberar memoria del árbol.
    // ================================================================
    public void postorden(Nodo nodo) {
        if (nodo != null) {
            postorden(nodo.getIzdo());              // 1. Recorrer subárbol izquierdo
            postorden(nodo.getDer());               // 2. Recorrer subárbol derecho
            System.out.print(nodo.getDato() + " "); // 3. Imprimir nodo actual
        }
    }

    // ================================================================
    //  MÉTODO MAIN: 
    // ================================================================
    public static void main(String[] args) {
        Scanner sc    = new Scanner(System.in);
        Arboles arbol = new Arboles(); // Creamos el árbol vacío
        int opcion;

        do {
            // Mostrar menú de opciones
            System.out.println("\n===== ARBOL BINARIO DE BUSQUEDA =====");
            System.out.println("1. Insertar valor");
            System.out.println("2. Recorrido Preorden");
            System.out.println("3. Recorrido Inorden");
            System.out.println("4. Recorrido Postorden");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");

            // Validar que el usuario ingrese un número entero
            while (!sc.hasNextInt()) {
                System.out.print("Entrada invalida. Ingresa un numero: ");
                sc.next(); // Descartar la entrada incorrecta
            }
            opcion = sc.nextInt();

            switch (opcion) {

                case 1: // ── Insertar ──
                    System.out.print("Ingresa el valor a insertar: ");
                    // Validar que el valor también sea un entero
                    while (!sc.hasNextInt()) {
                        System.out.print("Valor invalido. Ingresa un entero: ");
                        sc.next();
                    }
                    arbol.insertar(sc.nextInt());
                    break;

                case 2: // ── Preorden ──
                    if (arbol.raiz == null) { System.out.println("El arbol está vacio."); break; }
                    System.out.print("Preorden:  ");
                    arbol.preorden(arbol.raiz); // Empezamos desde la raíz
                    System.out.println();
                    break;

                case 3: // ── Inorden ──
                    if (arbol.raiz == null) { System.out.println("El arbol está vacío."); break; }
                    System.out.print("Inorden:   ");
                    arbol.inorden(arbol.raiz);
                    System.out.println();
                    break;

                case 4: // ── Postorden ──
                    if (arbol.raiz == null) { System.out.println("El arbol está vacio."); break; }
                    System.out.print("Postorden: ");
                    arbol.postorden(arbol.raiz);
                    System.out.println();
                    break;

                case 5: // ── Salir ──
                    System.out.println("¡Ponme 10!");
                    break;

                default:
                    System.out.println("Opcion no válida. Intenta de nuevo.");
            }

        } while (opcion != 5); // El do-while repite hasta que el usuario elija Salir

        sc.close(); 
    }
}