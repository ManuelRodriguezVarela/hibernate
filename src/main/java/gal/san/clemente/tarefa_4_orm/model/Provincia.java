package gal.san.clemente.tarefa_4_orm.model;

import java.io.Serializable;
import java.util.Objects;

public class Provincia implements Serializable {

    private Long id;
    private String nome;

    public Provincia() {
    }

    public Provincia(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Provincia provincia = (Provincia) o;
        return Objects.equals(id, provincia.id);
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Provincia{" + "id=" + id + ", nome=" + nome + '}';
    }
    
}
