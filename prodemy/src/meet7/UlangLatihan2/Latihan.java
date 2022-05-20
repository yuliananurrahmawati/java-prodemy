package meet7.UlangLatihan2;

import java.util.Scanner;

public class Latihan {
	private String[][] arr;
	Scanner in = new Scanner(System.in);

	public int getN() {
		System.out.print("\nMasukkan nilai n : ");
		int n = in.nextInt();
		return n;
	}

	public Boolean cetakUlang() {
		Boolean cek;
		System.out.print("\n\nApakah anda ingin mengulang (Y/N)?");
		String ulang = in.next().toUpperCase();
		if (ulang.equalsIgnoreCase("y")) {
			cek = true;
		} else {
			cek = false;
		}
		return cek;
	}

	public void isiArray(int n) {
		this.arr = new String[n][n];
		String[] huruf = KumpulanDeret.getArrayHuruf(n);
		String[] angka = KumpulanDeret.getArrayFibo(n);
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i % 2 == 0) {
					if (j <= i) {
						this.arr[i][j] = huruf[j];
					} else {
						this.arr[i][j] = " ";
					}
				} else {
					if (j >= n - (i + 1)) {
						this.arr[i][j] = angka[count++];
					} else {
						this.arr[i][j] = " ";
					}
				}
			}
			count = 0;
		}
	}

	public void cetakArray() {
		Boolean cek = true;
		do {
			int n = getN();
			isiArray(n);
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(this.arr[i][j]);
				}
				System.out.println();
			}
			cetakUlang();
		} while (cek);
	}

	public static void main(String[] args) {
		System.out.println("=====APLIKASI MENCETAK DERET HURUF DAN FIBO=====");
		Latihan run = new Latihan();
		run.cetakArray();
	}
}
