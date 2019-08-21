/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJOS.Mon;
import connection.Controller;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author DELL
 */
public class MonDAO {
    public static Mon getmon(String mamon){
        Session session = Controller.getSessionFactory().openSession();
        Mon mon = null;
        try {
            mon = (Mon) session.get(Mon.class, mamon);
        } catch(HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return mon;
    }

    /**
     *
     * @return
     */
    public static List<Mon> getlistmon() {
        Session session = Controller.getSessionFactory().openSession();
        List<Mon> listmon = null;
        try {
            String hql = "select m from Mon m";
            Query query = session.createQuery(hql);
            listmon = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return listmon;
    }
    
    public static boolean createmon(Mon m) {
        Session session = Controller.getSessionFactory().openSession();
        if (MonDAO.getmon(m.getMamon())!= null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(m);
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
