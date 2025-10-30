package com.leonel.equipofutbol;



//INTEGRANTES DEL EQUIPO:
                                                    //María José Camarena Lomelí
                                                    //Gustavo Sanchez de Tagle Carmona
                                                    //Leonel Figueroa Jauregui



// Clase principal
public final class EquipoFutbol {
    public static void main(String[] args) {
        // Instanciación de objetos + Polimorfismo
        PersonaEquipo futbolista = new Futbolista(1, "Carlos", "Gomez", 25, 10, "Delantero");
        PersonaEquipo entrenador = new Entrenador(2, "Luis", "Martinez", 50, "FED123");
        PersonaEquipo masajista = new Masajista(3, "Ana", "Lopez", 40, "Fisioterapeuta", 15);

        System.out.println("---- CONCENTRACION ----");
        futbolista.concentrarse();   
        entrenador.concentrarse();   
        masajista.concentrarse();    

        System.out.println("---- VIAJES ----");
        futbolista.viajar();         
        entrenador.viajar();         
        masajista.viajar();          

        System.out.println("---- METODOS ESPECIFICOS ----");
        ((Futbolista) futbolista).jugarPartido();      
        ((Futbolista) futbolista).entrenar();          

        ((Entrenador) entrenador).dirigirPartido();    
        ((Entrenador) entrenador).dirigirEntrenamiento(); 

        ((Masajista) masajista).darMasaje();           
    }
}
