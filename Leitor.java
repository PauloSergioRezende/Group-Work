import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Leitor {

	private String n;
	private InputStreamReader Isr;
	private InputStream is;
	private BufferedReader Br;

	public Leitor(String nome) {
		n = nome;
	}

	public ArrayList<float[]> Ler() {

		try {

			ArrayList<float[]> arquivo = new ArrayList<float[]>();
			is = new FileInputStream(n);
			Isr = new InputStreamReader(is);
			Br = new BufferedReader(Isr);

			String s = Br.readLine();

			while (s != null) {

				String[] s2 = s.split(",");
				float[] vetor = new float[s2.length];

				try {
					
					for (int i = 0; i < s2.length; i++) {
						vetor[i] = Float.valueOf(s2[i]);
					}
					arquivo.add(vetor);
					
				} catch (Exception e) {
					System.out.println("Linha Invalida ou Nula.");
				}

				vetor = null;
				s2 = null;
				s = Br.readLine();
			}
			Br.close();
			Isr.close();
			return arquivo;

		} catch (IOException e) {
			System.out.println(e.getMessage());
			return null;
		}

	}
}
