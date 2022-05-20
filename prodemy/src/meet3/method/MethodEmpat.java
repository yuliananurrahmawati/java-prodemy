package meet3.method;

import java.util.Scanner;

public class MethodEmpat {
	public void cetakSoalEmpat(int jumlahDeret) {

		System.out.print("Hasil deret : ");
		int[] deret = {1,1,1,3,5,3};
		System.out.print("Deret bilangan soal 4 sepanjang " + jumlahDeret + " bilangan :");
		for(int i = 0; i < jumlahDeret; i++) {
			System.out.print(deret[i%6] + " ");
		}
	}

	public static int getJumlahDeret() {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan jumlah deret : ");
		int n = input.nextInt();
		input.close();
		return n;
	}

	public static void main(String[] args) {
		int jumlahDeret = getJumlahDeret();
		MethodEmpat soalEmpat = new MethodEmpat();
		soalEmpat.cetakSoalEmpat(jumlahDeret);
	}
}
