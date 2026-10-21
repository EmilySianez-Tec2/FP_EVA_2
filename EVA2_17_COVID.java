/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_covid;

import java.util.Scanner;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA2_17_COVID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        double imc, altura, peso;
        String enfer;
        Scanner captu = new Scanner(System.in);
        System.out.println("Edad: ");
        edad = captu.nextInt();
        System.out.println("Tiene alguna enfermedad cronica ?");
        enfer = captu.nextLine();
        captu.nextLine();
        System.out.println("Cuanto pesa ?");
        peso = captu.nextDouble();
        System.out.println("Cuanto mide ?");
        altura = captu.nextDouble();
        imc = peso / (altura * altura);
        System.out.println(" Su IMC es de: " + imc);
        if ((edad >= 65) || (enfer.equals("si")) || (imc >= 25)){
            System.out.println("Eres propenso a tener COVID");
        }else{
            System.out.println("No tienes que preocuparte");
        }
        
       
                
    }
    
}
