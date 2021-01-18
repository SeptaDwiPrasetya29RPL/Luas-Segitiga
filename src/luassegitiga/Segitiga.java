
package luassegitiga;

import java.util.Scanner;


public class Segitiga {
    Scanner in = new Scanner(System.in);
    int alas;
    int tinggi;
    int hasil;
    
    void input(){
        System.out.print("masukkan panjang alas = ");
        alas = in.nextInt();
        System.out.print("masukkan tinggi = ");
        tinggi = in.nextInt();    
    }
    void hitung(){
        hasil = alas*tinggi/2;
    }
    int hasil(){
        return hasil;
    }


    
}
