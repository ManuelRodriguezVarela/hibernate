package gal.san.clemente.tarefa_4_orm.model.dao.implementacion;

import gal.san.clemente.tarefa_4_orm.model.Empleado;
import gal.san.clemente.tarefa_4_orm.model.dao.IEmpleadoDAO;
import org.hibernate.SessionFactory;

public class EmpleadoDBDAOImpl extends DAOImpl<Empleado, Long> implements IEmpleadoDAO {
 
    public EmpleadoDBDAOImpl(SessionFactory session) {
        super(Empleado.class, session);
    }
    
}
