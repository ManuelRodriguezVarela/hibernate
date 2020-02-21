package gal.san.clemente.tarefa_4_orm.model.dao;

public interface IDAOManagerJSON extends IDAOManager {
    
    IProvinciaDAO getProvinciaDAO(String url);
    IConfigurationDAO getConfigurationDAO(String url);
    
}
