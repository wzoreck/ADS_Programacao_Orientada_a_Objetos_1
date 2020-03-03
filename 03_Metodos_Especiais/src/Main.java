
public class Main {

	public static void main(String[] args) {
		
		Caneta c1 = new Caneta();
		
		//c1.setModelo("Bic");
		// Pode setar o modelo dessa forma tbm, já que modelo é um atributo público
		// c1.modelo = "bic";
		//c1.setPonta(1.0f);
		
		// status de objeto caneta criada com método construtor
		c1.status();
		
		//System.out.println("Caneta\nmodelo: " + c1.getModelo() + "\nponta: " + c1.getPonta());
	}

}
