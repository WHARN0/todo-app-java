import java.util.ArrayList;
import java.util.Scanner;

public class TodoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> todos = new ArrayList<>();
        String input;

        System.out.println("=== Aplikasi Todo List Sederhana ===");

        while (true) {
            System.out.println("\n1. Tambah Tugas");
            System.out.println("2. Lihat Semua Tugas");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            input = scanner.nextLine();

            if (input.equals("1")) {
                System.out.print("Masukkan tugas: ");
                String task = scanner.nextLine();
                todos.add(task);
                System.out.println("✅ Tugas ditambahkan.");
            } else if (input.equals("2")) {
                System.out.println("\n📋 Daftar Tugas:");
                if (todos.isEmpty()) {
                    System.out.println("(Kosong)");
                } else {
                    for (int i = 0; i < todos.size(); i++) {
                        System.out.println((i + 1) + ". " + todos.get(i));
                    }
                }
            } else if (input.equals("3")) {
                System.out.println("Sampai jumpa!");
                break;
            } else {
                System.out.println("❌ Pilihan tidak valid.");
            }
        }
    }
}
