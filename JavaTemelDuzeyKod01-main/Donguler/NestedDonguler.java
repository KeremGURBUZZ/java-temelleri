package Donguler;

public class NestedDonguler {

	public static void main(String[] args) {
		// İÇ İÇE DÖNGÜLER
		
		int satir = 5;
		int sutun = 3;
		
		for(int i = 1; i <=satir; i++) {
           for(int j = 1; j<=sutun; j++) {
        	   
        	   System.out.print("[ " + i + " " + j + " ]");

           }
           System.out.println();
		}
		
	}

}
