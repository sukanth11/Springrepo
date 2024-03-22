package org.doctorapp.client;

import org.doctorapp.model.Doctor;
import org.doctorapp.model.Specialization;
import org.doctorapp.service.DoctorServiceImpl;
import org.doctorapp.service.IDoctorService;

public class Client {
    public static void main(String[] args) {
        IDoctorService doctorService=new DoctorServiceImpl();

        Specialization specialization=Specialization.gyna;
        String speciality=specialization.getSpeciality();

//        String speciality=Specialization .gyna.getSpeciality();

//        Doctor doctor=new Doctor("sukanth",speciality,5000,9,5);
//        doctorService.addDoctor(doctor);

        doctorService.updateDoctor(1,5000);
    }
}
