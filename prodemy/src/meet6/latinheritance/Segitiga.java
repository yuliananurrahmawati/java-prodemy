package meet6.latinheritance;
//Segitiga = subclass atau child

public class Segitiga extends BangunDatar {
	public void getKeliling() {
		System.out.println("Ini adalah keliling segitiga : ");
	}
	
	public void getLuas() {
		System.out.println("Ini adalah luas segitiga : ");
	}
	
	public static void main(String[] args) {
		Segitiga s = new Segitiga();
		s.luas = 7;
		s.getLuas();
		s.getKeliling();
	}
}
