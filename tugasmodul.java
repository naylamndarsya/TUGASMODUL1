import java.util.Scanner; //mengimport class scanner

public class tugasmodul { //menampilkan codingan yang ada di kelas ini
    public static void main(String[] args) { // mengawali program
        Scanner objinput = new Scanner(System.in); //objinput adalah variabel // scanner untuk rekam inputan user //new scanner untuk membuat objek baru //system.in untuk mengambil sebuah input dari user melalui keyboard

        int pilihan; //tipe data

        System.out.println("Selamat datang di sistem login library.");
        System.out.println("Silakan pilih jenis user:");
        System.out.println("1. Login as student");
        System.out.println("2. Login as admin");
        System.out.print("Pilihan: ");
        pilihan = objinput.nextInt();

        if (pilihan == 1) {
            String nim;

            System.out.print("Masukkan NIM: ");
            nim = objinput.next(); //input.next() untuk membaca string dengan panjang tunggal

            if (nim.length() != 15) {
                System.out.println("Login gagal. NIM harus terdiri dari 15 karakter. ");
            } else {
                System.out.println("Login berhasil sebagai mahasiswa");
            }
        } else if (pilihan == 2) {
            String username, password;

            System.out.print("Masukkan username: ");
            username = objinput.next();

            System.out.print("Masukkan password: ");
            password = objinput.next();

            if (username.equals("admin") && password.equals("admin")) { //equals jika uname admin dan sesuai pass maka login berhasil
                System.out.println("Login berhasil sebagai admin.");
            } else {
                System.out.println("Login gagal. Username atau password salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        objinput.close();
    }
}