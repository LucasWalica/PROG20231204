package examenes.ev1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			String linea;
			System.out.print("> ");
			while ((linea = in.nextLine()) != null) {
				for (String s: linea.split("\\s+")) {
					System.out.print(Ejercicio1.transformar(s) + " ");
				}
				System.out.println("\n> ");
			}
		}
	}

}
