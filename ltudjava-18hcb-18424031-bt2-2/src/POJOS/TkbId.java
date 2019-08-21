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
public class TkbId  implements java.io.Serializable {


     private String malop;
     private String mamon;

    public TkbId() {
    }

    public TkbId(String malop, String mamon) {
       this.malop = malop;
       this.mamon = mamon;
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


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TkbId) ) return false;
		 TkbId castOther = ( TkbId ) other; 
         
		 return ( (this.getMalop()==castOther.getMalop()) || ( this.getMalop()!=null && castOther.getMalop()!=null && this.getMalop().equals(castOther.getMalop()) ) )
 && ( (this.getMamon()==castOther.getMamon()) || ( this.getMamon()!=null && castOther.getMamon()!=null && this.getMamon().equals(castOther.getMamon()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getMalop() == null ? 0 : this.getMalop().hashCode() );
         result = 37 * result + ( getMamon() == null ? 0 : this.getMamon().hashCode() );
         return result;
   }   


}


