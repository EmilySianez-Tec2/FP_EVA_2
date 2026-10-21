/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_menu;

import java.util.Scanner;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA2_8_MENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        Scanner captu = new Scanner(System.in);
        System.out.println(">>>>>>>>>>>>>>>>Menu La Cucaracha Crocante<<<<<<<<<<<<<<<");
        System.out.println("1. Ventas");
        System.out.println("2. Provedores");
        System.out.println("3. Empleados");
        System.out.println("4. Inventario");
        System.out.println("5. Salir");
        System.out.println("Selecciona una opcion");
        opcion = captu.nextInt();
        if (opcion == 1){
            System.out.println("Pantalla de ventas");
        }else if (opcion == 2){
            System.out.println("Pantalla de provedores");
        }else if (opcion == 3){
            System.out.println("Pantalla de empleados");
        }else if (opcion == 4){
            System.out.println("Pantalla de Inventario");
        }else if (opcion == 5){
            System.out.println("Bye");
        }else{
            System.out.println("Opcion incorrecta");
            
        }
    }
    
}
