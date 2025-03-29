package com.mycompany.hastaneotomasyonu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HospitalDB {

    private static final String connectionString = "jdbc:mysql://127.0.0.1:3306/hospital_db?user=root&password=m0rfeus123";
    private static Connection conn;
    public static User currentUser = null;

    public static boolean addUser(Appointment appointment) {// Kullanıcı ekleme
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "INSERT INTO hospital_db.tbl_randevu (name_surname, clinic, doctor, date, appointment_time, email) VALUES ('"
                    + appointment.nameSurname + "','"
                    + appointment.clinic + "','"
                    + appointment.doctor + "','"
                    + appointment.date + "','"
                    + appointment.appointmentTime + "','"
                    + currentUser.email + "');";

            stmt.executeUpdate(query);
            conn.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(HospitalDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static ArrayList<Appointment> searchByName(String name) {// İsimle randevu arama
        ArrayList<Appointment> appointmentList = new ArrayList<>();
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM hospital_db.tbl_randevu WHERE name_surname LIKE '%" + name + "%'";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                Appointment appointment = new Appointment();
                appointment.id = rs.getInt("id");
                appointment.nameSurname = rs.getString("name_surname");
                appointment.doctor = rs.getString("doctor");
                appointment.clinic = rs.getString("clinic");
                appointment.date = rs.getString("date");
                appointment.appointmentTime = rs.getString("appointment_time");
                appointmentList.add(appointment);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ex.getMessage()).log(Level.SEVERE, null, ex);
        }
        return appointmentList;
    }


    public static boolean deleteById(int id) {// Randevu silme
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "DELETE FROM hospital_db.tbl_randevu WHERE id=" + id;

            stmt.executeUpdate(query);
            conn.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(HospitalDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static boolean updateUser(Appointment appointment) {// Randevu güncelleme
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "UPDATE hospital_db.tbl_randevu SET name_surname = '" + appointment.nameSurname
                    + "', doctor = '" + appointment.doctor
                    + "', clinic = '" + appointment.clinic
                    + "', date = '" + appointment.date
                    + "', appointment_time = '" + appointment.appointmentTime
                    + "' WHERE id = " + appointment.id + ";";

            stmt.executeUpdate(query);
            conn.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(HospitalDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static boolean createAppointment(Appointment appointment) {// Randevu oluşturma
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();

            String query = "INSERT INTO hospital_db.tbl_randevu (name_surname, clinic, doctor, date, appointment_time, email) VALUES ('"
                    + appointment.nameSurname + "','"
                    + appointment.clinic + "','"
                    + appointment.doctor + "','"
                    + appointment.date + "','"
                    + appointment.appointmentTime + "','"
                    + currentUser.email + "');";

            stmt.executeUpdate(query);
            conn.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ex.getMessage()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static User login(String email, String password) {// Kullanıcı girişi
        currentUser = null;
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM hospital_db.tbl_user WHERE email='" + email + "' AND password='" + password + "';";
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                currentUser = new User();
                currentUser.user_id = rs.getInt("id");
                currentUser.name_surname = rs.getString("name_surname");
                currentUser.email = rs.getString("email");
                currentUser.password = rs.getString("password");
                currentUser.user_type = rs.getString("user_type");
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ex.getMessage()).log(Level.SEVERE, null, ex);
        }
        return currentUser;
    }

    public static boolean addUser(User newUser) {// Kullanıcı ekleme
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "INSERT INTO hospital_db.tbl_user (name_surname, email, password, gender, user_type) VALUES ('"
                    + newUser.name_surname + "','"
                    + newUser.email + "','"
                    + newUser.password + "','"
                    + newUser.gender + "','"
                    + newUser.user_type + "');";

            stmt.executeUpdate(query);
            conn.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(HospitalDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static ArrayList<Appointment> searchAppointment(String search) {// Randevu arama
        ArrayList<Appointment> appointmentList = new ArrayList<>();
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM hospital_db.tbl_randevu WHERE email = '" + currentUser.email + "' AND (clinic LIKE '%" + search + "%' OR appointment_time LIKE '%" + search + "%')";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                Appointment appointment = new Appointment();
                appointment.clinic = rs.getString("clinic");
                appointment.appointmentTime = rs.getString("appointment_time");
                appointmentList.add(appointment);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(HospitalDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return appointmentList;
    }

    public static ArrayList<Appointment> getAllAppointments() {
        ArrayList<Appointment> appointmentList = new ArrayList<>();
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM hospital_db.tbl_randevu"; // Tüm randevuları getiren SQL sorgusu
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                Appointment appointment = new Appointment();
                appointment.id = rs.getInt("id");
                appointment.nameSurname = rs.getString("name_surname");
                appointment.doctor = rs.getString("doctor");
                appointment.clinic = rs.getString("clinic");
                appointment.date = rs.getString("date");
                appointment.appointmentTime = rs.getString("appointment_time");
                appointmentList.add(appointment);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(HospitalDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return appointmentList;
    }
}

