public class Mahasiswa extends User {
    private String nim;
    private String jurusan;

    public Mahasiswa(String nama, String alamat, String ttl, String telepon, String nim, String jurusan) {
        super(nama, alamat, ttl, telepon);
        this.nim = nim;
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nim ='" + nim + '\'' +
                ", jurusan ='" + jurusan + '\'' +
                ", nama ='" + getNama() + '\'' +
                ", alamat ='" + getAlamat() + '\'' +
                ", ttl ='" + getTtl() + '\'' +
                ", telepon ='" + getTelepon() + '\'' +
                '}';
    }
}
