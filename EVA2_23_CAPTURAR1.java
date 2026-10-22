/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23_capturar1;

import java.util.Scanner;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA2_23_CAPTURAR1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SOLIITAR LAS CALIFICACIONES Y PROMEDIOS
        int cant, califa = 0; //EN CASO DE SUMAS USAR EL 0
        double promedio;
        Scanner captu = new Scanner(System.in);
        System.out.println("Cuantas calificaciones vas a capturar");
        cant = captu.nextInt();
        captu.nextLine();
        for(int i = 0; i< cant; i++){ //for(int i = 1; i<= cant; i++)
        System.out.println("Capturar las calificaciones: ");  
        califa = califa + captu.nextInt(); //ACUMULADOR
        captu.nextLine();
        
        
        }
        System.out.println("Acumulado" + califa);
        promedio = califa / (cant * 1.0);
        System.out.println("Promedio" + promedio);

    }
    
}
