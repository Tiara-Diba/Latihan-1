// Nama     : Tiara Diba
// NIM      : 11200930000017
// Kelas    : 2A SI'20

package Matematic;

public class MatematikaCanggihBeraksi {
    public static void main (String []args ){
        MatematikaCanggih Math = new MatematikaCanggih();
            
       Math.setPertambahan(20,20); 
        System.out.println("Ini adalah pertambahan:" + Math.getPertambahan());
       Math.setPengurangan (40,30);
        System.out.println("Ini adalah pengurangan:" + Math.getPengurangan());
       Math.setPerkalian(45, 33);
        System.out.println("Ini adalah perkalian:" + Math.getPerkalian());
       Math.setPembagian(30,10);
        System.out.println("Ini adalah pembagian:" + Math.getPembagian());
       Math.setModulus(10,100);
        System.out.println("Ini adalah modulus:" + Math.getModulus());
    }
}
