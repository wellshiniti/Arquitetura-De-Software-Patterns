package exercicio7_2;

import java.util.Arrays;

public class Teste {
	
	private static final int n = 7;

	
	private static Double[] Vetor() {
		Double[] d = new Double[n];
		for (int i = 0; i < d.length; i++)
			d[i] = Math.random() * n;
		return d;
	}

	
	public static void main(String[] args) throws Exception {
		
		Double[] v = Vetor();
		
		Arrays.sort(v, new ComparatorDouble());
		
		System.out.println(Arrays.toString(v));
	}
}