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
	public void remova(int num) {
		carros.remove(num);
		result.redirectTo(CarrosController.class).lista();
	}

	@Path("/carros/edicao/{num}")
	public void edicao(int num) {
		result.include("carro", carros.getCarro(num));
		result.include("index", num);
	}

	@Path("/carros/atualize/{antigo}")
	public void atualize(final Carro carro, int antigo) {
		carros.atualize(antigo, carro);
		result.redirectTo(CarrosController.class).lista();
	}
}