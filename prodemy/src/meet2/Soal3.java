// deret 1 1 2 3 5 3 2 1 1 2 3 5 
package meet2;

import java.util.Scanner;

public class Soal3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan jumlah deret : ");
		int n = input.nextInt();
		input.close();

		int a = 0, b = 1, c = 1, x = 0;
		System.out.print("Hasil deret : ");

		for (int i = 0; i < n; i++) {
			if (x < 4) {
				System.out.printf(x + " ");
				c = a + b;
				a = b;
				b = c;
				x++;
			} else {
				System.out.printf(x + " ");
				c = a;
				a = b - a;
				b = c;
				x--;
			}
		}
	}
}
