/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_ejercicio_1;

import java.util.Scanner;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA2_24_EJERCICIO_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2;
        Scanner captu = new Scanner(System.in);
        System.out.println("Dame un numero inicial: ");
                num1 = captu.nextInt();
        System.out.println("Dame un numero final: ");
                num2 = captu.nextInt();
        for(int i = num1; i <= num2; i++){
            System.out.print(i + "-");
        }
                
                        
    }
    
}
