/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_34_ahorro;

import java.util.Scanner;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA_2_34_AHORRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        
        int ahorro = 15000;
        int deposito;
        int cuenta = 0;
        while(true){
            System.out.println("introduce el deposito: ");
            deposito = captu.nextInt();
            captu.nextLine();
            //VERIFICAR SI NOS ESTAMOS PASANDO
            if ((cuenta + deposito) > 15000){
                System.out.println("Te pasaste de la meta");
                continue; //DETIENE LA ITERACION ACTUAL
                
            }
            cuenta += deposito;
            System.out.println("cuenta =" + cuenta);
            if (cuenta == 15000){ //LLEGAMOS A LA META
                System.out.println("Meta cumplida");
                break;//DETIENE EL CICLO COMPLETO
        }
            
        }
        
    }
    
}
