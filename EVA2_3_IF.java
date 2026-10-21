/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_if;

import java.util.Scanner;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA2_3_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    double precio, cantidad, subtotal, descuento = 0, total;
    Scanner captu = new Scanner(System.in);
    System.out.println("Captura el precio del producto ");
    precio = captu.nextDouble();
    System.out.println("Captura la cantidad de producto que compraste");
    cantidad = captu.nextDouble();
    subtotal = precio * cantidad;
     if (subtotal >= 1000){
         System.out.println("Se te aplica descuento del 10%");
        descuento = subtotal * 0.1;
        total = subtotal - descuento;
        System.out.println("Subtotal = " + subtotal);
        System.out.println("descuento = " + descuento);
        System.out.println("Total = " + total);
     }else{ 
        System.out.println("No aplica descuento");
        System.out.println("Total = " + subtotal);
     }

    }
    
}
