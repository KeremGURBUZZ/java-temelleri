package Donusumler;

public class Donusumler02 {

	public static void main(String[] args) {
		
		String sayi1 = 	"123456789";
		long buyuksayi = Long.parseLong(sayi1);
		System.out.println(buyuksayi + 10);
		
		buyuksayi = Long.valueOf(sayi1);
		System.out.println(buyuksayi + 10);

		String ondalikli = "57.4";
		float fOndalik = Float.parseFloat(ondalikli);
		System.out.println(fOndalik + 10);
		
		double dOndalik = Double.valueOf(ondalikli);
		System.out.println(dOndalik + 10);

		double ondalik = 27.5;
		int tam = (int) ondalik;
		System.out.println(tam);
		

	}

}
