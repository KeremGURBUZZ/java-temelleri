package sinifKavrami4;

public class sinifKavrami4 {

	public static void main(String[] args) {
		
		VeriTabani veriTabani = new VeriTabani();
		veriTabani.ekle();
		veriTabani.sil();
		veriTabani.guncelle();
		
		System.out.println(" ");
		
		Muhasebe muhasebe = new Muhasebe();
		muhasebe.paraEkle(500);
		muhasebe.paraAl(100);
		muhasebe.toplamParaGoster();
		
		

	}

}
