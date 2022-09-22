package model;

public class CartaoDebito implements FormaPagamento {
    
    private double taxaDesconto;
    
    public CartaoDebito(double tavaDesconto){
        this.taxaDesconto = tavaDesconto/100;
    }
    
    @Override
    public double calcular(double valor){
        return valor - (valor * this.taxaDesconto);
    }
     @Override
    public String descricao(){
        return "Cartão de Debito";
    }
}
