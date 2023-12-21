
package entities.models;

import java.util.ArrayList;
import java.util.List;


public class Cliente {
    private String cpf;
    private String nome;
    private String email;
    private static int contador = 0;
    private List <Locacao> locacoes = new ArrayList();
    private List <Telefone> telefones = new ArrayList();
    
    public Cliente(String cpf, String nome, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        contador++;
    }
    
    public Cliente(String cpf, String nome, String email, List telefones) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.telefones = telefones;
    }
    

    public List<Locacao> getLocacoes() {
        return locacoes;
    }

    public void setLocacoes(List<Locacao> locacoes) {
        this.locacoes = locacoes;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public String toString() {
        return "Cliente{" + "cpf=" + cpf + ", nome=" + nome + ", email=" + email + ", locacoes=" + locacoes + ", telefones=" + telefones + '}';
    }
    
    public void adicionarLocacao(Locacao locacao){
        if(locacao != null){
            this.locacoes.add(locacao);
        }
    }
    
    
}
