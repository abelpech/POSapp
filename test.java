/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.sql.Connection;

/**
 *
 * @author pech
 */
public class test {
    

    
    public static void main(String[] args) {
            conectar conn = new conectar();
            Connection c = conn.conexion();
    }
}
