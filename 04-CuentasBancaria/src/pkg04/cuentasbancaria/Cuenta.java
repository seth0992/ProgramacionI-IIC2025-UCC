/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg04.cuentasbancaria;

/**
 *
 * @author seth
 */
public class Cuenta {
    
    private String titular;
    private double monto;
    
    //get titular
    public String getTitular(){
        return this.titular;
    }
    
    //set titular
    public void setTitular(String titular){
        this.titular = titular;
    }
    
    public double getMonto(){
        return this.monto;
    }
    
    public void setMonto(double monto){
        this.monto = monto;
    }
    
    public void ingresar(double monto){
        if(monto > 0){
            this.monto += monto; // this.monto = this.monto + monto
        }
    }
    
    public void retirar(double monto){
    
        if ( (this.monto - monto) < 0 ){
            this.monto = 0;
        }else{
            this.monto -= monto;
        }
    }
    
    public Cuenta(String titulas, double monto){
        this.titular = titulas;
        this.monto = monto;
    }
    
    public Cuenta(){}
}
