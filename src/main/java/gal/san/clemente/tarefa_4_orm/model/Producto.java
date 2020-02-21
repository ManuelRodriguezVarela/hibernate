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

@Entity(name = "Producto")
@Table(name = "PRODUCTOS")
public class Producto implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID_PRODUCTO")
    private Long id;
    
    @Column(name = "NOME")
    private String nome;
    
    @Column(name = "DESCRIPCION")
    private String descripcion;
    
    @Column(name = "PREZO")
    private Double prezo;
    
    @OneToMany(
       mappedBy = "producto",
       cascade = CascadeType.ALL,
       orphanRemoval = true
    )
    private List<TendaProducto> tendas = new ArrayList<>();

    public Producto() {
    }

    public Producto(String nome, String descripcion, Double prezo) {
        this.nome = nome;
        this.descripcion = descripcion;
        this.prezo = prezo;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrezo() {
        return prezo;
    }

    public void setPrezo(Double prezo) {
        this.prezo = prezo;
    }

    public List<TendaProducto> getTendas() {
        return tendas;
    }

    public void setTendas(List<TendaProducto> tendas) {
        this.tendas = tendas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(id, producto.id);
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nome=" + nome + ", descripcion=" + descripcion + ", prezo=" + prezo + '}';
    }
    
}
