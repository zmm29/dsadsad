package model;

public class Dinheiro implements FormaPagamento {
    
    private double taxaDesconto;
    
    public Dinheiro(double tavaDesconto){
        this.taxaDesconto = tavaDesconto/100;
    }
    
    @Override
    public double calcular(double valor){
        return valor - (valor * this.taxaDesconto);
    }
     @Override
    public String descricao(){
        return "Dinehiro";
    }
}
