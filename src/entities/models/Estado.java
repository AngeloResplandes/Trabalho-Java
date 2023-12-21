
package entities.models;

import java.util.ArrayList;


public class Estado {
    private String nome;
    private Integer id;
    private static int contador = 0;
    private ArrayList <Cidade> cidades = new ArrayList();

    public Estado(String nome) {
        this.nome = nome;
        contador++;
        this.id = contador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "Estado{" + "nome=" + nome + ", id=" + id + ", cidades=" + cidades + '}';
    }
    
}
