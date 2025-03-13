package Diziler;

public class Diziler04 {

	public static void main(String[] args) {
		
		int[][] dizi = {{5,10,15} , {20,25,30} , {35,40,45}};
		//	System.out.println(dizi[1][2]);
			int toplam = 0;
			
			
			
			for(int i = 0; i < dizi.length; i++) 
			{
				toplam = 0;
				for(int j = 0; j < dizi[i].length; j++) 
				{
					System.out.print(dizi[i][j] + " ");
					toplam = toplam + dizi[i][j];
				}
				System.out.println();
				System.out.println(toplam);
			}
			
			System.out.println("Döngü bitti..");
			
			
			
			
			

		}

	

	}


