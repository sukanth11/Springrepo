package org.doctorapp.util;

public class Queries {
    public static final String INSERTQUERY=
            "insert into doctor(doctor_name,speciality,experience,rating,fees) values(?,?,?,?,?);";

    public static final String UPDATEQUERY=
            "update doctor set fees=? where doctor_id=?;";

    public static final String DELETEQUERY=
            "delete from doctor where doctor_id=?;";

    public static final String FINDALLQUERY=
            "select * from doctor;";

    public static final String FINDBYSPECIALITY=
            "select * from doctor where speciality=?;";

    public static final String FINDBYSPECANDEXP=
            "select * from doctor where speciality=? and experience>=?;";

    public static final String FINDBYSPECANDRAT=
            "select * from doctor where speciality=? and rating>=?;";

    public static final String FINDBYSPECANDFEES=
            "select * from doctor where speciality=? and fees<=?;";

    public static final String FINDBYSPECANDNAME=
            "select * from doctor where speciality=? and doctor_name like ?;";

    public static final String FINDBYID=
            "select * from doctor where doctor_id=?;";

}
