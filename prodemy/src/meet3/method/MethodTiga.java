package meet3.method;

import java.util.Scanner;

public class MethodTiga {
	
	public void cetakSoalTiga(int jumlahDeret) {
		int[] deret = {1,1,2,3,5,3,2};
		System.out.print("Deret bilangan soal 3 sepanjang " + jumlahDeret + " bilangan :");
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
		int jumlahDeret = getJumlahDeret(); /////
		MethodTiga soalTiga = new MethodTiga();
		soalTiga.cetakSoalTiga(jumlahDeret);
	}
}
