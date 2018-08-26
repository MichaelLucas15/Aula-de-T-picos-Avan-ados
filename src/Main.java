public class Main {
	public static void main(String[] args) {
			
		FuncaoInteiros soma = (int n1, int n2) -> {return n1 + n2;};
		
		FuncaoVetor media = (double[] vetor) -> {
			if (vetor.length == 0) {throw new IllegalArgumentException("vetor.length == 0");}	
			double s = 0;
			for (double valor : vetor) {s += valor;}		
			return s / vetor.length;};
			
		FuncaoUnicoInteiro fatorial = (int n) -> {
			if (n < 0) { throw new IllegalArgumentException("numero < 0"); }		
			int resultado = 1;
			for (int i = 1; i <= n; i++) { resultado *= i; }
			return resultado;};
		
		FuncaoBooleanInteiros  isPrimo = (int n) -> {
			int divisiveis = 0;	
			for (int i = 1; i <= n; i++) { if (n % i == 0) { divisiveis++; }}
			return divisiveis == 2; };
		
		FuncaoBooleanTextos isInteiroValido = (String t) -> { return t.matches("-?\\d+"); };
		
		FuncaoVetor imprimirMaiorNumero = (double[] vetor) -> {
			if (vetor.length == 0) { throw new IllegalArgumentException("vetor.length == 0"); }
			double maiorNumero = vetor[0];	
			for (int i = 1; i < vetor.length; i++) { if (vetor[i] > maiorNumero) { maiorNumero = vetor[i]; }}	
		    System.out.println ("Maior número = " + maiorNumero);
			return maiorNumero; };
		
		    	
		System.out.println(soma.calcular(10, 15));
		System.out.println(soma.calcular(187, 18));
		
		double[] array1 = { 1, 10, 6.5, 189.5 };
		System.out.println(media.calcular(array1));
		double[] array2 = { 10, 58.9, 6.5, 18 };
		System.out.println(media.calcular(array2));
		
		System.out.println(fatorial.calcular(5));
		System.out.println(fatorial.calcular(7));
		
		System.out.println(isPrimo.is(13));
		System.out.println(isPrimo.is(14));
		
		System.out.println(isInteiroValido.is("157"));
		System.out.println(isInteiroValido.is("15a7"));
		
		imprimirMaiorNumero.calcular(array1);
		imprimirMaiorNumero.calcular(array2);
	}
}