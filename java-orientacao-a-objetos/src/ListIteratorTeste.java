import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTeste {
	
	public static void main(String[] args) {
		List<String> listaNome = new ArrayList<>();
		listaNome.add("Rafael");
		listaNome.add("Pedro");
		
		//PERCORRENDO DE TRÁS PARA FRENTE
		ListIterator<String> listIterator = listaNome.listIterator(listaNome.size());
		while(listIterator.hasPrevious()) {
			String nome = listIterator.previous();
			System.out.println(nome);
		}
	}

}
