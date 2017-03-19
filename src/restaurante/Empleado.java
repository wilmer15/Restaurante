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
public class Empleado {
    private String nombre;
    private String Hora_entrada;
    private String Hora_salida;
    private int Sueldo_Diario;
    private int  Prima_Diario;
    
    public Empleado(){
        
    }
    public int Calcular_M(){
        int total=0;
        for(int i=0;i<24;i++){
            total+=this.Sueldo_Diario;
        }
        return total;
    }
        
     public int Calcular_A(){
        int total=0;
        total=this.Sueldo_Diario*293;
        return total;
    }
     
    public int Calcular_PM(){
        int total=0;
        for(int i=0;i<24;i++){
            total+=this.Prima_Diario;
        }
        return total;   
    }
    
    public int Calcular_PA(){
        int total=0;
        total=this.Prima_Diario*293;
        return total;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHora_entrada() {
        return Hora_entrada;
    }

    public void setHora_entrada(String Hora_entrada) {
        this.Hora_entrada = Hora_entrada;
    }

    public String getHora_salida() {
        return Hora_salida;
    }

    public void setHora_salida(String Hora_salida) {
        this.Hora_salida = Hora_salida;
    }

    public int getSueldo_Diario() {
        return Sueldo_Diario;
    }

    public void setSueldo_Diario(int Sueldo_Diario) {
        this.Sueldo_Diario = Sueldo_Diario;
    }

    public int getPrima_Diario() {
        return Prima_Diario;
    }

    public void setPrima_Diario(int Prima_Diario) {
        this.Prima_Diario = Prima_Diario;
    }      
}
