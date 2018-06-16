import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Escritor {
	private Scanner in;
	private String nomeSaida;
	
	
	public Escritor() {

		System.out.println("Digite o nome do Arquivo de Saida");
		in = new Scanner(System.in);
		String aux = in.nextLine();
		String[] aux2 = aux.split(".");
		nomeSaida = aux2[0] + ".txt";
	}

	public Escritor(String nome) {
		
		try {
			String[] aux2 = nome.split(".");
			nomeSaida = aux2[0] + ".txt";
		}catch(Exception e) {	
			nomeSaida = nome + ".txt";
		}
		
	}

	
	public void EscreverFloat(ArrayList<float[]> arquivo) {
		
		try {
			
			OutputStream os = new FileOutputStream(nomeSaida);
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);

			for (int i = 0; i < arquivo.size(); i++) {
				for (int j = 0; j < arquivo.get(i).length; j++) {
					
					bw.write(String.valueOf(arquivo.get(i)[j]));
					
					if (j < arquivo.get(i).length-1) {
						bw.write(", ");
					}
				}
				
				if(i != arquivo.size()-1) {
					bw.newLine();
				}
			}

			bw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void EscreverInt(ArrayList<float[]> arquivo) {
		
		try {
			
			OutputStream os = new FileOutputStream(nomeSaida);
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);

			for (int i = 0; i < arquivo.size(); i++) {
				for (int j = 0; j < arquivo.get(i).length; j++) {
					
					bw.write(String.valueOf((int)arquivo.get(i)[j]));
					
					if (j < arquivo.get(i).length-1) {
						bw.write(", ");
					}
				}
				
				if(i != arquivo.size()-1) {
					bw.newLine();
				}
				

			}

			bw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
