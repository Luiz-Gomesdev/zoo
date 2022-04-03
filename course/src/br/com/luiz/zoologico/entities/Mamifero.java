package br.com.luiz.zoologico.entities;

public class Mamifero extends Animal{
	
	private String alimento;

	public Mamifero(){
		super();
		this.setCor("Castanho");
		this.setAmbiente("Terra");
		this.setPatas(4);
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public String toString() {
		String s = super.toString();
		s += "\nAlimento: " + alimento;
		
		return s;
	}

	
	
}
