package gal.san.clemente.tarefa_4_orm.view.converter;

import gal.san.clemente.tarefa_4_orm.exception.ModelException;
import gal.san.clemente.tarefa_4_orm.model.Producto;
import gal.san.clemente.tarefa_4_orm.model.dao.IProductoDAO;
import gal.san.clemente.tarefa_4_orm.view.tendas.tenda_productos.ProductoComboView;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

 public class ProductosComboModel extends DefaultComboBoxModel<ProductoComboView> {
     
    private IProductoDAO productoDAO;
    
    private List<Producto> productos;

    public ProductosComboModel(IProductoDAO productoDAO) {
        this.productoDAO = productoDAO;
        this.productos = new ArrayList<>();
    }
    
    public void update() throws ModelException {
        if(productoDAO != null) {
            productos = productoDAO.obtenerTodos();
            removeAllElements();
            for(Producto producto: productos) {
                addElement(new ProductoComboView(producto));
            } 
            
        }       
    }
     
    
}
