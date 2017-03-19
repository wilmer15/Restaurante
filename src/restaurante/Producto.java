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
public class Producto {
    private String nombre;
    private String[]  Ingredientes;
    private int cantidad;
    private int Costo_neto;
    private int Costo_vendido;
    
     public int getCosto_neto() {
        return Costo_neto;
    }

    public void setCosto_neto(int Costo_neto) {
        this.Costo_neto = Costo_neto;
    }

    public int getCosto_vendido() {
        return Costo_vendido;
    }

    public void setCosto_vendido(int Costo_vendido) {
        this.Costo_vendido = Costo_vendido;
    }
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public Producto(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getIngredientes() {
        return Ingredientes;
    }

    public void setIngredientes(String[] Ingredientes) {
        this.Ingredientes = Ingredientes;
    }
   
    
    
    
    
}
