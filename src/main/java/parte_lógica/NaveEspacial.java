package parte_lógica;
import java.util.*;
/**Clase nave espacial
 * @author Gustavo González
 * @version versión 1, 10 de junio 2024*/
public abstract class NaveEspacial {
    /***/
    private String horario;
    /***/
    private String recorrido;
    /***/
    private String modelo;
    /***/
    private ArrayList<Asiento> asientos = new ArrayList<>();
    /***/
    public NaveEspacial() {
    }
    /***/
    public void add(Asiento asiento) {
        asientos.add(asiento);
    }
}