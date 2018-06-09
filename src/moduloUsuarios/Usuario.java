/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moduloUsuarios;

/**
 *
 * @author Justo
 */
public class Usuario {
    public String usuario;
    public String password;
    
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
   public int inicioSesion(String usuario, String password){
       if((usuario == this.usuario) && (password == this.password))
          return 1; 
       else
           return 0;
   }
   
   
    
    
    
    
    
}
