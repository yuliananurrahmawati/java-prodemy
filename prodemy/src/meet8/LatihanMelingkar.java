package meet8;

import java.util.Scanner;

public class LatihanMelingkar {
	private int n;
	private int[][] arr;
	private int c;
	Scanner in = new Scanner(System.in);

	public void getN() {
		System.out.print("Masukkan Nilai N : ");
		this.n = in.nextInt();
	}

	public void isiArray(int c) {
		this.arr = new int[n][n];
		isiPolaAtas();
		isiPolaKanan();
		isiPolaBawah();
		isiPolaKiri();
	}

	public void isiPolaAtas() {
		for (int i = 0; i < this.n; i++) {
			this.arr[0][i] = c++;
		}
	}

	public void isiPolaKanan() {
		for (int i = 0; i < this.n; i++) {
			if (i > 0 && i < this.n - 1) {
				this.arr[i][this.n - 1] = c++;
			}
		}
	}

	public void isiPolaBawah() {
		for (int i = this.n - 1; i >= 0; i--) {
			this.arr[this.n - 1][i] = c++;
		}
	}

	public void isiPolaKiri() {
		for (int i = this.n - 1; i >= 0; i--) {
			if (i > 0 && i < this.n - 1) {
				this.arr[i][0] = c++;
			}
		}
	}

	public void cetakArray() {
		Boolean tes = true;
		do {
			getN();
			c = 1;
			isiArray(c);
			for (int i = 0; i < this.n; i++) {
				for (int j = 0; j < this.n; j++) {
					System.out.printf("%3d", arr[i][j]);
				}
				System.out.println();
			}

			System.out.print("\n\nApakah anda ingin mengulang (Y/N)?");
			String ulang = in.next().toLowerCase();
			if (ulang.equalsIgnoreCase("Y")) {
				tes = true;
			} else {
				tes = false;
			}

		} while (tes);

		System.out.println("terimakasih");
		in.close();
	}

	public static void main(String[] args) {
		LatihanMelingkar lm = new LatihanMelingkar();
		lm.cetakArray();
	}
}
