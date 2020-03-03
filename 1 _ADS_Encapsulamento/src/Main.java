import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Pessoa[] vetorPessoa = new Pessoa[999];
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bem vindo!");
		while(true) {
			System.out.println("[1] para dar oi");
			System.out.println("[2] para dar tchau");
			int opcao = scanner.nextInt();
			if (opcao == 1) {
				System.out.println("OI");
				continue; // Volta para o início do while
			}
			if (opcao == 2) {
				System.out.println("Tchau");
				break; // Sai do while
			}
		}
	}

}
