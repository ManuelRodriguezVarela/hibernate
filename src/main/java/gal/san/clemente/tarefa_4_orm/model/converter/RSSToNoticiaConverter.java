package gal.san.clemente.tarefa_4_orm.model.converter;

import gal.san.clemente.tarefa_4_orm.model.Noticia;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class RSSToNoticiaConverter implements IConverter<NodeList, Noticia>{

    @Override
    public List<Noticia> converterKToE(NodeList items) {
        ArrayList<Noticia> noticias = new ArrayList();
        for(int i = 0; i < items.getLength(); i++) {
            Node nodo = items.item(i);
            Noticia noticia = new Noticia();
            for(Node n = nodo.getFirstChild(); n != null; n = n.getNextSibling()) {
                if(n.getNodeName().equals("title")) {
                    noticia.setTitulo(n.getTextContent());
                    noticias.add(noticia);
                }
                
            }
        }
        return noticias;
    }
    
}
