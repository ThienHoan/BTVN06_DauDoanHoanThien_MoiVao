/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

/**
 *
 * @author hoan6
 */
public class Nguoi {
    private String name ;
    private int tuoi,cmnd;

    public Nguoi(String name, int tuoi, int cmnd) {
        this.name = name;
        this.cmnd = cmnd;
        this.tuoi = tuoi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "Khach Hang: " + "name = " + name  + ", tuoi = " + tuoi +  ", cmnd = " + cmnd ;
    }
    
    
}
