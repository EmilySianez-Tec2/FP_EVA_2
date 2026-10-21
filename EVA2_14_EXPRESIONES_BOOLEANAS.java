/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_expresiones_booleanas;

import java.util.Scanner;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA2_14_EXPRESIONES_BOOLEANAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //BECA
        //promedio >= 95
        //Esta en equipo representetativo
        int promedio;
        String equipo;
        Scanner captu = new Scanner(System.in);
        System.out.println("Estas en equipo representativo (S/N)?");
        equipo = captu.nextLine();
        System.out.println("Cual es tu promedio?");
        promedio = captu.nextInt();
         //
         if ((promedio >= 95) || equipo.equals("S")){
             System.out.println("Tienes beca");
         }else{ 
             System.out.println("No tienes beca");
         }

        
    }
    
}
