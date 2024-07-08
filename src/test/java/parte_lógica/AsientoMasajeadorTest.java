package parte_lógica;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
/**Test para verificar la creación del Asiento Masajeador
 * @author Gustavo Benitez
 * @version 1, 08 de julio de 2024*/
class AsientoMasajeadorTest {

    @Test
    void deberíaCrearAsientoMasajeadorConLasPropiedadesCorrectas() {
        int numero = 15;

        AsientoMasajeador asientoMasajeador = new AsientoMasajeador(numero);

        assertThat(asientoMasajeador.getNúmero()).isEqualTo(numero);
        assertThat(asientoMasajeador.getCategoría()).isEqualTo("Masajeador");
        assertThat(asientoMasajeador.getPrecio()).isEqualTo(15000);
    }
}
