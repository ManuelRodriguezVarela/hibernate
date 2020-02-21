package gal.san.clemente.tarefa_4_orm.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "TendaEmpleado")
@Table(name = "TENDAS_EMPLEADOS")
public class TendaEmpleado implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TENDA_ID")
    private Tenda tenda;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMPREGADO_ID")
    private Empleado empleado;
    
    @Column(name = "NUMERO_HORAS_SEMANA")
    private Integer numeroHorasSemana;

    public TendaEmpleado() {
    }

    public TendaEmpleado(Tenda tenda, Empleado empleado, Integer numeroHorasSemana) {
        this.tenda = tenda;
        this.empleado = empleado;
        this.numeroHorasSemana = numeroHorasSemana;
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

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Integer getNumeroHorasSemana() {
        return numeroHorasSemana;
    }

    public void setNumeroHorasSemana(Integer numeroHorasSemana) {
        this.numeroHorasSemana = numeroHorasSemana;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TendaEmpleado tendaEmpleado = (TendaEmpleado) o;
        return Objects.equals(id, tendaEmpleado.id);
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "TendaEmpregado{" + "id=" + id + ", idTenda=" + tenda.getId() + ", idEmpleado=" + empleado.getId() + ", numeroHorasSemana=" + numeroHorasSemana + '}';
    }
    
}
