package gal.san.clemente.tarefa_4_orm.view.converter;

import gal.san.clemente.tarefa_4_orm.exception.ModelException;
import gal.san.clemente.tarefa_4_orm.model.Empleado;
import gal.san.clemente.tarefa_4_orm.model.dao.IEmpleadoDAO;
import gal.san.clemente.tarefa_4_orm.view.tendas.tenda_empregados.EmpleadoComboView;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

 public class EmpleadosComboModel extends DefaultComboBoxModel<EmpleadoComboView> {
     
    private IEmpleadoDAO empleadoDAO;
    
    private List<Empleado> empleados;

    public EmpleadosComboModel(IEmpleadoDAO empleadoDAO) {
        this.empleadoDAO = empleadoDAO;
        this.empleados = new ArrayList<>();
    }
    
    public void update() throws ModelException {
        if(empleadoDAO != null) {
            empleados = empleadoDAO.obtenerTodos();
            removeAllElements();
            for(Empleado empleado: empleados) {
                addElement(new EmpleadoComboView(empleado));
            } 
            
        }       
    }
     
    
}
