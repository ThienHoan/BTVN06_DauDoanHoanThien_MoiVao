/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author hoan6
 */
public class KhachSan {
    private int soNgayThue;
    public static final int phongA = 500;
    public static final int phongB = 300;
    public static final int phongC = 100;
    //ArrayList<KhachSan> kS = new ArrayList<>();

    public KhachSan(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    @Override
    public String toString() {
        return  "soNgayThue=" + soNgayThue ;
    }
    
//    public void hangPhong(){
//        System.out.println("Hang A");
//        kS.add(phongA);
//        System.out.println("Hang B");
//        System.out.println("Hang C");
//        
//        
//        
//    }
    
}
