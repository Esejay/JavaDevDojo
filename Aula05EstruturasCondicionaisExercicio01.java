package projeto.serjoadevdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionaisExercicio01 {
	public static void main(String[] args) {
		double valorRecebido = 25000;
		if (valorRecebido<=34712) {
			System.out.println("O imposto a ser pago é de: "+(valorRecebido*9.7)/100);
		}else if (valorRecebido==34712 && valorRecebido<=68507){
			System.out.println("O imposto a ser pago é de: "+(valorRecebido*37.35)/100);
		}else {
			System.out.println("O imposto a ser pago é de: "+(valorRecebido*49.50)/100);
		}
}

}