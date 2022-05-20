package meet2.method;

import java.util.Scanner;

public class Soal3Method {
	
	public void cetakSoal3() {
		int n = getN(); /////
		int[] deret = {1,1,2,3,5,3,2};
		System.out.print("Hasil deret : ");
		
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
		Soal3Method soal3 = new Soal3Method();
		soal3.cetakSoal3();
	}
}
