package carrinho;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Assertions;
import produto.Produto;

/**
 *
 * @author leandro
 */
public class CarrinhoTest {
    
    Carrinho carrinho;
    Produto livro;
    
    @Before
    public void setUp() {
        carrinho = new Carrinho();
    }
    
    @Test
    public void testGetValorTotal() {
        livro = new Produto("Introdução ao Teste de Software 1", 120.00);
        carrinho.addItem(livro);
        livro = new Produto("Introdução ao Teste de Software 2", 150.00);
        carrinho.addItem(livro);
        
        System.out.println(carrinho);
        
        double valorTotal = carrinho.getValorTotal();
        
        assertTrue(valorTotal == 270.00);
    }

    @Test
    public void testAddItem() {
        livro = new Produto("Introdução à Loucura 1", 123.00);
        carrinho.addItem(livro);
        
        boolean verificaItem = carrinho.verificaItem(livro);
        
        assertTrue(verificaItem == true);
    }

    @Test
    public void testRemoveItem() throws Exception {
        carrinho.removeItem(livro);
        
        boolean verificaItem = carrinho.verificaItem(livro);
        
        assertTrue(verificaItem == false);
    }

    @Test
    public void testGetQtdeItems() {
        livro = new Produto("Introdução ao Desespero 1", 444.00);
        carrinho.addItem(livro);
        livro = new Produto("Introdução ao Desespero 2", 777.00);
        carrinho.addItem(livro);
        int qtdeItems = carrinho.getQtdeItems();
        
        Assertions.assertEquals(2, qtdeItems);
    }

    @Test
    public void testEsvazia() {
        carrinho.esvazia();
        
        int qtdeItems = carrinho.getQtdeItems();
        
        Assertions.assertEquals(0, qtdeItems);
    }
    
}
