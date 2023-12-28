
package overaid;

import java.util.Scanner;

public class daftarbarang extends barang {
     @Override
     public void namabrg(){
         System.out.println("Dafatar Nama dan Harga Barang: ");
         Scanner input = new Scanner(System.in);
         int hrg1;
         int hrg2;
         int hrg3;
         
         System.out.print("Harga Teh pucuk: ");
         hrg1 = input.nextInt();
         
         System.out.print("Harga Teh Kotak: ");
         hrg2 = input.nextInt();
         
         System.out.print("Harga Teh Botol: ");
         hrg3 = input.nextInt();
         
         
         System.out.println("Harga Teh Pucuk: "+hrg1+ "K");
         System.out.println("Harga Teh Kotak: "+hrg2+ "K");
         System.out.println("Harga Teh Botol: "+hrg3+ "K");
     }
    
    
}
