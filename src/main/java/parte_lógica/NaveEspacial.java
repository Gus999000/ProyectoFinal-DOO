package parte_lógica;
import java.util.*;
/**Clase nave espacial
 * @author Gustavo González
 * @version versión 3, 19 de junio 2024*/
public abstract class NaveEspacial {
    /**Horario de salida de la nave espacial*/
    private String horario;
    /**Recorrido (destino) de la nave espacial*/
    private String recorrido;
    /**Modelo de la nave espacial*/
    private String modelo;
    /**Asientos de la nave espacial*/
    private ArrayList<Asiento> asientos = new ArrayList<>();
    /**Constructor de NaveEspacial*/
    public NaveEspacial(String horario, String recorrido, Modelos modelo) {
        this.horario = horario;
        this.recorrido = recorrido;
        this.modelo = modelo.getmodelo();
    }
    /**Método para añadir asientos*/
    public void add(Asiento asiento) {
        asientos.add(asiento);
    }
    /**Getter del horario de la nave espacial
     * @return horario de salida de la nave espacial*/
    public String getHorario() {
        return horario;
    }
    /**Getter del recorrido de la nave espacial
     * @return destino de la nave espacial*/
    public String getRecorrido() {
        return recorrido;
    }
    /**Getter del modelo de la nave espacial
     * @return modelo de la nave espacial*/
    public String getModelo() {
        return modelo;
    }
    /**Getter de un asiento de la nave espacial
     * @return un asiento de la nave espacial*/
    public Asiento getAsiento(int i) {
        return asientos.get(i);
    }
}