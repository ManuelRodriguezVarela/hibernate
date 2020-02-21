package gal.san.clemente.tarefa_4_orm.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "Empleado")
@Table(name = "EMPREGADOS")
public class Empleado implements Serializable {
    private static final Long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID_EMPREGADO")
    private Long id;
    
    @Column(name = "NOME")
    private String nome;
    
    @Column(name = "APELIDOS")
    private String apelidos;
    
    @OneToMany(
       mappedBy = "empleado",
       cascade = CascadeType.ALL,
       orphanRemoval = true
    )
    private List<TendaEmpleado> tendas = new ArrayList<>();

    public Empleado() {
    }

    public Empleado(String nome, String apelidos) {
        this.nome = nome;
        this.apelidos = apelidos;
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

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public List<TendaEmpleado> getTendas() {
        return tendas;
    }

    public void setTendas(List<TendaEmpleado> tendas) {
        this.tendas = tendas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(id, empleado.id);
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nome=" + nome + ", apelidos=" + apelidos + '}';
    }
    
}
