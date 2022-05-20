//deret : 1 1 2 3 5 8 13 21 34
package meet2.method;
import java.util.Scanner;

public class Soal1Method {
	
	public void printDeret(){
		int n = getN(); //memanggil nilai n
		int a = 0, b = 1, c = 1;
		System.out.print("Hasil deret : ");
		for (int i = 0; i < n; i++) {
			System.out.print(" " + c);
			c = a+b;
			a = b;
			b = c;
		}
	}
	
	public int getN(){ //method function yang mengembalikan nilai int
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan jumlah deret : ");
		int n = input.nextInt();
		input.close();
		return n;
	}

	public static void main(String[] args) {
		Soal1Method soal1 = new Soal1Method();
		soal1.printDeret();
	}
}