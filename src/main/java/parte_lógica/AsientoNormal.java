package parte_lógica;
/**Clase AsientoNormal
 * @author Gustavo González
 * @version versión 1, 29 de junio 2024*/
public class AsientoNormal extends Asiento {
    /**Constructor de la clase AsientoNormal
     * @param número int*/
    public AsientoNormal(int número) {
        super(número, Categorías.NORMAL);
    }
}