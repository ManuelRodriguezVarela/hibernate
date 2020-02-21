package gal.san.clemente.tarefa_4_orm.model.dao.implementacion;

import gal.san.clemente.tarefa_4_orm.exception.ModelException;
import gal.san.clemente.tarefa_4_orm.model.Noticia;
import gal.san.clemente.tarefa_4_orm.model.dao.INoticiaDAO;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;


public class NoticiaRSSDAOImpl extends DAOImplRSS<Noticia, Long> implements INoticiaDAO {
    
    public NoticiaRSSDAOImpl() {
        super(Noticia.class);
    }

    public NodeList obtenerTodos(String item, String uri) throws ModelException {
        NodeList items = null;
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(uri);
            items = document.getElementsByTagName(item);
        } catch (Exception e) {
            throw new ModelException(e.getMessage(), e);
        }
        return items;
    } 
}
