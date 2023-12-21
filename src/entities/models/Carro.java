
package entities.models;

import java.util.ArrayList;
import java.util.Date;


public class Carro {
    private static int contador = 0;
    private Integer id;
    private String modelo;
    private String placa;
    private Cor cor;
    private Integer ano;
    private Date dataAquisicao;
    
    private ArrayList <Locacao> locacoes = new ArrayList();

    public Carro(String modelo, String placa, Cor cor, Integer ano, Date dataAquisicao) {
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.ano = ano;
        this.dataAquisicao = dataAquisicao;
        contador++;
        this.id = contador; 
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Date getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(Date dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }
    
    @Override
    public String toString() {
        return "Carro{" + "id=" + id + ", modelo=" + modelo + ", placa=" + placa + ", cor=" + cor + ", ano=" + ano + ", dataAquisicao=" + dataAquisicao + ", locacoes=" + locacoes + '}';
    }

    
}
