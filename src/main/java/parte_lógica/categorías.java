package parte_lógica;
/**Categorías de asiento
 * @author Gustavo González
 * @version versión 1, 10 de junio 2024*/
public enum categorías {
    /**Constantes de la enumeración (categorías de asientos)*/
    SEMI_CAMA("semi cama"),
    SALÓN_CAMA("salón cama");
    /**Categoría del asiento*/
    private final String categoría;
    /**Constructor de categorías
     * @param categoría String*/
    categorías(String categoría) {
        this.categoría = categoría;
    }
}