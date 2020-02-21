package gal.san.clemente.tarefa_4_orm.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity(name = "TendaProducto")
@Table(name = "TENDAS_PRODUCTOS")
public class TendaProducto implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TENDA_ID")
    private Tenda tenda;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCTO_ID")
    private Producto producto;
    
    @Column(name = "STOCK")
    private Integer stock;

    public TendaProducto() {
    }

    public TendaProducto(Tenda tenda, Producto producto, Integer stock) {
        this.tenda = tenda;
        this.producto = producto;
        this.stock = stock;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Tenda getTenda() {
        return tenda;
    }

    public void setTenda(Tenda tenda) {
        this.tenda = tenda;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
 
        if (o == null || getClass() != o.getClass())
            return false;
 
        TendaProducto that = (TendaProducto) o;
        return Objects.equals(tenda, that.tenda) &&
               Objects.equals(producto, that.producto);
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(tenda, producto);
    }

    @Override
    public String toString() {
        return "TendaProducto{ idTenda=" + tenda.getId() + ", idProducto=" + producto.getId() + ", stock=" + stock + '}';
    }
    
}
