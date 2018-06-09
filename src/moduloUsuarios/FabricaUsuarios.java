/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moduloUsuarios;
import moduloDoctores.*;
/**
 *
 * @author Justo
 */
public class FabricaUsuarios  implements FabricaUsuariosInterfaz{
    public  Usuario creacionUsuario(String usuario, String password,int tipo){
        Usuario usuario_nuevo = new Usuario();
        if(tipo==1){
           usuario_nuevo   = new Doctor(usuario,password);
        }
        else if(tipo==2){
            usuario_nuevo   = new Doctor(usuario,password);
        }
       
        return usuario_nuevo;
    }
}
