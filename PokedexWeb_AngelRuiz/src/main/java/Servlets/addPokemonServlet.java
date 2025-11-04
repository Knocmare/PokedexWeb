package Servlets;

import Dominio.Pokemon;
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
 * @author Ángel Ruíz García - 248171
 */
@WebServlet(name = "addPokemonServlet", urlPatterns = {"/addPokemon"})
public class addPokemonServlet extends HttpServlet {

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
        String nombre = request.getParameter("nombre");
        int numero = Integer.parseInt(request.getParameter("numero"));
        String tipo = request.getParameter("tipo");
        String imagenUrl = request.getParameter("imagen");

        Pokemon nuevoPokemon = new Pokemon(nombre, numero, tipo, imagenUrl);

        // Lo guarda en una lista de aplicación
        // "El reemplazo de la BD" (no creo que se la mejor descripción)(sin BD)
        ServletContext context = getServletContext();
        List<Pokemon> lista = (List<Pokemon>) context.getAttribute("pokemones");
        
        if (lista == null) {
            lista = new ArrayList<>();
        }
        
        lista.add(nuevoPokemon);
        context.setAttribute("pokemones", lista);
        
        // Redirige a lista
        response.sendRedirect("listPokemon");
    }

}
