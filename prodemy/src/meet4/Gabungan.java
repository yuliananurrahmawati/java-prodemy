package meet4;
import java.util.Scanner;

public class Gabungan {
	public Scanner input = new Scanner(System.in);

	public void loop() {
		Boolean cek = true;
		do {
			tampilDeret();
			System.out.print("\n\nApakah anda ingin mengulang (Y/N)? ");
			String ulang = input.next().toUpperCase();
			if (ulang.equalsIgnoreCase("y")) {
				cek = true;
			} else {
				cek = false;
			}
		} while (cek);
		System.out.print("Terimakasih!");
		input.close();
	}
	
	public void tampilDeret() {
		int panjangDeret = getPanjangDeret();
		SoalSatu cetak1 = new SoalSatu();
		SoalDua cetak2 = new SoalDua();
		SoalTiga cetak3 = new SoalTiga();
		
		cetak1.cetakArray(panjangDeret);
		cetak2.cetakArray(panjangDeret);
		cetak3.cetakArray(panjangDeret);
	}
	
	public int getPanjangDeret() {
		System.out.print("Masukkan panjang deret : ");
		int panjangDeret = input.nextInt();
		return panjangDeret;
	}

	public static void main(String[] args) {
		System.out.println("====TUGAS DERET ARRAY====");
		Gabungan run = new Gabungan();
		run.loop();
	}
}
