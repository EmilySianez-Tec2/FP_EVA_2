/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_expresiones_boleanas;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA2_13_EXPRESIONES_BOLEANAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean entrarAntro, tieneCredencial = false;
        int edad = 18;
        //AND --> PARA QUE SEA VERDAD, AMBAS EXPRESIOES DEBEN DE SER VERDAD (TRUE)
        entrarAntro = (edad >= 18) && (tieneCredencial = false);
        System.out.println(entrarAntro);
        //OR --> PARA QUE SEA VERDAD, SOLO UNA (CUALQUIERA) DEBE DE SER VERDAD
        boolean estaSoleado = false, tienesDinero = false;
        boolean permisoSalir;
        
        permisoSalir = (estaSoleado == true) || (tienesDinero == true);
        System.out.println("Permiso para salir de paseo : " + permisoSalir);
        
        
    }
    
}
