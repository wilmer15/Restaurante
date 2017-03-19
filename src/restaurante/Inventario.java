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
    private int Total2=0;
    private int Total=0;
    
    public Inventario(){
        this.p = new ArrayList<>();
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
        
    public void subbCantidad(String nombre,int cant){
         for(Producto b : this.p){
           if(b.getNombre().equals(nombre)){
               b.setCantidad(b.getCantidad() - cant);
               System.out.println(b.getCosto_vendido());
               Total2+=cant*b.getCosto_vendido();
               v.setDinero_Obtenido(Total2);
           }   
        }  
    } 
}
