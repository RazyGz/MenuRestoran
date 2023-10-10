package Nilai;

import java.util.Scanner;

public class MenuRestoran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("List harga makanan: \n 1. Nasgor 12000\n 2. Steak 22000\n 3. Ayam goreng 15000");
        System.out.println("List harga minuman: \n 1. Es teh 3500\n 2. Jeruk peras  4000\n 3. Alpukat 10000");
        String namaMakanan;
        String namaMinuman;
        int hargaMakanan =0;
        int hargaMinuman =0;
        int total =0;
        boolean status = true;
        do {
            System.out.println("Masukkan Nomor Makanan Yang Ingin Dibeli :");

            int makanan = input.nextInt();
            System.out.println("Masukkan Nomor Makanan Yang Ingin Dibeli :");
            int minuman  = input.nextInt();

            if(makanan == 1){
                namaMakanan ="Nasgor";
            }else if(makanan == 2){
                namaMakanan = "Steak";
            }else if(makanan == 3){
                namaMakanan = "Ayam Goreng";
            }
                if(minuman ==1){
                    namaMinuman = "Es Teh";
                }
                if(minuman ==1){
                    namaMinuman = "Jeruk Peras";
                    
                }else if(minuman ==1){
                        namaMinuman = "Alpukat";
                
                }
            }
        }
}