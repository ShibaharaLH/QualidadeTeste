package calculadora;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

/**
 *
 * @author leandro
 */
public class CalculadoraTest {
    
    private Calculadora calc;
    
    @Before
    public void inicializa() {
        calc = new Calculadora();
    }

    @Test
    public void testSoma() {
        int soma = calc.soma(4, 5);
        Assertions.assertEquals(9, soma);
    }

    @Test
    public void testSubtracao() {
        int subtrai = calc.subtracao(4, 5);
        Assertions.assertEquals(-1, subtrai);
    }

    @Test
    public void testMultiplicacao() {
        int multiplica = calc.multiplicacao(2, 5);
        Assertions.assertEquals(10, multiplica);
    }

    @Test
    public void testDivisaoDoisNumeros() {
        int divisao = calc.divisao(8, 4);
        assertTrue(divisao == 2);
    }
    
    @Test
    public void somatoria() {
        int somatoria = calc.somatoria(2);
        Assertions.assertEquals(3, somatoria);
    }

    @Test
    public void testDivisaoPorZero() {
        try {
            int divisao = calc.divisao(8, 0);
            fail("Exceção não lançada");
        } catch (ArithmeticException e) {
            assertEquals("/ by zero", e.getMessage());
        }
    }
    
    @Test
    public void testDivisaoPorZeroComAssertThrows() {
        assertThrows(IllegalArgumentException.class, () -> {throw new IllegalArgumentException("a message");});
        
    }

    @Test
    public void testEhPositivo() {
        boolean positivo = calc.ehPositivo(10);
        assertTrue(positivo);
    }

    @Test
    public void testCompara() {
        int compara = calc.compara(5, 5);
        assertTrue(compara == 0);
    }
}
