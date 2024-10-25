public class MatkulPilihan extends MataKuliah {
    private int minMahasiswa;

    public MatkulPilihan(String kode, int sks, String nama, int minMahasiswa) {
        super(kode, sks, nama);
        this.minMahasiswa = minMahasiswa;
    }

    @Override
    public String toString() {
        return "MatkulPilihan{" +
                "minMahasiswa =" + minMahasiswa +
                ", " + super.toString() +
                '}';
    }
}
