package controllers;

import auxiliares.Carro;
import auxiliares.Carros;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class CarrosController {
	private final Result result;
	private Carros carros;
	
	public CarrosController(Result result, Carros carros){
		this.result = result;
		this.carros = carros;
	}
	
	@Path("/")
	public void index() {
	}
	
	public void cadastro() {
	}
	
	public void salve(final Carro carro) {
		carros.adiciona(carro);
		result.redirectTo(CarrosController.class).index();
	}
	
	public void lista(){
		result.include("carros", carros);
	}
	
	public void remova(final Carro carro){
		carros.remove(carro);
		result.redirectTo(CarrosController.class).lista();
	}
}