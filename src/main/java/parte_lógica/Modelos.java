package parte_lógica;
/**Categorías de asiento
 * @author Gustavo González
 * @version versión 2, 17 de junio 2024*/
public enum Modelos {
    /**Constantes de la enumeración (categorías de asientos)*/
    UES_CONTACT_LIGHT("UES Contact Light"),
    SALÓN_CAMA("salón cama");
    /**Categoría del asiento*/
    private final String modelo;
    /**Constructor de categorías
     * @param modelo String*/
    Modelos(String modelo) {
        this.modelo = modelo;
    }
    /**Getter del modelo de la nave espacial
     * @return modelo de la nave espacial*/
    public String getModelo() {
        return modelo;
    }
}