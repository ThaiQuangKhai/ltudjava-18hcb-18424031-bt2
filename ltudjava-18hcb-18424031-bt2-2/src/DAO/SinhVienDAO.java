/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJOS.SinhVien;
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
public class SinhVienDAO {

    /**
     *
     * @param maStudent
     * @return
     */
    public static SinhVien getSinhVien(String maStudent) {
        Session session = Controller.getSessionFactory().openSession();

        SinhVien sv = null;
        try {
            sv = (SinhVien) session.get(SinhVien.class, maStudent);
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }

        return sv;
    }

    /**
     *
     * @param sv
     * @return
     */
    public static boolean createSinhVien(SinhVien sv) {
        Session session = Controller.getSessionFactory().openSession();

        if (SinhVienDAO.getSinhVien(sv.getMssv()) != null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(sv);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }

        return true;
    }
    
    /**
     *
     * @param malop
     * @return
     */
    public static List<SinhVien> getlistsv(String malop) {
        Session session = Controller.getSessionFactory().openSession();
        List<SinhVien> listsv = null;
        try {
            //String hql1 = "select sv from SinhVien sv where sv.malop='17HCB'";
            //String hql = "from sinhvien sv where sv.MALOP= '" +malop +"'";
            //System.out.println(hql);
            String hql = "from SinhVien sv where sv.malop = '"+malop+"'";
            Query query = session.createQuery(hql);
            //listsv = (List<SinhVien>) session.createQuery(hql);
            //query.setParameter("malop", malop);
            listsv = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return listsv;
    }
    

//
//    public static boolean updateStudent(Student st) {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//
//        if (StudentDAO.getStudent(st.getMaStudent()) == null) {
//            return false;
//        }
//
//        Transaction transaction = null;
//        try {
//            transaction = session.beginTransaction();
//            session.update(st);
//            transaction.commit();
//        } catch (HibernateException ex) {
//            transaction.rollback();
//            System.err.println(ex);
//        } finally {
//            session.close();
//        }
//
//        return true;
//    }
//
    public static boolean deletesvlop(String maStudent) {
        Session session = Controller.getSessionFactory().openSession();
        SinhVien sv = SinhVienDAO.getSinhVien(maStudent);
        if (sv == null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(sv);
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
