package gal.san.clemente.tarefa_4_orm.model.dao.implementacion;

import gal.san.clemente.tarefa_4_orm.model.dao.IDAOManagerRSS;
import gal.san.clemente.tarefa_4_orm.model.dao.IProvinciaDAO;
import java.io.File;
import gal.san.clemente.tarefa_4_orm.model.dao.INoticiaDAO;

public class DAOManagerRSSImpl extends DAOManagerFactory implements IDAOManagerRSS {
    
    private INoticiaDAO noticiaDAO = null;
    
    public DAOManagerRSSImpl() {
        
    }

    @Override
    public INoticiaDAO getNoticiaDAO() {
        if(noticiaDAO == null) {
           noticiaDAO = new NoticiaRSSDAOImpl();
        }
        return noticiaDAO;
    }
    
    
}
