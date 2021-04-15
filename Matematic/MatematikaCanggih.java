// Nama     : Tiara Diba
// NIM      : 11200930000017
// Kelas    : 2A SI'20
package Matematic;


public class MatematikaCanggih extends Matematika {
    private int Modulus, a, b;
            int Modulus1; 
            double Modulus2;
            
    void setModulus(int a, int b){
        Modulus = a%b;
    }
    int getModulus(){
        return Modulus;
    }
    public void Modulus(int a, int b){
        Modulus1 = a%b;
        System.out.println("Modulus1:" + a + "%" + b + "=" + Modulus1 );
    }
    public void Modulus(double a, double b, double c){
        Modulus2 = a%b%c;
        System.out.println("Modulus2:"+ a + "%" + b + "%" + c + "=" + Modulus2 );
    }
}
