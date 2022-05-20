package meet9;

import java.util.Scanner;

public class LatihanFiboHuruf {
	Scanner in = new Scanner(System.in);
	private int n;
	private String[] arrFibo;
	private String[][] arr;

	public int getN() {
		System.out.print("Masukkan Nilai N : ");
		this.n = in.nextInt();
		return n;
	}

	public String[] getArrayFibo(int n) {
		this.arrFibo = new String[n];
		char a = 'A';
		int x = 0, y = 1, z = 1;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				arrFibo[i] = Integer.toString(x);
				z = x + y;
				x = y;
				y = z;
			} else {
				arrFibo[i] = Character.toString(a++);
			}
		}
		return arrFibo;
	}

	public void isiArray(int n) {
		this.arr = new String[n][n];
		this.arrFibo = getArrayFibo(n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((j >= i) && (j < n - i)) {
					arr[i][j] = arrFibo[i];
				} else if (i + j < n - 1) {
					arr[i][j] = arrFibo[j];
				} else if ((i + j) > (n - 1) && i < j) {
					arr[i][j] = arrFibo[n - 1 - j];
				} else if ((i + j) >= (n - 1) && i >= j) {
					arr[i][j] = arrFibo[n - 1 - i];
				}
			}
		}
	}

	public void cetakArray() {
		Boolean cek = true;
		do {
			int n = getN();
			this.getArrayFibo(n);
			isiArray(n);
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(" " + arr[i][j]);
				}
				System.out.println();
			}

			System.out.print("\n\nApakah anda ingin mengulang (Y/N)?");
			String ulang = in.next().toLowerCase();
			if (ulang.equalsIgnoreCase("Y")) {
				cek = true;
			} else {
				cek = false;
			}
		} while (cek);
		System.out.println("terimakasih");
	}

	public static void main(String[] args) {
		LatihanFiboHuruf run = new LatihanFiboHuruf();
		run.cetakArray();
	}
}
