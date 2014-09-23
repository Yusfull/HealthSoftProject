/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package olsps.com.healthsoftproject.controller;

import java.util.List;
import olsps.com.healthsoftproject.model.Patient;
import olsps.com.healthsoftproject.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Eusuph
 */
@Controller
public class homeController {
    
    @Autowired
    private PatientService patientService;
    
    @RequestMapping("/")
    public String getHome()throws Exception{
       return  "home";       
    }
       
    @RequestMapping(value = "/dash", method = RequestMethod.GET)
    public ModelAndView getDashBoard(){
       List<Patient> patientList = patientService.list();
        ModelAndView model = new ModelAndView("dashBoard");
        model.addObject("dashBoard", patientList);
        return model;
    }
    
    @ModelAttribute("patient")
    @RequestMapping(value = "/addPatient",method = RequestMethod.POST)
    public  ModelAndView addPatientData(@ModelAttribute("patient") Patient patient, BindingResult result){
        patientService.saveOrUpdate(patient);
        return new ModelAndView("dash");
        
    }
}
