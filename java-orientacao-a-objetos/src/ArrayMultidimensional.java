
public class ArrayMultidimensional {
	
	public static void main(String[] args) {
		String [][] locais = new String[3][];
		locais[0] = new String[3];
		locais[0][0] = "Uberlândia";
		locais[0][1] = "Uberaba";
		locais[0][2] = "Belo Horizonte";
		
		locais[1] = new String[1];
		locais[1][0] = "Rio de Janeiro";
		
		locais[2] = new String[2];
		locais[2][0] = "São Paulo";
		locais[2][1] = "Ribeirão Preto";
		
		String [][] locais2 = {
				{"Uberlândia","Uberaba","Belo Horizonte"},
				{"Rio de Janeiro"},
				{"São Paulo","Ribeirão Preto"}
		};
		
		//PERCORRENDO ARRAY MULTIDIMENSIONAL
		for(int i = 0;i < locais.length; i++) {
			for(int j = 0; j<locais[i].length;j++) {
				System.out.println(locais[i][j]);
			}
		}
	}

}
