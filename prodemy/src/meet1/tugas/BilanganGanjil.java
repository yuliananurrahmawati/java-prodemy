//Buat aplikasi yang memunculkan nilai ganjil sepanjang n
// n = 5 --> 1,3,5,7,9

package meet1.tugas;

import java.util.Scanner;

public class BilanganGanjil {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan nilai n : ");
		int n = input.nextInt();
		
		input.close();
		
		for(int i = 0; i < n; i++) {
			System.out.printf("%3d", i * 2 + 1);
		}
	}
}
