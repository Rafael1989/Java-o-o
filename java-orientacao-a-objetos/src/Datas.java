import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Datas {

	public static void main(String[] args) {
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		try {
			Date dataExpiracao = formatador.parse("20/10/2013 14:30:00");
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(dataExpiracao);
			calendar.roll(Calendar.DAY_OF_MONTH, -25);
			System.out.println("Nova data de expiração: " + formatador.format(calendar.getTime()));
		} catch (ParseException e) {
			System.err.println("Formatao inválido. " + e.getMessage());
			System.exit(1);
		}
	}

}
