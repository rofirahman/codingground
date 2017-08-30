public class Belajar03 {
    public static void main(String[] args) {
        System.out.println("\nProgram Menghitung Luas dan Keliling Persegi Panjang (Java8)");
        
        // Menggunakan tipe data "int" atau integer
        int panjang,lebar,luas,keliling;
        
        // Menentukan isi variable panjang dan lebar
        panjang = 10;
        lebar = 15;
        
        // Melakukan penghitungan luas dan keliling
        luas = panjang * lebar;
        keliling = 2 * (panjang+lebar);
        
        // Menampilkan Hasil penghitungan luas dan keliling
        System.out.println("Luas = " + luas);
        System.out.println("Keliling = " + keliling + "\n");
    }
}