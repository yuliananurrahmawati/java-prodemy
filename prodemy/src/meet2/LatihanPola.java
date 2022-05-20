package meet2;

import java.util.Scanner;

public class LatihanPola {

	public void printPola(){
		int panjang = getN(); //memanggil nilai n
		for(int i = 0; i < panjang; i++) {
			if(i % 2 == 0) {
				System.out.printf("%3d", i + 2);
			} else {
				System.out.printf("%3d", (i + 1) * 3 / 2);
			}
		}
	}
	
	public int getN(){ //method function yang mengembalikan nilai int
		Scanner s = new Scanner(System.in);
		System.out.print("Masukkan Nilai N : ");
		int n = s.nextInt();
		s.close();
		return n;
	}
	
	public static void main(String[] args) {
		LatihanPola latihan = new LatihanPola();
		latihan.printPola(); //memanggil method printPola
	}
}
