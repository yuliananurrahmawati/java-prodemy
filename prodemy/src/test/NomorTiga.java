package test;

public class NomorTiga {
	public int solution(int a, int b, int k) {
		int count = 0;
		System.out.print("Numbers : ");
		for (int i = a; i <= b; i++) {
			if(i % k == 0) {
				count++;
				System.out.print(i + " ");
			}
		}
		System.out.println("\nTotal numbers : " + count);
		return count;
	}
	
	public void cetak() {
		int a = 6, b = 11, k = 2;
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		System.out.println("K = " + k);
		solution(a,b,k);
	}
	
	public static void main(String[] args) {
		NomorTiga run = new NomorTiga();
		run.cetak();
	}
}
