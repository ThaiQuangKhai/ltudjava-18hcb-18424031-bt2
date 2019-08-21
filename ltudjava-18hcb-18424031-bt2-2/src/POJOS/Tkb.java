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
public class Tkb  {//implements java.io.Serializable {


     private TkbId id;
     private String tenmon;
     private String phong;

    public Tkb() {
    }

	
    public Tkb(TkbId id) {
        this.id = id;
    }
    public Tkb(TkbId id, String tenmon, String phong) {
       this.id = id;
       this.tenmon = tenmon;
       this.phong = phong;
    }
   
    public TkbId getId() {
        return this.id;
    }
    
    public void setId(TkbId id) {
        this.id = id;
    }
    public String getTenmon() {
        return this.tenmon;
    }
    
    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }
    public String getPhong() {
        return this.phong;
    }
    
    public void setPhong(String phong) {
        this.phong = phong;
    }
}


