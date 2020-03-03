
public class Caneta {
	
	/*
	   + público (a classe atual e todas as outras podem ter acesso);
	   - privado (somente a classe atual tem acesso);
	   # protegido (a classe atual e todas as suas subclasses tem acesso);
	*/
		
	// Atributos com visibilidade
	public String modelo;
	public String cor;
	private float  ponta;
	protected int carga;
	private boolean tampada;
	
	// Métodos
	public void status() {
		
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Tampada: " + this.tampada);
		System.out.println(); // Pular uma linha
	}
	
	public void rabiscar() {
		if(this.tampada == true) {
			System.out.println("É necessário destampar a caneta primeiro!");
			System.out.println();
		} else {
			System.out.println("Rabiscando");
			System.out.println();
		}
	}
	
	// Método para "tampar" a caneta
	public void tampar() {
		// Podemos atribuir valor em "private tampada"pois está dentro da classe atual, o método tampar() sendo público dará a possibilidade de tamparmos a caneta
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
}