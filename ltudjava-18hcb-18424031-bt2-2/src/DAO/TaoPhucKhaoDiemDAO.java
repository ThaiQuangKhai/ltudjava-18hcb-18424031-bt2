/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJOS.Taophuckhaodiem;
import connection.Controller;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
/**
 *
 * @author DELL
 */
public class TaoPhucKhaoDiemDAO {
    
    public static Taophuckhaodiem getpk() {
        Session session = Controller.getSessionFactory().openSession();
        Taophuckhaodiem pk = null;
        try {
            String hql = "from Taophuckhaodiem where id = (select max(pk.id) from Taophuckhaodiem pk)";
            //from Person where person.id = (select max(id) from Person)
            Query query = session.createQuery(hql);
            pk = (Taophuckhaodiem) query.uniqueResult();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return pk;
    }
    
    public static List<Taophuckhaodiem> gettaopk() {
        Session session = Controller.getSessionFactory().openSession();
        List<Taophuckhaodiem> list = null;
        try {
            String hql = "select pk from Taophuckhaodiem pk";
            Query query = session.createQuery(hql);
            list = query.list();
        } catch(HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return list;
    }

    /**
     *
     * @param a
     * @return
     */
    
    public static boolean createtpkd(Taophuckhaodiem a) {
        boolean kq;
        Session session = Controller.getSessionFactory().openSession();
        //SessionFactory sf = Controller.getSessionFactory();
        //Session session = sf.getCurrentSession();
        Transaction trans = session.getTransaction();
        try {
            trans.begin();
            session.save(a);
            trans.commit();
            kq=true;
        } catch (Exception ex) {
            kq = false;
            System.out.println(ex.getMessage());
        } finally {
            session.close();
        }
        return kq;
    }
}
