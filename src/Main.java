import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> matakuliahSarjana = new ArrayList<>();
        matakuliahSarjana.add("Matematika");
        matakuliahSarjana.add("Fisika");

        MahasiswaSarjana mahasiswaSarjana = new MahasiswaSarjana("Andi", "Jakarta", "01-01-2000", "08123456789", "123456", "Teknik", matakuliahSarjana);
        System.out.println(mahasiswaSarjana);

        List<String> matakuliahMagister = new ArrayList<>();
        matakuliahMagister.add("Analisis Data");
        MahasiswaMagister mahasiswaMagister = new MahasiswaMagister("Budi", "Bandung", "02-02-1995", "08987654321", "654321", "Sistem Informasi", matakuliahMagister, "Optimasi Algoritma");
        System.out.println(mahasiswaMagister);

        MahasiswaDoktor mahasiswaDoktor = new MahasiswaDoktor("Cindy", "Surabaya", "03-03-1990", "08765432109", "789012", "Ilmu Komputer", "Machine Learning", 85, 90, 92);
        System.out.println(mahasiswaDoktor);

        List<String> mataKuliahDiajarkan = new ArrayList<>();
        mataKuliahDiajarkan.add("Kalkulus");
        Dosen dosen = new Dosen("Dr. Eko", "Yogyakarta", "04-04-1985", "08223334455", "NIK001", "Matematika", mataKuliahDiajarkan);
        System.out.println(dosen);

        Karyawan karyawan = new Karyawan("Fanny", "Semarang", "05-05-1988", "08553322110", "NIK002", 5000000, new ArrayList<>());
        System.out.println(karyawan);
    }
}
