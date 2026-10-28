/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_32_continue;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA_2_32_CONTINUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for (int i = 0; i <= 20; i++){
        //PARA SABER SI ES PAR, ME INTERESA EL RESIDUO A DIVIDIR 
        //ENTRE DOS
        int residuo = i % 2;
        if (residuo == 0){//EL NUMERO ES PAR
            System.out.println(i + "-");
            continue;// INTERRUMPE LA ITERACION ACTUAL
        }
            System.out.print("Si el numero es par, no se imprime");
        }
    }
    
}
