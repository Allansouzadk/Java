package matriz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] math = new int[m][n];
		for (int i = 0 ; i < math.length ; i++) {
			for (int j = 0 ; j < math[i].length ; j++) {
				math[i][j] = sc.nextInt();
				
			}
			
		}
		
	for (int i = 0; i < math.length; i++) {
		
		for (int j = 0; j < math[i].length ; j++) {
			
			System.out.println(math[i][j]);

		}
		
		
	}
	
	int x = sc.nextInt();
	
	for (int i=0; i<math.length; i++) {
		for (int j=0; j<math[i].length; j++) {
			if (math[i][j] == x) {
				System.out.println("Position " + i + "," + j + ":");
				if (j > 0) {
					System.out.println("Esquerda: " + math[i][j-1]);
				}
				if (i > 0) {
					System.out.println("Acima: " + math[i-1][j]);
				}
				if (j < math[i].length-1) {
					System.out.println("Direita: " + math[i][j+1]);
				}
				if (i < math.length-1) {
					System.out.println("Abaixo: " + math[i+1][j]);
				}
			}
		}
	}
	
		sc.close();
	}

}
