//deret 1 1 1 3 5 9 17 31 57

package meet2;
import java.util.Scanner;

public class Soal2 {
	public static void main(String[] args) {
		int a = 1, b = 1, c = 1, jumlah = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan jumlah deret : ");
		int n = input.nextInt();
		input.close();
		
		System.out.print("Hasil deret : ");
		System.out.print(a + " " + b + " " + c);

		for(int i = 3; i < n; i++) {
			jumlah = a + b + c;
			System.out.print(" " + jumlah);
			a = b;
			b = c;
			c = jumlah;
		}
	}
}
