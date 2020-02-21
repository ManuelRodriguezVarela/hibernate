package gal.san.clemente.tarefa_4_orm.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//implementar serializable, para implementar de forma remota
@Entity(name = "Cliente")
@Table(name = "CLIENTES")
public class Cliente implements Serializable {
    //necesario ao implementar serializable
    private static final Long serialVersionUID = 1L;
    
    //Obligatorio poner el ID con @Id
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID_CLIENTE")
    private Long id;
    
    @Column(name = "NOME")
    private String nome;
    
    @Column(name = "APELIDOS")
    private String apelidos;
    
    @Column(name = "EMAIL")
    private String email;
    
    //fai falla para que sexa un bean. Constructor sen argumentos
    public Cliente() {
    }

    public Cliente(String nome, String apelidos, String email) {
        this.nome = nome;
        this.apelidos = apelidos;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id);
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", apelidos=" + apelidos + ", email=" + email + '}';
    }

}
