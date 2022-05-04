package cs4800HibernateHW;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainDelete {

public static void main(String args[]) {
	SessionFactory factory = new Configuration().
            configure("hibernate.cfg.xml").
            addAnnotatedClass(Customer.class).
            addAnnotatedClass(Professor.class).
            buildSessionFactory();

	Session session = factory.getCurrentSession();
	try {
		
		session.beginTransaction();
		
		Professor p = session.get(Professor.class, 1);
		
		session.delete(p);
		
		//session.createQuery("delete from Instructor where id=6").executeUpdate();
		
		session.getTransaction().commit();
		
		
	} catch (Exception e) {
		e.printStackTrace();
		
	} finally {
		factory.close();
	}
}


}
