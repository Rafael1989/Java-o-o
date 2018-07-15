import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class TryWithResourcesTeste {

	public static void main(String[] args) {
		Locale locale = new Locale("pt", "BR");
		
		try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("itens_pedido.txt")))){
			scanner.useLocale(locale);
			scanner.useDelimiter(";");
			
			NumberFormat formatador = NumberFormat.getCurrencyInstance(locale);
			
			while(scanner.hasNext()) {
				String produto = scanner.next();
				int quantidade = scanner.nextInt();
				double valor = scanner.nextDouble();
				scanner.nextLine();
				System.out.printf("Produto: %s. Quantidade: %d. Por: %s\n", produto,quantidade,formatador.format(valor));
			}
		}catch(IOException e) {
			System.err.println("Não conseguiu ler o arquivo. Erro: " + e.getMessage());
			System.exit(1);
		}
	}
}
