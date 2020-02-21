package gal.san.clemente.tarefa_4_orm.model.dao.implementacion;

import gal.san.clemente.tarefa_4_orm.model.dao.IProvinciaDAO;
import java.io.File;
import gal.san.clemente.tarefa_4_orm.model.Provincia;


public class ProvinciaJSONDAOImpl extends DAOImplJson<Provincia, Long> implements IProvinciaDAO {
    
    public ProvinciaJSONDAOImpl(File file) {
        super(Provincia.class, file);
    }

    
}
