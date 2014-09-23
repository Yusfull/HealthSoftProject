/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package olsps.com.healthsoftproject.dao;

import java.util.List;
import olsps.com.healthsoftproject.model.Doctor;



/**
 *
 * @author Eusuph
 */
public interface DoctorDAO {
       
        public List<Doctor> list();
	
	public  Doctor getDoctorByID(int id);
	
	public void saveOrUpdate( Doctor  doctor);
	
	public void deletePatient(int id);
    
}
