package com.mycompany.hastaneotomasyonu;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdminFrm extends javax.swing.JFrame {

    DefaultTableModel tableModel;

    public AdminFrm() {
        initComponents();
        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new Object[]{"Id", "Name-Surname", "Doctor", "Clinic", "Date", "Appointment Time"});
        tblTable.setModel(tableModel);
        loadAllAppointments(); // Form açıldığında tüm randevuları yükle
    }

    private void loadAllAppointments() {
        tableModel.setRowCount(0);
        ArrayList<Appointment> appointmentList = HospitalDB.getAllAppointments(); // Tüm randevuları getirir
        for (Appointment appointment : appointmentList) {
            tableModel.addRow(new Object[]{appointment.id, appointment.nameSurname, appointment.doctor, appointment.clinic, appointment.date, appointment.appointmentTime});
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        pnlAdmin = new javax.swing.JPanel();
        lblDoctor = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblAppointmentTime = new javax.swing.JLabel();
        cmbDoctor = new javax.swing.JComboBox<>();
        cmbDate = new javax.swing.JComboBox<>();
        cmbAppointmentTime = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        tblTable = new javax.swing.JTable();
        lblNameSurname = new javax.swing.JLabel();
        txtNameSurname = new javax.swing.JTextField();
        lblClinic = new javax.swing.JLabel();
        cmbClinic = new javax.swing.JComboBox<>();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtSearch = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlAdmin.setBackground(new java.awt.Color(255, 255, 255));
        pnlAdmin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDoctor.setFont(new java.awt.Font("Tahoma", 1, 14));
        lblDoctor.setText("Doctor:");
        pnlAdmin.add(lblDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 14));
        lblDate.setText("Date:");
        pnlAdmin.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        lblAppointmentTime.setFont(new java.awt.Font("Tahoma", 1, 14));
        lblAppointmentTime.setText("Appointment Time:");
        pnlAdmin.add(lblAppointmentTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        cmbDoctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Dr. Ayşe", "Dr. Mehmet", "Dr. Elif", "Dr. Eren", "Dr. Zeynep", "Dr. Ahmet", "Dr. Merve", "Dr. Emre", "Dr. Zehra", "Dr. Ali"}));
        pnlAdmin.add(cmbDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 150, -1));

        cmbDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"2024-05-21", "2024-05-22", "2024-05-23", "2024-05-24", "2024-05-25", "2024-05-26", "2024-05-27", "2024-05-28", "2024-05-29", "2024-05-30", "2024-05-31", "2024-06-01", "2024-06-02", "2024-06-03", "2024-06-04", "2024-06-05", "2024-06-06", "2024-06-07"}));
        pnlAdmin.add(cmbDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 150, -1));

        cmbAppointmentTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00"}));
        pnlAdmin.add(cmbAppointmentTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 150, -1));

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnSearch.setIcon(new javax.swing.ImageIcon("img/search.png"));
        btnSearch.setText("Search");
        btnSearch.addActionListener(evt -> btnSearchActionPerformed(evt));
        pnlAdmin.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 110, 30));

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnDelete.setIcon(new javax.swing.ImageIcon("img/delete.png"));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(evt -> btnDeleteActionPerformed(evt));
        pnlAdmin.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 110, 30));

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnAdd.setIcon(new javax.swing.ImageIcon("img/add.png"));
        btnAdd.setText("Add");
        btnAdd.addActionListener(evt -> btnAddActionPerformed(evt));
        pnlAdmin.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 110, 30));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnUpdate.setIcon(new javax.swing.ImageIcon("img/update.png"));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(evt -> btnUpdateActionPerformed(evt));
        pnlAdmin.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 110, 30));

        tblTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null}
                },
                new String[]{
                        "Id", "Name-Surname", "Doctor", "Clinic", "Date", "Appointment Time"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tblTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTableMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(tblTable);
        pnlAdmin.add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 600, 230));

        lblNameSurname.setFont(new java.awt.Font("Tahoma", 1, 14));
        lblNameSurname.setText("Name-Surname:");
        pnlAdmin.add(lblNameSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));
        pnlAdmin.add(txtNameSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 150, -1));

        lblClinic.setFont(new java.awt.Font("Tahoma", 1, 14));
        lblClinic.setText("Clinic:");
        pnlAdmin.add(lblClinic, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        cmbClinic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Cardiology", "Dermatology", "Endocrinology", "Gastroenterology", "Hematology", "Infectious Disease", "Nephrology", "Neurology", "Oncology", "Pulmonology"}));
        pnlAdmin.add(cmbClinic, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 150, -1));

        lblId.setFont(new java.awt.Font("Tahoma", 1, 14));
        lblId.setText("Id:");
        pnlAdmin.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));
        pnlAdmin.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 150, -1));
        pnlAdmin.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 110, -1));

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnExit.setText("Exit");
        btnExit.addActionListener(evt -> btnExitActionPerformed(evt));
        pnlAdmin.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            if (txtId.getText().isEmpty() || txtNameSurname.getText().isEmpty() ||
                    cmbDoctor.getSelectedIndex() == -1 || cmbClinic.getSelectedIndex() == -1 ||
                    cmbDate.getSelectedIndex() == -1 || cmbAppointmentTime.getSelectedIndex() == -1) {
                throw new IllegalArgumentException("All fields must be filled!");
            }

            Appointment newAppointment = new Appointment();
            newAppointment.id = Integer.parseInt(txtId.getText());
            newAppointment.nameSurname = txtNameSurname.getText();
            newAppointment.doctor = cmbDoctor.getSelectedItem().toString();
            newAppointment.clinic = cmbClinic.getSelectedItem().toString();
            newAppointment.date = cmbDate.getSelectedItem().toString();
            newAppointment.appointmentTime = cmbAppointmentTime.getSelectedItem().toString();

            Matcher matcher = Pattern.compile(".*\\d+.*").matcher(newAppointment.nameSurname);
            if (matcher.matches()) {
                throw new IllegalArgumentException("Name-Surname cannot contain numbers");
            }

            if (HospitalDB.addUser(newAppointment)) {
                JOptionPane.showMessageDialog(rootPane, "Appointment Created");
                txtSearch.setText(""); // Arama alanını boşalt
                btnSearchActionPerformed(evt); // Tabloyu yenile
            } else {
                throw new Exception("Appointment Could Not Be Created");
            }
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }


    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String search = txtSearch.getText();

            // Arama alanı boşsa veritabanındaki tüm verileri çek
            ArrayList<Appointment> appointmentList;
            if (search.isEmpty()) {
                appointmentList = HospitalDB.getAllAppointments();
            } else {
                appointmentList = HospitalDB.searchByName(search);
            }

            tableModel.setRowCount(0);

            if (appointmentList.isEmpty()) {
                throw new Exception("No appointments found.");
            }

            for (Appointment appointment : appointmentList) {
                tableModel.addRow(new Object[]{appointment.id, appointment.nameSurname, appointment.doctor, appointment.clinic, appointment.date, appointment.appointmentTime});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void tblTableMouseCliked(java.awt.event.MouseEvent evt) {
        btnUpdate.setEnabled(true);
    }

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            if (txtId.getText().isEmpty() || txtNameSurname.getText().isEmpty() ||
                    cmbDoctor.getSelectedIndex() == -1 || cmbClinic.getSelectedIndex() == -1 ||
                    cmbDate.getSelectedIndex() == -1 || cmbAppointmentTime.getSelectedIndex() == -1) {
                throw new IllegalArgumentException("All fields must be filled!");
            }

            Appointment updatedAppointment = new Appointment();
            updatedAppointment.id = Integer.parseInt(txtId.getText());
            updatedAppointment.nameSurname = txtNameSurname.getText();
            updatedAppointment.doctor = cmbDoctor.getSelectedItem().toString();
            updatedAppointment.clinic = cmbClinic.getSelectedItem().toString();
            updatedAppointment.date = cmbDate.getSelectedItem().toString();
            updatedAppointment.appointmentTime = cmbAppointmentTime.getSelectedItem().toString();

            if (HospitalDB.updateUser(updatedAppointment)) {
                JOptionPane.showMessageDialog(rootPane, "Appointment Updated");
                btnSearchActionPerformed(evt); // Refresh the table after updating
            } else {
                throw new Exception("Appointment Could Not Be Updated");
            }
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void tblTableMouseClicked(java.awt.event.MouseEvent evt) {
        if (tblTable.getSelectedRow() < 0) {
            return;
        }

        txtId.setText(tableModel.getValueAt(tblTable.getSelectedRow(), 0).toString());
        txtNameSurname.setText(tableModel.getValueAt(tblTable.getSelectedRow(), 1).toString());
        cmbDoctor.setSelectedItem(tableModel.getValueAt(tblTable.getSelectedRow(), 2).toString());
        cmbClinic.setSelectedItem(tableModel.getValueAt(tblTable.getSelectedRow(), 3).toString());
        cmbDate.setSelectedItem(tableModel.getValueAt(tblTable.getSelectedRow(), 4).toString());
        cmbAppointmentTime.setSelectedItem(tableModel.getValueAt(tblTable.getSelectedRow(), 5).toString());
    }

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int rowIndex = tblTable.getSelectedRow();
            if (rowIndex < 0) {
                throw new IllegalArgumentException("No row selected!");
            }

            int id = Integer.parseInt(tableModel.getValueAt(rowIndex, 0).toString());

            if (HospitalDB.deleteById(id)) {
                JOptionPane.showMessageDialog(rootPane, "Appointment Deleted");
                btnSearchActionPerformed(evt); // Refresh the table after deleting
            } else {
                throw new Exception("Appointment Could Not Be Deleted");
            }

            reset();
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {
        Main main = new Main();
        main.setVisible(true);
        this.dispose();
    }

    private void reset() {
        txtId.setText("");
        txtNameSurname.setText("");
        cmbDoctor.setSelectedIndex(0);
        cmbClinic.setSelectedIndex(0);
        cmbDate.setSelectedIndex(0);
        cmbAppointmentTime.setSelectedIndex(0);
    }



    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbAppointmentTime;
    private javax.swing.JComboBox<String> cmbClinic;
    private javax.swing.JComboBox<String> cmbDate;
    private javax.swing.JComboBox<String> cmbDoctor;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblAppointmentTime;
    private javax.swing.JLabel lblClinic;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDoctor;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNameSurname;
    private javax.swing.JPanel pnlAdmin;
    private javax.swing.JTable tblTable;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNameSurname;
    private javax.swing.JTextField txtSearch;
}
