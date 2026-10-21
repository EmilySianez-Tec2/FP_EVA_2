/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_21_ciclos;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA2_21_CICLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //acceso por indice --> i
        //CICLOS O BUCLES --> REPETICION DE INSTRUCCIONES
        // FOR ( SABEMOS EL # REPETICIONES ) 
        //WHILE ( PUEDEN SER 0 N REPETICIONES) 
        //DO WHILE (PUEDEN SER 1 O N REPETICIONES)
        // IMPRIMIR UN LISTADO DE1 AL 10:
        // 3 parametros
        //PUNTO DE PARTIDA
        // CONDICION PARA DETENERSE
        // AVANCE --> DE UNO EN UNO
        for (int i = 1; i <= 10; i++){
            //INSTRUCCIONES A REPETIR
            System.out.print(i + " - ");
            
        }
        System.out.println();
        // 20,22, 24. 26, 28,30,32 ,34 ,36, 38
        for(int i = 20; i<=38; i+=2){
        System.out.print(i + " - ");    
        }
        System.out.println();
        for(int i = 0; i<10; i++){
            System.out.print(i + " - "); 
            
        }
        //del 10 al 1
         System.out.println();
        for(int i = 10; i>=1; i--){
            System.out.print(i + " - "); 
        }
        System.out.println();
         for(int i = 0; i<=20; i+=2){
            System.out.print(i + " - "); 
         }
    }
    
}
