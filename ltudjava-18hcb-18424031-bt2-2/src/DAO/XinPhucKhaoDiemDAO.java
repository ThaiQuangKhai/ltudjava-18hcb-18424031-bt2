/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import connection.Controller;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import POJOS.Xinphuckhaodiem;
import POJOS.Taophuckhaodiem;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author DELL
 */
public class XinPhucKhaoDiemDAO {
    
    public static boolean create(Xinphuckhaodiem a) {
        Session session = Controller.getSessionFactory().openSession();
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
    
    public static boolean createtpkd(Xinphuckhaodiem a) {
        boolean kq;
        Session session = Controller.getSessionFactory().openSession();
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
    
    public static boolean updatetinhtran(int id, String mssv, String mamon, String malop, int tt) {
        Session session = Controller.getSessionFactory().openSession();
        Transaction transaction = session.getTransaction();
        try {
            transaction.begin();
            String hql = "update Xinphuckhaodiem set tinhtrang = "+tt+" where id.id="+id+" and id.mamon='"+mamon+"' and id.mssv='"+mssv+"' and id.malop='"+malop+"'";
            Query query = session.createQuery(hql);
            query.executeUpdate();
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
    
    public static List<Xinphuckhaodiem> getlistxinpk(Integer id) {
        Session session = Controller.getSessionFactory().openSession();
        List<Xinphuckhaodiem> list = null;
        try {
            String hql = "select pk from Xinphuckhaodiem pk where pk.id.id="+id;
            Query query = session.createQuery(hql);
            list = query.list();
        } catch(HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return list;
    }
}
