import java.math.BigDecimal;

public class BigDecimalTeste {
	
	public static void main(String[] args) {
		//SEMPRE USAR STRING NO CONSTRUTOR DO BIGDECIMAL
		BigDecimal valor = new BigDecimal("10");
		
		if(valor.compareTo(new BigDecimal("15"))<0) {
			System.out.println("Valor menor que 15");
		}
		
		if(valor.compareTo(new BigDecimal("5")) > 0) {
			System.out.println("Valor maior que 5");
		}
		
		if(valor.compareTo(new BigDecimal("10")) == 0) {
			System.out.println("Valor igual a 10");
		}
	}

}
