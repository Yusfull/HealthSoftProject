/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testRepository;

import javax.persistence.EntityManager;
import olsps.com.healthsoftproject.dao.AppointmentDAO;
import olsps.com.healthsoftproject.model.Appointment;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Eusuph
 */
public class testAppointmentRepo {
    
    @Autowired
    AppointmentDAO appDao;
    @Autowired
    EntityManager em;
    @Autowired
    SessionFactory session;
    
    public testAppointmentRepo() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void createAppointment() {
         Appointment appointment = new Appointment();
         try{
             em.getTransaction().begin();
         }catch(Exception ex){
             ex.printStackTrace();
         }
       
     }
}
