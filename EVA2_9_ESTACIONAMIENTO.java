/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_estacionamiento;

import java.util.Scanner;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA2_9_ESTACIONAMIENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tiempo, tarifa1,tarifa2,tarifa3,tarifa4;
        Scanner captu = new Scanner(System.in);
        System.out.println(" Cuantas horas lleva en el estacionamiento ? ");
        tiempo = captu.nextInt();
        if (tiempo <= 2){
        tarifa1 = tiempo * 25;
        System.out.println("Usted debe =" + tarifa1);
    }else if (tiempo <= 5){
        tarifa2 = tiempo * 20;
        System.out.println("Usted debe =" + tarifa2);
    } else if (tiempo <= 10){
        tarifa3 = tiempo * 15;
        System.out.println("Usted debe =" + tarifa3);   
    }else if (tiempo >= 10){
        tarifa4 = 150;
        System.out.println("Usted debe =" + tarifa4);
    }
       
        
        
        
        
    }
    
}
