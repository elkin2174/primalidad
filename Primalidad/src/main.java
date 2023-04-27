import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		
		new esPrimo();
		
		int numeroPrueba =  Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero entero"));
		
		if(esPrimo.comprobarPrimo(numeroPrueba)) {
			System.out.println(numeroPrueba + " Es primo");
		}else {
			System.out.println(numeroPrueba + " No es primo");
		}
		

		if(esPrimo.comparaPrimo2(numeroPrueba)) {
			System.out.println(numeroPrueba + " Es primo");
		}else {
			System.out.println(numeroPrueba + " No es primo");
		}
		

	}

}
