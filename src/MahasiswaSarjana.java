import java.util.List;

public class MahasiswaSarjana extends Mahasiswa {
    private List<String> matakuliahDiambil;

    public MahasiswaSarjana(String nama, String alamat, String ttl, String telepon, String nim, String jurusan, List<String> matakuliahDiambil) {
        super(nama, alamat, ttl, telepon, nim, jurusan);
        this.matakuliahDiambil = matakuliahDiambil;
    }

    @Override
    public String toString() {
        return "MahasiswaSarjana{" +
                "matakuliahDiambil =" + matakuliahDiambil + ", " + super.toString() + '}';
    }
}
