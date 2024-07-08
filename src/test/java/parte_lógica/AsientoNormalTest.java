package parte_lógica;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
/**Test para verificar la creación del Asiento Normal
 * @author Gustavo Benitez
 * @version 1, 08 de julio de 2024*/
class AsientoNormalTest {

    @Test
    void deberíaCrearAsientoNormalConLasPropiedadesCorrectas() {
        int numero = 22;

        AsientoNormal asientoNormal = new AsientoNormal(numero);

        assertThat(asientoNormal.getNúmero()).isEqualTo(numero);
        assertThat(asientoNormal.getCategoría()).isEqualTo("Normal");
        assertThat(asientoNormal.getPrecio()).isEqualTo(1000);
    }
}
