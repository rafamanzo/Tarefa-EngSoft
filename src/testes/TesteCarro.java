package testes;

import junit.framework.TestCase;
import auxiliares.Carro;

public class TesteCarro extends TestCase{
	public TesteCarro(String name){
		super(name);
	}
	
	public void testGetMarca(){
		Carro carro = new Carro("Marca", "Modelo", "Cor", 0, 0);
		assertEquals("Marca", carro.getMarca());
	}
	
	public void testSetMarca(){
		Carro carro = new Carro("Marca", "Modelo", "Cor", 0, 0);
		carro.setMarca("Teste");
		assertEquals("Teste", carro.getMarca());
	}
	
	public void testGetModelo() {
		Carro carro = new Carro("Modelo", "Modelo", "Cor", 0, 0);
		assertEquals("Modelo", carro.getModelo());
	}

	public void testSetModelo() {
		Carro carro = new Carro("Marca", "Modelo", "Cor", 0, 0);
		carro.setModelo("Teste");
		assertEquals("Teste", carro.getModelo());
	}
	
	public void testGetCor(){
		Carro carro = new Carro("Marca", "Modelo", "Cor", 0, 0);
		assertEquals("Cor", carro.getCor());
	}
	
	public void testSetCor(){
		Carro carro = new Carro("Marca", "Modelo", "Cor", 0, 0);
		carro.setCor("Teste");
		assertEquals("Teste", carro.getCor());
	}
	
	public void testGetAno(){
		Carro carro = new Carro("Marca", "Modelo", "Cor", 0, 0);
		assertEquals((Integer) 0, carro.getAno());
	}
	
	public void testSetAno(){
		Carro carro = new Carro("Marca", "Modelo", "Cor", 0, 0);
		carro.setAno(2011);
		assertEquals((Integer) 2011, carro.getAno());
	}
}
