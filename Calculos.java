
import java.util.ArrayList;
public class Calculos {
	
	public ArrayList<float[]> processamento(ArrayList<float[]> Arquivo) {
 		
		for(int i = 0 ; i < Arquivo.size() ; i++) {
			
			float[] aux = new float[3];
			aux[0] = Arquivo.get(i).length;
			aux[1] = Media(Arquivo.get(i));
			aux[2] = DesvioPadrao(Arquivo.get(i));
			
			Arquivo.remove(i);
			Arquivo.add(i, aux);
		}
		
		return Arquivo;
	}
	
	private float DesvioPadrao(float[] DP) {
		
		float mediaArit = MediaAritmetica(DP);
		float soma = 0;
		
		for(int i = 0 ; i < DP.length ; i++) {
			soma += Math.pow(DP[i] - mediaArit, 2);
		}
		
		return (float) Math.sqrt(soma/DP.length);
	}

	private float MediaAritmetica(float[] Valores) {
		if(Valores.length != 0) {
			float MediaArit = 0f;
			for(int i = 0 ; i < Valores.length ; i ++) {
				MediaArit += Valores[i];
			}
			return (float) MediaArit/Valores.length;
		}else {
			return 0f;
		}
		
	}

	private float Media(float[] M) {
		
		int Media = 0;
		for(int i = 0 ; i < M.length ; i++) {
			Media += M[i];
		}
		
		
		return (float) Media/2;
	}

}
