package br.com.luiz.zoologico.application;

import br.com.luiz.zoologico.entities.Animal;
import br.com.luiz.zoologico.entities.Mamifero;
import br.com.luiz.zoologico.entities.Peixe;

public class Program {

	public static void main(String[] args) {
		
		Animal camelo = new Animal();
				
		camelo.setNome("Camelo");
		camelo.setComprimento(150);
		camelo.setPatas(4);
		camelo.setCor("Amarelo");
		camelo.setAmbiente("Terra");
		camelo.setVelocidade(2.0);
		
		
		Peixe tubarao = new Peixe();
		tubarao.setNome("Tubar�o");
		tubarao.setComprimento(300);
		tubarao.setVelocidade(1.5);
		
		
		Mamifero urso = new Mamifero();
		urso.setNome("Urso do Canad�");
		urso.setComprimento(180);
		urso.setCor("Vermelho");
		urso.setVelocidade(0.5);
		urso.setAlimento("Mel");
		
		Animal[] animais = new Animal[3];
		animais[0] = camelo;
		animais[1] = tubarao;
		animais[2] = urso;
		
		System.out.println("Zoo");
		System.out.println("---------------------");
		for (Animal animal: animais) {
			System.out.println(animal);
			System.out.println("---------------------");
		}
	}

}
