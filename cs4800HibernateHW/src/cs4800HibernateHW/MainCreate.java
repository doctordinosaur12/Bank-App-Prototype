package cs4800HibernateHW;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainCreate {
public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().
				                 configure("hibernate.cfg.xml").
				                 addAnnotatedClass(Customer.class).
				                 addAnnotatedClass(Professor.class).
				                 buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			Customer c = new Customer("bob", "123 asdf St.");
			
			//session.save(tempInstructorDetail);
			
			Professor p = new Professor("8-111", "SWE");
			
			p.setCustomer(c);
			
			session.save(p);
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			factory.close();
		}		
		
		
	}
}
