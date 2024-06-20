package parte_lógica;
/**Categorías de asiento
 * @author Gustavo González
 * @version versión 4, 19 de junio 2024*/
public enum Modelos {
    /**Constantes de la enumeración (modelos de naves espaciales)*/
    UES_CONTACT_LIGHT("UES Contact Light"),
    ARCA_DEL_VACÍO("Arca del Vacío"),
    HALCÓN_MILENARIO("Halcón Milenario"),
    APOLO_11("Apolo 11"),
    MORNING_STAR("Morning Star");
    /**Modelo de la nave*/
    private final String modelo;
    /**Constructor de Modelos
     * @param modelo String*/
    Modelos(String modelo) {
        this.modelo = modelo;
    }
    /**Getter del modelo de la nave espacial
     * @return modelo de la nave espacial*/
    public String getmodelo() {
        return modelo;
    }
}