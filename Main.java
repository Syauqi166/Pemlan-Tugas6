package praktikum.tugas6;

public class Main {
    public static void main(String[] args) {
        // 1. Manusia
        // Laki-laki, menikah
        Manusia a = new Manusia("Budi", true, "123456789", true);
        System.out.println(a);
        // Perempuan, menikah
        Manusia b = new Manusia("Siti", false, "987654321", true);
        System.out.println(b);
        // Belum menikah
        Manusia c = new Manusia("Andi", true, "456789123", false);
        System.out.println(c);

        // 2. MahasiswaFILKOM
        // IPK < 3.0
        MahasiswaFILKOM d = new MahasiswaFILKOM("Doni", true, "242222222", false, "241507234", 2.8);
        System.out.println(d.toString());
        // IPK 3.0 - 3.5
        MahasiswaFILKOM e = new MahasiswaFILKOM("Rina", false, "987654321", true, "201507344", 3.2);
        System.out.println(e.toString());
        // IPK > 3.5
        MahasiswaFILKOM f = new MahasiswaFILKOM("Sari", false, "456789123", false, "210507653", 3.8);
        System.out.println(f.toString());

        // 3. Pekerja
        // 2 tahun, 2 anak
        Pekerja g = new Pekerja(2000.0, 2021, 5, 15, 2, "Joko", true, "123456789", true);
        System.out.println(g.toString());
        // 9 tahun, 0 anak
        Pekerja h = new Pekerja(3000, 2014, 3, 10, 0, "Dewi", false, "987654321", true);
        System.out.println(h.toString());
        // 20 tahun, 10 anak
        Pekerja i = new Pekerja(5000, 2003, 1, 1, 10, "Siti", false, "456789123", false);
        System.out.println(i.toString());

        // 4. Manager
        // 15 tahun, gaji 7500
        Manager j = new Manager("HRD", 7500, 2008, 6, 1, 15, "Budi", "123456789", true, true);
        System.out.println(j.toString());
    }
    
}
