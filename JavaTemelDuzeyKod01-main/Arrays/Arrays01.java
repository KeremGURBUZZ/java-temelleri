package Arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		//ŞİMDİYE KADAR HEP TEK ELEMENT ÇALIŞTIK 
		// ARRAYS BİZE MULTİPLE ELEMENT STORE ETMEMİZİ SAĞLIYOR 
		//TANIM : AYNI DATA TYPE A SAHİP ELEMENTLE KÜMESİ DİYEBİLİRİZ 
		// YAZIMI : dt name[] = new dt[size]; sabit size var. elementlere index vasıtasıyla ulasabiliriz
	
		int arr[] = new int[4]; //deklere
		
		arr[0] = 3;
		arr[1] = 2;
		arr[2] = 7;
		arr[3] = 9;
		
		//EĞER SİZENİN DIŞINA ÇIKARSAK "java.lang.ArrayIndexOutOfBoundsException" HATASI ALIRIZ
		
		System.out.println(arr[2]);
		
		System.out.println(Arrays.toString(arr));
		

	}

}
