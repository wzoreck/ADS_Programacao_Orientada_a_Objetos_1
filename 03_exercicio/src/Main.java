
public class Main {

	public static void main(String[] args) {
		
		 ContaBanco daniel = new ContaBanco();
		 
		 daniel.setNumConta(205);
		 daniel.setDono("Daniel");
		 daniel.abrirConta("CP");
		 daniel.depositar(100);
		 daniel.estadoAtual();
		 
		 ContaBanco leinad = new ContaBanco();
		 
		 leinad.setNumConta(206);
		 leinad.setDono("Leinad");
		 leinad.abrirConta("CC");
		 leinad.estadoAtual();
	}

}
