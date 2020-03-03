
public class ContaBanco {
	
	// Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	// Métodos Personalizados
	
	public void estadoAtual() {
		System.out.println("\nConta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
		System.out.println();
	}
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		// se abrir uma conta corrente deposita 50, se abrir uma conta poupança deposita 150
		if (t == "CC") {
			this.setSaldo(50);
		} else if (t == "CP") {
			this.setSaldo(150);
		}
		System.out.println("Conta aberta :) \n");
	}
	
	public void fecharConta() {
		// Verifica se ainda há dinheiro ou se há dividas antes de fechar a conta
		if (this.getSaldo() > 0) {
			System.out.println("Ainda há dinheiro, conta não pode ser fechada \n");
		} else if (this.getSaldo() < 0) {
			System.out.println("Conta não pode ser fechada, saldo negativo \n");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada :) \n");
		}
	}
	
	public void depositar(float valor) {
		if(this.getStatus()) { // se getStatus() retornar true já entra no if, não é necessário fazer comparação
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("Deposito realizado :) \n");
		} else {
			System.out.println("Conta fechada, impossível realizar depósito \n");
		}
	}
	
	public void sacar(float valor) {
		if (this.getStatus()) {
			if(this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Saque realizado :)");
				System.out.println();
			} else {
				System.out.println("O valor informado é maior do que o disponível \n");
			}
		} else {
			System.out.println("Não é possível sacar, conta fechada! \n");
		}
	}
	
	public void pagarMensal() {
		int v = 0;
		if (this.getTipo() == "CC") {
			v = 12;
		} else if (this.getTipo() == "CP") {
			v = 20;
		}
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga :) \n");
		} else {
			System.out.println("Falhou, conta fechada :) \n");
		}
	}
	
	
	// Método Construtor
	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	
	// Métodos Getters e Setters
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
