/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;
import java.util.*;
/**
 *
 * @author Acer
 */
public class Gastos {
    private int Gasto_mensual;
    private int Gasto_anual;
    private int Gasto_dia;
    private int Gastos_Compras;
    
    private ArrayList<Empleado> E;
    
    private Gastos_Local g;
    
    public Gastos(){
        this.g = new Gastos_Local();
        this.E = new ArrayList<>();
    }
    
    
    public int getGasto_mensual() {
        return Gasto_mensual;
    }

    public void setGasto_mensual(int Gasto_mensual) {
        this.Gasto_mensual = Gasto_mensual;
    }

    public int getGasto_anual() {
        return Gasto_anual;
    }

    public void setGasto_anual(int Gasto_anual) {
        this.Gasto_anual = Gasto_anual;
    }

    public int getGasto_dia() {
        return Gasto_dia;
    }

    public void setGasto_dia(int Gasto_dia) {
        this.Gasto_dia = Gasto_dia;
    }

    public int getGastos_Compras() {
        return Gastos_Compras;
    }

    public void setGastos_Compras(int Gastos_Compras) {
        this.Gastos_Compras = Gastos_Compras;
    }
    
    public void addEmpleado(Empleado e){
      this.E.add(e);
    }
    
    public int Gastost_d(){
        int Total=0;
        for(Empleado p : E){
            Total+=p.getSueldo_Diario() + p.getPrima_Diario();           
        }
        Total+= g.getArriendo_dia() + g.getImpuestos_dia() + g.getServicio_dia();
        Total+=this.getGastos_Compras();
        this.setGasto_dia(Total);
        return Total;
    } 
    
     public int Gastost_M(){
        int Total=0;
        for(int i =0;i<24;i++){
        for(Empleado p : E){
            Total+=p.getSueldo_Diario() + p.getPrima_Diario();           
        }
        Total+= g.getArriendo_dia() + g.getImpuestos_dia() + g.getServicio_dia();
        Total+=this.getGastos_Compras();
        }
        this.setGasto_mensual(Total);
        return Total;
    } 
     public int Gastost_A(){
        int Total=0;
        for(int i =0;i<293;i++){
        for(Empleado p : E){
            Total+=p.getSueldo_Diario() + p.getPrima_Diario();           
        }
        Total+= g.getArriendo_dia() + g.getImpuestos_dia() + g.getServicio_dia();
        Total+=this.getGastos_Compras();
        }
        this.setGasto_anual(Total);
        return Total;
    } 
}
