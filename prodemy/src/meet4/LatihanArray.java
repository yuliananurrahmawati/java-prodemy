package meet4;

import java.util.Scanner;

public class LatihanArray {
	Scanner input = new Scanner(System.in);

	public void cetakArray() {
		int panjangAngka = getPanjangAngka();
		System.out.println("Masukkan nilai secara acak");
		int[] arr = ambilArray(panjangAngka);
		urutAsc(arr);
		urutDesc(arr);
		input.close();
	}

	public int[] ambilArray(int panjangAngka) {
		int arr[] = new int[panjangAngka];
		for (int i = 0; i < panjangAngka; i++) {
			System.out.print("Angka ke " + (i + 1) + ": ");
			int angkaAcak = getAngka();
			arr[i] = angkaAcak;
		}
		return arr;
	}

	public void urutAsc(int arr[]) {
		int k;
		System.out.print("Urut angka secara Ascending : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					k = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = k;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void urutDesc(int arr[]) {
		int l;
		System.out.print("\nUrut angka secara Descending : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					l = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = l;
				}
			}
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
	}

	public int getPanjangAngka() {
		System.out.print("Masukkan panjang angka : ");
		int panjangAngka = input.nextInt();
		return panjangAngka;
	}

	public int getAngka() {
		int angkaAcak = input.nextInt();
		return angkaAcak;
	}

	public static void main(String[] args) {
		LatihanArray aplikasi = new LatihanArray();
		aplikasi.cetakArray();
	}
}
