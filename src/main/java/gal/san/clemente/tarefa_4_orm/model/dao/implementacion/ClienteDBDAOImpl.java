package gal.san.clemente.tarefa_4_orm.model.dao.implementacion;

import gal.san.clemente.tarefa_4_orm.model.Cliente;
import gal.san.clemente.tarefa_4_orm.model.dao.IClienteDAO;
import org.hibernate.SessionFactory;

public class ClienteDBDAOImpl extends DAOImpl<Cliente, Long> implements IClienteDAO {
    
    public ClienteDBDAOImpl(SessionFactory session) {
        super(Cliente.class, session);
    }
    
}
