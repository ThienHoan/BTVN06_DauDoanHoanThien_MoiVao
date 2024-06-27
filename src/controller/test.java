/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import model.Nguoi;
import model.KhachSan;
/**
 *
 * @author hoan6
 */
public class test {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Nguoi> nguoi = new ArrayList<>();
    
    
    public static void main(String[] args) {
         while (true) {
            System.out.println("*****Menu*****");
            System.out.println("1. Them Khach Hang");
            System.out.println("2. Xoa Khach hang theo cmnd");
            System.out.println("3. Tinh Tien");
            System.out.println("4. Quit");
            System.out.println("Moi ban chon: ");

            int choice;
            try {
                choice = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Vui long nhap tu 1...3");
                sc.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    addKH();
                    break;
                case 2:
                    rmHK();
                    break;
                case 3: 
                    tinhTien();
                    break;
                case 4:
                    System.out.println("Hen gap lai.");
                    break;

            }
            if (choice == 4) {
                break;
            }
        }
    }
    
    public static void addKH(){
        System.out.println("Moi ban nhap ten: ");
        String name = sc.nextLine();
        System.out.println("Moi ban nhap tuoi: ");
        int tuoi = Integer.parseInt(sc.nextLine());
        System.out.println("Moi ban nhap cmnd: ");
        int cmnd = Integer.parseInt(sc.nextLine());
        
        Nguoi themKH = new Nguoi(name, tuoi, cmnd);
        nguoi.add(themKH);
        System.out.println("Them Thanh Cong.");
    }
    
    public static void rmHK(){
        for (Nguoi nguoi1 : nguoi) {
            System.out.println(nguoi1);
        }
        System.out.println("Nhap cmnd nguoi ban muon xoa: ");
        int rm = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < nguoi.size(); i++) {
                if(nguoi.get(i).equals(rm))
                    nguoi.remove(rm);
        }
    }
    
    public static void tinhTien(){
        for (Nguoi nguoi1 : nguoi) {
            System.out.println(nguoi1);
        }
        System.out.println("Moi ban nhap cmnd KH can Thanh Toan: ");
        int cmnd = Integer.parseInt(sc.nextLine());
        System.out.println("Moi ban nhap soNgay: ");
        int soNgay = Integer.parseInt(sc.nextLine());
        System.out.println("Loai phong: A, B, C");
        String loaiPhong = sc.nextLine();
        KhachSan kS = new KhachSan(soNgay);
        switch(loaiPhong){
            case "A": 
                int tienA = KhachSan.phongA * soNgay;
                System.out.println("So tien can phai Thanh Toan la: " + tienA);
                break;
            case "B":
                int tienB = KhachSan.phongB * soNgay;
                System.out.println("So tien can phai Thanh Toan la: " + tienB);
                break;
            case "C":
                int tienC = KhachSan.phongB * soNgay;
                System.out.println("So tien can phai Thanh Toan la: " + tienC);
                break;
        }
        
    }
    
    
}
