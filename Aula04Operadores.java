package projeto.serjoadevdojo.maratonajava.introducao;

public class Aula04Operadores {
	public static void main(String[] args) {
		int numberV1 = 24;
		double numberV2 = 3.7;
		double result = numberV1+numberV2;
		System.out.println(result);
		
		double resto = 20%3; 
		System.out.println(resto);
		
		boolean maior = 10>20;
		boolean menor = 10<20;
		boolean diferente = 10!=20;
		boolean igual = 10==20;
		
		System.out.println(maior);
		System.out.println(menor);
		System.out.println(diferente);
		System.out.println(igual);
		
		// && and || or ! not
		
		int idade = 30;
		float salario = 5000F;
		boolean verificacao = idade>=30 && salario>=4612;
		boolean verificacao2 = idade<30 && salario>=3381;
		
		System.out.println(verificacao);
		System.out.println(verificacao2);
		
		double valorConta = 2000;
		double valorContaP = 2000;
		
		boolean compraPS = valorConta>=3000 || valorContaP>=3000;
		System.out.println(compraPS);
		
		double bonus = 3567;
		bonus -= 1000;
		bonus += 1000;
		bonus /= 1000;
		bonus *= 1000;
		bonus %= 1000;
		System.out.println(bonus);
		
		int contador = 0;
		contador++;
		contador--;
		contador+=1;
		System.out.println(++contador);
}
}