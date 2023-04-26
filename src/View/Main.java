package View;
import Controller.Rec;

public class Main {

	public static void main(String[] args) {
		 int[] V = {4,45,84,1,39};
		 int Tamanho = V.length-1;
		 int Ultimo = V[0];
		 Rec R = new Rec();
		 System.out.println(R.RecVet(V,Tamanho,Ultimo));
	}

}
