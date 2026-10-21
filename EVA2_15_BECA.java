/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_beca;

import java.util.Scanner;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA2_15_BECA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int promedio, ingresos;
        Scanner captu = new Scanner(System.in);
        System.out.println("Cual es tu promedio ?");
        promedio = captu.nextInt();
        System.out.println("Cual es el ingreso mensual de tus papas?");
        ingresos = captu.nextInt();
        if ((promedio >= (80)) && (ingresos <= 10000)){
        System.out.println("Eres candidato para la beca");
        }else{
            System.out.println("No eres apto para la beca");
        }
        
        
    }
    
}
