import java.util.List;

public class MahasiswaMagister extends Mahasiswa {
    private List<String> matakuliahDiambil;
    private String judulTesis;

    public MahasiswaMagister(String nama, String alamat, String ttl, String telepon, String nim, String jurusan, List<String> matakuliahDiambil, String judulTesis) {
        super(nama, alamat, ttl, telepon, nim, jurusan);
        this.matakuliahDiambil = matakuliahDiambil;
        this.judulTesis = judulTesis;
    }

    @Override
    public String toString() {
        return "MahasiswaMagister{" +
                "matakuliahDiambil =" + matakuliahDiambil + ", judulTesis ='" + judulTesis + '\'' + ", " + super.toString() + '}';
    }
}
