import java.util.ArrayList;

public class FileToFile {
	private Leitor d;
	private Calculos c;
	private Escritor e;
	private ArrayList<float[]> Arquivo;
	
	public FileToFile(String n) {
		d = new Leitor(n);
		c = new Calculos();
		e = new Escritor();
	}
	
	public void To_Float() {
		Arquivo = d.Ler();
		Arquivo = c.processamento(Arquivo); 
		e.EscreverFloat(Arquivo);
	}
	
	public void To_Int() {
		Arquivo = d.Ler();
		Arquivo = c.processamento(Arquivo); 
		e.EscreverInt(Arquivo);
	}
}
