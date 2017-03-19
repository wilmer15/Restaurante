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
public class test {
    public static void main(String[] agrs ){
        Producto p1 = new Producto();
        p1.setCosto_neto(5000);
        p1.setCosto_vendido(9000);
        p1.setCantidad(5);
        String[] i = new String[3];
        i[0] = "Arroz";
        i[1] = "patacon"; 
        i[2] = "carne"; 
        p1.setIngredientes(i);
        p1.setNombre("Corriente");
        
        Producto p2 = new Producto();
        p2.setCosto_neto(8000);
        p2.setCosto_vendido(15000);
        p2.setCantidad(6);
        String[] j = new String[5];
        j[0] = "Arroz";
        j[1] = "patacon"; 
        j[2] = "carne"; 
        j[3] = "Chorizo"; 
        j[4] = "Chicharron"; 
        p2.setIngredientes(j);
        p2.setNombre("Paisa");
        
        Producto p3 = new Producto();
        p3.setCosto_neto(8000);
        p3.setCosto_vendido(15000);
        p3.setCantidad(6);
        String[] k = new String[5];
        k[0] = "Arroz";
        k[1] = "patacon"; 
        k[2] = "Pescado"; 
        k[3] = "ensalada"; 
        k[4] = "postre"; 
        p3.setIngredientes(k);
        p3.setNombre("Especial");
        Inventario inv = new Inventario();
        inv.addProducto(p1);
        inv.addProducto(p2);
        inv.addProducto(p2);
        
        Empleado emp = new Empleado();
        emp.setHora_entrada("8am");
        emp.setHora_salida("15");
        emp.setNombre("Carlos");
        emp.setPrima_Diario(5000);
        emp.setSueldo_Diario(15000);
        
        Empleado emp2 = new Empleado();
        emp2.setHora_entrada("8am");
        emp2.setHora_salida("15");
        emp2.setNombre("Dario");
        emp2.setPrima_Diario(6000);
        emp2.setSueldo_Diario(12000);
        
        Gastos g = new Gastos();
        g.addEmpleado(emp);
        g.addEmpleado(emp2);
        
        Gastos_Local gastosl = new Gastos_Local();
        gastosl.setArriendo_dia(20000);
        gastosl.setImpuestos_dia(15000);
        gastosl.setServicio_dia(14000);
        
        
        Venta v = new Venta();
        v.Vender();   
        System.out.println("Gastos Dia  " + g.Gastost_d());
    }
}
