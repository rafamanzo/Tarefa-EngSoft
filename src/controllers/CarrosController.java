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

	public CarrosController(Result result, Carros carros) {
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

	public void lista() {
		result.include("carros", carros);
	}

	@Path("/carros/remova/{num}")
<<<<<<< HEAD
	public void remova(int num) {
=======
	public void remova(long num){
>>>>>>> a4e789a4cd028c7ab82babecd5db86b48dd35711
		carros.remove(num);
		result.redirectTo(CarrosController.class).lista();
	}

	@Path("/carros/edicao/{num}")
<<<<<<< HEAD
	public void edicao(int num) {
		result.include("carro", carros.getCarro(num));
		result.include("index", num);
	}

	@Path("/carros/atualize/{antigo}")
	public void atualize(final Carro carro, int antigo) {
		carros.atualize(antigo, carro);
=======
	public void edicao(long num){
		result.include("carro", carros.getCarro(num));
		result.include("index", num);
	}
	
	public void atualize(final Carro carro){
		carros.atualize(carro);
>>>>>>> a4e789a4cd028c7ab82babecd5db86b48dd35711
		result.redirectTo(CarrosController.class).lista();
	}
}