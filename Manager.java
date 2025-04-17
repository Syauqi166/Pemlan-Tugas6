package praktikum.tugas6;

public class Manager extends Pekerja {
    private String departemen;

    public Manager(String departemen, double gaji, int tahun, int bulan, int tanggal, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean status) {
        super(gaji, tahun, bulan, tanggal, jumlahAnak, nama, jenisKelamin, nik, status);
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    @Override
    public double getPendapatan() {
        double tambahan = super.getGaji() * 0.10;
        return super.getPendapatan() + tambahan;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nDepartemen: " + getDepartemen();
    }

    
}
