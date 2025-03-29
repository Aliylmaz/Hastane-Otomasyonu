package com.mycompany.hastaneotomasyonu;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.Color;

public class RegisterFrm extends javax.swing.JFrame {

    public RegisterFrm() {
        initComponents();
        customizeComponents();
    }

    private void customizeComponents() {
        // Butonların arka plan ve yazı renklerini ayarlama
        btnSave.setBackground(new Color(51, 153, 255));
        btnSave.setForeground(Color.WHITE);
        btnCancel.setBackground(new Color(255, 51, 51));
        btnCancel.setForeground(Color.WHITE);

        // Etiketlerin font ve renklerini ayarlama
        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24));
        lblTitle.setForeground(new Color(51, 51, 51));
        lblNameSurname.setFont(new java.awt.Font("Tahoma", 1, 12));
        lblNameSurname.setForeground(new Color(51, 51, 51));
        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 12));
        lblEmail.setForeground(new Color(51, 51, 51));
        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 12));
        lblPassword.setForeground(new Color(51, 51, 51));
        lblGender.setFont(new java.awt.Font("Tahoma", 1, 12));
        lblGender.setForeground(new Color(51, 51, 51));
        lblUserType.setFont(new java.awt.Font("Tahoma", 1, 12));
        lblUserType.setForeground(new Color(51, 51, 51));

        // Text alanlarının kenarlıklarını ayarlama
        txtNameSurname.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(0, 0, 0)));
        txtEmail.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(0, 0, 0)));
        txtPassword.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(0, 0, 0)));
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        buttonGroupGender = new javax.swing.ButtonGroup();
        jPanelMain = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblNameSurname = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtNameSurname = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        rbtnFemale = new javax.swing.JRadioButton();
        rbtnMale = new javax.swing.JRadioButton();
        lblGender = new javax.swing.JLabel();
        lblUserType = new javax.swing.JLabel();
        comboBoxUserType = new javax.swing.JComboBox<>();
        checkBoxShowPassword = new javax.swing.JCheckBox();
        lblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMain.setBackground(new java.awt.Color(204, 229, 255));
        jPanelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(51, 51, 51));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("User Registration");
        jPanelMain.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 220, -1));

        lblLogo.setIcon(new javax.swing.ImageIcon("src/main/java/img/medical-logo.png")); // NOI18N
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelMain.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 100, 100));

        lblNameSurname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNameSurname.setText("Name-Surname:");
        jPanelMain.add(lblNameSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEmail.setText("Email:");
        jPanelMain.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPassword.setText("Password:");
        jPanelMain.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        txtNameSurname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNameSurname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanelMain.add(txtNameSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 150, -1));

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanelMain.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 150, -1));

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanelMain.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 150, -1));

        btnSave.setBackground(new java.awt.Color(51, 153, 255));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setBorderPainted(false);
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanelMain.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 100, 30));

        btnCancel.setBackground(new java.awt.Color(255, 51, 51));
        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.setBorderPainted(false);
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanelMain.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 100, 30));

        buttonGroupGender.add(rbtnFemale);
        rbtnFemale.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbtnFemale.setText("Female");
        jPanelMain.add(rbtnFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        buttonGroupGender.add(rbtnMale);
        rbtnMale.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbtnMale.setText("Male");
        jPanelMain.add(rbtnMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        lblGender.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblGender.setText("Gender:");
        jPanelMain.add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        lblUserType.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUserType.setText("User Type:");
        jPanelMain.add(lblUserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        comboBoxUserType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comboBoxUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Patient" }));
        jPanelMain.add(comboBoxUserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 150, -1));

        checkBoxShowPassword.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        checkBoxShowPassword.setText("Show Password");
        checkBoxShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxShowPasswordActionPerformed(evt);
            }
        });
        jPanelMain.add(checkBoxShowPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        getContentPane().add(jPanelMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 400));

        pack();
        setLocationRelativeTo(null);
    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            // Validate name-surname
            Pattern pattern = Pattern.compile("([A-Z|a-z][a-z]+[ ]*)+"); // At least two characters
            Matcher matcher = pattern.matcher(txtNameSurname.getText());

            if (!matcher.find()) {
                throw new IllegalArgumentException("Invalid Name-Surname Entered");
            }

            // Validate email
            pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");// Email format
            matcher = pattern.matcher(txtEmail.getText());// Email format

            if (!matcher.find()) {
                throw new IllegalArgumentException("Invalid Email Entered");
            }

            // Validate password
            pattern = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{4,}$");
            matcher = pattern.matcher(txtPassword.getText());

            if (!matcher.find()) {
                throw new IllegalArgumentException("Password Must Be At Least 4 Characters. Must Contain One Letter and One Number.");
            }

            // Create new user
            User newUser = new User();
            newUser.name_surname = txtNameSurname.getText();
            newUser.password = txtPassword.getText();
            newUser.email = txtEmail.getText();
            newUser.user_type = comboBoxUserType.getSelectedItem().toString();
            newUser.gender = (byte) (rbtnFemale.isSelected() ? 1 : 0);

            if (HospitalDB.addUser(newUser)) {
                JOptionPane.showMessageDialog(null, "Registered Successfully", "Info", JOptionPane.INFORMATION_MESSAGE);
                if (newUser.user_type.compareTo("Admin") == 0) {
                    AdminFrm admin = new AdminFrm();
                    admin.setVisible(true);
                } else {
                    AppointmentCreation appointment = new AppointmentCreation();
                    appointment.setVisible(true);
                }
                this.setVisible(false);
                this.dispose();
            } else {
                throw new Exception("Registration Failed");
            }
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(rootPane, "Email already registered. Please use a different email.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }


    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {
        LoginFrm login = new LoginFrm();
        login.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }

    private void checkBoxShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {
        txtPassword.setEchoChar(checkBoxShowPassword.isSelected() ? (char) 0 : '*');
    }



    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroupGender;
    private javax.swing.JCheckBox checkBoxShowPassword;
    private javax.swing.JComboBox<String> comboBoxUserType;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblNameSurname;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserType;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JRadioButton rbtnFemale;
    private javax.swing.JRadioButton rbtnMale;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNameSurname;
    private javax.swing.JPasswordField txtPassword;
}
