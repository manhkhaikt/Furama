package com.company;

import java.util.Scanner;

public class QuanLyHouse {

    public static int[][] house = null;
    private int soHouse;

    public int[][] getHouse() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap so House: ");
        soHouse = scan.nextInt();

        this.house = new int[soHouse][2];

        for (int i = 0; i < soHouse; i++) {
            System.out.println("House " + (i + 1) + " :");
            System.out.print("Nhap so giuong: ");
            this.house[i][0] = scan.nextInt();
            System.out.print("Nhap so be boi: ");
            this.house[i][1] = scan.nextInt();
        }
        return this.house;
    }

    public void showVilla() {
        System.out.println("House \t    So giuong \tSo ho boi ");
        for (int i = 0; i < this.house.length; i++) {
            System.out.println("House " + (i + 1) + ":\t\t" + this.house[i][0] + "    \t\t" + this.house[i][1]);
        }
    }
}
