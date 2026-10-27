/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_do_while_adivinar;

import java.util.Scanner;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA_2_DO_WHILE_ADIVINAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PIDE AL USUARIO ADIVINAR UN NUMERO
        // TERMINA CUANDO ADIVINA EL NUMERO
        Scanner captu = new Scanner(System.in);
        int numero;
        do{
            System.out.println("Intenta adivinar el numero en el que estoy pensando del 1 al 10 =)");
            numero = captu.nextInt();
            System.out.println("Sigue intentandolo");
            
        }while (numero != 5);
         System.out.println("Bieeeen, lo conseguiste");
    }
    
}
