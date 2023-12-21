package entities.models;

import java.util.Date;

public class Locacao {

    private Integer id;
    private Date instanteLocacao;
    private Date instanteDevolucao;
    private Cliente cliente;
    private static int contador = 0;
    private Double valorDiaria;
    
    public Locacao( Date instanteLocacao, Date instanteDevolucao, Cliente cliente, Double valorDiaria) {
        this.instanteLocacao = instanteLocacao;
        this.instanteDevolucao = instanteDevolucao;
        this.cliente = cliente;
        contador++;
        this.id = contador;
        this.valorDiaria = valorDiaria;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getInstanteLocacao() {
        return instanteLocacao;
    }

    public void setInstanteLocacao(Date instanteLocacao) {
        this.instanteLocacao = instanteLocacao;
    }

    public Date getInstanteDevolucao() {
        return instanteDevolucao;
    }

    public void setInstanteDevolucao(Date instanteDevolucao) {
        this.instanteDevolucao = instanteDevolucao;
    }

    public Double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(Double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
    
}
