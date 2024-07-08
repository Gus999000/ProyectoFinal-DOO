package parte_lógica;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
/**Test para verificar la inicialización de los asientos en MorningStar
 * @author Gustavo Benitez
 * @version 1, 07 de julio de 2024*/
class MorningStarTest {

    @Test
    void deberíaInicializarConElNúmeroCorrectoDeAsientos() {
        String horario = "06:00";
        String horario1 = "11:00";
        String horario2 = "17:00";
        String recorrido = "Órbita de Saturno";

        MorningStar morningStar = new MorningStar(horario, horario1, horario2, recorrido);

        assertThat(morningStar.getAsiento(0)).isInstanceOf(AsientoNormal.class);
        assertThat(morningStar.getAsiento(10)).isInstanceOf(AsientoNormal.class);
        assertThat(morningStar.getAsiento(36)).isInstanceOf(AsientoSalónCama.class);
        assertThat(morningStar.getAsiento(37)).isInstanceOf(AsientoSalónCama.class);
        assertThat(morningStar.getAsiento(38)).isInstanceOf(AsientoMasajeador.class);
        assertThat(morningStar.getAsiento(49)).isInstanceOf(AsientoMasajeador.class);
    }
}
