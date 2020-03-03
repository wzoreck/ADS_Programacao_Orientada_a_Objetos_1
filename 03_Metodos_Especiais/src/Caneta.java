
public class Caneta {
	
	public String modelo;
	private float  ponta;
	private boolean tampada;
	private String cor;
	
	
	// Método Construtor, dar o mesmo nome que o da Classe
	public Caneta() {
		this.tampar();
		this.cor = "Roxa";
		this.setModelo("Bic");
		this.setPonta(1.5f);
	}
	
	
	// Método getModelo() retorna uma String, que é o modelo
	public String getModelo() {
		return this.modelo;
	}
	
	// Método setModelo() recebe como parâmetro uma String
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	
	public void setPonta(float p) {
		this.ponta = p;
	}
	
	
	public void status() {
		// System.out.println("Modelo: " + this.modelo);
		// Mesma coisa que o anterior
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Tampada: " + this.tampada);
		System.out.println("Cor: " + this.cor);
		System.out.println();
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
}