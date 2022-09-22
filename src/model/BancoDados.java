package model;

import java.util.HashMap;
import java.util.Map;

public class BancoDados {
	private Map<Integer, String[]> produtos = new HashMap<>();
        
        private Map<String, FormaPagamento> formasPagamento = new HashMap();
        
	
	public BancoDados() {
		produtos.put(1, new String[] {"Arroz", "5"});
		produtos.put(2, new String[] {"Feijão", "10"});
		produtos.put(3, new String[] {"Milho", "3"});
		produtos.put(4, new String[] {"Sal", "2"});
		produtos.put(5, new String[] {"Açucar", "7"});
		produtos.put(6, new String[] {"Café", "12"});
		produtos.put(7, new String[] {"51", "20.5"});
		produtos.put(8, new String[] {"Pão", "10"});
		produtos.put(9, new String[] {"Pão", "10"});
		produtos.put(10, new String[] {"Pão", "10"});
                
                CartaoCredito cc = new CartaoCredito(5);
                CartaoDebito cd = new CartaoDebito(0);
                Dinheiro d = new Dinheiro(5);
                
                formasPagamento.put("cc", cc);
                formasPagamento.put("cd", cd);
                formasPagamento.put("d", d);
                
	}
	
	public String[] selectProduto(Integer codigo){
		if (!this.produtos.containsKey(codigo)) {
			return new String[]{"Produto Inválido", "0"};
		}
		
		return this.produtos.get(codigo);
	}

    FormaPagamento selectFormaPagamento(String forma) {
        return formasPagamento.get(forma);
        
    }
}
