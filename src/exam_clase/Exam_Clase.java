/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_clase;
import java.util.Scanner;
/**
 *
 * @author Adriana
 */
public class Exam_Clase {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Clase miClase = new Clase();
        Scanner entrada = new Scanner(System.in);
        miClase.setNro_Hc(entrada.nextLine());
        miClase.setDni(entrada.nextLine());
        miClase.setDomicilia(entrada.nextLine());
        miClase.setNombre(entrada.nextLine());
        
        System.out.println("Nro Hc: "+miClase.getNro_Hc());
        System.out.println("Dni: "+miClase.getDni());
        System.out.println("Domicilia: "+miClase.getDomicilia());
        System.out.println("Nombre: " + miClase.getNombre());
        
    }
    
}
 class Clase {
     private String Nro_Hc;
     private String Dni;
     private String Domicilia;
     private String Nombre;

    public String getNro_Hc() {
        return Nro_Hc;
    }

    public void setNro_Hc(String Nro_Hc) {
        this.Nro_Hc = Nro_Hc;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public String getDomicilia() {
        return Domicilia;
    }

    public void setDomicilia(String Domicilia) {
        this.Domicilia = Domicilia;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
     
 }
