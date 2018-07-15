
public class Wrapper {
	
	public static void main(String[] args) {
		Integer idade = new Integer(31);
		
		byte byteValue = idade.byteValue();
		short shortValue = idade.shortValue();
		double doubleValue = idade.doubleValue();
		
		Float precoProduto = new Float(45.42f);
		short shortValue2 = precoProduto.shortValue();
		
		String numero = "40";
		String valor = "12.34";
		
		double precoDouble = Double.parseDouble(valor);
		int precoInt = Integer.parseInt(numero);
		
		//A PARTIR DO JAVA 1.5
		Double preco = 1.4;
		int idadee = new Integer(20);
	}

}
