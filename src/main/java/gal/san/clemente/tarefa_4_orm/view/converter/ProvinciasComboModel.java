package gal.san.clemente.tarefa_4_orm.view.converter;

import gal.san.clemente.tarefa_4_orm.exception.ModelException;
import gal.san.clemente.tarefa_4_orm.model.Provincia;
import gal.san.clemente.tarefa_4_orm.model.dao.IProvinciaDAO;
import gal.san.clemente.tarefa_4_orm.view.tendas.ProvinciaComboView;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

 public class ProvinciasComboModel extends DefaultComboBoxModel<ProvinciaComboView> {
     
    private IProvinciaDAO provinciaDAO;
    
    private List<Provincia> provincias;

    public ProvinciasComboModel(IProvinciaDAO provinciaDAO) {
        this.provinciaDAO = provinciaDAO;
        this.provincias = new ArrayList<>();
    }
    
    public void update() throws ModelException {
        if(provinciaDAO != null) {
            provincias = provinciaDAO.obtenerTodos();
            removeAllElements();
            for(Provincia provincia: provincias) {
                addElement(new ProvinciaComboView(provincia));
            } 
            
        }       
    }
     
    
}
