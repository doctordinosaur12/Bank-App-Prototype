package cs4800HibernateHW;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainCreateOrder {
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
			Order order = new Order();
						
			// save the order
			System.out.println("\nSaving the course ...");
			session.save(order);

			// create the products
			Product product1 = new Product("pen");
			Product product2 = new Product("pencil");
						
			// add students to the course
			order.addProduct(product1);
			order.addProduct(product1);
			
			// save the products
			System.out.println("\nSaving products ...");
			session.save(product1);
			session.save(product2);
			
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
