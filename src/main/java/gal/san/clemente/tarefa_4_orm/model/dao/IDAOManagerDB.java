package gal.san.clemente.tarefa_4_orm.model.dao;

public interface IDAOManagerDB extends IDAOManager {
    
    IClienteDAO getClienteDAO();
    
    IEmpleadoDAO getEmpleadoDAO();
    
    IProductoDAO getProductoDAO();
    
    ITendaDAO getTendaDAO();
    
    ITendaProductoDAO getTendaProductoDAO();
    
    ITendaEmpleadoDAO getTendaEmpleadoDAO();
    
}
