import java.util.List;

public class MatkulAjar {
    private MataKuliah matkul;
    private List<Presensi> presensiStaff;

    public MatkulAjar(MataKuliah matkul, List<Presensi> presensiStaff) {
        this.matkul = matkul;
        this.presensiStaff = presensiStaff;
    }

    @Override
    public String toString() {
        return "MatkulAjar{" +
                "matkul =" + matkul +
                ", presensiStaff=" + presensiStaff +
                '}';
    }
}
