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
public class Mon  implements java.io.Serializable {


     private String mamon;
     private String tenmon;

    public Mon() {
    }

	
    public Mon(String mamon) {
        this.mamon = mamon;
    }
    public Mon(String mamon, String tenmon) {
       this.mamon = mamon;
       this.tenmon = tenmon;
    }
   
    public String getMamon() {
        return this.mamon;
    }
    
    public void setMamon(String mamon) {
        this.mamon = mamon;
    }
    public String getTenmon() {
        return this.tenmon;
    }
    
    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }




}


