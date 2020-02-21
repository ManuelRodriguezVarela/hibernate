package gal.san.clemente.tarefa_4_orm.model.dao;

import gal.san.clemente.tarefa_4_orm.exception.ModelException;
import gal.san.clemente.tarefa_4_orm.model.TendaProducto;
import gal.san.clemente.tarefa_4_orm.model.Tenda;
import java.util.List;

public interface ITendaProductoDAO extends IDAO<TendaProducto, Long> {
    List<TendaProducto> obtenerTodos(Tenda tenda) throws ModelException;
}
