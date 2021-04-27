package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory SESSION_FACTORY = null;

    public static SessionFactory getSessionFactory(){
        if(SESSION_FACTORY == null){
            try{
                Configuration configuration  = new Configuration().configure();
                SESSION_FACTORY = configuration.buildSessionFactory();
            }catch (Throwable e){
                throw new ExceptionInInitializerError(e.getMessage());
            }
        }
        return SESSION_FACTORY;
    }
}
