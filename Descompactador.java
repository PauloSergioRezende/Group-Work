import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Descompactador {

	private String n;
	private InputStreamReader Isr;
	private InputStream is;
	private BufferedReader Br;

	public Descompactador(String nome) {
		n = nome;
	}

	public ArrayList<int[]> Leitor() {

		try {

			ArrayList<int[]> arquivo = new ArrayList<int[]>();
			is = new FileInputStream(n);
			Isr = new InputStreamReader(is);
			Br = new BufferedReader(Isr);

			String s = Br.readLine();

			while (s != null) {

				String[] s2 = s.split(",");
				int[] vetor = new int[s2.length];

				for (int i = 0; i < s2.length; i++) {
					vetor[i] = Integer.valueOf(s2[i]);
				}
				arquivo.add(vetor);
				vetor = null;
				s2 = null;
				s = Br.readLine();
			}
			return arquivo;

		} catch (IOException e) {
			System.out.println(e.getMessage());
			return null;
		}

	}
}
