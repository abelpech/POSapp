/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author pech
 */
public class conectar {
    
    Connection conectar = null;
    
    String URL = "jdbc:mysql://localhost:3306/";
    String DRIVER = "com.mysql.jdbc.Driver";
    String USERNAME = "cesun";
    String PASSWORD = "Universidad1#";
    String DATABASE = "tienda";


    public Connection conexion()
    {
        try
        {
            Class.forName(DRIVER);
           // conectar=DriverManager.getConnection(URL + BD + Usuario + Contra);
             conectar = DriverManager.getConnection(URL + DATABASE , USERNAME, PASSWORD);
            System.out.println("Conexion Realizada Exitosamente");

        }
        catch(Exception e)
                {
                    System.out.println("Error " + e);
                }
        return conectar;
    }
    
}
