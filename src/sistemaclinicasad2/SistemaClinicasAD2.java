/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaclinicasad2;
import moduloUsuarios.*;
/**
 *
 * @author Justo
 */
public class SistemaClinicasAD2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FabricaUsuariosInterfaz fabrica = new FabricaUsuarios();
        Usuario doctor = fabrica.creacionUsuario("doctor", "contraDoc", 1);
         
        
        
        
    }
    
}
