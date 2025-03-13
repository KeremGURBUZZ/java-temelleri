package Degiskenler;

public class DegiskenlerOrnek {

	public static void main(String[] args) {
		// ALİ 10 KARPUZU 20 TL DEN ALIP TANESİNİ 6.5 TL DEN SATIYOR NET KARİNİ HESAPLAYAN PROGRAMI YAP
		
		// MEVCUT BİLGİLER
		
		   int maliyet = 20;
		   
		   int birimUrun = 10;
		   
		   double birimSatis = 6.5;
		   
		//YAPILAN İŞLEM 
		   
		  double toplamGelir = birimUrun * birimSatis;
		  
		  double netKar = toplamGelir - maliyet;
		  
		//SONUÇ
		  
		  System.out.println("Ali'nin Net Kari :"+ netKar);
		   
		
		
		
		
		

	}

}
