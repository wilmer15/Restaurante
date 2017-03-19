/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

/**
 *
 * @author Acer
 */
public class Gastos_Local {
   private int arriendo_dia;  
   private int Impuestos_dia;  
   private int servicio_dia;

   
    public int Calcular_AA(){
        int total=0;
        total=this.arriendo_dia*293;
        return total;
    }
     
    public int Calcular_AM(){
        int total=0;
        for(int i=0;i<24;i++){
            total+=this.arriendo_dia;
        }
        return total;   
    }

     public int Calcular_IA(){
        int total=0;
        total=this.Impuestos_dia*293;
        return total;
    }
     
    public int Calcular_IM(){
        int total=0;
        for(int i=0;i<24;i++){
            total+=this.Impuestos_dia;
        }
        return total;   
    }
    
     public int Calcular_SA(){
        int total=0;
        total=this.servicio_dia*293;
        return total;
    }
     
    public int Calcular_SM(){
        int total=0;
        for(int i=0;i<24;i++){
            total+=this.servicio_dia;
        }
        return total;   
    }
   
   
   

    public double getArriendo_dia() {
        return arriendo_dia;
    }

    public void setArriendo_dia(int arriendo_dia) {
        this.arriendo_dia = arriendo_dia;
    }

  
    public int  getImpuestos_dia() {
        return Impuestos_dia;
    }

    public void setImpuestos_dia(int  Impuestos_dia) {
        this.Impuestos_dia = Impuestos_dia;
    }


    public int  getServicio_dia() {
        return servicio_dia;
    }

    public void setServicio_dia(int  servicio_dia) {
        this.servicio_dia = servicio_dia;
    }
     
}
