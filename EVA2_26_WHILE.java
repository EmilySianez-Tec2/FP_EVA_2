/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_26_while;

import java.util.Scanner;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA2_26_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // WHILE --> MIENTRAS (QUE?)
        //CERO N VECES
        //IMPRIMIR NUMEROS DEL 1 AL 10
        int i = 1;
        Scanner captu = new Scanner(System.in);
        while (i <= 10){ //SE REPITE MIENTAS LA CONDICION SEA VERDADERA
            System.out.print(i + "-");
            i++;
        }
        System.out.println("");
         i = 10;
        while (i >=1){ //SE REPITE MIENTAS LA CONDICION SEA VERDADERA
            System.out.print(i + "-");
            i--;
        }
    }
    
}
