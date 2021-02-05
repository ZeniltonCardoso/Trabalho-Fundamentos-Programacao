import javax.swing.JOptionPane;

public class Trabalho3 {

	public static void main(String[] args) {
		int opcao, menor, array[], fatorial, somatorioimpar, primos, numero, aux, auxnum;
		String entrada;
		array = new int[20];
		menor = 999;
		primos = 0;
		somatorioimpar = 0;
		boolean Sitpop = false;

		do {

			entrada = JOptionPane.showInputDialog("\n\t\tMENU\n\n\t1. POPULAR\n\t2. "
					+ "MOSTRAR\n\t3. INVERTER\n\t4. ORDENAR CRESCENTE\n\t5. "
					+ "CONTAR PRIMOS\n\t6. SOMATORIO IMPARES\n\t7. DETONAR\n\t8. FATORIAL DO MENOR\n\t9. VAZAR");
			opcao = Integer.parseInt(entrada);

			switch (opcao) {

			case 1:// POPULA O PROGRAMA
				Sitpop = carregar(array);
				break;
			case 2:// MOSTRA A SITUAÇÃO ATUAL DO PROGRAMA
				if (Sitpop) {
					mostrar(array);
				} else
					System.out.println("A coleção não foi populada ainda");
				break;
			case 3:// INVERTE TODOS OS NUMEROS
				if (Sitpop) {
					inverter(array);
				} else
					System.out.println("A coleção não foi populada ainda");

				break;
			case 4:// MOSTRA A ORDEM CRESCENTE DO PROGRAMA
				if (Sitpop) {
					ordenarBolha(array);
				} else
					System.out.println("A coleção não foi populada ainda");

				break;
			case 5:// MOSTRA A QTDE DE PRIMOS
				if (Sitpop) {
					primos = contarPrimos(array);
					System.out.println("A quantidade de primos é " + primos);
				} else
					System.out.println("A coleção não foi populada ainda");

				break;

			case 6:// SOMATORIO DOS NUMEROS IMPARES
				if (Sitpop) {
					somatorioimpar = somarImpares(array);
					System.out.println("O somatorio de impares do array é" + somatorioimpar);
				} else
					System.out.println("A coleção não foi populada ainda");
				break;
			case 7:// DETONA O PROGRAMA
				if (Sitpop == true) {
					Sitpop = detonar(array);
					System.out.println("O array foi detonado");
				} else
					System.out.println("A coleção não foi populada ainda");
				break;
			case 8:// CALCULA E E MOSTRA O FATORIAL DO MENOR NUMERO
				if (Sitpop == true) {
					menor = menor(array);
					fatorial = fatorial(menor);
					System.out.println("O fatorial do menor numero é: " + fatorial);
				} else
					System.out.println("A coleção não foi populada ainda");
			}
		} while (opcao != 9);
		System.out.println("Boa noite, Obrigado por usar o sistema!!!");
	}

	private static int fatorial(int menor) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int menor(int[] array) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static boolean detonar(int[] array) {
		// TODO Auto-generated method stub
		return false;
	}

	private static int somarImpares(int[] array) {
		// TODO Auto-generated method stub
		return 0;
	}

	static boolean carregar(int array[]) {
		for (int numero = 0; numero < 20; numero++) {
			String entrada = JOptionPane.showInputDialog("Digite os 20 numeros da coleção ");
			array[numero] = Integer.parseInt(entrada);
		}
		return true;
	}

	static void mostrar(int array[]) {
		System.out.println("A situação atual do prog é ");
		for (int numero = 0; numero < 20; numero++) {
			System.out.println("" + array[numero]);
		}
	}

	static boolean inverter(int array[]) {
		for (int numero = 0; numero < 10; numero++) {
			int aux = array[numero];
			array[numero] = array[19 - numero];
			array[19 - numero] = aux;
		}
		return true;
	}

	static boolean ordenarBolha(int array[]) {
		for (int numero = 0; numero < 20; numero++) {
			for (int auxnum = 0; auxnum < 19; auxnum++) {
				if (array[auxnum] > array[auxnum + 1]) {
					int aux = array[auxnum];
					array[auxnum] = array[auxnum + 1];
					array[auxnum + 1] = aux;
				}
			}
		}
		return true;
	}

	static int contarPrimos(int array[]) {
		int primos = 0;
		for (int numero = 0; numero < 20; numero++) {
			if (array[numero] == 2) {
				primos++;
			} else {
				int aux = array[numero] - 1;
				boolean Eprimo = true;
				while (aux >= 2) {
					if ((array[numero] % aux) == 0) {
						Eprimo = false;
					}
					aux--;
				}
				if (Eprimo == true) {
					primos++;
				}
			}
		}

		return primos;
	}
}