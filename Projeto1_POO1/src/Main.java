
public class Main {

	public static void main(String[] args) {
		
		User daniel = new User("daniel", "123");
		
		
		System.out.println("Permissão: " + daniel.validateUser("daniel", "123"));
	}
}
