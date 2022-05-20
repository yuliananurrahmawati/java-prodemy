// n = 5
// a b c b a
//n = 6
// a b c c b a
package meet4;
import java.util.Arrays;

public class SoalDua {
	public void cetakArray(int panjangDeret) {
		char arr[] = new char[panjangDeret];
		char abjad = 'a';
		if (panjangDeret % 2 == 0) {
			for (int i = 0; i < panjangDeret; i++) {
				if (i < panjangDeret / 2) {
					arr[i] = abjad;
					abjad++;
				} else {
					abjad--;
					arr[i] = abjad;
				}
			}
		} else {
			for (int i = 0; i < panjangDeret; i++) {
				if (i < (panjangDeret - 1) / 2) {
					arr[i] = abjad;
					abjad++;
				} else {
					arr[i] = abjad;
					abjad--;
				}
			}
		}
		System.out.print("2. Deret Soal 2 : ");
		System.out.println(Arrays.toString(arr));
	}
}
