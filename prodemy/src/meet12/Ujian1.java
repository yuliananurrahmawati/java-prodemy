package meet12;

import java.util.Arrays;
import java.util.Scanner;

public class Ujian1 {
	public Scanner in = new Scanner(System.in);
	private int n;
	private int [][] arr;

	public void getN() {
		System.out.print("Masukkan Nilai N : ");
		this.n = in.nextInt();
	}
	
	public void isiArray(int n) {
		this.arr = new int[2][n];
		int x = 1;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < n; j++) {
				if(i == 0) {
					arr[i][j] = x;
					x = x + 4;
				} else {
					x = x - 4;
					arr[i][j] = x;
				}
			}
		}
	}
	
	public void cetakArray() {
		Boolean tes = true;
		do {
			getN();
			isiArray(n);
			for (int i = 0; i < 2; i++) {
				System.out.println(Arrays.toString(arr[i]));
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
		System.out.println("===APLIKASI ARRAY BILANGAN GANJIL===");
		Ujian1 run = new Ujian1();
		run.cetakArray();
	}
}
