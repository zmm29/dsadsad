package model;

public class ItemVenda {
	private Produto produto;
	private int quantidade;
	
	public ItemVenda(int codProduto, int qtdeVendida) {
		quantidade = qtdeVendida;
		
		BancoDados bd = new BancoDados();
		String[] dadosProduto = bd.selectProduto(codProduto);
		
		produto = new Produto();
		produto.setNome(dadosProduto[0]);
		produto.setPreco(Double.parseDouble(dadosProduto[1]));
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public double getValorTotal(){
		return quantidade * produto.getPreco();
	}

	public String getRepresentacaoString() {
		return this.getProduto().getNome() + 
			   " - " + this.getProduto().getPreco() + 
		       " - " + this.getValorTotal();
	}
}
