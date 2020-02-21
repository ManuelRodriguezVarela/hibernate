package gal.san.clemente.tarefa_4_orm.model.dao.implementacion;

import gal.san.clemente.tarefa_4_orm.model.Tenda;
import gal.san.clemente.tarefa_4_orm.model.dao.ITendaDAO;
import org.hibernate.SessionFactory;

public class TendaDBDAOImpl extends DAOImpl<Tenda, Long>  implements ITendaDAO {
    
    public TendaDBDAOImpl(SessionFactory session) {
        super(Tenda.class, session);
    }
    
}
