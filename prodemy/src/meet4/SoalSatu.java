//a b c

package meet4;
import java.util.Arrays;

public class SoalSatu {
	public void cetakArray(int panjangDeret) {
		char arr[] = new char[panjangDeret];
		char abjad = 'a';
		for (int i = 0; i < panjangDeret; i++) {
			arr[i] = abjad;
			abjad++;
		}
		System.out.print("1. Deret Soal 1 : ");
		System.out.println(Arrays.toString(arr));
	}
}
