package gal.san.clemente.tarefa_4_orm.model.dao.implementacion;

import gal.san.clemente.tarefa_4_orm.model.Producto;
import gal.san.clemente.tarefa_4_orm.model.dao.IProductoDAO;
import org.hibernate.SessionFactory;

public class ProductoDBDAOImpl extends DAOImpl<Producto, Long> implements IProductoDAO {
    
    public ProductoDBDAOImpl(SessionFactory session) {
        super(Producto.class, session);
    }
    
}
