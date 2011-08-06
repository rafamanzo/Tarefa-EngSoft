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

	public Carros(){
		System.out.println("*************Criou!!!****************");
	}
	public void adiciona(Carro carro){
		System.out.println("*************Adicionou!!!****************");
		lista.add(carro);
	}
	
	public void remove(Carro carro){
		lista.remove(carro);
	}
	
	public List<Carro> getLista(){
		System.out.println("*************Listou!!!****************");
		return lista;
	}
}
