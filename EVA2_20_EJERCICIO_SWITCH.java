/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_ejercicio_switch;

import java.util.Scanner;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA2_20_EJERCICIO_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Calculadora
        //pedir dos valores enteros
        //PEDIR LA OPERACION
        //1 SUMA
        //2 RESTA
        //3 MULTI
        //4 DIVISION
        //REGRESAR EL RESULTADO 
        //CUALQUIER OTRO VALOR -->OPERCION INVALIDA
        //MOSTRAR EL RESULTADO 
        Scanner captu = new Scanner(System.in);
        double valor1, valor2, suma, resta, divi, multi;
        String operacion;
        System.out.println("Valor 1:");
        valor1 = captu.nextDouble();
        System.out.println("Valor 2:");
        valor2 = captu.nextDouble();
        System.out.println("Que operacion deseas hacer ");
        operacion = captu.nextLine();
        switch(operacion){
            case "Suma":
                suma = valor1 + valor2;
                System.out.println("Tu resultado es:" +suma);
                break;
            case "Resta":
                resta = valor1 - valor2;
                    System.out.println("Tu resultado es:" + resta);
                    break;
            case "Division":
                divi = valor1 / valor2;
                    System.out.println("Tu resultado es" + divi);
                    break;
            case "Multiplicacion":
                multi = valor1 * valor2;
                    System.out.println("Tu resultado es" + multi);
                    break;
                
        }
    }
    
}
