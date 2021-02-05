import javax.swing.JOptionPane;

public class Trabalho {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
    		int num, numP, contador, conta, num22, divisor, media, fat, menor, resultado, numeroAtual, menorNumero;
    
    		boolean isPrimo;
    		String entrada;
    		int[] numeros20 = new int[2];
    		contador = 1;
    		numP = 0;
    		conta = 0;
    		num22 = 0;
    		isPrimo = true;
    		divisor = 0;
    		fat = 1;
    		media = 0;
    		resultado = 0;
    		numeroAtual = 0;
    		menorNumero = 0;
    
    		// Le os 20 numeross
    		for (int x = 0; x < 2; x++) {
    
    			// Entrada de um numero que o usuario digitar
    			entrada = JOptionPane.showInputDialog("Informe um numero");
    			num = Integer.parseInt(entrada);
    
    			// Verifica se o numero primo e menor que 2
    			if (num < 2) {
    				numP++;
    				System.out.println("O número " + num + " é Primo.");
    			}
    
    			// Verifica se o numero digitado e primo ou não
    			for (int i = 2; i <= num; i++) {
    				if (((num % i) == 0) && (i != num)) {
    					isPrimo = false;
    					divisor = i;
    					break;
    				}
    			}
    
    			if (isPrimo) {
    				numP++;
    				System.out.println("O número " + num + " é Primo.");
    			} else {
    				System.out.println("O número " + num + " não é Primo.");
    			}
    
    			// Diz quantas vezes o numero 22 foi digitado
    			if (num == 22) {
    				num22++;
    			}
    
    			// Diz se o numero digitado e multiplo de 5 ou não
    			if (num % 5 == 0) {
    				System.out.println("O número é multiplo de 5");
    			} else {
    				System.out.println("O número " + num + " não é multiplo de 5");
    			}
    
    			// Diz se o numero e par ou não
    			if (num % 2 == 0) {
    				System.out.println("O número " + num + " é par.");
    			} else {
    				System.out.println("O número " + num + " é ímpar.");
    			}
    
    			// Array dos 20 numeros
    			numeros20[x] = num;
    
    			// Ve o fatorial do menor numero digitado.
    			numeroAtual = num;
    			fat = 1;
    			if (menorNumero == 0 || numeroAtual < menorNumero) {
    
    				menorNumero = numeroAtual;
    
    			}
    
    			System.out.println("");
    			System.out.println("_____________________________________________________________");
    			System.out.println("");
    
    		}
    
    		// Ve a media dos numeros digitados
    		for (int i = 0; i < numeros20.length; i++)
    			media += numeros20[i];
    
    		float total = (float) media / numeros20.length;
    
    		System.out.println("A média aritmética é: " + total);
    		for (int z = 1; z <= menorNumero; z++) {
    
    			fat *= z;
    			System.out.println("O fatorial de " + menorNumero + " é: " + fat);
    
    		}
    		
    		System.out.println("O número 22 foi digitado " + num22 + " vezes.");
    
    		System.out.println("Foram informados " + numP + " números primos.");
    
    	}

}
