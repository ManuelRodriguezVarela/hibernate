package gal.san.clemente.tarefa_4_orm.model.dao;

import gal.san.clemente.tarefa_4_orm.exception.ModelException;
import java.io.Serializable;
import java.util.List;

public interface IDAO<T, K extends Serializable> {
    void insertar(T entidad) throws ModelException;
    
    void modificar(T entidad) throws ModelException;
    
    void eliminar(K entidadId) throws ModelException;
    
    List<T> obtenerTodos() throws ModelException;
    
    T obtener(K id) throws ModelException;
}
