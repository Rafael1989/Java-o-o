
public class ExibeParametros {
	public static void main(String[] args) {//args run configurations: arguments: Um Dois Três "Q U A T R O"
		for(int i = 0;i < args.length;i++) {
			System.out.println("Argumento: " + i + ": " + args[i]);
		}
		
		enviarEmails("a@a.com","b@b.com");
	}
	
	//A PARTIR DO JAVA 5 (VARARGS)
	public static void enviarEmails(String... emails) {
		for(String email : emails) {
			System.out.println(email);
		}
	}

}
