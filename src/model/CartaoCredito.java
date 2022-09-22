
package model;


public class CartaoCredito implements FormaPagamento {
    private double taxJuros;
    
    public CartaoCredito(double taxJuros) {
        this.taxJuros = taxJuros/100;
        
    }
    
    @Override
    public double calcular(double valor){
        return valor + (valor * this.taxJuros);
    }
    @Override
    public String descricao(){
        return "Cartão de Credito";
    }
    
}
