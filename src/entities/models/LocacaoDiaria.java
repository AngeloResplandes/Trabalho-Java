
package entities.models;

import java.util.Date;

public class LocacaoDiaria extends Locacao {

    public LocacaoDiaria(Integer diasPrevistos, Date instanteLocacao, Date instanteDevolucao, Cliente cliente, Double valorDiaria) {
        super(instanteLocacao, instanteDevolucao, cliente, valorDiaria);
        this.diasPrevistos = diasPrevistos;
    }

  
    
    private Integer diasPrevistos;

    public Integer getDiasPrevistos() {
        return diasPrevistos;
    }

    public void setDiasPrevistos(Integer diasPrevistos) {
        this.diasPrevistos = diasPrevistos;
    }
    
}
