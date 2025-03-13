package Donusumler;

public class Donusumler01 {

	public static void main(String[] args) {
		
		String sayi = "45";
		System.out.println(sayi + 10);
		
		int tamSayi = Integer.parseInt(sayi);
		System.out.println(tamSayi + 10);
		
		tamSayi = Integer.valueOf(sayi);
		int toplam = tamSayi + 20;
		System.out.println(toplam);
		
		

	}

}
