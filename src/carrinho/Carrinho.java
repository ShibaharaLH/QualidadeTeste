package carrinho;

import produto.ProdutoNaoEncontradoException;
import java.util.ArrayList;
import java.util.Iterator;
import produto.Produto;

/**
 *
 * @author leandro
 */
public class Carrinho {
    private ArrayList items;
    
    public Carrinho() {
        items = new ArrayList();
    }
    
    public double getValorTotal() {
        double valorTotal = 0.0;
        
        for (Iterator i = items.iterator(); i.hasNext();) {
            Produto item = (Produto) i.next();
            valorTotal += item.getPreco();
        }
        
        return valorTotal;
    }
    
    public void addItem(Produto item) {
        items.add(item);
    }
	
    public void removeItem(Produto item) throws ProdutoNaoEncontradoException {
	if (!items.remove(item)) {
            throw new ProdutoNaoEncontradoException();
	} else {
            items.remove(item);
        }
    }
	
    public int getQtdeItems() {
	return items.size();
    }
	
    public void esvazia() {
	items.clear();
    }
    
    public boolean verificaItem(Produto item) {
        if (items.contains(item)) {
            return true;
        } else {
            return false;
        }
    }
}
