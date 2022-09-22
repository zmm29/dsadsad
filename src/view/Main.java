package view;

import model.Venda;

public class Main {
	public static void main(String[] args) {
		Venda venda = new Venda();
		venda.addItemVenda(8, 2);
		venda.addItemVenda(1, 2);
		venda.addItemVenda(2, 1);
                venda.setFormaPagamento("d");
		
		for (String formatacaoItem : venda.getItensVenda()) {
			System.out.println(formatacaoItem);
		}
		
		System.out.println(venda.getValorTotal());
                System.out.println(venda.getFormaPagamento().descricao());
                
                System.out.println(venda.getFormaPagamento().calcular(venda.getValorTotal()));
	}
}
