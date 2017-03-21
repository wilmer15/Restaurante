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
public class Inventario {
    private int id;
    private ArrayList<Producto> p;
    private Gastos g;
    private Venta v;

    public Gastos getG() {
        return g;
    }

    public void setG(Gastos g) {
        this.g = g;
    }

    public Venta getV() {
        return v;
    }

    public void setV(Venta v) {
        this.v = v;
    }
    private int Total2=0;
    private int Total=0;
    
    public Inventario(){
        this.p = new ArrayList<>();
        this.v = new Venta(3);
        this.g = new Gastos();
    }


    public void addProducto(Producto b){
        this.p.add(b);  
    }
    public void addCantidad(String nombre,int cant){
         for(Producto b : this.p){
           if(b.getNombre().equals(nombre)){
               b.setCantidad(b.getCantidad() + cant);
               Total+=cant*b.getCosto_neto();
               g.setGastos_Compras(Total);
           }   
        }  
    }
    
        
    public void subbCantidad(String nombre,int cant){;
         for(Producto b : this.p){
           if(b.getNombre().equals(nombre)){
               b.setCantidad(b.getCantidad() - cant);
               Total2+=cant*b.getCosto_vendido();
               this.v.setDinero_Obtenido(this.Total2);
           }   
        }  
    } 
}
