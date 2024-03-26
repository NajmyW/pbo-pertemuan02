import koneksi.Database;
import model.Dosen;
import model.Mahasiswa;
import model.MataKuliah;
public class Main { 
    public static void main(String[] args){
        System.out.println("Ini program main");
        Database.hubungkan();
        Dosen.tampilanInfo();
        Mahasiswa.tampilanInfo();
        MataKuliah.tampilanInfo();
    }
}