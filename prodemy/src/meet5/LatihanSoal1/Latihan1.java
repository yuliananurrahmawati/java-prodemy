package meet5.LatihanSoal1;
import java.util.Scanner;

public class Latihan1 {
	public Scanner in = new Scanner(System.in);

	public void cetakHasil() {
		Boolean cek = true;
		do {
			String data = getData();
			System.out.println("\nPilih pola output yang diinginkan");
			System.out.println("1. Vokal menjadi angka urut");
			System.out.println("2. Vokal menjadi tribonacci urut");
			System.out.println("3. Merubah huruf tengah suatu kata menjadi bintang");
			System.out.println("4. Menghitung panjang kalimat");
			System.out.println("5. Menghitung jumlah kata");
			int pola = getPola();
			pilihPola(data, pola);

			System.out.print("\n\nApakah anda ingin mengulang (Y/N)?");
//			Scanner in = new Scanner(System.in);
			String ulang = in.next().toUpperCase();
			if (ulang.equalsIgnoreCase("y")) {
				cek = true;
			} else {
				cek = false;
			}
		} while (cek);
		
		System.out.println("TERIMAKASIH!");

	}

	public String getData() {
//		Scanner in = new Scanner(System.in);
		System.out.print("Masukkan kalimat : ");
		String data = in.nextLine().toLowerCase();
		return data;
	}

	public int getPola() {
//		Scanner in = new Scanner(System.in);
		System.out.print("\nPola yang diinginkan : ");
		int pola = in.nextInt();
		return pola;
	}

	public void pilihPola(String data, int pola) {
		Pola1 pola1 = new Pola1();
		Pola2 pola2 = new Pola2();
		Pola3 pola3 = new Pola3();
		Pola4 pola4 = new Pola4();
		Pola5 pola5 = new Pola5();
		
		System.out.print("\nHASIL POLA " + pola + " : ");

		char[] kataChar = data.toCharArray();
		String[] kataSplit = data.split(" ");

		switch (pola) {
		case 1: {
			pola1.soal1(kataChar);
			break;
		}
		case 2: {
			pola2.soal2(kataChar);
			break;
		}
		case 3: {
			pola3.soal3(kataSplit);
			break;
		}
		case 4: {
			pola4.soal4(kataSplit);
			break;
		}
		case 5: {
			pola5.soal5(kataSplit);
			break;
		}
		default:
			System.out.println("Pilih hanya angka 1, 2, 3, 4, 5!");
		}
	}

	public static void main(String[] args) {
		System.out.println("=====LATIHAN 1 MANIPULASI KALIMAT=====\n");
		Latihan1 run = new Latihan1();
		run.cetakHasil();
	}
}
