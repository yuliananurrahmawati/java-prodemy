//buatlah suatu kelas dimana kelas tsb menetak bil ganjil, genap, dan fibonachi sepanjang n
//1. user diminta memasukan nilai n
//2. user diminta memilih pola yang diinginkan
//3. menampilkan hasil
//4. user diminta untuk memilih apakah ingin menghentikan program atau cetak lagi? Y/N
//5. kembali lagi ke memilih pola yang diinginkan

package meet3;

import java.util.Scanner;
import meet3.method.MethodDua;
import meet3.method.MethodTiga;
import meet3.method.MethodEmpat;

public class latihan {
	public Scanner input = new Scanner(System.in);
	
	public void pilihCase() {
		Boolean cek = true;
		do {
			int jumlahDeret = getJumlahDeret();
			int pola = getPola();
			
			pilihPola(jumlahDeret, pola);

			System.out.print("\n\nApakah anda ingin mengulang (Y/N)? ");
			String ulang = input.next().toUpperCase();
			if(ulang.equalsIgnoreCase("y")) {
				cek = true;
			} else {
				cek = false;
			}
		} while (cek);
		input.close();
		System.out.println("\nTerimakasih!");
	}
	
	public int getJumlahDeret() {
		System.out.print("\nMasukkan panjang deret : ");
		int jumlahDeret = input.nextInt();
		return jumlahDeret;
	}
	
	public int getPola(){
		System.out.println("\nPilih pola yang ingin anda cetak");
		System.out.println("1. Ganjil \n2. Genap \n3. Fibonacci \n4. Tribonacci \n5. Soal 3 \n6. Soal 4");
		System.out.print("Pola yang ingin dicetak : ");
		int pola = input.nextInt();
		return pola;
	}

	public void pilihPola(int jumlahDeret, int pola) {
		CetakDeret cetak = new CetakDeret(); 
		MethodDua cetak2 = new MethodDua();
		MethodTiga cetak3 = new MethodTiga();
		MethodEmpat cetak4 = new MethodEmpat();
		
		switch (pola) {
		case 1:
			cetak.cetakGanjil(jumlahDeret);
			break;
		case 2:
			cetak.cetakGenap(jumlahDeret);
			break;
		case 3:
			cetak.cetakFibonaci(jumlahDeret);
			break;
		case 4:
			cetak2.cetakTribonaci(jumlahDeret);
			break;
		case 5:
			cetak3.cetakSoalTiga(jumlahDeret);
			break;
		case 6:
			cetak4.cetakSoalEmpat(jumlahDeret);
			break;
		default:
			System.out.print("\nPilih hanya angka 1, 2 atau 3!");
		}
	}

	public static void main(String[] args) {
		latihan aplikasi = new latihan();
		aplikasi.pilihCase();
	}
}
