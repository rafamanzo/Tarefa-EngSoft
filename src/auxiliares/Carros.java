package auxiliares;

import java.util.ArrayList;
import java.util.List;
import br.com.caelum.vraptor.ioc.ApplicationScoped;
import br.com.caelum.vraptor.ioc.Component;
import auxiliares.Carro;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@Component
@ApplicationScoped
public class Carros {
	private List<Carro> lista = new ArrayList<Carro>();
	private Session session = null;

	public void adiciona(Carro carro) {
		try {
			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			session = sessionFactory.openSession();

			session.save(carro);

			session.flush();
			session.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void remove(int num) {
		lista.remove(num);
	}

	public void atualize(int antigo, Carro novo) {
		Carro carro = lista.get(antigo);
		carro.setAno(novo.getAno());
		carro.setMarca(novo.getMarca());
		carro.setModelo(novo.getModelo());
		carro.setCor(novo.getCor());
	}

	@SuppressWarnings("unchecked")
	public List getLista() {
		try {
			List l;

			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			session = sessionFactory.openSession();

			l = session.createQuery("from carros").list();
			return l;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}

	public Carro getCarro(int num) {
		return lista.get(num);
	}
}
