package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 0;
        int number1 = 0;
        int number2 = 0;

        //villa
        int thoiGianThue = 0;
        int soTienThueVilla = 0;

        //house
        int soTienThueHouse = 0;

        //ho boi
        int thoiGianMoHoBoi;

        //khach thue
        String hoVaTen;
        int doTuoi = 0;
        int thoiGianDatLich;
        int soTienKhachMangTheo;

        QuanLyVilla vl = new QuanLyVilla();
        QuanLyHouse ho = new QuanLyHouse();

        System.out.println("Nhap thong tin Villa");
        vl.getVilla();

        System.out.println("Nhap thong tin House");
        ho.getHouse();


        System.out.print("Nhap ten khach hang: ");
        hoVaTen = scan.nextLine();
        System.out.print("Nhap do tuoi: ");
        while (doTuoi < 1) {
            doTuoi = scan.nextInt();
            if (doTuoi < 1) {
                System.out.println("Nhap sai do tuoi yeu cau nhap lai: ");
            }
        }


        System.out.println("Nhap so ngay khach can thue: ");
        thoiGianThue = scan.nextInt();

        System.out.println("Khach Hang chon thue House hay Villa: \n" +
                "1.Villa \n" +
                "2.House ");

        System.out.println("Nhap lua chon: ");


        while (number1 < 1 || number1 > 2) {
            number1 = scan.nextInt();
            if (number1 < 1 || number1 > 2)
                System.out.println("Nhap sai lua chon xin moi nhap lai: ");
        }


        switch (number1) {
            case 1:
                System.out.println("Nhap so tien thue 1 Villa");
                soTienThueVilla = scan.nextInt();
                break;

            case 2:
                System.out.println("Nhap so tien thue 1 House");
                soTienThueHouse = scan.nextInt();
                break;
        }

        System.out.println("Nhap gio ho boi mo cua: ");
        thoiGianMoHoBoi = scan.nextInt();

        while (number == 0) {
            System.out.println("Chon dich vu: \n" +
                    "1.Tinh tien \n" +
                    "2.Hien thi thong tin khach hang \n" +
                    "3.In gio mo cua Swimming pool \n" +
                    "4.Nhan dat lich Swimming pool cua khach hang \n" +
                    "5.Tinh so ngay co the o trong 1 don vi tien \n" +
                    "6.Hien thi thong tin cua cac Villa\n" +
                    "7.Hien thi thong tin cac House\n" +
                    "8.Thoat chuong trinh");
            while (number2 < 1 || number2 > 8) {
                number2 = scan.nextInt();
                if (number2 < 1 || number2 > 8) {
                    System.out.println("Nhap sai yeu cau nhap lai: ");
                }
            }

            if (number2 == 8) break;

            switch (number2) {
                case 1:
                    if (number1 == 1) {
                        System.out.println(tinhTien(soTienThueVilla, thoiGianThue));
                    } else if (number1 == 2) {
                        System.out.println(tinhTien(soTienThueHouse, thoiGianThue));
                    }
                    System.out.println("----------------------------------------------");
                    break;
                case 2:
                    System.out.println("Ho va ten: " + hoVaTen);
                    System.out.println("Tuoi: " + doTuoi);
                    if (number1 == 1) {
                        System.out.println("Dich vu thue: Villa");
                    } else if (number1 == 2) {
                        System.out.println("Dịch vu thue: House");
                    }
                    System.out.println("Thoi gian thue: " + thoiGianThue);
                    System.out.println("----------------------------------------------");
                    break;
                case 3:
                    System.out.println("Gio mo cua cua Swinmming pool: " + thoiGianMoHoBoi);
                    break;
                case 4:
                    System.out.println("Nhap gio khach dat lich: ");
                    thoiGianDatLich = scan.nextInt();
                    if (thoiGianDatLich < thoiGianMoHoBoi) {
                        System.out.println("Xin quy khach doi den " + thoiGianMoHoBoi + " gio");
                    } else {
                        System.out.println("Chao mung quy khach den voi dich vu Swinmming pool");
                    }
                    System.out.println("----------------------------------------------");
                    break;
                case 5:
                    System.out.println("Nhap so tien khach mang theo: ");
                    soTienKhachMangTheo = scan.nextInt();
                    if (number1 == 1) {
                        System.out.print("So ngay khach co the o trong Villa la: ");
                        System.out.println(tinhNgay(soTienKhachMangTheo, soTienThueVilla));
                    } else {
                        if (number1 == 2) {
                            System.out.println("So ngay khach co the o trong House la: " + tinhNgay(soTienKhachMangTheo, soTienThueHouse) + " Ngay");
                        }
                    }
                    System.out.println("----------------------------------------------");
                    break;
                case 6:
                    vl.showVilla();
                    System.out.println("-----------------------------------------------");
                    break;
                case 7:
                    ho.showVilla();
                    System.out.println("------------------------------------------------");
            }
            number2 = 0;
        }
    }

    public static int tinhTien(int tien, int soNgay) {
        return tien * soNgay;
    }

    public static int tinhNgay(int tienKhach, int giaPhong) {
        return tienKhach / giaPhong;
    }
}
