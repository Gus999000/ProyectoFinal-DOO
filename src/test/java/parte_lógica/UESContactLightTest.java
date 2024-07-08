package parte_lógica;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
/**Test para verificar la inicialización de los asientos en UESContactLight
 * @author Gustavo Benitez
 * @version 1, 07 de julio de 2024*/
class UESContactLightTest {

    @Test
    void deberíaInicializarConElNúmeroCorrectoDeAsientos() {
        String horario = "09:00";
        String horario1 = "15:00";
        String horario2 = "22:00";
        String recorrido = "Órbita de Plutón";

        UESContactLight uesContactLight = new UESContactLight(horario, horario1, horario2, recorrido);

        assertThat(uesContactLight.getAsiento(0)).isInstanceOf(AsientoNormal.class);
        assertThat(uesContactLight.getAsiento(99)).isInstanceOf(AsientoNormal.class);
    }
}
