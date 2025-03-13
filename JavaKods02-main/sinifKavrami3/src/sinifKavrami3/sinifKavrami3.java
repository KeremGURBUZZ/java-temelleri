package sinifKavrami3;

import java.util.Scanner; 

public class sinifKavrami3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        Insan Kerem = new Insan();
        
    
        System.out.print("Kerem beyin boyunu girin: ");
        Kerem.boy = scanner.nextInt(); 
        scanner.nextLine(); 

        System.out.println("Kerem beyin boyu: " + Kerem.boy);

        System.out.print("Kerem beyin cinsiyetini girin: ");
        Kerem.cinsiyet = scanner.nextLine(); 
        
        System.out.println("Kerem beyin cinsiyeti: " + Kerem.cinsiyet);

        System.out.print("Kerem beyin kilosunu girin: ");
        Kerem.kilo = scanner.nextInt(); 
        scanner.nextLine(); 
        
        System.out.println("Kerem beyin kilosu: " + Kerem.kilo);

        System.out.print("Kerem beyin göz rengini girin: ");
        Kerem.gozRengi = scanner.nextLine(); 
        
        System.out.println("Kerem beyin göz rengi: " + Kerem.gozRengi);

        System.out.print("Kerem beyin saç rengini girin: ");
        Kerem.sacRengi = scanner.next(); 
        
        System.out.println("Kerem beyin saç rengi: " + Kerem.sacRengi);
        
        Kerem.yemekYe("Dolma");
        Kerem.uyu();
        Kerem.kos();
        
        scanner.close(); 
    }
}
