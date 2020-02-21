package gal.san.clemente.tarefa_4_orm.model.dao.implementacion;

import gal.san.clemente.tarefa_4_orm.exception.ModelException;
import gal.san.clemente.tarefa_4_orm.model.TendaEmpleado;
import gal.san.clemente.tarefa_4_orm.model.Tenda;
import gal.san.clemente.tarefa_4_orm.model.dao.ITendaEmpleadoDAO;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TendaEmpleadoDBDAOImpl extends DAOImpl<TendaEmpleado, Long> implements ITendaEmpleadoDAO {
    
    public TendaEmpleadoDBDAOImpl(SessionFactory session) {
        super(TendaEmpleado.class, session);
    }

    @Override
    public List<TendaEmpleado> obtenerTodos(Tenda tenda) throws ModelException {
        Transaction tran = null;
        Session session = null;

        List<TendaEmpleado> entidades = new ArrayList<>();
        try {
            //Collemos a sesión de Hibernate
            session = sessionFactory.openSession();
            TypedQuery<TendaEmpleado> query = session
                .createQuery("from TendaEmpleado where tenda = :tenda")
                    .setParameter("tenda", tenda);

            //Comenzamos unha transacción
            tran = session.beginTransaction();

            if (query.getResultList() != null) {
                entidades = query.getResultList();
            } else {
                throw new ModelException("No hay datos");
            }

            for(TendaEmpleado entidad: entidades) {
                entidad.getEmpleado();
                entidad.getTenda();
            }

            //Facemos un commit da transacción
            tran.commit();

            return entidades;

        } catch (Exception e) {
            throw new ModelException("Error al buscar en BBDD " + e.getMessage(), e);
        }
    }
   
    
}
