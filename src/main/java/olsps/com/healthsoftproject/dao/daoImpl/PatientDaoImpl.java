/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olsps.com.healthsoftproject.dao.daoImpl;

import java.util.List;
import olsps.com.healthsoftproject.dao.PatientDAO;
import olsps.com.healthsoftproject.model.Patient;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Eusuph
 */

@Repository
public class PatientDaoImpl implements PatientDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public PatientDaoImpl() {
    }

    public PatientDaoImpl(SessionFactory session) {
        this.sessionFactory = session;
    }

    @Override
    @Transactional
    public List<Patient> list() {
        
        @SuppressWarnings("unchecked")
        List<Patient> patientList = sessionFactory.openSession()
                .createCriteria(Patient.class)
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
        return patientList;

    }

    @Override
    public Patient getPatientByID(int id) {
        Session session = sessionFactory.openSession();
        Patient patient = (Patient)session.load(Patient.class,id);
        return patient;
    }

    @Override
    public void saveOrUpdate(Patient patient) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(patient);
        tx.commit();
       
    }

    @Override
    public void deletePatient(int id) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Patient patient = (Patient)session.load(Patient.class,id);
        session.delete(patient);
        tx.commit();
        session.close();
             
    }

}
