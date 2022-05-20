package Evaluasi;

import java.util.Scanner;

public class Soal2Eval {
	Scanner input = new Scanner(System.in);
//	private int [][] arr;

	public int uangAndi() {
		System.out.println("Masukan Jumlah Uang yang Andi miliki : ");
		int uangA = input.nextInt();
		return uangA;
	}

	public int[][] listBarang() {
		int[][] barang = { { 34, 26, 44 }, { 21, 39, 33 } };
		for (int i = 0; i < 2; i++) {
			if (i == 0) {
				System.out.print("Harga Kacamata : ");
				for (int j = 0; j < 3; j++) {
					System.out.print(barang[i][j] + " ");
				}
				System.out.println();
			} else if (i == 1) {
				System.out.print("Harga Baju : ");
				for (int j = 0; j < 3; j++) {
					System.out.print(barang[i][j] + " ");
				}
				System.out.println();
			}
		}
		System.out.println();
		return barang;
	}

	public void checkOut() {
		int uang = uangAndi();
		int[][] barang = listBarang();
		int[] mungkin = new int[10];
		int m = 0;
		int co;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				co = barang[0][i] + barang[1][j];
				if (co <= uang) {
					mungkin[m] = co;
					m++;
					System.out.println(co + " Detail > "+" Kacamata : "+ barang[0][i]+" Baju : "+barang[1][j]);
				} else {
					mungkin[m] = 0;
					m++;
					System.out.println(co + "(Dana Tidak Mencukupi)");
				}
				System.out.println();
			}
		}
		int beli = 0;
		for (int value : mungkin) {
			if (value > beli) {
				beli = value;
			}
		}
		System.out.println("Pengeuaran Maksimal adalah : "+beli );
	}

	public static void main(String[] args) {
		Soal2Eval run = new Soal2Eval();
		run.checkOut();
	}
}
