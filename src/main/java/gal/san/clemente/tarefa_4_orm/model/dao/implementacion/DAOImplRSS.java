package gal.san.clemente.tarefa_4_orm.model.dao.implementacion;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import gal.san.clemente.tarefa_4_orm.exception.ModelException;
import gal.san.clemente.tarefa_4_orm.model.dao.utils.ModelError;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import gal.san.clemente.tarefa_4_orm.model.dao.IDAO;

public class DAOImplRSS <T, K extends Serializable> implements IDAO<T, K>{

    private Class<T> persistentClass;

    public DAOImplRSS(Class<T> persistentClass) {
	this.persistentClass = persistentClass;
    }

    public DAOImplRSS() {
    } 
    
    @Override
    public List<T> obtenerTodos() throws ModelException {
        return null;
    }

    @Override
    public void insertar(T entidad) throws ModelException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(T entidad) throws ModelException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(K entidadId) throws ModelException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T obtener(K id) throws ModelException {

        return null;
    }
    
    
}
