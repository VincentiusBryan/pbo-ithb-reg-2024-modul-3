import java.util.List;

public class Karyawan extends Staff {
    private double salary;
    private List<String> presensiStaff;

    public Karyawan(String nama, String alamat, String ttl, String telepon, String nik, double salary, List<String> presensiStaff) {
        super(nama, alamat, ttl, telepon, nik);
        this.salary = salary;
        this.presensiStaff = presensiStaff;
    }

    @Override
    public String toString() {
        return "Karyawan{" +
                "salary=" + salary +
                ", presensiStaff=" + presensiStaff +
                ", " + super.getNama() + 
                ", nik='" + getNik() + '\'' +
                '}';
    }
}
