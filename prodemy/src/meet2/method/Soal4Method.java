package meet2.method;

import java.util.Scanner;

public class Soal4Method {
	public void cetakSoal4() {
		int n = getN();
		System.out.print("Hasil deret : ");
		int[] deret = {1,1,1,3,5,3};
		
		for(int i = 0; i < n; i++) {
			System.out.print(deret[i%6] + " ");
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
		Soal4Method soal4 = new Soal4Method();
		soal4.cetakSoal4();
	}
}
