package com.doctorapp.repository;

import com.doctorapp.model.Doctor;
import com.doctorapp.util.DoctorDataBase;
import com.doctorapp.util.Queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
@Repository
public class DoctorRepositoryImpl implements IDoctorRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
    public DoctorRepositoryImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
    public void addDoctor(Doctor doctor) {
		Object[] doctorArray= {doctor.getDoctorName(),doctor.getSpeciality(),doctor.getExperince(),doctor.getRating(),doctor.getFees()};
		jdbcTemplate.update(Queries.INSERTQUERY,doctorArray);
    }

    @Override
    public void updateDoctor(int doctorId, double fees) {
    	jdbcTemplate.update(Queries.UPDATEQUERY,fees,doctorId);
    }

    @Override
    public void deleteDoctor(int doctorId) {
    	jdbcTemplate.update(Queries.DELETEQUERY,doctorId);
    }

    @Override
    public Doctor findById(int doctorId) {
    	Doctor doctor=jdbcTemplate.queryForObject(Queries.FINDBYID,new DoctorMapper(),doctorId);
		return doctor;
    }

    @Override
    public List<Doctor> findAll() {
    	org.springframework.jdbc.core.RowMapper<Doctor> mapper=new DoctorMapper();
		List<Doctor> doctors=jdbcTemplate.query(Queries.FINDALLQUERY, mapper);
		return doctors;
    }

    @Override
    public List<Doctor> findBySpeciality(String speciality) {
    	List<Doctor> doctors = jdbcTemplate.query(Queries.FINDBYSPECIALITY, new DoctorMapper(), speciality);
        return doctors;
        
    }

    @Override
    public List<Doctor> findBySpecialityAndNameContains(String speciality, String doctorName) {
        List<Doctor> doctors = jdbcTemplate.query(Queries.FINDBYSPECANDNAME, new DoctorMapper(), doctorName);
        return doctors;
            }

    @Override
    public List<Doctor> findBySpecialityAndExp(String speciality, int experience) {
    	List<Doctor> doctors = jdbcTemplate.query(Queries.FINDBYSPECANDEXP, new DoctorMapper(), speciality,experience);
        return doctors;
    }

    @Override
    public List<Doctor> findBySpecialityAndLessFee(String speciality, double fees) {
    	List<Doctor> doctors = jdbcTemplate.query(Queries.FINDBYSPECANDFEES, new DoctorMapper(), speciality,fees);
        return doctors;
    }

    @Override
    public List<Doctor> findBySpecialityAndRating(String speciality, int ratings) {
    	List<Doctor> doctors = jdbcTemplate.query(Queries.FINDBYSPECANDRAT, new DoctorMapper(), speciality,ratings);
        return doctors;
    }

}
