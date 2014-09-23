/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package olsps.com.healthsoftproject.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Eusuph
 */
@Entity
@Table(name = "APPOINTMENT")
@NamedQueries({
    @NamedQuery(name = "Appointment.findAll", query = "SELECT a FROM Appointment a"),
    @NamedQuery(name = "Appointment.findByApptno", query = "SELECT a FROM Appointment a WHERE a.apptno = :apptno"),
    @NamedQuery(name = "Appointment.findByDate", query = "SELECT a FROM Appointment a WHERE a.date = :date"),
    @NamedQuery(name = "Appointment.findByTime", query = "SELECT a FROM Appointment a WHERE a.time = :time")})
public class Appointment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "APPTNO")
    private Integer apptno;
    @Column(name = "DATE")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Column(name = "TIME")
    @Temporal(TemporalType.TIME)
    private Date time;
    @JoinColumn(name = "PATIENTNO", referencedColumnName = "PATIENTNO")
    @ManyToOne
    private Patient patientno;
    @JoinColumn(name = "DOCTORID", referencedColumnName = "DOCTORID")
    @ManyToOne
    private Doctor doctorid;

    public Appointment() {
    }

    public Appointment(Integer apptno) {
        this.apptno = apptno;
    }

    public Integer getApptno() {
        return apptno;
    }

    public void setApptno(Integer apptno) {
        this.apptno = apptno;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Patient getPatientno() {
        return patientno;
    }

    public void setPatientno(Patient patientno) {
        this.patientno = patientno;
    }

    public Doctor getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(Doctor doctorid) {
        this.doctorid = doctorid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (apptno != null ? apptno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Appointment)) {
            return false;
        }
        Appointment other = (Appointment) object;
        if ((this.apptno == null && other.apptno != null) || (this.apptno != null && !this.apptno.equals(other.apptno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "olsps.com.healthsoftproject.model.Appointment[ apptno=" + apptno + " ]";
    }
    
}
