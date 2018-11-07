package com.company;

import java.util.Scanner;

public class QuanLyVilla {

    public static int[][] villa = null;

    public int[][] getVilla() {
        Scanner scan = new Scanner(System.in);
        int soVilla;
        System.out.print("Nhap so Villa: ");
        soVilla = scan.nextInt();

        this.villa = new int[soVilla][2];

        for (int i = 0; i < soVilla; i++) {
            System.out.println("Villa " + (i + 1) + " :");
            System.out.print("Nhap so giuong: ");
            this.villa[i][0] = scan.nextInt();
            System.out.print("Nhap so be boi: ");
            this.villa[i][1] = scan.nextInt();
        }
        return this.villa;
    }

    public void showVilla() {
        System.out.println("Villa \t    So giuong \tSo ho boi ");
        for (int i = 0; i < this.villa.length; i++) {
            System.out.println("Villa " + (i + 1) + ":\t\t" + this.villa[i][0] + "    \t\t" + this.villa[i][1]);
        }
    }
}
