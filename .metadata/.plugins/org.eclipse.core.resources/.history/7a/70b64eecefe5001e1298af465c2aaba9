package org.doctorapp.repository;

import org.doctorapp.model.Doctor;

import java.util.List;

public interface IDoctorRepository {
    void  addDoctor(Doctor doctor);
    void  updateDoctor(int DoctorId,double doctor);
    void  deleteDoctor(int DoctorId );
    Doctor findById(int doctorId);
    List<Doctor>findAll();

    List<Doctor> findAll(String speciality);
    List<Doctor> findBySpeciality(String speciality);
    List<Doctor> findBySpecialityAndExp(String speciality,int experience);
    List<Doctor> findBySpecialityAndLessFee(String speciality,double fees);
    List<Doctor> findBySpecialityAndRating(String speciality,int ratings);
    List<Doctor> findBySpecialityAndNameContains(String speciality,String doctorName);
}
