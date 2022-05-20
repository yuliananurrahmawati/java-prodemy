//deret 1 1 1 3 5 9 17 31 57
package meet2.method;

import java.util.Scanner;

public class Soal2Method {

	public void cetakTribonaci() {
		int n = getN();
		int a = 1, b = 1, c = 1, jumlah = 0;
		System.out.print("Hasil deret : ");

		for (int i = 0; i < n; i++) {
			if (i <= 3) {
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

	public int getN() {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan jumlah deret : ");
		int n = input.nextInt();
		input.close();
		return n;
	}

	public static void main(String[] args) {
		Soal2Method soal2 = new Soal2Method();
		soal2.cetakTribonaci();
	}
}
