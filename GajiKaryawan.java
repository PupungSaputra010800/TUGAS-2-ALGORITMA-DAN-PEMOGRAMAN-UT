import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Golongan (A/B/C): ");
        String golongan = input.nextLine().toUpperCase();
        System.out.print("Masukkan Jam Lembur (1-5): ");
        int jamLembur = input.nextInt();
        double gajiPokok = 0;
        switch (golongan) {
            case "A": gajiPokok = 5000000; break;
            case "B": gajiPokok = 6500000; break;
            case "C": gajiPokok = 9500000; break;
        }
        double gajiLembur = 0;
        if (jamLembur == 1) gajiLembur = gajiPokok * 0.30;
        else if (jamLembur == 2) gajiLembur = gajiPokok * 0.32;
        else if (jamLembur == 3) gajiLembur = gajiPokok * 0.34;
        else if (jamLembur == 4) gajiLembur = gajiPokok * 0.36;
        else if (jamLembur == 5) gajiLembur = gajiPokok * 0.38;
        double total = gajiPokok + gajiLembur;
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Gaji Lembur: " + gajiLembur);
        System.out.println("Total Gaji: " + total);
    }
}
