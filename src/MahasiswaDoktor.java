public class MahasiswaDoktor extends Mahasiswa {
    private String judulDisertasi;
    private double nilaiSidang1;
    private double nilaiSidang2;
    private double nilaiSidang3;

    public MahasiswaDoktor(String nama, String alamat, String ttl, String telepon, String nim, String jurusan, String judulDisertasi, double nilaiSidang1, double nilaiSidang2, double nilaiSidang3) {
        super(nama, alamat, ttl, telepon, nim, jurusan);
        this.judulDisertasi = judulDisertasi;
        this.nilaiSidang1 = nilaiSidang1;
        this.nilaiSidang2 = nilaiSidang2;
        this.nilaiSidang3 = nilaiSidang3;
    }

    @Override
    public String toString() {
        return "MahasiswaDoktor{" +
                "judulDisertasi ='" + judulDisertasi + '\'' +
                ", nilaiSidang1 =" + nilaiSidang1 +
                ", nilaiSidang2 =" + nilaiSidang2 +
                ", nilaiSidang3 =" + nilaiSidang3 +
                ", " + super.toString() +
                '}';
    }
}
