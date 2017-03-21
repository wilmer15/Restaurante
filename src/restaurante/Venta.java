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
public class Venta {
     private int Total;
     private Inventario i;

    public Inventario getI() {
        return i;
    }

    public void setI(Inventario i) {
        this.i = i;
    }
     private Gastos g;
     private String Producto_Vendido;
     private int Cantidad;
     private int Dinero_Obtenido;
     private int ganancia;
    
     private Scanner leer = new Scanner(System.in);
     public Venta(){
       this.i = new Inventario();
       this.g = new Gastos();
     }
      public Venta(int t){
     }
  
   public void Vender(){
      System.out.println("Digite el producto que desea");
      this.Producto_Vendido = leer.next();
      System.out.println("Digite la cantidad");
      this.Cantidad= leer.nextInt();
      i.subbCantidad(Producto_Vendido,Cantidad);
   }
   
    public void Comprar(){
      String Producto_agregado;
      int Cantidad2;
      System.out.println("Digite el producto al que le desea agregar mas unidades al inventario");
      Producto_agregado = leer.next();
      System.out.println("Digite la cantidad");
      Cantidad2= leer.nextInt();
      i.addCantidad(Producto_agregado,Cantidad2);  
    }

    public int getDinero_Obtenido() {
        return Dinero_Obtenido;
    }

    public void setDinero_Obtenido(int Dinero_Obtenido_2) {
        this.Dinero_Obtenido = Dinero_Obtenido_2;
    }

    public int getGanancia() {
        return (this.i.getV().getDinero_Obtenido() - this.i.getG().getGastos_Compras());
    }
     

}
