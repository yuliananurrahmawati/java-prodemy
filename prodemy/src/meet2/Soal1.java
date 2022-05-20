//deret : 1 1 2 3 5 8 13 21 34

package meet2;
import java.util.Scanner;

public class Soal1 {
	public static void main(String[] args) {
		int n, a = 0, b = 1, c = 1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan jumlah deret : ");
		n = input.nextInt();
		input.close();
		
		System.out.print("Hasil deret : ");
		
		for (int i = 0; i < n; i++) {
			System.out.print(" " + c);
			c = a+b;
			a = b;
			b = c;
		}
	}
}
