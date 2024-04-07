package projeto.serjoadevdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
	public static void main(String[] args) {
		byte dia = 10;
		
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("Opção inválida digitada.");
			break;
		}
		
		char sexo = 'P';
		switch(sexo) {
		case 'M':
			System.out.println("Masculino");
			break;
		case 'F':
			System.out.println("Feminino");
			break;
		default:
			System.out.println("Opção inválida digitada");
		}
	}

}
