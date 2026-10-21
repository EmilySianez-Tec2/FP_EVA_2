/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_if;

import java.util.Scanner;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA2_4_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        double salario, bono1, bono2, total1, total2;
        Scanner captu = new Scanner(System.in);
        System.out.println("Nombre del empleado");
        nombre = captu.nextLine();
        System.out.println("Salario del empleado: ");
        salario = captu.nextDouble();
        if (salario <= 12000){
            bono1 = salario * 0.1;
            total1 = salario + bono1;
            System.out.println("Tu bono es del 10% : " + bono1 );
            System.out.println("Tu total es: " + total1);
        }else{
            System.out.println("Tu bono es del 5% ");
            bono2 = salario * .05;
            total2 = salario + bono2;
            System.out.println("Tu bono es: " + bono2);
            System.out.println("Tu total es: " + total2);

        }
            
    }
    
}
