/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJOS.DiemlopmonId;
import POJOS.Diemlopmon;
import POJOS.SinhVien;
import DAO.DiemLopMonDAO;
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
public class DiemLopMonDAO {
    public static Diemlopmon getlopmonsv(String malop, String mamon, String mssv) {
        Session session = Controller.getSessionFactory().openSession();

        Diemlopmon lopmonsv = null;
        try {
            String hql = "select lmsv from Diemlopmon lmsv where lmsv.malop='"+malop+"' and lmsv.mamon='"+mamon+"' and lmsv.mssv='"+mssv+"'";
            Query query = session.createQuery(hql);
            lopmonsv = (Diemlopmon) query.uniqueResult();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return lopmonsv;
    }
    
    
    public static List<SinhVien> getlistsvlopmon(String malop, String mamon) {
        Session session = Controller.getSessionFactory().openSession();
        List<SinhVien> listsv = null;
        try {
            //String hql = "from Diemlopmon lmsv, SinhVien sv";
            //String hql = "from Diemlopmon lmsv, SinhVien sv where lmsv.malop='"+malop+"' and lmsv.mamon='"+mamon+"' and sv.mssv=lmsv.mssv";
            String hql = "select sv from Diemlopmon lmsv, SinhVien sv where lmsv.id.malop='"+malop+"' and lmsv.id.mamon='"+mamon+"' and sv.mssv=lmsv.id.mssv";
            Query query = session.createQuery(hql);
            listsv = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return listsv;
    }
    
    public static List<Object[]> getlistdiemlopmon(String malop, String mamon) {
        Session session = Controller.getSessionFactory().openSession();
        List<Object[]> listsv = null;
        try {
            //String hql = "from Diemlopmon lmsv, SinhVien sv";
            //String hql = "from Diemlopmon lmsv, SinhVien sv where lmsv.malop='"+malop+"' and lmsv.mamon='"+mamon+"' and sv.mssv=lmsv.mssv";
            String hql = "select dlm.id.mssv, sv.hoten, dlm.diemgk, dlm.diemck, dlm.diemkhac, dlm.diemtong from Diemlopmon dlm, SinhVien sv where dlm.id.malop='"+malop+"' and dlm.id.mamon='"+mamon+"' and dlm.id.mssv=sv.mssv";
            Query query = session.createQuery(hql);
            listsv = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return listsv;
    }
    
    public static List<Object[]> getlistdiemsv(String mssv) {
        Session session = Controller.getSessionFactory().openSession();
        List<Object[]> listsv = null;
        try {
            
            String hql = "select dlm.id.malop, dlm.id.mamon, m.tenmon, dlm.diemgk, dlm.diemck, dlm.diemkhac, dlm.diemtong from Diemlopmon dlm, Mon m where dlm.id.mssv='"+mssv+"' and dlm.id.mamon=m.mamon";
            Query query = session.createQuery(hql);
            listsv = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return listsv;
    }
    
    public static boolean create(Diemlopmon dlm) {
        Session session = Controller.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(dlm);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
    
    public static boolean update(Diemlopmon dlm) {
        Session session = Controller.getSessionFactory().openSession();
        if(DiemLopMonDAO.getid(dlm) == null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(dlm);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
    
    public static boolean ktid(Diemlopmon dlm) {
        Session session = Controller.getSessionFactory().openSession();
        if(DiemLopMonDAO.getid(dlm) == null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(dlm);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
    
    public static Diemlopmon getid(Diemlopmon dlm) {
        Session session = Controller.getSessionFactory().openSession();
        Diemlopmon lopmonsv = null;
        try {
            String hql = "select lmsv from Diemlopmon lmsv where lmsv.id.malop='"+dlm.getId().getMalop()+"' and lmsv.id.mamon='"+dlm.getId().getMamon()+"' and lmsv.id.mssv='"+dlm.getId().getMssv()+"'";
            Query query = session.createQuery(hql);
            lopmonsv = (Diemlopmon) query.uniqueResult();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return lopmonsv;
    }
    
    public static boolean delete(String malop, String maon, String mssv) {
        Session session = Controller.getSessionFactory().openSession();
        Transaction transaction = session.getTransaction();
        try {
            String hql = "delete lmsv from Diemlopmon lmsv where lmsv.id.malop='"+malop+"' and lmsv.id.mamon='"+maon+"' and lmsv.id.mssv='"+mssv+"'";
            Query query = session.createQuery(hql);
            query.executeUpdate();
            transaction.commit();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
}
