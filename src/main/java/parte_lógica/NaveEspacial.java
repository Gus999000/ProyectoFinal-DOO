package parte_lógica;
import java.util.*;
/**Clase nave espacial
 * @author Gustavo González
 * @version versión 2, 17 de junio 2024*/
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
    public NaveEspacial(String horario, String recorrido, Modelos modelo) {
        this.horario = horario;
        this.recorrido = recorrido;
        this.modelo = modelo.getmodelo();
    }
    /***/
    public void add(Asiento asiento) {
        asientos.add(asiento);
    }
    /**Getter del modelo de la nave espacial
     * @return modelo de la nave espacial*/
    public String getModelo() {
        return modelo;
    }
}