
public class esPrimo {

	static boolean comprobarPrimo(int numero) {
		
		int contador = 0;
		
		int[] numeros = new int[numero];
		
		for(int i = 0; i < numeros.length; i++) {
			
			numeros[i]=i+1;
			
		}
		
		for(int i : numeros) {
			
				if(i==1 || i==numero) {
					
					continue;		
				}
				if(numero%i == 0) {
					contador++;
					
				}
		}
		
		return contador == 0;
	}
}
