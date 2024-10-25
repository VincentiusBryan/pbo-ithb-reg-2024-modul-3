public class Presensi {
    private String tanggal;
    private int status; 
    // 1 = Hadir, 0 = Alpha

    public Presensi(String tanggal, int status) {
        this.tanggal = tanggal;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Presensi{" +
                "tanggal ='" + tanggal + '\'' +
                ", status =" + status +
                '}';
    }
}
