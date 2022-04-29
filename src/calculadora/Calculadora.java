package calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		char op = '.';

		float n1 = 0, n2 = 0, result = 0;

		int i = 0;

		System.out.println("Digite o valor de N1: ");

		n1 = entrada.nextFloat();

		System.out.println("Qual operação deseja fazer? (+ , - , x , / , ^). ");
		op = entrada.next().charAt(0);

		while (i >= 0) {

			switch (op) {
			case '+':
				System.out.println("Digite o valor de N2:");
				n2 = entrada.nextFloat();

				result = n1 + n2;

				System.out.println(n1 + " + " + n2 + " = " + result);

				i--;

				break;

			case '-':
				System.out.println("Digite o valor de N2:");
				n2 = entrada.nextFloat();

				result = n1 - n2;

				System.out.println(n1 + " - " + n2 + " = " + result);
				i--;
				break;

			case 'x':
				System.out.println("Digite o valor de N2:");
				n2 = entrada.nextFloat();

				result = n1 * n2;

				System.out.println(n1 + " x " + n2 + " = " + result);
				i--;
				break;

			case '/':
				System.out.println("Digite o valor de N2:");
				n2 = entrada.nextFloat();

				if (n2 == 0) {
					System.out.println("Não existe número divisível por 0(zero). Tente novamente.");
					
				} else {

					result = n1 / n2;

					System.out.println(n1 + " / " + n2 + " = " + result);
					i--;
				}
				break;

			case '^':
				System.out.println("Digite o valor de N2:");
				n2 = entrada.nextFloat();

				result = (float) Math.pow(n1, n2);

				System.out.println(n1 + " ^ " + n2 + " = " + result);
				i--;
				break;

			default:

				System.out.println("operação inválida. Digite novamente");
				op = entrada.next().charAt(0);
				break;
			}

		}

		entrada.close();

	}

}
