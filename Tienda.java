/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.sql.Connection;

/**
 *
 * @author aleman
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        conectar cc=  new conectar();
//        Connection con = cc.conexion();
      
    login log = new login();
    log.setVisible(true);
/*  ALEMAN
      Alta a = new Alta();
      a.setVisible(true);
      
      venta_producto b = new venta_producto();
      b.setVisible(true);
      
       listaventas c = new listaventas();
      c.setVisible(true);
      */


     // jframe j = new jframe();
      //j.setVisible(true);
        
    }
    
}
