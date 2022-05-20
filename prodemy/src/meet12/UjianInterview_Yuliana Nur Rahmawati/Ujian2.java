package meet12;

import java.util.Scanner;

public class Ujian2 {

	private int n;
	private int[][] arr;
	private String dataK;
	private String dataB;
	Scanner in1 = new Scanner(System.in);
	Scanner in2 = new Scanner(System.in);
	Scanner in3 = new Scanner(System.in);
	Scanner in4 = new Scanner(System.in);

	public void getN() {
		System.out.print("Masukkan jumlah uang yang Andi miliki : ");
		this.n = in1.nextInt();
	}

	public void getHargaK() {
		System.out.print("Harga Kacamata : ");
		this.dataK = in2.nextLine();
	}

	public void getHargaB() {
		System.out.print("Harga Baju : ");
		this.dataB = in3.nextLine();
	}

	public void splitBarang(String dataK, String dataB) {
		String[] splitK = dataK.split(", ");
		String[] splitB = dataB.split(", ");
		this.arr = new int[2][3];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 0) {
					arr[i][j] = Integer.parseInt(splitK[j]);
				} else {
					arr[i][j] = Integer.parseInt(splitB[j]);
				}
			}
		}
	}

	public void hargaBarang(int[][] arr) {
		int sum;
		int nilai = 0;
		int K = 0;
		int B = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum = arr[0][i] + arr[1][j];
				if (sum <= n && sum > nilai) {
					nilai = sum;
					K = arr[0][i];
					B = arr[1][j];
				}
			}
		}
		if (nilai <= n && nilai > 0) {
			System.out.println("Hasil = " + nilai);
			System.out.println("Barang yang dibeli adalah : ");
			System.out.println("Kacamata = " + K);
			System.out.println("Baju = " + B);
		} else {
			System.out.println("Uang anda tidak cukup");
		}
	}

	public void cetak() {
		Boolean tes = true;
		do {
			getN();
			getHargaK();
			getHargaB();
			splitBarang(dataK, dataB);
			hargaBarang(arr);
			System.out.print("\n\nApakah anda ingin mengulang (Y/N)?");
			String ulang = in4.next().toLowerCase();
			if (ulang.equalsIgnoreCase("Y")) {
				tes = true;
			} else {
				tes = false;
			}
		} while (tes);
		System.out.println("terimakasih");
	}

	public static void main(String[] args) {
		System.out.println("===APLIKASI PEMBELIAN KACAMATA DAN BAJU===");
		Ujian2 run = new Ujian2();
		run.cetak();
	}
}
