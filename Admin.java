/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Admin {
    private String username;
    private String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void login() {
        // Logika untuk proses login admin
        // Contoh implementasi sederhana
        if (username.equals("admin") && password.equals("password")) {
            System.out.println("Login berhasil!");
        } else {
            System.out.println("Username atau password salah.");
        }
    }

    public void createNewUser(String username, String password) {
        // Logika untuk membuat pengguna baru
        // Contoh implementasi sederhana
        
        User newUser = new User(username, password);
        // Simpan pengguna baru ke dalam database atau daftar pengguna
        System.out.println("Pengguna baru telah berhasil dibuat.");
    }

    public void deleteUser(String username) {
        // Logika untuk menghapus pengguna
        // Contoh implementasi sederhana
        // Hapus pengguna dari database atau daftar pengguna
        System.out.println("Pengguna dengan username " + username + " telah dihapus.");
    }

    // Metode lainnya sesuai kebutuhan

    public static void main(String[] args) {
        // Contoh penggunaan kelas Admin
        Admin admin = new Admin("admin", "password");
        admin.login();
        admin.createNewUser("john", "123456");
        admin.deleteUser("john");
    }

    private static class User {

        public User(String username, String password) {
        }
    }
}
