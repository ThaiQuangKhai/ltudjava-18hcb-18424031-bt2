/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJOS.Lop;
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
public class LopDAO {

    /**
     *
     * @param malop
     * @return
     */
    public static Lop getlop(String malop){
        Session session = Controller.getSessionFactory().openSession();
        Lop lop = null;
        try {
            lop = (Lop) session.get(Lop.class, malop);
        } catch(HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return lop;
    }

    /**
     *
     * @return
     */
    public static List<Lop> getlistlop() {
        Session session = Controller.getSessionFactory().openSession();
        List<Lop> listlop = null;
        try {
            String hql = "select l from Lop l";
            Query query = session.createQuery(hql);
            listlop = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return listlop;
    }

    /**
     *
     * @param l
     * @return
     */
    public static boolean createlop(Lop l) {
        Session session = Controller.getSessionFactory().openSession();
        if (LopDAO.getlop(l.getMalop())!= null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(l);
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
