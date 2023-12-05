package examenes.ev1;

public class Ejercicio1 {
	
	static String transformar(String s){
		return s.length() < 3 ? s : s.charAt(0) + "*".repeat(s.length() - 2) + s.charAt(s.length() - 1);
	}
}
