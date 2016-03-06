package database;

import org.junit.Test;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 * Created by ramon on 06/03/2016.
 */
public class TesteBanco {

    @Test
    public void testConnection(){

      EntityManagerFactory factory = Persistence.createEntityManagerFactory("thePersistenceUnit");
      EntityManager theManager = factory.createEntityManager();


    }
}
