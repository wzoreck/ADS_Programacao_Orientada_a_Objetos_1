
public class Main {

	public static void main(String[] args) {
		
		Caneta c1 = new Caneta();
		
		// Tentando modificar alguns atributos
		c1.modelo = "Bic"; // Permite pois é público
		c1.cor = "Azul"; // Permite pois é público
		//c1.ponta = 1.0f; // Não permite pois é privado, a pŕopria IDE avisa
		c1.carga = 40; // Permite pois o método main(String[] args){} está dentro de uma classe que está usando a classe Caneta, objeto "c1"
		//c1.tampada = true;
		
		// Podemos utilizar dentro do main os métodos que são PUBLICOS e PROTEGIDOS da classe Caneta
		c1.destampar(); // Mesmo o atributo "tampada" da classe Caneta sendo privado, podemos destampar a caneta através do método destampar() 
		c1.status();
		c1.rabiscar();
	}

}
