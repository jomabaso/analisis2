/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo_paciente;

/**
 *
 * @author mrjosh
 */
public class Producto {
   
    private int edad;
    private String nombre;
    private String ocupacion;
    private String Domicilio;

    public int getEdad() {
        return edad;
    }
     
    public String getNombre(){
     return nombre;   
    }


    public String getOcupacion() {
        return ocupacion;
    }

    public String getDomicilio() {
        return Domicilio;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }
    
    
}
