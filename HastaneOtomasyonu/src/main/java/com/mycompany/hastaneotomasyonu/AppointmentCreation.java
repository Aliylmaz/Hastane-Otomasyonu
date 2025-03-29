package com.mycompany.hastaneotomasyonu;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AppointmentCreation extends javax.swing.JFrame {

    DefaultTableModel tableModel;

    public AppointmentCreation() {// Constructor
        initComponents();
        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new Object[]{"Clinic", "Appointment Time"});
        tblAppointments.setModel(tableModel);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {


        tabbedPane = new javax.swing.JTabbedPane();
        pnlViewAppointments = new javax.swing.JPanel();
        btnView = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jScrollPane = new javax.swing.JScrollPane();
        tblAppointments = new javax.swing.JTable();
        btnExitView = new javax.swing.JButton();
        pnlCreateAppointment = new javax.swing.JPanel();
        cmbClinic = new javax.swing.JComboBox<>();
        cmbDoctor = new javax.swing.JComboBox<>();
        cmbDate = new javax.swing.JComboBox<>();
        cmbTime = new javax.swing.JComboBox<>();
        btnCreate = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblClinic = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblDoctor = new javax.swing.JLabel();
        btnExitCreate = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlViewAppointments.setBackground(new java.awt.Color(255, 255, 255));

        btnView.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        tblAppointments.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null},
                        {null, null}
                },
                new String [] {
                        "Clinic", "Appointment Time"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tblAppointments);

        btnExitView.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExitView.setText("Exit");
        btnExitView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlViewAppointmentsLayout = new javax.swing.GroupLayout(pnlViewAppointments);
        pnlViewAppointments.setLayout(pnlViewAppointmentsLayout);
        pnlViewAppointmentsLayout.setHorizontalGroup(
                pnlViewAppointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlViewAppointmentsLayout.createSequentialGroup()
                                .addGroup(pnlViewAppointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlViewAppointmentsLayout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnlViewAppointmentsLayout.createSequentialGroup()
                                                .addGap(83, 83, 83)
                                                .addComponent(btnView)
                                                .addGap(33, 33, 33)
                                                .addComponent(btnExitView)))
                                .addContainerGap(44, Short.MAX_VALUE))
        );
        pnlViewAppointmentsLayout.setVerticalGroup(
                pnlViewAppointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlViewAppointmentsLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlViewAppointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnView)
                                        .addComponent(btnExitView))
                                .addContainerGap(20, Short.MAX_VALUE))
        );

        tabbedPane.addTab("View Appointments", pnlViewAppointments);

        pnlCreateAppointment.setBackground(new java.awt.Color(255, 255, 255));

        cmbClinic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cardiology", "Dermatology", "Endocrinology", "Gastroenterology", "Hematology", "Infectious Disease", "Nephrology", "Neurology", "Oncology", "Pulmonology" }));

        cmbDoctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dr. Ayşe", "Dr. Mehmet", "Dr. Elif", "Dr. Eren", "Dr. Zeynep", "Dr. Ahmet", "Dr. Merve", "Dr. Emre", "Dr. Zehra", "Dr. Ali" }));

        cmbDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024-05-21", "2024-05-22", "2024-05-23", "2024-05-24", "2024-05-25", "2024-05-26", "2024-05-27", "2024-05-28", "2024-05-29", "2024-05-30", "2024-05-31", "2024-06-01", "2024-06-02", "2024-06-03", "2024-06-04", "2024-06-05", "2024-06-06", "2024-06-07" }));

        cmbTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00" }));

        btnCreate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblName.setText("Name:");

        lblClinic.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblClinic.setText("Select Clinic:");

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDate.setText("Date:");

        lblTime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTime.setText("Time:");

        lblDoctor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDoctor.setText("Select Doctor:");

        btnExitCreate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExitCreate.setText("Exit");
        btnExitCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitCreateActionPerformed(evt);
            }
        });



        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setText("Create New Appointment");

        javax.swing.GroupLayout pnlCreateAppointmentLayout = new javax.swing.GroupLayout(pnlCreateAppointment);
        pnlCreateAppointment.setLayout(pnlCreateAppointmentLayout);
        pnlCreateAppointmentLayout.setHorizontalGroup(
                pnlCreateAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlCreateAppointmentLayout.createSequentialGroup()
                                .addGroup(pnlCreateAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlCreateAppointmentLayout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addGroup(pnlCreateAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblName)
                                                        .addComponent(lblClinic)
                                                        .addComponent(lblDoctor)
                                                        .addComponent(lblDate)
                                                        .addComponent(lblTime))
                                                .addGap(37, 37, 37)
                                                .addGroup(pnlCreateAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtName)
                                                        .addComponent(cmbClinic, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cmbDoctor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cmbDate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cmbTime, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))



                                        .addGroup(pnlCreateAppointmentLayout.createSequentialGroup()
                                                .addGap(70, 70, 70)
                                                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(50, 50, 50)
                                                .addComponent(btnExitCreate))
                                        .addGroup(pnlCreateAppointmentLayout.createSequentialGroup()
                                                .addGap(70, 70, 70)
                                                .addComponent(lblTitle)))
                                .addContainerGap(44, Short.MAX_VALUE))
        );
        pnlCreateAppointmentLayout.setVerticalGroup(
                pnlCreateAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlCreateAppointmentLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblTitle)
                                .addGap(18, 18, 18)
                                .addGroup(pnlCreateAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblName)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlCreateAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblClinic)
                                        .addComponent(cmbClinic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlCreateAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblDoctor)
                                        .addComponent(cmbDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlCreateAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblDate)
                                        .addComponent(cmbDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlCreateAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblTime)
                                        .addComponent(cmbTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlCreateAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnCreate)
                                        .addComponent(btnExitCreate))
                                .addContainerGap(20, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Create Appointment", pnlCreateAppointment);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tabbedPane)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {// randevu oluşturuluyor
        // Create appointment action
        Appointment appointment = new Appointment();
        appointment.nameSurname = txtName.getText();
        appointment.clinic = cmbClinic.getSelectedItem().toString();
        appointment.doctor = cmbDoctor.getSelectedItem().toString();
        appointment.date = cmbDate.getSelectedItem().toString();
        appointment.appointmentTime = cmbTime.getSelectedItem().toString();

        Matcher matcher = Pattern.compile(".*\\d+.*").matcher(appointment.nameSurname);
        if (matcher.matches()) {
            JOptionPane.showMessageDialog(rootPane, "Name cannot contain numbers");
            return;
        }

        if (HospitalDB.createAppointment(appointment)) {
            JOptionPane.showMessageDialog(null, "Appointment created", "Info", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Appointment could not be created", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//arama yapılacak
        // View appointments action
        String search = txtSearch.getText();

        tableModel.setRowCount(0);

        ArrayList<Appointment> appointmentList = HospitalDB.searchAppointment(search);

        if (appointmentList.isEmpty()) {
            System.out.println("No appointments found.");
            JOptionPane.showMessageDialog(null, "No appointments found", "Info", JOptionPane.INFORMATION_MESSAGE);
        } else {
            for (Appointment appointment : appointmentList) {
               JOptionPane.showMessageDialog(null, "Appointments found", "Info", JOptionPane.INFORMATION_MESSAGE);
                tableModel.addRow(new Object[]{appointment.clinic, appointment.appointmentTime});
            }
        }
    }

    private void btnExitCreateActionPerformed(java.awt.event.ActionEvent evt) {
        // Exit create appointment action
        Main main = new Main();
        main.setVisible(true);
        this.dispose();
    }

    private void btnExitViewActionPerformed(java.awt.event.ActionEvent evt) {
        // Exit view appointments action
        Main main = new Main();
        main.setVisible(true);
        this.dispose();
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnExitCreate;
    private javax.swing.JButton btnExitView;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> cmbClinic;
    private javax.swing.JComboBox<String> cmbDate;
    private javax.swing.JComboBox<String> cmbDoctor;
    private javax.swing.JComboBox<String> cmbTime;
    private javax.swing.JPanel pnlCreateAppointment;
    private javax.swing.JPanel pnlViewAppointments;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JLabel lblClinic;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDoctor;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblAppointments;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
