package composition;

public class Composition01 {

	public static void main(String[] args) {
		
		Ogrenci ogrenci = new Ogrenci("Kerem" , "Gürbüz" , "2145" , "Aslan" , "Emine" , "24.05.2000");
		
		OgrenciIslemleri ogrenciIslemleri = new OgrenciIslemleri(ogrenci);
		ogrenciIslemleri.ekle();
		

	}

}
