package gal.san.clemente.tarefa_4_orm.model.dao.implementacion;

import gal.san.clemente.tarefa_4_orm.model.dao.IConfigurationDAO;
import java.io.File;
import gal.san.clemente.tarefa_4_orm.model.dao.utils.configuration.ConfigurationBBDD;

public class ConfigurationJSONDAOImpl1 extends DAOImplJson<ConfigurationBBDD, Long> implements IConfigurationDAO {
    
    public ConfigurationJSONDAOImpl1(File file) {
        super(ConfigurationBBDD.class, file);
    }

    
}
