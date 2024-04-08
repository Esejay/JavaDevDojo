package projeto.serjoadevdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticaoExercicio02 {
	public static void main(String[] args) {
		double valorCarro = 30000;
		for(int parcela = 1;parcela<=valorCarro; parcela++) {
			double valorParcela = valorCarro/parcela;
			if(valorParcela<1000) {
				break;
			}
			System.out.println("Parcela "+ parcela+ " R$ "+valorParcela);
		}
		
		
	}

}
