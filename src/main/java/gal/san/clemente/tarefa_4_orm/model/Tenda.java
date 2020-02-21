package gal.san.clemente.tarefa_4_orm.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
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

@Entity(name = "Tenda")
@Table(name = "TENDAS")
public class Tenda implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID_TENDAS")
    private Long id;
    
    @Column(name = "NOME")
    private String nome;
    
    @Column(name = "CIDADE")
    private String cidade;
    
    @Column(name = "PROVINCIA")
    Long provincia;
    
    @OneToMany(
        mappedBy = "tenda",
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    private List<TendaProducto> productos = new ArrayList<>();
    
    @OneToMany(
        mappedBy = "tenda",
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    private List<TendaEmpleado> empleados = new ArrayList<>();

    public Tenda() {
    }

    public Tenda(String nome, String cidade, Long provincia) {
        this.nome = nome;
        this.cidade = cidade;
        this.provincia = provincia;
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

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Long getProvincia() {
        return provincia;
    }

    public void setProvincia(Long provincia) {
        this.provincia = provincia;
    }

    public List<TendaProducto> getProductos() {
        return productos;
    }

    public void setProductos(List<TendaProducto> productos) {
        this.productos = productos;
    }

    public List<TendaEmpleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<TendaEmpleado> empleados) {
        this.empleados = empleados;
    }

    public void addProducto(Producto producto, Integer stock) {
        TendaProducto tendaProducto = new TendaProducto(this, producto, stock);
        productos.add(tendaProducto);
        producto.getTendas().add(tendaProducto);
    }
 
    public void removeProducto(Producto producto) {
        for (Iterator<TendaProducto> iterator = productos.iterator();
             iterator.hasNext(); ) {
            TendaProducto tendaProducto = iterator.next();
 
            if (tendaProducto.getTenda().equals(this) &&
                    tendaProducto.getProducto().equals(producto)) {
                iterator.remove();
                tendaProducto.getProducto().getTendas().remove(tendaProducto);
                tendaProducto.setTenda(null);
                tendaProducto.setProducto(null);
            }
        }
    }
    
    public void addEmpleado(Empleado empleado, Integer numeroHoras) {
        TendaEmpleado tendaEmpleado = new TendaEmpleado(this, empleado, numeroHoras);
        empleados.add(tendaEmpleado);
        empleado.getTendas().add(tendaEmpleado);
    }
 
    public void removeEmleado(Empleado empleado) {
        for (Iterator<TendaEmpleado> iterator = empleados.iterator();
             iterator.hasNext(); ) {
            TendaEmpleado tendaEmpleado = iterator.next();
 
            if (tendaEmpleado.getTenda().equals(this) &&
                    tendaEmpleado.getEmpleado().equals(empleado)) {
                iterator.remove();
                tendaEmpleado.getEmpleado().getTendas().remove(tendaEmpleado);
                tendaEmpleado.setTenda(null);
                tendaEmpleado.setEmpleado(null);
            }
        }
    }
 
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
 
        if (o == null || getClass() != o.getClass())
            return false;
 
        Tenda tenda = (Tenda) o;
        return Objects.equals(id, tenda.id);
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
}
