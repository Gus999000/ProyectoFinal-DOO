package parte_lógica;
/**Clase de un asiento
 * @author Gustavo González
 * @version versión 1, 10 de junio 2024*/
public abstract class asiento {
    /**Disponibilidad del asiento*/
    private boolean disponibilidad = true;
    /**Número del asiento*/
    private int número;
    /**Categoría del asiento (semi cama, salón cama, etc)*/
    private categorías categoría;
    /**Precio del asiento*/
    private int precio;
    /**Constructor de la clase asiento*/
    public asiento() {
    }
    /**Método que cambia la disponibilidad a "no disponible"*/
    public void reservar() {
        this.disponibilidad = false;
    }
}