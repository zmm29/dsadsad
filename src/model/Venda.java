package model;

import java.util.ArrayList;
import java.util.List;

public class Venda {
	private List<ItemVenda> itens = 
			new ArrayList<ItemVenda>();
        
        private FormaPagamento formaPagamento;
        
        public void setFormaPagamento(String formaPagamento) {
            BancoDados bd = new BancoDados();
            this.formaPagamento = bd.selectFormaPagamento(formaPagamento);           
            
        }
        public FormaPagamento getFormaPagamento() {
            return this.formaPagamento;
        }
	
	public void addItemVenda(int codProduto, int qtde){
		ItemVenda item = new ItemVenda(codProduto, qtde);
		itens.add(item);
	}
	
	public List<String> getItensVenda(){
		List<String> itensFormatados = 
				new ArrayList<String>();
		
		for(ItemVenda iv : itens){
			itensFormatados.add(iv.getRepresentacaoString());
		}
		
		return itensFormatados;
	}
	
	public double getValorTotal(){
		double total = 0;
		
		for (ItemVenda itemVenda : itens) {
			total += itemVenda.getValorTotal();
		}
		
		return total;
	}
}
