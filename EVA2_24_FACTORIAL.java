/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_factorial;

import java.util.Scanner;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA2_24_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero, facto =1;
        Scanner captu = new Scanner(System.in);
        System.out.println("Valor a capturar: ");
        numero = captu.nextInt();
        for (int i = 1; i <= numero; i++){
            //operaciones
            facto = facto * i;
      
    }
        System.out.println("Factirial de " + numero + "=" + facto);
    }
    
}
