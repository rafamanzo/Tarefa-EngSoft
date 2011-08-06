package auxiliares;

import java.util.ArrayList;
import java.util.List;
import br.com.caelum.vraptor.ioc.ApplicationScoped;
import br.com.caelum.vraptor.ioc.Component;
import auxiliares.Carro;

@Component
@ApplicationScoped
public class Carros {
	private List<Carro> lista = new ArrayList<Carro>();

	public void adiciona(Carro carro){
		lista.add(carro);
	}
	
	public void remove(int num){
		System.out.println("*****Removeu*******");
		lista.remove(num);
	}
	
	public List<Carro> getLista(){
		return lista;
	}
}
