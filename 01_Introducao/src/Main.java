
public class Main {

	public static void main(String[] args) {
		
		// Criando um objeto do tipo Caneta 
		Caneta caneta1 = new Caneta();
		
		// Atribuindo valores aos atributos
		caneta1.cor = "Vermelho";
		caneta1.carga = 100;
		caneta1.ponta = 1.0f;
		caneta1.tampada = false;
		caneta1.modelo = "Bic";
		
		// Chamando o método status() da classe Caneta, apresenta os valores dos atributos deste objeto
		caneta1.status();
		
		// Chamando o método tampar(), "tamparemos a caneta1"
		caneta1.tampar();
		caneta1.status();
		
		// Chamando o método rabiscar() com a caneta tampada
		caneta1.rabiscar();
		
		// Chamando o método rabiscar() com a caneta destampada
		caneta1.destampar();
		caneta1.rabiscar();
		
		// Nova Caneta
		Caneta c2 = new Caneta();
		c2.carga = 50;
		c2.cor = "Azul";
		c2.modelo = "Faber Castel";
		c2.ponta = 0.5f;
		c2.tampar();
		
		c2.status();
		c2.rabiscar();
		
		// Os dois objetos possuem os mesmos ATRIBUTOS e MÉTODOS, porêm cada um está em um ESTADO diferente
	}

}
