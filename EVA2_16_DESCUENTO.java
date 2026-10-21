/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_descuento;

import java.util.Scanner;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA2_16_DESCUENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String menor, estudiante, insen, credencial;
        Scanner captu = new Scanner(System.in);
        System.out.println("OBTEN TU DESCUENTO PARA EL CAMION");
        System.out.println("Eres menor de edad ?");
        menor = captu.nextLine();
        System.out.println("Estudias actualmente? ");
        estudiante = captu.nextLine();
        System.out.println("Si eres mayor a 60 años, cuentas con tu credencial INSEN?");
        insen = captu.nextLine();
        if ((menor.equals("si")) || (estudiante.equals("si")) || (insen.equals("si"))){
            System.out.println("Tienes el descuento");
        }else{
            System.out.println("No tienes el desuento");
        }
        
       
                
             
        
       
        
    }
    
}
