/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_else_if;

import java.util.Scanner;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA2_7_ELSE_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //temperatura
        //35 muy calido
        //20 agradable
        //10 fresco
        //muy frio
        int temperatura;
        Scanner captu = new Scanner(System.in);
        System.out.println("Que temperatura esta ahorita?");
        temperatura = captu.nextInt();
        if (temperatura >= 35){
            System.out.println("Muy calido !!");
        }else if(temperatura >= 20){
            System.out.println("Agradable!!");
        }else if(temperatura >= 10){
            System.out.println("Fresco");
        }else {
            System.out.println("Muy frioooo !!");
        }
            
   
        }
    }
    

