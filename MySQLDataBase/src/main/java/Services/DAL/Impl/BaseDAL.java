package Services.DAL.Impl;

import org.apache.log4j.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by ramon on 06/03/16.
 */
public abstract class BaseDAL {

    private final Logger logger = Logger.getLogger(BaseDAL.class);
    private EntityManagerFactory factory;
    private EntityManager manager;

    public BaseDAL() {
        //validando factory
        factory = Persistence.createEntityManagerFactory("AlunoPU");

        //validando o manager
        manager = factory.createEntityManager();
    }


    public EntityManager getManager() {
        return manager;
    }

//    public void setManager(EntityManager manager) {
//        this.manager = manager;
//    }
//
//    public EntityManagerFactory getFactory() {
//        return factory;
//    }
//
//    public void setFactory(EntityManagerFactory factory) {
//        this.factory = factory;
//    }


}
