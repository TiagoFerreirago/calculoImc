package cadastroimc.menu;

public class Menu {
	
	
	
	public void condicional(double imc) {
	
		if (imc <= 18.5)  {
	    	System.out.println("Seu Resultado: ");
	    	System.out.println("Abaixo do peso");
	    	
	    }
	    else if (imc <= 24.9)  {
	    	System.out.println("Seu Resultado: ");
	    	System.out.println("Peso normal");
	    }
	    else if (imc <= 29.9)  {
	    	System.out.println("Seu Resultado: ");
	    	System.out.println("Acima do peso(sobrepeso)");
	    }
		else if (imc <= 34.9)  {
			System.out.println("Seu Resultado: ");
			System.out.println("Obesidade I");
		}
		else if (imc <= 39.9)  {
			System.out.println("Seu Resultado: ");
			System.out.println("Obesidade II");
		}
		else {
			System.out.println("Seu Resultado: ");
			System.out.println("Obesidade III");
	}
}

	
}
