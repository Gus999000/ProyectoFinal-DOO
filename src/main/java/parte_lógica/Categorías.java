package parte_lógica;
/**Categorías de asiento
 * @author Gustavo González
 * @version versión 3, 29 de junio 2024*/
public enum Categorías {
    /**Constantes de la enumeración (categorías de asientos)*/
    SEMI_CAMA("Semi cama", 5000),
    SALÓN_CAMA("Salón cama", 10000),
    NORMAL("Normal", 1000),
    MASAJEADOR("Masajeador", 15000);
    /**Categoría del asiento*/
    private final String categoría;
    /**Precio del asiento*/
    private final int precio;
    /**Constructor de categorías
     * @param categoría String
     * @param precio int*/
    Categorías(String categoría, int precio) {
        this.categoría = categoría;
        this.precio = precio;
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