//deret 1 1 1 3 5 9 17 31 57
package meet3.method;

import java.util.Scanner;

public class MethodDua {
	public void cetakTribonaci(int jumlahDeret) {
		int a = 1, b = 1, c = 1, jumlah = 0;
		System.out.print("Deret bilangan tribonaci sepanjang " + jumlahDeret + " bilangan :");

		for (int i = 0; i < jumlahDeret; i++) {
			if (i < 3) {
				System.out.print(" " + a);
			} else {
				jumlah = a + b + c;
				System.out.print(" " + jumlah);
				a = b;
				b = c;
				c = jumlah;
			}
		}
	}

	public static int getJumlahDeret() {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan jumlah deret : ");
		int jumlahDeret = input.nextInt();
		input.close();
		return jumlahDeret;
	}

	public static void main(String[] args) {
		int jumlahDeret = getJumlahDeret();
		MethodDua soal2 = new MethodDua();
		soal2.cetakTribonaci(jumlahDeret);
	}
}
