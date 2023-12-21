
package entities.models;

import java.util.ArrayList;
import java.util.List;

public class Sede {
    private Integer id;
    private Localidade localidade;
    private Endereco enderecoSede;
    private List <Carro> carros = new ArrayList();
    private List <Locacao> locacoes = new ArrayList();
    private List <Cliente> clientes = new ArrayList();
    private int contador = 0;
    
    public Sede(Localidade localidade, Endereco enderecoSede) {
        this.id = id;
        this.localidade = localidade;
        this.enderecoSede = enderecoSede;
        contador++;
        this.id = contador;
    }

    public List<Locacao> getLocacoes() {
        return locacoes;
    }

    public void setLocacoes(List<Locacao> locacoes) {
        this.locacoes = locacoes;
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

    public Localidade getLocalidade() {
        return localidade;
    }

    public void setLocalidade(Localidade localidade) {
        this.localidade = localidade;
    }

    public Endereco getEnderecoSede() {
        return enderecoSede;
    }

    public void setEnderecoSede(Endereco enderecoSede) {
        this.enderecoSede = enderecoSede;
    }
    public void adicionarCarro(Carro carro){
        this.carros.add(carro);
    }
    public void adicionarCliente(Cliente cliente){
        this.clientes.add(cliente);
    } 

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    
}
