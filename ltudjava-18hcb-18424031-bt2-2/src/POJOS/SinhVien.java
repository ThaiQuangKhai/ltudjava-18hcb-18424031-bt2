/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJOS;
import java.io.*;

/**
 *
 * @author DELL
 */
public class SinhVien implements Serializable{
    private static final long serialVersionUID = 1L;
    private String mssv;
    private String hoten;
    private String gt;
    private String cmnd;
    private String malop;

    /**
     *
     */
    public SinhVien(){
        
    }

    /**
     *
     * @param mssv
     */
    public SinhVien(String mssv){
        this.mssv = mssv;
    }

    /**
     *
     * @param mssv
     * @param hoten
     * @param gt
     * @param cmnd
     * @param malop
     */
    public SinhVien(String mssv,String hoten,String gt,String cmnd,String malop){
        this.mssv=mssv;
        this.hoten=hoten;
        this.gt=gt;
        this.cmnd=cmnd;
        this.malop=malop;
    }   

    /**
     * @return the mssv
     */
    public String getMssv() {
        return mssv;
    }

    /**
     * @param mssv the mssv to set
     */
    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    /**
     * @return the hoten
     */
    public String getHoten() {
        return hoten;
    }

    /**
     * @param hoten the hoten to set
     */
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    /**
     * @return the gt
     */
    public String getGt() {
        return gt;
    }

    /**
     * @param gt the gt to set
     */
    public void setGt(String gt) {
        this.gt = gt;
    }

    /**
     * @return the cmnd
     */
    public String getCmnd() {
        return cmnd;
    }

    /**
     * @param cmnd the cmnd to set
     */
    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    /**
     * @return the malop
     */
    public String getMalop() {
        return malop;
    }

    /**
     * @param malop the malop to set
     */
    public void setMalop(String malop) {
        this.malop = malop;
    }
}
