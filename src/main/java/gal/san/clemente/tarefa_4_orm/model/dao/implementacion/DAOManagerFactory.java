package gal.san.clemente.tarefa_4_orm.model.dao.implementacion;

import gal.san.clemente.tarefa_4_orm.exception.ModelException;
import gal.san.clemente.tarefa_4_orm.model.dao.IDAOManager;

public class DAOManagerFactory {
    
    public static IDAOManager getDAOManager(String type) throws ModelException {
        if ( type.equals("json") )
            return new DAOManagerJSONImpl();
        else if ( type.equals("bbdd") )
            return new DAOManagerBBDDImpl();
        else if ( type.equals("rss") )
            return new DAOManagerRSSImpl();
        return null;
    }
    
}
