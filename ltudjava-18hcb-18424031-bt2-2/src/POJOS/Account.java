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
public class Account {
    private String user;
    private String password;

    /**
     *
     */
    public Account(){
        
    }

    /**
     *
     * @param user
     */
    public Account(String user){
        this.user = user;
    }

    /**
     *
     * @param user
     * @param password
     */
    public Account(String user,String password){
        this.user=user;
        this.password=password;
    }   

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
