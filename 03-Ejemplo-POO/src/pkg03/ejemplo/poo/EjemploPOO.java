/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg03.ejemplo.poo;

/**
 *
 * @author seth
 */
public class EjemploPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Persona p1 = new Persona();
        //p1.nombre = "Jeremy"; // No se puede acceder porque la variable es privada
        p1.edad = 30;
        p1.setNombre("Jeremy");
        System.out.println(p1.getNombre());
        System.out.println(p1.getEdad());    
        p1.setEdad(32);
        System.out.println(p1.getEdad());
    }
    
}
