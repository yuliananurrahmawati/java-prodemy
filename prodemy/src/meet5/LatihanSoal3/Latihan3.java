package meet5.LatihanSoal3;

import java.util.Scanner;

public class Latihan3 {
	public Scanner in = new Scanner(System.in);
	public void cetakAkhir() {
		Boolean cek = true;
		do {
			int N = getN();
			Array(N);
			System.out.print("Apakah ingin mengulang (Y/N)? ");
			String ulang = in.next().toUpperCase();
			if (ulang.equalsIgnoreCase("y")) {
				cek = true;
			} else {
				cek = false;
			}
		} while (cek);
	}

	public void Array(int N) {
		int panjang = (N * N) - (N - 1);
		int jeda = N - 1;
		char arr[][] = new char[N][panjang];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < panjang; j++) {
				if ((i == 0) || (i == N - 1)) {
					arr[i][j] = '*';
				} else {
					if (j % jeda == 0) {
						arr[i][j] = '*';
					} else {
						arr[i][j] = ' ';
					}
				}
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	public int getN() {
		System.out.print("\nMasukkan nilai N : ");
		int N = in.nextInt();
		return N;
	}

	public static void main(String[] args) {
		System.out.println("====MENAMPILKAN PERSEGI====");
		Latihan3 run = new Latihan3();
		run.cetakAkhir();
		System.out.print("TERIMAKASIH!");
	}
}
