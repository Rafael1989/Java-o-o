import java.util.Arrays;

public class Array {
	
	public static void main(String[] args) {
		byte idades [] = new byte[10];
		for(byte i = 0; i < 10; i++) {
			idades[i] = (byte) (i+1);
		}
		//A PARTIR DO JAVA 5
		for(byte idade : idades) {
			System.out.println(idade);
		}
		
		
		//COPIANDO DADOS DO ARRAY
		byte[] idadesSelecionadas = Arrays.copyOf(idades, 1);
		for(byte idade : idadesSelecionadas) {
			System.out.println(idade);
		}
	}

}
