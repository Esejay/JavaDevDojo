package projeto.serjoadevdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais { 
	public static void main(String[] args) {
		int idade = 22;
		boolean maior20 = idade>=20;
		if(maior20) {
			System.out.println("Maior ou igual a 20");
		}else {
			System.out.println("Menor que 20");
		}
		float nota = 10F;
		if(nota>=5 && nota<7) {
			System.out.println("Recuperação");
		}else if(nota>=7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		

}
}
