/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import util.Conexion;

/**
 *
 * @author fclou
 */
public class ClienteDAO {
    
    Connection cn = Conexion.conectar();
    
    public boolean guardar(Cliente cliente){
        boolean resultado = false;
        try {
            String sql = "INSERT INTO Cliente VALUES(?,?,?,?)";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString( 1, cliente.getNombre() );
            pstm.setInt(2, cliente.getEdad() );
            pstm.setString( 3, cliente.getDni() );
            pstm.setString(4, cliente.getCorreo());
            
            if(pstm.executeUpdate() > 0){
                resultado = true;
            }            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }
    
    public boolean eliminar(int codigo){
        boolean resultado = false;
        try {
            String sql = "DELETE FROM Cliente WHERE Codigo = ? ";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setInt( 1, codigo );
            
            if( pstm.executeUpdate() > 0 ){
                resultado = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }
    
    public List<Cliente> listar(){
        List<Cliente> lstClientes = new ArrayList();
        try {
            String sql = "SELECT * FROM Cliente";
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()){
                int codigo = rs.getInt(1);
                String nombre = rs.getString(2);
                int edad = rs.getInt(3);
                String dni = rs.getString(4);
                String correo = rs.getString(5);
                
                Cliente cliente = new Cliente(codigo, nombre, edad, dni, correo);
                lstClientes.add(cliente);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstClientes;
    }
    
}
