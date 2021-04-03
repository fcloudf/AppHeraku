/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ClienteDAO;
import entity.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fclou
 */
@WebServlet(name = "ClienteServlet", urlPatterns = {"/guardarCliente","/eliminarCliente"})
public class ClienteServlet extends HttpServlet {

    ClienteDAO clientedao = new ClienteDAO();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.setCharacterEncoding("UTF-8");
        
        String url = request.getServletPath();
        
        switch(url){
            case "/guardarCliente" : guardarCliente(request, response); break;
            case "/eliminarCliente" : eliminarCliente(request, response); break;
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void guardarCliente(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        String nombre = request.getParameter("nombre");
        int edad = Integer.parseInt( request.getParameter("edad") );
        String dni = request.getParameter("dni");
        String correo = request.getParameter("correo");
        
        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setEdad(edad);
        cliente.setDni(dni);
        cliente.setCorreo(correo);
        
        clientedao.guardar(cliente);
        
        response.sendRedirect("listarClientes.jsp");
        
    }

    private void eliminarCliente(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        int codigo = Integer.parseInt( request.getParameter("codigo") );
        
        clientedao.eliminar(codigo);
        
        response.sendRedirect("listarClientes.jsp");
        
    }

}
