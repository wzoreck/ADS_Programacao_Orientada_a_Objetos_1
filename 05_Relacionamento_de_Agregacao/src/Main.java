
public class Main {

	public static void main(String[] args) {
		
		// Vteor de Lutadores
		Lutador l[] = new Lutador[3];
		
		// Criar objeto Lutador para cada posição do vetor - Utilizando o método construtor
		// Parâmetros ("Nome", "Nacionalidade", Idade, Altura, Peso, Vitorias, Derrotas, Empates)
		l[0] = new Lutador("Joselito", "Brazil", 35, 1.50f, 90.0f, 0, 29, 0);
		l[1] = new Lutador("Zé Bragança", "Indonésia", 45, 1.94f, 80.9f, 12, 0, 10);
		l[2] = new Lutador("Pafuncio", "Argentina", 20, 1.78f, 99.0f, 1, 0, 34);
		
		Luta luta = new Luta();

		luta.marcarLuta(l[0], l[2]);
		luta.lutar();
		
		
		System.out.println("\nEstado após a luta");
		l[0].apresentar();
		l[2].apresentar();
	}

}
