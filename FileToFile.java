import java.util.ArrayList;
import java.util.Scanner;

public class FileToFile {
	
	private Leitor d;
	private Calculos c;
	private Escritor e;
	private ArrayList<float[]> ArquivoLido;
	private ArrayList<float[]> ArquivoCalculos;
	private ArrayList<float[]> ArquivoExterno;
	private Scanner in;
	
	
	public FileToFile(String n) {
		d = new Leitor(n);
		c = new Calculos();
		e = new Escritor("saida");
		ArquivoLido = new ArrayList<float[]>();
		ArquivoCalculos = new ArrayList<float[]>();
	}
	
	public void AlterarDiretorioDeSaida() {
		System.out.println("Digite o nome do arquivo de saida:");
		in = new Scanner(System.in);
		String aux = in.nextLine();
		e =  new Escritor(aux);
	}
	
	
	
	public ArrayList<float[]> getArquivoLido() {
		return ArquivoLido;
	}
	
	public void LerArquivo() {
		ArquivoLido = d.Ler();
	}

	
	
	public ArrayList<float[]> getArquivoCalculado() {
		
		if(ArquivoCalculos.size() == 0) {
			
			System.out.println("Arquivo Calculado Vazio");
			System.out.println();
			System.out.println("Gostaria de Preenchê-lo?(Y/N)");
			in = new Scanner(System.in);
			
			char aux =  in.nextLine().toLowerCase().charAt(0);
			
			while("y".equals(aux) || "n".equals(aux)) {
				System.out.println("Opção Inválida");
				System.out.println("Por favor, responda usando Y para Sim ou N para Não.");
				aux =  in.nextLine().toLowerCase().charAt(0);
			}
			
			if(aux ==  'y') {
				CalcularArquivo();
				return ArquivoCalculos;
			}else {
				return null;
			}
		}
		return ArquivoCalculos;
	}
	
	public void CalcularArquivo(){
		if(ArquivoLido.size() == 0) {
			LerArquivo();
		}
		ArquivoCalculos = c.Calcular(ArquivoLido);
	}
	
	
	
	public ArrayList<float[]> CalcularDeArquivoExterno(ArrayList<float[]> ArquivoNew){
		ArquivoNew = c.Calcular(ArquivoNew);
		return ArquivoNew;
	}
	
	public void CalcularDeArquivoExterno_Salvar(ArrayList<float[]> ArquivoNew){
		ArquivoExterno = c.Calcular(ArquivoNew);
	}

	
	
	public void EscreverFloat() {
		if(ArquivoCalculos.size() != 0) {
			e.EscreverFloat(ArquivoCalculos);
		}else {
			System.out.println("Arquivo Vazio");
		}
		
	}
	
	public void EscreverInt() {
		if(ArquivoCalculos.size() != 0) {
			e.EscreverInt(ArquivoCalculos);
		}else {
			System.out.println("Arquivo Vazio");
		}
		
	}
	
	public void EscreverExternoFloat(ArrayList<float[]> ArquivoNew) {
		if(ArquivoNew.size() != 0) {
			e.EscreverFloat(ArquivoNew);
		}else {
			System.out.println("Arquivo Vazio");
		}
	}

	public void EscreverExternoInt(ArrayList<float[]> ArquivoNew) {
		if(ArquivoNew.size() != 0) {
			e.EscreverInt(ArquivoNew);
		}else {
			System.out.println("Arquivo Vazio");
		}
	}
	
	public void EscreverExternoFloat_Salvo() {
		if(ArquivoExterno.size() != 0) {
			e.EscreverFloat(ArquivoExterno);
		}else {
			System.out.println("Arquivo Vazio");
		}
	}

	public void EscreverExternoInt_Salvo() {
		if(ArquivoExterno.size() != 0) {
			e.EscreverInt(ArquivoExterno);
		}else {
			System.out.println("Arquivo Vazio");
		}
	}

	
	
	public void File_To_Float() {
		LerArquivo();
		CalcularArquivo();
		e.EscreverFloat(ArquivoCalculos);
	}
	
	public void File_To_Int() {
		LerArquivo();
		CalcularArquivo();
		e.EscreverInt(ArquivoCalculos);
	}
}
