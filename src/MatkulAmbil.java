import java.util.List;

public class MatkulAmbil {
    private MataKuliah matkul;
    private List<Presensi> presensi;
    private double n1;
    private double n2;
    private double n3;

    public MatkulAmbil(MataKuliah matkul, List<Presensi> presensi, double n1, double n2, double n3) {
        this.matkul = matkul;
        this.presensi = presensi;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    @Override
    public String toString() {
        return "MatkulAmbil{" +
                "matkul =" + matkul +
                ", presensi =" + presensi +
                ", n1 =" + n1 +
                ", n2 =" + n2 +
                ", n3 =" + n3 +
                '}';
    }
}
