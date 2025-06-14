/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg04.cuentasbancaria;

/**
 *
 * @author seth
 */
public class CuentasBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Cuenta c1 = new Cuenta();
        c1.setTitular("Jeremy");
        c1.setMonto(1500);
        
        System.out.println(c1.getMonto());
        c1.retirar(2000);
        System.out.println(c1.getMonto());
        c1.ingresar(1500);
        System.out.println(c1.getMonto());
        
        Cuenta c2 = new Cuenta("Juana", 19222);
        System.out.println(c2.getTitular());
        
    }
    
}
