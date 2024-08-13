
public class Uso_Arrays_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] matrizAleatorio = new int[150];
		
		for(int i = 0 ; i<matrizAleatorio.length;i++) {
			matrizAleatorio[i]= (int) Math.round(Math.random()*100);
		}
		
		for(int numeros:matrizAleatorio) {
			System.out.print(numeros + " ");
		}
	}

}
