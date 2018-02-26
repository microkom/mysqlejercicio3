/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysqlejercicio3;

import java.sql.*;

/**
 *
Crear una aplicación que muestre por pantalla el identificador
del cliente, su nombre y la cantidad de pedidos que ha hecho.
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Conexion login = new Conexion();
        Connection con = null;
        PreparedStatement stmt = null;
        
        try{
            con = login.conectar();
            
            //Consulta a la base de datos
            stmt = con.prepareStatement("SELECT * FROM cliente");
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
