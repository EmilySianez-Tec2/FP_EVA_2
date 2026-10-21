/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_if;

import java.util.Scanner;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA2_1_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        Scanner captu = new Scanner(System.in);
        System.out.println("Captura tu edad");
        edad = captu.nextInt();
        //ÁRENTESIS OBLIGATORIOS, DENTRO DE LA EXPRESION CONDICIONAL (VERDADERO O FALSO)
        if (edad >= 18) //QUE HACEMOS SI ES VERDAD
               System.out.println("Puedes entrar !!");
        else //QUE HACEMOS SI ES FALSO (OPCIONAL)
            System.out.println("No puedes entrar");
        
    }
    
}
