package parte_lógica;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
/**Test para verificar la inicialización de los asientos en Apolo11
 * @author Gustavo Benitez
 * @version 1, 07 de julio de 2024*/
class Apolo11Test {

    @Test
    void deberíaInicializarConElNúmeroCorrectoDeAsientos() {
        String horario = "10:00";
        String horario1 = "14:00";
        String horario2 = "18:00";
        String recorrido = "Base Lunar";

        Apolo11 apolo11 = new Apolo11(horario, horario1, horario2, recorrido);

        assertThat(apolo11.getAsiento(0)).isInstanceOf(AsientoNormal.class);
        assertThat(apolo11.getAsiento(19)).isInstanceOf(AsientoNormal.class);
        assertThat(apolo11.getAsiento(20)).isInstanceOf(AsientoSemiCama.class);
        assertThat(apolo11.getAsiento(29)).isInstanceOf(AsientoSemiCama.class);
        assertThat(apolo11.getAsiento(30)).isInstanceOf(AsientoSalónCama.class);
        assertThat(apolo11.getAsiento(39)).isInstanceOf(AsientoSalónCama.class);
        assertThat(apolo11.getAsiento(40)).isInstanceOf(AsientoMasajeador.class);
        assertThat(apolo11.getAsiento(49)).isInstanceOf(AsientoMasajeador.class);
    }
}
