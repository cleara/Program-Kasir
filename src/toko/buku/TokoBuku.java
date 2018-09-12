
package toko.buku;

import java.util.Scanner;


public class TokoBuku {

   
    public static void main(String[] args) {
        
        System.out.println("Clearasia Prastika Sari\n");
        
        
        System.out.println(">>>Inshaallah Berkah<<<<\n");
        
         Scanner s = new Scanner(System.in);
        
        String namaKasir,namaBarang;
        int jumlahBarang,kodeBarang;
        double harga,totalBayar=0,diskon=0;
        
        System.out.print("Nama Pembeli \t : ");
        String namaPembeli = s.nextLine();
        
        System.out.print("Nama kasir \t : ");
        String namKasir = s.nextLine();
        
        System.out.print("Kode Barang \t : ");
        kodeBarang = s.nextInt();
        
        System.out.print("Harga \t \t :");
        harga=s.nextDouble();
        
        System.out.print("Jumlah Barang \t :");
        jumlahBarang = s.nextInt();
        
       totalBayar = jumlahBarang*harga;
       
        if(totalBayar>100000){
        diskon=0.10*totalBayar;
    }
        if (totalBayar>200000) {
        diskon=0.20*totalBayar;
    }
        if (totalBayar>5000000) {
        diskon=0.50*totalBayar;
    }

        totalBayar=totalBayar-diskon;
        
      
        System.out.println("diskon \t \t :Rp "+diskon);
        System.out.println("Total bayar \t :Rp"+totalBayar);
        
        System.out.println("Terimakasih atas kunjungan anda");
       
    }
    
}
