/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package olsps.com.healthsoftproject.dao;

import java.util.List;
import olsps.com.healthsoftproject.model.Patient;

/**
 *
 * @author Eusuph
 */

public interface PatientDAO {
    
        public List<Patient> list();
	
	public Patient getPatientByID(int id);
	
	public void saveOrUpdate(Patient patient);
	
	public void deletePatient(int id);
    
}
