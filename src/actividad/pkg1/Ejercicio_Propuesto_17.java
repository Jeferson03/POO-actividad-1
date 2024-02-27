/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad.pkg1;

/**
 *
 * @author jefeg
 */
public class Ejercicio_Propuesto_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJERCICIO PROPUESTO NUMERO 17
        /**Dado el radio de un círculo. Haga un algoritmo que obtenga el área del círculo y la longitud
de la circunferencia. */
        double radcir, areacir, longcircun;
        radcir = 6 ;
        areacir = Math.PI * Math.pow(radcir, 2);
        longcircun = 2 * Math.PI * radcir;
        System.out.println("El radio del circulo es: " + radcir);
        System.out.println("El area del circulo es: " + areacir);
        System.out.println("La longitud de la circunferencia es: " + longcircun);
        
    }
    
}
