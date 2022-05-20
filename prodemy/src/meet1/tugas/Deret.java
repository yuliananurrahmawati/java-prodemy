//Buat aplikasi untuk mencetak deret sejumlah n dengan deret 2 3 4 6 6 9 .. ..

package meet1.tugas;

import java.util.Scanner;

public class Deret {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan jumlah deret : ");
		int n = input.nextInt();
		input.close();
		
		System.out.print("Hasil deret : ");
		for(int i = 0; i < n; i++) {
			if(i%2==0) {
				System.out.print(" " + (i+2));
			} else {
				System.out.print(" " + (3 * ((i+1)/2)));
			}
		}
	}
}
