
package entities.models;

import java.util.ArrayList;
import java.util.List;


public class Categoria {
    private Integer id;
    private String descricao;
    private Double precoDiario;
    private List <Carro> carros = new ArrayList();
    
    public Categoria(Integer id, String descricao, Double precoDiario) {
        this.id = id;
        this.descricao = descricao;
        this.precoDiario = precoDiario;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPrecoDiario() {
        return precoDiario;
    }

    public void setPrecoDiario(Double precoDiario) {
        this.precoDiario = precoDiario;
    }
    
    
}
