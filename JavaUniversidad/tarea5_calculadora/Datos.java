/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea5_calculadora;

/**
 *
 * @author Leonel
 */
public class Datos {
    private float valor1, valor2, resultado;
    
    
    Datos(){}

public void setValor1(int Valor1)
{
            this.valor1=Valor1;
}

public void SetValor2(int Valor2){
             this.valor2=Valor2;
}

public void suma(){
        this.resultado = this.valor1 + this.valor2;
        System.out.println(this. valor1 + "+" + this.valor2 + "=" + this.resultado);
}

public void resta(){
        this.resultado = this.valor1 - this.valor2;
        System.out.println(this. valor1 + "-" + this.valor2 + "=" + this.resultado);

}

public void multiplicacion(){
        this.resultado = this.valor1 * this.valor2;
        System.out.println(this. valor1 + "*" + this.valor2 + "=" + this.resultado);

}

public void division(){
       if(this.valor2 == 0)
            System.out.println("No se puede dividir entre 0, intente denuevo");
else{
         this.resultado = this.valor1 / this.valor2;
           System.out.println(this.valor1 + "/" + this.valor2 + "=" + this.resultado);
}


}
}
