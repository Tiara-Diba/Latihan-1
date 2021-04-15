// Nama     : Tiara Diba
// NIM      : 11200930000017
// Kelas    : 2A SI'20
package Matematic;


public class MatematikaCanggihBangetBeraksi {
    public static void main (String[]args){
        MatematikaCanggihBanget Math = new MatematikaCanggihBanget();
       Math.setPertambahan(67,99); 
        System.out.println("Ini adalah pertambahan:" + Math.getPertambahan());
       Math.setPengurangan (45,37);
        System.out.println("Ini adalah pengurangan:" + Math.getPengurangan());
       Math.setPerkalian(85, 39);
        System.out.println("Ini adalah perkalian:" + Math.getPerkalian());
       Math.setPembagian(50,5);
        System.out.println("Ini adalah pembagian:" + Math.getPembagian());
       Math.setModulus(50,500);
        System.out.println("Ini adalah modulus:" + Math.getModulus());
       Math.setPertambahanTiga(40,70,88);
        System.out.println("Ini adalah pertambahan tiga:" + Math.getPertambahanTiga());
        
        
    }    
}
