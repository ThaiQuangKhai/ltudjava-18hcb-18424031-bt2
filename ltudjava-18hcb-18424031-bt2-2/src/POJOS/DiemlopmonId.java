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
public class DiemlopmonId  implements java.io.Serializable {


     private String malop;
     private String mamon;
     private String mssv;

    public DiemlopmonId() {
    }

    public DiemlopmonId(String malop, String mamon, String mssv) {
       this.malop = malop;
       this.mamon = mamon;
       this.mssv = mssv;
    }
   
    public String getMalop() {
        return this.malop;
    }
    
    public void setMalop(String malop) {
        this.malop = malop;
    }
    public String getMamon() {
        return this.mamon;
    }
    
    public void setMamon(String mamon) {
        this.mamon = mamon;
    }
    public String getMssv() {
        return this.mssv;
    }
    
    public void setMssv(String mssv) {
        this.mssv = mssv;
    }
}


