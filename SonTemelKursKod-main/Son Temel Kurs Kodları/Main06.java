import java.util.Scanner;
//KULLANICININ GİRDİĞİ SAYIYA KADAR OLAN MÜKEMMEL SAYIYI BULAN PROGRAM
public class Main06 { 
	
    public static void main(String[] args) {
    
    	 Scanner scanner= new Scanner(System.in);
    	 System.out.println("Lütfen Bir Sayı Giriniz:");
    	 int sayi= scanner.nextInt();
    	 int toplam=0;
    	 
    	 
    	 for(int i = 1;i<sayi;i++) {
    		 for(int j = 1;j<=i/2;j++) {
    			 if(i%j==0) {
    				 toplam+=j;
    			 }
    		 }
    		 if(toplam==i) {
    			 System.out.println(i+"Sayisi Mükemmel Bir Sayidir!");
    		 }
    		 toplam=0;
    	 }
    	 
    		}
    	}