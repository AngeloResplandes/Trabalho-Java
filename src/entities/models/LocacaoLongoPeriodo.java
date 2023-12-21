
package entities.models;

import java.util.Date;

public class LocacaoLongoPeriodo extends Locacao {

    public LocacaoLongoPeriodo(Double porcetagemDesconto, Date instanteLocacao, Date instanteDevolucao, Cliente cliente, Double valorDiaria) {
        super(instanteLocacao, instanteDevolucao, cliente, valorDiaria);
        this.porcetagemDesconto = porcetagemDesconto;
    }
    
    private Double porcetagemDesconto;

    public Double getPorcetagemDesconto() {
        return porcetagemDesconto;
    }

    public void setPorcetagemDesconto(Double porcetagemDesconto) {
        this.porcetagemDesconto = porcetagemDesconto;
    }
    
}
