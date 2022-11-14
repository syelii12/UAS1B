import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Jawaban {

    int JumMabaPoltek = 3; // TI,DKV,TKOM
    static int JumlahMaba = 1050;
    public static String[] TI = new String[500];
    public static String[] DKV = new String[300];
    public static String[] TKOM = new String[250];

    public static void PenerimaMaba() {
        int totalTI = 0;
        int totalSisaKursi = 0;
        for (int index = 0; index < TI.length; index++) {
            if (TI[index] != null) {
                totalTI++;
            }
        }
        int totalDKV = 0;
        for (int index = 0; index < DKV.length; index++) {
            if (DKV[index] != null) {
                totalDKV++;
            }
        }
        int totalTKOM = 0;
        for (int index = 0; index < TKOM.length; index++) {
            if (TKOM[index] != null) {
                totalTKOM++ ;
            }
        }
        totalSisaKursi = JumlahMaba - totalTI - totalDKV - totalTKOM;
        System.out.println("Total JumlahMabaBaru: " + totalTI + " | Total JumlahMaba: " + totalDKV + " | Total JumlahMabaBaru: " + totalTKOM);
        System.out.println("JumMabaPoltek:" + JumlahMaba + "| Total Sisa Kuota: " + totalSisaKursi);
        System.out.println();
    }

    public static void CheckIndexArray(String[] JumlahMaba, String Maba) {
        int indexNow = 0;
        for (int index = 0; index < JumlahMaba.length; index++) {
            if (JumlahMaba[index] != null) {
                indexNow = index + 1;
            }
        }
        if (indexNow < JumlahMaba.length) {
            JumlahMaba[indexNow] = Maba;
        }
    }

    public static void simpanMabaBaru(int angkaRandom, String Maba) {
        switch (angkaRandom) {
            case 1:
                CheckIndexArray(TI, Maba);
                System.out.println("Anda mendapatkan NIK + TI22");
                PenerimaMaba();
                break;
            case 2:
                CheckIndexArray(DKV, Maba);
                System.out.println("Anda mendapatkan NIK + DKV22");
                PenerimaMaba();
                break;
            case 3:
                CheckIndexArray(TKOM, Maba);
                System.out.println("Anda mendapatkan NIK + TKOM22");
                PenerimaMaba();
                break;
        }
    }

    public static void Maba() {
        Scanner inputData = new Scanner(System.in);
        while (true) {
            System.out.println("Maba = ");
            String Maba = inputData.nextLine();
            if (Maba.isBlank()) {
                System.out.println(" Nama PenerimaMaba");
                Maba();
            } else {
                Random hasilRandom = new Random();
                int JenisRandom = hasilRandom.nextInt(3) + 1;
                simpanMabaBaru(JenisRandom, Maba);
            }
        }
    }

    public static void main(String[] args) {
        Maba();
        //
    }
}











