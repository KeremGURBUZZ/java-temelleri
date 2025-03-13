package Degiskenler;

import java.util.Scanner;

public class Degiskenler07 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kütle değerini giriniz : ");
		int m = scanner.nextInt();
		System.out.print("İvme değerini giriniz : ");
		int a = scanner.nextInt();
		int F = m * a;
		System.out.println("Kuvvet : " + F);
		
	}

}
