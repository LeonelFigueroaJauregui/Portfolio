//EJERCICIO 2
import java.util.Scanner; //Importamos la funcion Scanner de util       
public class Ejercicio2 {
    public static void main(String[] args) {
        String nombre; //declaracion de variable
        Scanner lectura=new Scanner(System.in);     
        System.out.println("Por favor, ingresa tu nombre:");
        nombre=lectura.nextLine(); //leemos el nombre
        System.out.println("Hola " + nombre + ", bienvenido al programa!" ); //saludo al usuario
        lectura.close(); //cerramos el Scanner para evitar advertencias
    }
}



