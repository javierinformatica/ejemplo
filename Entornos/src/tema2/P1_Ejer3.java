package tema2;

import java.util.Scanner;

public class P1_Ejer3 {

	public static void metodo1(int n) {
		int aux, i = 1;

		do {
			aux = n % i;
			if (aux == 0) // Es divisor
				System.out.println(i + " ");
			i++;
		} while (i <= n);
	}

	public static int metodo2(int n, int m) {
		int i, acumulador = 0;

		for (i = 0; i <= m; i++) {
			acumulador = acumulador + (n + i);
		}

		return acumulador;
	}

	public static void metodo3() {
		int i, j;

		for (j = 10; j >= 5; j--) {
			for (i = j; i >= 0; i--) {
				System.out.print(i + " ");
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		Scanner t;
		int n, m;

		t = new Scanner(System.in);
		do { // Comprobación de las entradas de datos
			System.out.println("Valor para N: ");
			n = t.nextInt();
			System.out.println("Valor para M: ");
			m = t.nextInt();
			if (n > m)
				System.out.println("N debe ser menor que M");
		} while (n > m);

		// Llamadas a los métodos
		System.out.println("Divisores de " + n);
		metodo1(n);
		System.out.println("Suma de la serie: " + metodo2(n, m));
		System.out.println("Triangulo descendente ");
		metodo3();
	}

}
