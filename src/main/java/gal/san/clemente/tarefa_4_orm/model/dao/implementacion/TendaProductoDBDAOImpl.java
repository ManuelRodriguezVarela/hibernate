package gal.san.clemente.tarefa_4_orm.model.dao.implementacion;

import gal.san.clemente.tarefa_4_orm.exception.ModelException;
import gal.san.clemente.tarefa_4_orm.model.TendaProducto;
import gal.san.clemente.tarefa_4_orm.model.Tenda;
import gal.san.clemente.tarefa_4_orm.model.dao.ITendaProductoDAO;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TendaProductoDBDAOImpl extends DAOImpl<TendaProducto, Long> implements ITendaProductoDAO {
    
    public TendaProductoDBDAOImpl(SessionFactory session) {
        super(TendaProducto.class, session);
    }

    @Override
    public List<TendaProducto> obtenerTodos(Tenda tenda) throws ModelException {
        Transaction tran = null;
        Session session = null;

        List<TendaProducto> entidades = new ArrayList<>();
        try {
             //Collemos a sesión de Hibernate
            session = sessionFactory.openSession();
            TypedQuery<TendaProducto> query = session
		.createQuery("from TendaProducto where tenda = :tenda")
                    .setParameter("tenda", tenda);
            
            //Comenzamos unha transacción
            tran = session.beginTransaction();
            
            if (query.getResultList() != null) {
                entidades = query.getResultList();
            } else {
                throw new ModelException("No hay datos");
            }
            
            for(TendaProducto entidad: entidades) {
                entidad.getProducto();
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
