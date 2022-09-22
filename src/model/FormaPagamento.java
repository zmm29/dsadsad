
package model;

public interface FormaPagamento {
    String descricao();
    
    double calcular(double valor);
    
}
