import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class DecimalFormatTeste {
	
	public static void main(String[] args) {
		double litrosAbastecidos = 38.42;
		double valorDoLitro = 2.299;
		
		double totalAPagar = litrosAbastecidos * valorDoLitro;
		
		DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		String valorAPagar = decimalFormat.format(totalAPagar);
		System.out.println(valorAPagar);
	}

}
