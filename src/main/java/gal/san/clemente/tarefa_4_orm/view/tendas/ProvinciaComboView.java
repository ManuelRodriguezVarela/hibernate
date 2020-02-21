package gal.san.clemente.tarefa_4_orm.view.tendas;

import gal.san.clemente.tarefa_4_orm.model.Provincia;
import java.util.Objects;

public class ProvinciaComboView {
    //Patrón adapter. Se crea un campo tipo profesor getter y setter y en equal y en el toString lo que queremos
    private Provincia provincia;

    public ProvinciaComboView(Provincia provincia) {
        this.provincia = provincia;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    @Override
    public int hashCode() {
        return Objects.hash(provincia.getId());
    }

    @Override
    public boolean equals(Object obj) {      
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProvinciaComboView other = (ProvinciaComboView) obj;
        if (!Objects.equals(this.provincia, other.provincia)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return provincia.getNome();
    }
    
}
