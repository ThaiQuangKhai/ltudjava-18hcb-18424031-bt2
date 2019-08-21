/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJOS.Tkb;
import POJOS.TkbId;
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
public class TkbDAO {
    public static List<Tkb> getlisttkb(String malop){
        Session session = Controller.getSessionFactory().openSession();
        List<Tkb> listtkb = null;
        try {
            String hql = "from Tkb t where t.id.malop='"+malop+"'";
            //String hql = "select t from Tkb t where t.id.malop='"+malop+"'";
            //String hql = "select new POJOS.TkbId(t.malop)from Tkb t";
            Query query = session.createQuery(hql);
            listtkb = query.list();
        } catch(HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return listtkb;
    }

    /**
     *
     * @return
     */
    
    public static boolean createtkb(Tkb t) {
        Session session = Controller.getSessionFactory().openSession();
        TkbId id;
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(t);
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
