package polymorphism;

public class polymorphism01 {

	public static void main(String[] args) {
		
		Hayvan hayvan = new Kopek();
		HayvanYonetimi	hayvanYonetimi = new HayvanYonetimi(hayvan);	
		
		hayvanYonetimi.sesVer();

	}

}
