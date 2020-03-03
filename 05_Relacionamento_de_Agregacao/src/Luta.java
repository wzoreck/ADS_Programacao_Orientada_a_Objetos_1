import java.util.Random;

public class Luta {
	// Atributos
	private Lutador desafiado; // Atributo do tipo Lutador, ou seja do tipo da classe Lutador
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	// Métodos públicos
	public void marcarLuta(Lutador l1, Lutador l2) {
		/*
		  	igual
		  	 
		  	if (l1.getCategoria() == l2.getCategoria() && (l1 != l2))
		 
		  	porem a forma abaixo é a correta por ser uma comparação entre "classes"
		 */
		if (l1.getCategoria().equals(l2.getCategoria()) && (l1 != l2)) {
			this.setAprovada(true);
			this.setDesafiado(l1);
			this.setDesafiante(l2);
		} else {
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
		}
	}
	
	public void lutar() {
		if (this.getAprovada()) {
			System.out.println("----Desafiadao----");
			this.desafiado.apresentar();
			System.out.println("----Desafiante----");
			this.desafiante.apresentar();
			
			// Gerar um resultado aleatório
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3); // Poderá retornar 0, 1 ou 2
			switch (vencedor) {
				case 0: // Empate
					System.out.println("\nEmpate!");
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
				break;
				
				case 1: // Desafiado venceu
					System.out.println("\nVencedor: " + this.desafiado.getNome());
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
				break;
				
				case 2: // Desafiante venceu
					System.out.println("\nVencedor: " + this.desafiante.getNome());
					this.desafiado.perderLuta();
					this.desafiante.ganharLuta();
				break;
			}
			
		} else {
			System.out.println("A luta não está aprovada");
		}
	}

	// Métodos especiais
	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean getAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	
}
