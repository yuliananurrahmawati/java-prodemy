package meet7.UlangLatihan2;

public class KumpulanDeret {
	public static String[] getArrayHuruf(int n) {
		String[] arr = new String[n];
		char c = 'a';
		for (int i = 0; i < n; i++) {
			arr[i] = String.valueOf(c++);
		}
		return arr;
	}

	public static String[] getArrayFibo(int n) {
		String[] arr = new String[n];
		arr[0] = "1";
		arr[1] = "1";
		for (int i = 2; i < n; i++) {
			arr[i] = String.valueOf(Integer.parseInt(arr[i - 1]) + Integer.parseInt(arr[i - 2]));
		}
		return arr;
	}
}
