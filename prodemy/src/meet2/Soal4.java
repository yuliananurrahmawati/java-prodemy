// deret 1 1 1 3 5 3 1 1 1

package meet2;
import java.util.Scanner;

public class Soal4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan jumlah deret : ");
		int n = input.nextInt();
		input.close();
		
		System.out.print("Hasil deret : ");
		int[] deret = {1,1,1,3,5,3};
		
		for(int i = 0; i < n; i++) {
			System.out.print(deret[i%6] + " ");
		}
	}

}
