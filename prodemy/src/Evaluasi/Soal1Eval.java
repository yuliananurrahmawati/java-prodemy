package Evaluasi;

import java.util.Scanner;

public class Soal1Eval {

	Scanner input = new Scanner(System.in);
	private int[][] arr;

	public int getN() {
		System.out.println(" masukan panjang N : ");
		int getN = input.nextInt();
		return getN;
	}

	public void isi(int p) {
		arr = new int[2][p];
		int isiA = 1;
		for (int i = 0; i < 2; i++) {
			if (i == 0) {
				for (int j = 0; j < p; j++) {
					arr[i][j] = isiA;
					isiA += 4;
				}
			} else if (i == 1) {
				for (int j = 0; j < p; j++) {
					isiA -= 4;
					arr[i][j] = isiA;
				}
			}
		}
	}

	public void cetak() {
		int p = getN();
		isi(p);
		for (int i=0;i<2;i++) {
			for(int j=0;j<p;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Soal1Eval run = new Soal1Eval();
		run.cetak();
	}
}
