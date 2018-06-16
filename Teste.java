import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		String n = "arquivo.txt";
		FileToFile teste = new FileToFile(n);
		
		ArrayList<float[]> aux = teste.getArquivoCalculado();
		
		for(int i = 0; i < aux.size() ; i++) {
			for(int j = 0; j < aux.get(i).length ; j++) {
				System.out.print(aux.get(i)[j]);
				
				if(j < aux.get(i).length-1) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}
		
	}

}
