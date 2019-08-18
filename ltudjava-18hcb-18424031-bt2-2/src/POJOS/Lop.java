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
public class Lop {
    private String malop;
    private String tenlop;

    public Lop() {
    }
    public Lop(String malop) {
        this.malop = malop;
    }
    public Lop(String malop, String tenlop) {
       this.malop = malop;
       this.tenlop = tenlop;
    }
   
    public String getMalop() {
        return this.malop;
    }
    
    public void setMalop(String malop) {
        this.malop = malop;
    }
    public String getTenlop() {
        return this.tenlop;
    }
    
    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }
}
