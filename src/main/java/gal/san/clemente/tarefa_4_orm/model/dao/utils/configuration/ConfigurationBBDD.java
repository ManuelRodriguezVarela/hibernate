package gal.san.clemente.tarefa_4_orm.model.dao.utils.configuration;

public class ConfigurationBBDD {
    
    private ConnectionConf dbConnection;
    
    private HibernateConfiguration hibernate;

    public ConfigurationBBDD(ConnectionConf dbConnection, HibernateConfiguration hibernate) {
        this.dbConnection = dbConnection;
        this.hibernate = hibernate;
    }

    public ConfigurationBBDD() {
    }

    public ConnectionConf getDbConnection() {
        return dbConnection;
    }

    public void setDbConnection(ConnectionConf dbConnection) {
        this.dbConnection = dbConnection;
    }

    public HibernateConfiguration getHibernate() {
        return hibernate;
    }

    public void setHibernate(HibernateConfiguration hibernate) {
        this.hibernate = hibernate;
    }
     
}
