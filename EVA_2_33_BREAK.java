/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_33_break;

import java.util.Scanner;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA_2_33_BREAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int numero;
        int valor = 10;
        while(true){ //CICLO INFINITO
            System.out.println("Introduce un valor: ");
            numero = captu.nextInt();
            captu.nextLine();
            
            if (numero == valor){
                //el usuario adivino y gano, termina el juego
                System.out.println("Adivinaste el valor es 10, GANASTE !!!");
                break; //TERMINA EL CICLO
            }
        }
    }
    
}
