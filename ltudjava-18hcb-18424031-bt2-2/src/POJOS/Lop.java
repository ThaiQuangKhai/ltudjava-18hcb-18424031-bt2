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

    /**
     *
     */
    public Lop() {
    }

    /**
     *
     * @param malop
     */
    public Lop(String malop) {
        this.malop = malop;
    }

    /**
     *
     * @param malop
     * @param tenlop
     */
    public Lop(String malop, String tenlop) {
       this.malop = malop;
       this.tenlop = tenlop;
    }
   
    /**
     *
     * @return
     */
    public String getMalop() {
        return this.malop;
    }
    
    /**
     *
     * @param malop
     */
    public void setMalop(String malop) {
        this.malop = malop;
    }

    /**
     *
     * @return
     */
    public String getTenlop() {
        return this.tenlop;
    }
    
    /**
     *
     * @param tenlop
     */
    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }
}
