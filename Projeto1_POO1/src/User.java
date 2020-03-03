
public class User {
	private String name;
	private String passwd;
	private boolean permission;
	
	// Métodos Públicos
	public boolean validateUser(String name1, String passwd1) {
		if (this.getName().equals(name1) && this.getPasswd().equals(passwd1)) {
			System.out.println("\nUsuário liberado");
			this.setPermission(true);
			return permission;
		} else if (this.getName().equals(name1) && !this.getPasswd().equals(passwd1)) {
			System.out.println("\nSenha inválida!");
			this.setPermission(false);
			return permission;
		} else  if (!this.getName().equals(name1) && this.getPasswd().equals(passwd1)) {
			System.out.println("\nNome de usuário invlálido!");
			this.setPermission(false);
			return permission;
		} else {
			System.out.println("\nNome e Senha inválidos!");
			this.setPermission(false);
			return permission;
		}
	}
	
	// Métodos Especiais 
	// Construtor
	public User(String nm, String pw) {
		this.setName(nm);
		this.setPasswd(pw);
		this.setPermission(false);
	}
	
	//Getters e Setters
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private String getPasswd() {
		return passwd;
	}
	private void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	private void setPermission(boolean permission) {
		this.permission = permission;
	}
	
	
}
