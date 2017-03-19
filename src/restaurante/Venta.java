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
     private Gastos g;
     private String Producto_Vendido;
     private int Cantidad;
     private int Dinero_Obtenido;
     private int ganancia;
    
     private Scanner leer = new Scanner(System.in);
     public Venta(){
      this.i = new Inventario();
     }
  
   public void Vender(){
      System.out.println("Digite el producto que desea");
      this.Producto_Vendido = leer.next();
      System.out.println("Digite la cantidad");
      this.Cantidad= leer.nextInt();
      i.subbCantidad(Producto_Vendido,Cantidad);
   }

    public int getDinero_Obtenido() {
        return Dinero_Obtenido;
    }

    public void setDinero_Obtenido(int Dinero_Obtenido) {
        this.Dinero_Obtenido = Dinero_Obtenido;
    }
   
   
   public void Ganancia_T(){
       this.ganancia=(this.getDinero_Obtenido() - this.g.getGastos_Compras());
       System.out.println("La ganancia obtenidad es" + this.ganancia);
   }
   

}
