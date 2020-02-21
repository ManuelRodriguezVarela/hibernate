package gal.san.clemente.tarefa_4_orm;

import gal.san.clemente.tarefa_4_orm.exception.ModelException;
import gal.san.clemente.tarefa_4_orm.model.dao.implementacion.DAOManagerBBDDImpl;
import gal.san.clemente.tarefa_4_orm.view.Inicio;
import gal.san.clemente.tarefa_4_orm.view.MainMenu;
import java.util.logging.Level;
import java.util.logging.Logger;
import gal.san.clemente.tarefa_4_orm.model.dao.IDAOManagerDB;
import gal.san.clemente.tarefa_4_orm.model.dao.implementacion.DAOManagerFactory;

public class FranquiciaMain {
    
    public static void main(String[] args) {
        Inicio inicio = new Inicio();
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);
        try {
            IDAOManagerDB manager = (IDAOManagerDB) DAOManagerFactory.getDAOManager("bbdd");
            MainMenu menu = new MainMenu(manager);
            menu.setLocationRelativeTo(null);
            menu.setVisible(true);
        } catch (ModelException ex) {
            Logger.getLogger(FranquiciaMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
