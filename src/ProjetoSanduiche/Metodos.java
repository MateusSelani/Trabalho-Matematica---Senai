package ProjetoSanduiche;

public class Metodos {
	
	public static void nSandu(int x) {
		/* Metodo nSandu */
		
		switch(x) {
		 case 1: System.out.print("Sanduiches Medios: ");
		 	break;
		 case 2: System.out.print("Sanduiches Grandes: ");
		 	break;
		 case 3: System.out.print("Sanduiches Super: ");
		 	break;
		}
	}
	
	public static double calcSandu(double x, double y) {
		double soma = ((x * y) * 0.001);
			return soma;
	}
	
}

