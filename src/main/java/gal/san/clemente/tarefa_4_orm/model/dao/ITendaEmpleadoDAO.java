package gal.san.clemente.tarefa_4_orm.model.dao;

import gal.san.clemente.tarefa_4_orm.exception.ModelException;
import gal.san.clemente.tarefa_4_orm.model.TendaEmpleado;
import gal.san.clemente.tarefa_4_orm.model.Tenda;
import java.util.List;

public interface ITendaEmpleadoDAO extends IDAO<TendaEmpleado, Long> {
    List<TendaEmpleado> obtenerTodos(Tenda tenda) throws ModelException;
}
