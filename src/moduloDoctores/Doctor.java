/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moduloDoctores;
import moduloUsuarios.*;
/**
 *
 * @author Justo
 */
public class Doctor extends Usuario{
    public String especialidad;
    
    public Doctor(String usuario, String password) {
        super.setUsuario(usuario);
        super.setPassword(password);
        System.out.println("Creacion de usuario tipo Doctor");
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    
    
}
