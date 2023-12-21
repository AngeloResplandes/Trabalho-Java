
package entities.models;


public class Cidade {
    private String nome;
    private Integer id;
    private Estado estado;
    private static int contador = 0;
    public Cidade(String nome, Estado estado) {
        this.nome = nome;
        this.estado = estado;
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cidade{" + "nome=" + nome + ", id=" + id + ", estado=" + estado + '}';
    }
    
}
