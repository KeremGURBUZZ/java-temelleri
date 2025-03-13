package ErisimBelirtecleri;

public class ErisimBelirtecleri {

	public static void main(String[] args) {
		
		Kullanici kullanici = new Kullanici();
		kullanici.bilgileriYazdir();
		System.out.println(kullanici.isim);
		kullanici.yas = 18;
		System.out.println(kullanici.yas);
		

	}

}
