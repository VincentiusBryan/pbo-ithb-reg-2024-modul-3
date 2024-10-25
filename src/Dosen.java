import java.util.List;

public class Dosen extends Staff {
    private String departemen;
    private List<String> mataKuliahDiajarkan;

    public Dosen(String nama, String alamat, String ttl, String telepon, String nik, String departemen, List<String> mataKuliahDiajarkan) {
        super(nama, alamat, ttl, telepon, nik);
        this.departemen = departemen;
        this.mataKuliahDiajarkan = mataKuliahDiajarkan;
    }

    @Override
    public String toString() {
        return "Dosen{" +
                "departemen='" + departemen + '\'' +
                ", mataKuliahDiajarkan=" + mataKuliahDiajarkan +
                ", " + super.getNama() +
                ", nik='" + getNik() + '\'' +
                '}';
    }
}
