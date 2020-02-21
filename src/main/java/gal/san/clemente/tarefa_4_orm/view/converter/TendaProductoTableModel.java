package gal.san.clemente.tarefa_4_orm.view.converter;

import gal.san.clemente.tarefa_4_orm.exception.ModelException;
import gal.san.clemente.tarefa_4_orm.model.Tenda;
import gal.san.clemente.tarefa_4_orm.model.TendaProducto;
import gal.san.clemente.tarefa_4_orm.model.dao.ITendaProductoDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

 public class TendaProductoTableModel extends AbstractTableModel {
     
    private ITendaProductoDAO tendaProductoDAO;
    
    private Tenda tenda;
    
    private List<TendaProducto> tendasProductosDatos = new ArrayList<>();
     
    public TendaProductoTableModel(ITendaProductoDAO tendaProductoDAO, Tenda tenda) {
         this.tendaProductoDAO = tendaProductoDAO;
         this.tenda = tenda;
    }
    
    public void updateModelTenda() throws ModelException {
        tendasProductosDatos = tendaProductoDAO.obtenerTodos(tenda);
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "ID";
            case 1: return "TENDA";
            case 2: return "PRODUCTO";
            case 3: return "STOCK";
            default: return "[NO]"; 
        }
    }

    @Override
    public int getRowCount() {
        return tendasProductosDatos.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TendaProducto tendaProducto = tendasProductosDatos.get(rowIndex);
        switch (columnIndex) {
            case 0: return tendaProducto.getId();
            case 1: return tendaProducto.getTenda().getNome();
            case 2: return tendaProducto.getProducto().getNome();
            case 3: return tendaProducto.getStock();
            default: return "";
        }
    }
    
}
