/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author fclou
 */
public class Conexion {
    
    public static Connection conectar(){
        Connection cn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection(
            "jdbc:sqlserver://localhost; DataBaseName=EjemploStruts","sa","sqladmin");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cn;
    }
    
}
