package produto;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.notNullValue;
import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Assertions;

/**
 *
 * @author leandro
 */
public class ProdutoTest {

    Produto livro;

    @Before
    public void setUp() {
        livro = new Produto("Introdução ao Teste de Software", 100.00);
    }

    @Test
    public void testCriaProduto() {
        Assertions.assertAll("livro",
                () -> assertEquals("Introdução ao Teste de Software", livro.getNome()),
                () -> assertTrue(100.00 == livro.getPreco())
        );
    }

    @Test
    public void testProdutosIguais() {
        Produto livro2 = new Produto("Introdução ao Teste de Software", 90.00);

        assertNotSame(livro, livro2);
    }

    @Test
    public void assertionComHamcrestMatcher() {
        assertThat(livro.getPreco(), equalTo(100.00));
        assertThat(livro.getNome(), notNullValue());
        assertThat(livro.getNome(), containsString("Teste"));
        assertThat(livro, instanceOf(Produto.class));
    }
}
