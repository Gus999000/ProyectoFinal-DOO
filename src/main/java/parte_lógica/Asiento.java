package parte_lógica;
/**Clase de un asiento
 * @author Gustavo González
 * @version versión 3, 28 de junio 2024*/
public abstract class Asiento {
    /**Disponibilidad del asiento*/
    private boolean disponibilidad = true;
    /**Número del asiento*/
    private int número;
    /**Categoría del asiento (semi cama, salón cama, etc)*/
    private String categoría;
    /**Precio del asiento*/
    private int precio;
    /**Constructor de la clase asiento
     * @param número int
     * @param categoría Categorías*/
    public Asiento(int número, Categorías categoría) {
        this.número = número;
        this.categoría = categoría.getCategoría();
        this.precio = categoría.getPrecio();
    }
    /**Método que cambia la disponibilidad a "no disponible"*/
    public void reservar() {
        this.disponibilidad = false;
    }
    /**Getter de la disponibilidad del asiento
     * @return disponibilidad del asiento*/
    public boolean getDisponibilidad() {
        return disponibilidad;
    }
    /**Getter del número del asiento
     * @return número del asiento*/
    public int getNúmero() {
        return número;
    }
    /**Getter de la categoría del asiento
     * @return categoría del asiento*/
    public String getCategoría() {
        return categoría;
    }
    /**Getter del precio del asiento
     * @return precio del asiento*/
    public int getPrecio() {
        return precio;
    }
}