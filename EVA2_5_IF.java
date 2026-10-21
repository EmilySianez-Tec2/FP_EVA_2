/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_if;

import static java.lang.Thread.State.NEW;
import java.util.Scanner;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA2_5_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ANIDAMIENTO
        int edad, credencial;
        Scanner captu = new Scanner(System.in);
        System.out.println("Cual es tu edad");
        edad = captu.nextInt();
        if (edad>= 18){
            System.out.println("Tienes credencial de lector? (1 = si) (2 = no)");
            credencial = captu.nextInt();
            if (credencial == 1){//TIENE CREDENCIAL
            System.out.println("Puedes pasar");
            }else{
                System.out.println("No puedes pasar");
             }
            
        }else{
            System.out.println("Largate de aqui");
        }
    }
    
}
