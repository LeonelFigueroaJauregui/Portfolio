
//Creamos la clase
class ConsolaDeVideojuegos
{
    String marca;
    String modelo;
    int almacenamiento;

    //CONSTRUCTOR
    ConsolaDeVideojuegos(String Marca, String Modelo, int Almacenamiento)
    {
        this.marca = Marca;
        this.modelo = Modelo;
        this.almacenamiento = Almacenamiento;
    }

    //METODOS
    public void Encender()
    {
        System.out.println("Encender consola " + this.marca);
    }

    //MAIN
    public static void main(String[] args)
    {
    ConsolaDeVideojuegos ConsolaRetro = new ConsolaDeVideojuegos("Xbox", "360", 512);
    ConsolaRetro.Encender();

    }
}

