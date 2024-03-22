package org.doctorapp.service;

import org.doctorapp.exception.DoctorNotFoundException;
import org.doctorapp.exception.IdNotFoundException;
import org.doctorapp.model.Doctor;
import org.doctorapp.repository.DoctorRepositoryImpl;
import org.doctorapp.repository.IDoctorRepository;

import java.util.Collections;
import java.util.List;

public class DoctorServiceImpl implements IDoctorService {

    private IDoctorRepository doctorRepository=new DoctorRepositoryImpl();
    @Override
    public void addDoctor(Doctor doctor) {
        doctorRepository.addDoctor(doctor);
    }

    @Override
    public void updateDoctor(int doctorId, double fees) {
        doctorRepository.updateDoctor(doctorId,fees);
    }

    @Override
    public void deleteDoctor(int doctorId) {
        doctorRepository.deleteDoctor(doctorId);
    }

    @Override
    public Doctor getById(int doctorId) throws IdNotFoundException {
        Doctor doctor = doctorRepository.findById(doctorId);
        if(doctor==null) {
            throw new IdNotFoundException("Invalid ID");
        }
        return doctor;
    }

    @Override
    public List<Doctor> getAll() {
        List<Doctor> doctors = doctorRepository.findAll();
        return doctors;
    }

    @Override
    public List<Doctor> getAll(String speciality) throws DoctorNotFoundException {
        return null;
    }

    @Override
    public List<Doctor> getBySpeciality(String speciality) throws DoctorNotFoundException {
        List<Doctor> doctors = doctorRepository.findBySpeciality(speciality);
        if (doctors.isEmpty()) {

            throw new DoctorNotFoundException("Doctor with this speciality not found");
        }
        Collections.sort(doctors,(d1, d2)->d1.getDoctorName().compareTo(d2.getDoctorName()));
        return doctors;
    }


    @Override
    public List<Doctor> getBySpecialityAndExp(String speciality, int experience) throws DoctorNotFoundException {
        List<Doctor> doctors = doctorRepository.findBySpecialityAndExp(speciality,experience);
        if (doctors.isEmpty()) {
            throw new DoctorNotFoundException("Doctor with this speciality and exp not found");
        }
        Collections.sort(doctors,(d1,d2)-> ((Integer)(d2.getExperince())).compareTo(d1.getExperince()));
        return doctors;
    }

    @Override
    public List<Doctor> getBySpecialityAndLessFee(String speciality, double fees) throws DoctorNotFoundException {
        List<Doctor> doctors = doctorRepository.findBySpecialityAndLessFee(speciality, fees);
        if (doctors.isEmpty())
            throw new DoctorNotFoundException("doctor with this speciality and fees not found");
        Collections.sort(doctors, (d1,d2)-> ((Double)(d1.getFees())).compareTo(d2.getFees()));
        return doctors;
    }

    @Override
    public List<Doctor> getBySpecialityAndRating(String speciality, int ratings) throws DoctorNotFoundException {
        List<Doctor> doctors = doctorRepository.findBySpecialityAndRating(speciality, ratings);
        if (doctors.isEmpty())
            throw new DoctorNotFoundException("doctor with this speciality and ratings not found");
        Collections.sort(doctors, (d1,d2)-> ((Integer)(d1.getRating())).compareTo(d1.getRating()));
        return doctors;
    }

    @Override
    public List<Doctor> getBySpecialityAndNameContains(String speciality, String doctorName) throws DoctorNotFoundException {
        List<Doctor> doctors = doctorRepository.findBySpecialityAndNameContains(speciality, doctorName);
        if (doctors.isEmpty()) {
            throw new DoctorNotFoundException("doctor with this speciality and exp not found");
        }
        Collections.sort(doctors,(d1,d2)-> (d2.getDoctorName().compareTo(d2.getDoctorName())));
        return doctors;
    }

}
