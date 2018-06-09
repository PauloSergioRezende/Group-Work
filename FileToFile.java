import java.util.ArrayList;

public class FileToFile {
	private Descompactador d;
	private ArrayList<int[]> arquivo;
	
	public FileToFile(String n) {
		d = new Descompactador(n);
	}
	
	public void To_Q_M_D_P() {
		arquivo = d.Leitor();
		System.out.println("batata");
	}
}
