
import gal.san.clemente.tarefa_4_orm.model.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
    
    private static EntityManager manager;
    
    /*
    acceder á unidade de persistencia en jee co contexto de persistencia
    que facilita EJB 
    @PersistenceContext(unitName = "Persistencia")
    */
    
    //Como estamos en JSE, accédese á unidade de persistencia a través de
    private static EntityManagerFactory emf;
    
    public static void main(String[] args) {
        //creamos a entityManagerFactory co método de abaixo pasando o nome da unidade de persistencia
        emf = Persistence.createEntityManagerFactory("Persistencia");
        manager = emf.createEntityManager();
        
        //insertar elementos
        Cliente cliente = new Cliente("Juan", "Varela", "juan.varela@clem.es");
        
        //iniciamos una transacción. Entre begin y transaction podemos facer o que queiramos
        manager.getTransaction().begin();
        manager.persist(cliente);
        //cambios que se hacen, y no hace falta volver a llamar a persist (pasa el objeto a managed)
        //instancia managed, administrada. Presta atención al objeto para que este atento a cambios
        //ojo con los managed en aplicaciones de alta concurrencia WEB, el manager se crea cuando hace falta y se destruye cuando no
        //con el método close(). Pasando el objeto a Detached. dejando de esta managed. Cuando necesitamos trabajar sobre un objeto
        //detached usamos el método merge(). Mezcla el estado de dos entidades
        cliente.setApelidos("Pérez"); //no es detached es siempre managed
        manager.getTransaction().commit();
        
        //merge() y remove()
        //merge para entidade detached para volver a introducir sus datos
        //remove() elimina un sistema del sistema, borrado
        
    }
    
    private static void imprimirTodo() {
        //Obter tódolos empregados con HQL.
        //Casteo xa que o getResultList devolve un listado sen tipo
        List<Cliente> clientes = (List<Cliente>) manager.createQuery("FROM Cliente").getResultList();
        System.out.println("O número de cliente é: " + clientes.size());
    }
}
