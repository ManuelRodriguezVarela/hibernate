package gal.san.clemente.tarefa_4_orm.view.converter;

import gal.san.clemente.tarefa_4_orm.exception.ModelException;
import gal.san.clemente.tarefa_4_orm.model.Noticia;
import gal.san.clemente.tarefa_4_orm.model.converter.IConverter;
import gal.san.clemente.tarefa_4_orm.model.converter.RSSToNoticiaConverter;
import gal.san.clemente.tarefa_4_orm.model.dao.INoticiaDAO;
import gal.san.clemente.tarefa_4_orm.model.dao.implementacion.NoticiaRSSDAOImpl;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

 public class NoticiaTableModel extends AbstractTableModel {
     
    private NoticiaRSSDAOImpl noticiaDAO;
    private IConverter converter;
    
    private List<Noticia> noticiasDatos = new ArrayList<>();
     
    public NoticiaTableModel(INoticiaDAO noticiaDAO) {
         this.noticiaDAO = (NoticiaRSSDAOImpl) noticiaDAO;
    }
    
    public void updateModelNoticia() throws ModelException {
        converter = new RSSToNoticiaConverter();
        noticiasDatos = converter.converterKToE(noticiaDAO.obtenerTodos("item", "http://ep00.epimg.net/rss/elpais/portada.xml"));
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Titular";
            default: return "[NO]"; 
        }
    }

    @Override
    public int getRowCount() {
        return noticiasDatos.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Noticia noticia = noticiasDatos.get(rowIndex);
        switch (columnIndex) {
            case 0: return noticia.getTitulo();
            default: return "";
        }
    }
    
}
