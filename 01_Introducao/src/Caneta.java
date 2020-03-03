
public class Caneta {
	// Atributos
	String modelo;
	String cor;
	float  ponta;
	int carga;
	boolean tampada;
	
	// Métodos
	void status() {
		
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Tampada: " + this.tampada);
		System.out.println(); // Pular uma linha
	}
	
	void rabiscar() {
		if(this.tampada == true) {
			System.out.println("É necessário destampar a caneta primeiro!");
			System.out.println();
		} else {
			System.out.println("Rabiscando");
			System.out.println();
		}
	}
	
	// Método para "tampar" a caneta
	void tampar() {
		this.tampada = true;
	}
	
	void destampar() {
		this.tampada = false;
	}
}
