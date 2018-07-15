import java.util.Scanner;

public class CalculoIMC {
	public static void main(String[] args) {
		System.out.println("======================Bem vindo ao sistema de cálculo do IMC==============================");
		System.out.println("Digite seu nome:");
		Scanner leitor = new Scanner(System.in);
		String nome = leitor.nextLine();
		System.out.println("Digite sua altura:");
		double altura = leitor.nextDouble();
		System.out.println("Digite seu peso:");
		int peso = leitor.nextInt();
		double imc = peso / (altura*altura);
		System.out.println(nome + " seu imc é : " + imc);
		if(imc < 18.5) {
			System.out.println("O seu peso está abaixo do ideal!!!! Coma bastante carboidrato, como por exemplo: pão, pizza, macarrão, arroz...");
		}else if(imc > 25 && imc < 30) {
			System.out.println("Peso ideal!! Continue assim, fazendo exercício, se alimentando bem...");
		}else if(imc > 30 && imc < 35) {
			System.out.println("Tá engordando fi, para por aí, entra na academia, diminua o carboidrato..");
		}else if(imc > 35 && imc < 40) {
			System.out.println("Perigo! Procure uma nutricionista, um personal trainer...");
		}else if(imc > 40 && imc < 50) {
			System.out.println("Perigo!!!!!!!!!!!!!!! Procure uma nutricionista, um personal trainer, pare de comer açúcar e carboidrato!!!");
		}else {
			System.out.println("Perigo!!!!!!!!!! Procure uma nutricionista, um personal trainer, pare de comer açúcar e carboidrato!!!, faça 1 hora de exercício todos os dias, coma fibras, vegetais, proteínas, e legumes em quantidades pequenas");
		}
	}
}
