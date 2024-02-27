/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad.pkg1;

/**
 *
 * @author jefeg
 */
public class Ejercicio_Propuesto_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // EJERCICIO PROPUESTO NUMERO 12
        double sabruto, retencion, saneto, horasts, pagoh;
        pagoh = 5000;
        horasts = 48;
        sabruto = pagoh * horasts;
        retencion = sabruto * 0.125;
        saneto = sabruto - retencion;
        System.out.println("Su salario bruto es: " + sabruto);
        System.out.println("La retencion en la fuente es: " + retencion);
        System.out.println("Su salario neto es: " + saneto);            
    }
    
    
}
