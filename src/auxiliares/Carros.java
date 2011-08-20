package auxiliares;

import java.util.List;
import br.com.caelum.vraptor.ioc.Component;
import auxiliares.Carro;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@Component
public class Carros {
	private Session session = null;

	public void adiciona(Carro carro) {
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();

			session.save(carro);

			session.flush();
			session.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void remove(long num){
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        session = sessionFactory.openSession();
		
		session.delete(session.get(Carro.class, num));
		session.flush();
		
		session.close();
	}
	
	public void atualize(Carro novo){
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        session = sessionFactory.openSession();
        
        session.saveOrUpdate(novo);
        session.flush();
        
        session.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Carro> getLista(){
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        session = sessionFactory.openSession();
        
		List<Carro> l = session.createCriteria(Carro.class).list();
		
		session.close();
		
		return l;
	}
	
	public Carro getCarro(long num){
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        session = sessionFactory.openSession();
        
		Carro c = (Carro) session.get(Carro.class, num);
		
		session.close();
		
		return c;
	}
}
