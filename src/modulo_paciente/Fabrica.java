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
public class Fabrica implements FabricaInterfaz {
    public  Producto metodoFabrica(String producto_nombre, String forma){
        Producto miproducto = new Producto();
        if(producto_nombre.equals("historial")){
           miproducto   = new HistorialMedico();
           //miproducto.setForma(forma);
        }
        else if(producto_nombre.equals("paciente")){
            miproducto = new Paciente();
            //miproducto.setForma(forma);
        }else if(producto_nombre.equals("receta")){
            miproducto = new Receta();
        }
        return miproducto;
        
    }
}
