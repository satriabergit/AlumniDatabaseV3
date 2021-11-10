package com.PngEngineering;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AlumniDataManager dataManager = new AlumniDataManager();

        int selectedMenu = 1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Pilih menu:");
            System.out.println("1. tambah data alumni");
            System.out.println("2. tampilkan data alumni");
            System.out.println("0. keluar");
            System.out.print("Menu pilihan anda: ");
            selectedMenu = scanner.nextInt();

            switch (selectedMenu) {
                case 1: AlumniData newAlumniData = new AlumniData();
                        System.out.print("Masukkan nama alumni: ");
                        do{
                            newAlumniData.name = scanner.nextLine();
                        } while (newAlumniData.name.strip().isEmpty());

                        System.out.print("Masukkan alamat alumni: ");
                        do{
                            newAlumniData.address = scanner.nextLine();
                        } while (newAlumniData.address.strip().isEmpty());

                        System.out.print("Masukkan nomor telepon alumni: ");
                        newAlumniData.phoneNo = scanner.nextInt();

                        dataManager.addAlumniData(newAlumniData);
                        break;
                case 2: System.out.println("Data alumni: ");
                        int counter = 1;
                        dataManager.restartIterator();
                        AlumniData alumniData = dataManager.getNextAlumniData();
                        while (alumniData != null) {
                            System.out.println(counter + ".\tnama\t: " + alumniData.name);
                            System.out.println("\talamat\t: " + alumniData.address);
                            System.out.println("\ttelepon\t: " + alumniData.phoneNo);
                            counter++;
                            alumniData = dataManager.getNextAlumniData();
                        }
                        break;
                default:
            }

        } while (selectedMenu != 0);
    }
}
