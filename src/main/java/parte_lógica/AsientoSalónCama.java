package parte_lógica;
/**Clase AsientoSalónCama
 * @author Gustavo González
 * @version versión 1, 29 de junio 2024*/
public class AsientoSalónCama extends Asiento {
    /**Constructor de la clase AsientoSalónCama
     * @param número int*/
    public AsientoSalónCama(int número) {
        super(número, Categorías.SALÓN_CAMA);
    }
}