
public class Main {

	public static void main(String[] args) {
		// O que há de diferente? - Primeiramente criar uma nova interface java no package
		
		ControleRemoto c1 = new ControleRemoto();
		
		c1.ligar();
		c1.maisVolume();
		c1.play();
		c1.abrirMenu();
	}

}
