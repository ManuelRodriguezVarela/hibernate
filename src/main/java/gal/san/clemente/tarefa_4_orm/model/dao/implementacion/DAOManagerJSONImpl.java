package gal.san.clemente.tarefa_4_orm.model.dao.implementacion;

import gal.san.clemente.tarefa_4_orm.model.dao.IConfigurationDAO;
import gal.san.clemente.tarefa_4_orm.model.dao.IProvinciaDAO;
import java.io.File;
import gal.san.clemente.tarefa_4_orm.model.dao.IDAOManagerJSON;

public class DAOManagerJSONImpl extends DAOManagerFactory implements IDAOManagerJSON {
    
    private IProvinciaDAO provinciaDAO = null;
    private IConfigurationDAO configurationDAO = null;
    
    public DAOManagerJSONImpl() {
        
    }

    @Override
    public IProvinciaDAO getProvinciaDAO(String url) {
        File file = new File(url);
        if(provinciaDAO == null) {
           provinciaDAO = new ProvinciaJSONDAOImpl(file);
        }
        return provinciaDAO;
    }
    
    @Override
    public IConfigurationDAO getConfigurationDAO(String url) {
        File file = new File(url);
        if(configurationDAO == null) {
           configurationDAO = new ConfigurationJSONDAOImpl1(file);
        }
        return configurationDAO;
    }
    
}
