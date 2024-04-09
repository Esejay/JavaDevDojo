package projeto.serjoadevdojo.maratonajava.introducao;

public class Aula07Arrays03 {
	public static void main(String[] args) {
		int[] numeros = new int[]{1,2,3,4,5};
		
		for(int i=0; i<numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		for(int num:numeros) {
			System.out.println(num);
		}
		
	}

}
