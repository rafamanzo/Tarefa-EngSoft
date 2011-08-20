package testes;

import junit.framework.TestCase;
import auxiliares.Carro;
import auxiliares.Carros;
import java.util.List;

//É mais um teste de integração do que testes de unidade
public class TesteCarros extends TestCase{
	private Carro carro;
	private Carros carros;
	
	public void setUp(){
		carro = new Carro();
		carro.setAno(2000);
		carro.setMarca("Gurgel");
		carro.setModelo("BR800");
		carro.setCor("Prata");
		carros = new Carros();
	}
	
	public void testAdicionaAndGetCarroAndRemove(){
		long id = carros.adiciona(carro);
		Carro c = carros.getCarro(id);
	
		assertEquals(carro.getCor(), c.getCor());
		assertEquals(carro.getMarca(), c.getMarca());
		assertEquals(carro.getModelo(), c.getModelo());
		assertEquals(carro.getAno(), c.getAno());
		
		carros.remove(id);
		assertNull(carros.getCarro(id));
	}
	
	public void testAtualize(){
		long id = carros.adiciona(carro);
		Carro c = carros.getCarro(id);
		
		c.setAno(1000);
		c.setMarca("Ford");
		c.setModelo("Ka");
		c.setCor("Preto");
		
		carros.atualize(c);
		
		Carro c1 = carros.getCarro(id);
		
		assertEquals(c.getCor(), c1.getCor());
		assertEquals(c.getMarca(), c1.getMarca());
		assertEquals(c.getModelo(), c1.getModelo());
		assertEquals(c.getAno(), c1.getAno());
		
		carros.remove(id);
	}
	
	public void testGetLista(){
		long id = carros.adiciona(carro);
		
		List<Carro> l = carros.getLista();
		
		assertNotNull(l);
		
		carros.remove(id);
	}
}