package Controller;

public class Rec {
	public int RecVet(int[] v, int tamanho, int ultimo) {
		if (tamanho == 0) {
			return ultimo;
		}else {
			ultimo = RecVet(v,tamanho -1,ultimo);
			if (v[tamanho] < ultimo) {
				ultimo = v[tamanho];
			}
			return ultimo;
		}
	}
}
