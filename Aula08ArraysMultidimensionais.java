package projeto.serjoadevdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais {
	public static void main(String[] args) {
		// 1,2,3,4,5 meses
		// 31,28,31,30 dias
		int[][] dias = new int[3][4];
		dias[0][0] = 31;
		dias[0][1] = 28;
		dias[0][2] = 31;
		
		dias[1][0] = 31;
		dias[1][1] = 28;
		dias[1][2] = 31;
		
		dias[2][0] = 31;
		dias[2][1] = 28;
		dias[2][2] = 31;
		for(int i=0;i<dias.length;i++) {
			for(int x=0;x<dias[i].length;x++) {
				System.out.println(dias[i][x]);
			}
		}
		for(int[] arrBase: dias) {
			for(int num: arrBase) {
				System.out.println(num);
			}
			
		}
	}

}
