import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Escritor {

	public void EscreverFloat(ArrayList<float[]> arquivo) {
		try {
			OutputStream os = new FileOutputStream("saida.txt");
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);

			for (int i = 0; i < arquivo.size(); i++) {

				float[] aux = arquivo.get(i).clone();

				for (int j = 0; j < arquivo.get(i).length; j++) {
					String aux2 = String.valueOf(aux[j]);
					bw.write(aux2);
					if (j < 2) {
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
			OutputStream os = new FileOutputStream("saida.txt");
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);

			for (int i = 0; i < arquivo.size(); i++) {

				float[] aux = arquivo.get(i).clone();

				for (int j = 0; j < arquivo.get(i).length; j++) {
					int aux2 = (int) aux[j];
					bw.write(String.valueOf(aux2));
					if (j < 2) {
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
