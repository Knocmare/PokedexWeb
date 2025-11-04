package Servlets;

import Dominio.Pokemon;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Knocmare
 */
@WebServlet(name = "listPokemonServlet", urlPatterns = {"/listPokemon"})
public class listPokemonServlet extends HttpServlet {

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
        ServletContext context = getServletContext();
        List<Pokemon> lista = (List<Pokemon>) context.getAttribute("pokemones");
        
        if (lista == null) {
            lista = new ArrayList<>();
        }
        
        request.setAttribute("pokemones", lista);
        RequestDispatcher dispatcher = request.getRequestDispatcher("listaPokemon.jsp");
        dispatcher.forward(request, response);
    }
}
