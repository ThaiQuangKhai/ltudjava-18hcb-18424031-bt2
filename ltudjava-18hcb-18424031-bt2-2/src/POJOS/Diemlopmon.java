/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJOS;

/**
 *
 * @author DELL
 */
public class Diemlopmon  implements java.io.Serializable {


     private DiemlopmonId id;
     private Float diemgk;
     private Float diemck;
     private Float diemkhac;
     private Float diemtong;

    public Diemlopmon() {
    }

	
    public Diemlopmon(DiemlopmonId id) {
        this.id = id;
    }
    public Diemlopmon(DiemlopmonId id, Float diemgk, Float diemck, Float diemkhac, Float diemtong) {
       this.id = id;
       this.diemgk = diemgk;
       this.diemck = diemck;
       this.diemkhac = diemkhac;
       this.diemtong = diemtong;
    }
   
    public DiemlopmonId getId() {
        return this.id;
    }
    
    public void setId(DiemlopmonId id) {
        this.id = id;
    }
    public Float getDiemgk() {
        return this.diemgk;
    }
    
    public void setDiemgk(Float diemgk) {
        this.diemgk = diemgk;
    }
    public Float getDiemck() {
        return this.diemck;
    }
    
    public void setDiemck(Float diemck) {
        this.diemck = diemck;
    }
    public Float getDiemkhac() {
        return this.diemkhac;
    }
    
    public void setDiemkhac(Float diemkhac) {
        this.diemkhac = diemkhac;
    }
    public Float getDiemtong() {
        return this.diemtong;
    }
    
    public void setDiemtong(Float diemtong) {
        this.diemtong = diemtong;
    }




}


