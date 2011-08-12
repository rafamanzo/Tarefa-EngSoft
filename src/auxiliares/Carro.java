package auxiliares;

public class Carro {
	private String marca;
	private String modelo;
	private String cor;
	private Integer ano;
	private long id;
	
	public void setId(long id){
		this.id = id;
	}
	
	public long getId(){
		return this.id;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}
}
