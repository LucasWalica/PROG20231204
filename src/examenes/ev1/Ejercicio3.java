package examenes.ev1;

import java.util.Arrays;
import java.util.Scanner;

/*

3
Pepe - 9.0; 8.0; 7.0
Pepín -    5  ; 4;  3
Pepón-5;4;3

*/

public class Ejercicio3 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			s.useDelimiter("\\s*|\\s*-\\s*|\\s*;\\s*");
			int n = s.nextInt();
			String [] nombres = new String[n];
			float [][] notas = new float[n][3];
			for (int i=0; i<3; i++) {
				nombres[i] = s.next();
				notas[i][0] = s.nextFloat();
				notas[i][1] = s.nextFloat();
				notas[i][2] = s.nextFloat();
			}
			System.out.println(Arrays.toString(nombres));
			System.out.println(Arrays.deepToString(notas));
		}
	}

}
