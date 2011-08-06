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
		lista.remove(num);
	}
	
	public void atualize(int antigo, Carro novo){
		Carro carro = lista.get(antigo);		
		carro.setAno(novo.getAno());
		carro.setMarca(novo.getMarca());
		carro.setModelo(novo.getModelo());
		carro.setCor(novo.getCor());
	}
	
	public List<Carro> getLista(){
		return lista;
	}
	
	public Carro getCarro(int num){
		return lista.get(num);
	}
}
