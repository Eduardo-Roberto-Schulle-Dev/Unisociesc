package Calculator_forGraduation;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// Entrada
		Scanner teclado = new Scanner(System.in);
		System.out.println(
				"Digite a operação (1-Adicao, 2-subtracao, 3-multiplicacao, 4-divisao, 5-Exponeniacao, 6-fatorial):");
		int tipo = teclado.nextInt();
		
		if (tipo == 1 || tipo == 2 || tipo == 3 || tipo == 4 || tipo == 5 || tipo == 6) {
			System.out.println("Digite o valor 1");
		} else {
			System.out.println("Operacao invalida!");
		}

		int valor1 = teclado.nextInt();
		int valor2 = 0;
		if (tipo != 6) {
			System.out.println("Digite o valor 2");
			valor2 = teclado.nextInt();

		}
		teclado.close();

		// Nivel 1
		switch (tipo) {
		case 1:
			System.out.println("Adicao " + (valor1 + valor2));
		case 2:
			System.out.println("subtracao " + (valor1 - valor2));
		case 3:
			System.out.println("multiplicaca o" + (valor1 * valor2));
		case 4:
			System.out.println("divisa o" + (valor1 / valor2));
		default:
			System.out.println("Operacao invalida!");

		}
		
		//// Nivel-2
		Operacao operacaoNivel2;
		switch (tipo) {

		case 1:
			operacaoNivel2 = new Adicao();
			operacaoNivel2.setNumero1(valor1);
			operacaoNivel2.setNumero1(valor2);
			System.out.println("Adicao=" + operacaoNivel2.calcula());
			break;

		case 2:
			operacaoNivel2 = new Subtracao();
			break;

		default:
			operacaoNivel2 = null;
			System.out.println("Nao foi possivel idetificar a operacao desejada");
		}

		//Nivel 3
		Operacao operacaoNivel3;
		switch (tipo) {
		case 1:
			operacaoNivel3 = new Adicao();
			System.out.println("Adicao=" + operacaoNivel3.calcula(valor1, valor2));
			break;
		case 2:
			operacaoNivel3 = new Subtracao();
			System.out.println("Subtracao" + operacaoNivel3.calcula(valor1, valor2));
			break;

		default:
			operacaoNivel3 = null;
			System.out.println("Nao foi possivel identificar a operacao desejada");

		}
		boolean queroTestarNivel4 = false;
		if (queroTestarNivel4 == true)
			;
		Operacao operacaoNivel4;
		
		switch (tipo) {
		case 1:
			operacaoNivel4 = new Adicao();
			break;
		case 2:
			operacaoNivel4 = new Subtracao();
			break;
		default:
			operacaoNivel4 = null;
			System.out.println("Não foi possivel indentificar a operacao desejada");

		}

		// Saida

		//System.out.pintln(operacaoNivel4.calcula(valor1, valor2));

	}

}
