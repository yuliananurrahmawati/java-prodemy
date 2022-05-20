package meet5.LatihanSoal2;
import java.util.Scanner;

public class Latihan2 {
	public Scanner in = new Scanner(System.in);
	public void cetakDeret() {
		Abjad arrB = new Abjad();
		Fibonaci arrF = new Fibonaci();
		Array arrA = new Array();
		Boolean cek = true;
		do {
			int N = getN();
			char[] abjad = arrB.getAbjad(N);
			String[] fibo = arrF.getFibo(N);
			arrA.setArray(N, abjad, fibo);
			cek = cetakUlang();
		} while (cek);
		in.close();
	}

	public Boolean cetakUlang() {
		Boolean cek;
		System.out.print("\n\nApakah anda ingin mengulang (Y/N)?");
		String ulang = in.next().toUpperCase();
		if (ulang.equalsIgnoreCase("y")) {
			cek = true;
		} else {
			cek = false;
		}
		return cek;
	}

	public int getN() {
		System.out.print("\nMasukkan nilai N : ");
		int N = in.nextInt();
		return N;
	}

	public static void main(String[] args) {
		System.out.println("====SOAL 2====");
		Latihan2 run = new Latihan2();
		run.cetakDeret();
		System.out.println("TERIMAKASIH!");
	}
}
