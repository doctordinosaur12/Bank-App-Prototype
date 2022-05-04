package cs4800HibernateHW;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainCreateProduct {
	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Order.class)
								.addAnnotatedClass(Product.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			
			// start a transaction
			session.beginTransaction();
						
			// create a order
			Product product = new Product("laptop");
						
			// save the order
			System.out.println("\nSaving the course ...");
			session.save(product);

			// create the products
			Order order1 = new Order();
			Order order2 = new Order();
						
			// add students to the course
			product.addOrder(order1);
			product.addOrder(order2);
			
			// save the products
			System.out.println("\nSaving products ...");
			session.save(order1);
			session.save(order2);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			
			// add clean up code
			session.close();
			
			factory.close();
		}
	}
}
