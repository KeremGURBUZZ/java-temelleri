package Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		
		 int[] sayilar = {20,30,10,5,70,90,12,3,7,9};
		 
		 int enBuyuk = sayilar[0];
		 
		 for (int i = 1; i < sayilar.length; i++){
			 
			 if(sayilar[i] > enBuyuk) {
				 
				 enBuyuk = sayilar[i];
			 }
				 
		} 
		 
		 System.out.println("Dizideki en buyuk sayi :" + enBuyuk);
			 
		 }

	}
