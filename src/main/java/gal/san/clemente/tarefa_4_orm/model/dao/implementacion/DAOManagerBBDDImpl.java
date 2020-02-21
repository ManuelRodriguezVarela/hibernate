package gal.san.clemente.tarefa_4_orm.model.dao.implementacion;

import gal.san.clemente.tarefa_4_orm.exception.ModelException;
import gal.san.clemente.tarefa_4_orm.model.dao.IClienteDAO;
import gal.san.clemente.tarefa_4_orm.model.dao.IEmpleadoDAO;
import gal.san.clemente.tarefa_4_orm.model.dao.IProductoDAO;
import gal.san.clemente.tarefa_4_orm.model.dao.ITendaDAO;
import gal.san.clemente.tarefa_4_orm.model.dao.ITendaEmpleadoDAO;
import gal.san.clemente.tarefa_4_orm.model.dao.ITendaProductoDAO;
import java.io.File;
import org.hibernate.SessionFactory;
import gal.san.clemente.tarefa_4_orm.model.dao.IDAOManagerDB;

public class DAOManagerBBDDImpl extends DAOManagerFactory implements IDAOManagerDB {
    
    private SessionFactory session;
    
    private File file;
    
    private IEmpleadoDAO empleadoDAO = null;
    
    private ITendaDAO tendaDAO = null;
    
    private IClienteDAO clienteDAO = null;
    
    private IProductoDAO productoDAO = null;
    
    private ITendaProductoDAO tendaProductoDAO = null;
    
    private ITendaEmpleadoDAO tendaEmpleadoDAO = null;

    public DAOManagerBBDDImpl() throws ModelException {
        session = HibernateUtil.getInstance();
    }

    @Override
    public IClienteDAO getClienteDAO() {
        if(clienteDAO == null) {
            clienteDAO = new ClienteDBDAOImpl(session);
        }
        return clienteDAO;
    }

    @Override
    public IEmpleadoDAO getEmpleadoDAO() {
        if(empleadoDAO == null) {
            empleadoDAO = new EmpleadoDBDAOImpl(session);
        }
        return empleadoDAO;
    }

    @Override
    public IProductoDAO getProductoDAO() {
        if(productoDAO == null) {
            productoDAO = new ProductoDBDAOImpl(session);
        }
        return productoDAO;
    }

    @Override
    public ITendaDAO getTendaDAO() {
        if(tendaDAO == null) {
            tendaDAO = new TendaDBDAOImpl(session);
        }
        return tendaDAO;
    } 
    
    @Override
    public ITendaProductoDAO getTendaProductoDAO() {
        if(tendaProductoDAO == null) {
            tendaProductoDAO = new TendaProductoDBDAOImpl(session);
        }
        return tendaProductoDAO;
    } 
    
    @Override
    public ITendaEmpleadoDAO getTendaEmpleadoDAO() {
        if(tendaEmpleadoDAO == null) {
            tendaEmpleadoDAO = new TendaEmpleadoDBDAOImpl(session);
        }
        return tendaEmpleadoDAO;
    } 
    
}
