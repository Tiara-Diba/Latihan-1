// Nama : Tiara Diba
// NIM  : 11200930000017
package Duit;

public class Bank {

    int saldo;
    int simpanUang;
    int ambilUang;
    public Bank(int saldo){
        this.saldo = 100000;
    }   
    public void saldo (){
        System.out.println("Hallo, Selamat Datang");
        System.out.println("Saldo Anda Saat Ini=" + " Rp." + saldo);
        System.out.println("                     ");
    }
    
    public void simpanUang(int simpanUang){
        saldo = saldo + simpanUang;
        System.out.println("Simpanan Uang Anda=" + " Rp." + simpanUang);
        System.out.println("Saldo Anda Saat Ini=" + " Rp." + saldo);
        System.out.println("                     ");
    }
    
    public void ambilUang(int ambilUang){
        saldo = saldo - ambilUang;
        System.out.println("Ambil Uang Anda=" + " Rp." + ambilUang);
        System.out.println("Saldo Anda saat ini=" + " Rp." + saldo);
        System.out.println("                     ");
    }
    int getsaldo(){
        return saldo;
    }
    }
    
   

   
    
