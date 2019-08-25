/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJOS.Account;
import org.hibernate.Session;
import connection.Controller;
import org.hibernate.HibernateException;
import org.hibernate.Transaction;

/**
 *
 * @author DELL
 */
public class AccountDAO {

    /**
     *
     * @param userName
     * @return
     */
    public static Account getAccount(String userName) {
        Session session = Controller.getSessionFactory().openSession();
        Account account = null;
        try {
            account = (Account) session.get(Account.class, userName);
        } catch(HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return account;
    }

    /**
     *
     * @param a
     * @return
     */
    public static boolean updateAccount(Account a) {
        Session session = Controller.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            
            transaction = session.beginTransaction();
            session.update(a);
            transaction.commit();
        } catch(HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
    
    public static boolean createaccount(Account a) {
        Session session = Controller.getSessionFactory().openSession();
        if (AccountDAO.getAccount(a.getUser())!= null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(a);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
}
