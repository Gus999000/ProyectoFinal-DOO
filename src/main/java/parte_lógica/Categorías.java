package parte_lógica;
/**Categorías de asiento
 * @author Gustavo González
 * @version versión 2, 17 de junio 2024*/
public enum Categorías {
    /**Constantes de la enumeración (categorías de asientos)*/
    SEMI_CAMA("semi cama", 5000),
    SALÓN_CAMA("salón cama", 10000);
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