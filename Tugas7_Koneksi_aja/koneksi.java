// Nama : Tiara Diba
// NIM  : 11200930000017
// Kelas: 2A SI'20

package Tugas7_Koneksi_aja;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class koneksi {
    private Connection koneksi;
    
    public Connection connect(){
     try{
    Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Berhasil Koneksi");
    } catch (ClassNotFoundException ex){
            System.out.println("Gagal Koneksi" + ex);
    }
    String url = "jdbc:mysql://localhost:3306/db_luki_silk";
    try{
    koneksi = DriverManager.getConnection(url, "root", "");
            System.out.println("Berhasil Koneksi Database");
    } catch (SQLException ex){
            System.out.println("Gagal Koneksi Database" + ex);
    }
    return koneksi;
    }
}
