package parte_lógica;
import java.util.*;
/**Clase nave espacial
 * @author Gustavo González
 * @version versión 4, 26 de junio 2024*/
public abstract class NaveEspacial {
    /**Horarios de salida de la nave espacial*/
    private String horario;
    private String horario1;
    private String horario2;
    /**Recorrido (destino) de la nave espacial*/
    private String recorrido;
    /**Modelo de la nave espacial*/
    private String modelo;
    /**Asientos de la nave espacial*/
    private ArrayList<Asiento> asientos = new ArrayList<>();
    /**Constructor de NaveEspacial
     * @param horario String
     * @param horario1 String
     * @param horario2 String
     * @param recorrido String
     * @param modelo Modelos*/
    public NaveEspacial(String horario, String horario1, String horario2, String recorrido, Modelos modelo) {
        this.horario = horario;
        this.horario1 = horario1;
        this.horario2 = horario2;
        this.recorrido = recorrido;
        this.modelo = modelo.getmodelo();
    }
    /**Método para añadir asientos*/
    public void addAsiento(Asiento asiento) {
        asientos.add(asiento);
    }
    /**Getter del horario de la nave espacial
     * @return horario de salida de la nave espacial*/
    public String getHorario() {
        return horario;
    }
    /**Getter del horario1 de la nave espacial
     * @return horario1 de salida de la nave espacial*/
    public String getHorario1() {
        return horario1;
    }
    /**Getter del horario2 de la nave espacial
     * @return horario2 de salida de la nave espacial*/
    public String getHorario2() {
        return horario2;
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