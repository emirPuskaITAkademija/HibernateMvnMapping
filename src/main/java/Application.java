import entity.Product;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import util.HibernateUtil;


import java.util.List;

public class Application {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try(Session session = sessionFactory.openSession()){
            //SELECT *FROM products;
            Query<Product> query = session.createQuery("from Product");
            List<Product> productList = query.list();
            productList.forEach(System.out::println);
        }catch (HibernateException e){
            System.err.println(e.getMessage());
        }
    }
}
