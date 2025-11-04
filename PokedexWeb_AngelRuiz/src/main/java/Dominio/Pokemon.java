package Dominio;

/**
 * Esta clase representa al Pokémon
 * @author Ángel Ruíz García - 248171
 */
public class Pokemon {

    private String nombre;
    private int numero;
    private String tipo;
    private String imagenUrl;

    public Pokemon(String nombre, int numero, String tipo, String imagenUrl) {
        this.nombre = nombre;
        this.numero = numero;
        this.tipo = tipo;
        this.imagenUrl = imagenUrl;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }
}
