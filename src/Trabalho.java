import javax.swing.JOptionPane;

public class Trabalho {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int numero, opcao, numeroAtual, temp, contador = 1, divisor, numeroPrimo = 0, maior = 0, posMaior = 0;
		boolean isPrimo = false;
		String numerosOrdenados = "", numerosDecrescente = "", entra = "";
		int vetor[] = new int[19];
		
		for (int x = 0; x < vetor.length; x++) {
			entra = JOptionPane.showInputDialog("Informe um Numero ");
			numero = Integer.parseInt(entra);
			vetor[x] = numero;
			
			// Verifica se o numero primo e menor que 2
			if (numero < 2) {
				numeroPrimo++;
			}

			// Verifica se o numero digitado e primo ou não
			for (int i = 2; i <= numero; i++) {
				if (((numero % i) == 0) && (i != numero)) {
					isPrimo = true;
					divisor = i;
					break;
				}
				if (isPrimo) {
					numeroPrimo++;
					isPrimo = false;
				} 
			}

	
		}
	     
		do {
		
			int menorNumero = 0, fat = 1;
			numero = Integer.parseInt(entra);
			numeroAtual = numero;
			
			// Verifica se o numero e menor q o outro 
			if (menorNumero == 0 || numeroAtual < menorNumero) {
				menorNumero = numeroAtual;
			}
		
			entra = JOptionPane.showInputDialog(
					"\n\t\tMENU"
					+ "\n\n\t1.MOSTRAR"
					+ "\n\t2. INVERTER"
					+ "\n\t3. ORDENAR CRESCENTE"
					+ "\n\t4. ORDENAR DECRESCENTE"
					+ "\n\t5. FATORIAL DO MENOR"
					+ "\n\t6. POSIÇÃO DO MAIOR"
					+ "\n\t7. QTIDADE PRIMOS"
					+ "\n\n\t9. VAZAR");
			
			opcao = Integer.parseInt(entra);
		switch (opcao) {
		case 1:
			//Imprime o array
			System.out.print("Este é o array original e completo: ");
			for(int i = 0; i < vetor.length; i++) {
				if(i < 21) {
					System.out.print(vetor[i] + "-");
					} else if (i == 1) {
						System.out.println(vetor[i]);
					}
				}
			break;
		case 2:
			//Reorganiza o array invertendo as posições
			for(int i = 0; i <= 1; i++) {
				int aux = vetor[i];
				vetor[i] = vetor[vetor.length - 1 - i];
				vetor[vetor.length - 1 - i] = aux;
			}
			System.out.print("Este é o array com posições invertidas e completo: ");
			for(int i = 0; i < vetor.length; i++) {
				if(i < 21) {
					System.out.print(vetor[i] + "-");
					}else if(i == 1) {
						System.out.println(vetor[i]);
					}
				}
			break;
		case 3:
			// Ordenar Crescente
	        do{
	            for (int i = 0; i < vetor.length -1; i++){
	                if (vetor[i] > vetor [i+1]){
	                    temp = vetor[i];
	                    vetor[i] = vetor[i+1];
	                    vetor[i+1] = temp;
	                }
	            }
	            contador++;
	        } while (contador < vetor.length);
	        
	        // exibe os números na tela
	        for (int n : vetor) {
	            numerosOrdenados += n+"-";
	        }
	        System.out.println(numerosOrdenados);
	        contador = 1;
			break;
		case 4:
			// Ordenar Decrescente
			do {
			for (int i = 1; i < vetor.length; i++) {
			    for (int j = 0; j < i; j++) {
			        if (vetor[i] > vetor[j]) {
			            temp = vetor[i];
			            vetor[i] = vetor[j];
			            vetor[j] = temp;
			        }
			    }
			}
	        contador++;
			} while (contador < vetor.length);
			
			// exibe os números na tela
	        for (int n : vetor) {
	        	numerosDecrescente += n+"-";
	        }
	        System.out.println(numerosDecrescente);
	        contador = 1;
			break;
		case 5:
			// Ve o fatorial do menor numero
			for (int z = 1; z <= menorNumero; z++) {
				fat *= z;
				System.out.println("O fatorial de " + menorNumero + " é: " + fat);
			}
			break;
		case 6:
			// Posição do maior numero no array
			for (int i = 0; i < vetor.length; i++) {
				if (i == 0) {
					maior = vetor[i];
					posMaior = i;
				} else if (vetor[i] > maior) {
					maior = vetor[i];
					posMaior = i;
				}
			}
			System.out.println("A posição do maior numero é = "+posMaior);
			break;
		case 7:
			System.out.println("Este é o total de números primos no array: "+numeroPrimo);
			break;
		default:
			System.out.println("Digite um numero");
			break;
		}
		} while (opcao != 9);
		System.out.println("BOA NOITE - OBRIGADO POR USAR O SISMIM - SISTEMA FEITO POR MIM");
	}

}
