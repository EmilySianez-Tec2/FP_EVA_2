/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_califas;

import java.util.Scanner;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA2_10_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int promedio;
        Scanner captu = new Scanner(System.in);
       System.out.println("Introduce tu promedio");
       promedio = captu.nextInt();
       if (promedio > 100){
            System.out.println("No seas mentiroso");
       }else if (promedio >= 90){
            System.out.println("Increiblemente wow, soy tu fan");
       }else if (promedio >= 80){
           System.out.println("super bien, vamos por mas");
       }else if (promedio >= 70){
           System.out.println("Uff por un pelo de rana calva");
       }else if (promedio >=0){
           System.out.println("Mejor nadota");
       }else{ //Todos los demas
           System.out.println("Calificacion invalida");
           
       }
       
    }
    
}
