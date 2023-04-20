/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package user_ui;

import database.Db;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import login.LoginForm;
import models.Posts;

/**
 *
 * @author nikhilbindal
 */
public class UserLandingPage extends javax.swing.JFrame {

    /**
     * Creates new form UserLandingPage
     */
    Db db = new Db();
    ArrayList<Posts> posts = new ArrayList();
    public UserLandingPage() {
        initComponents();
        ResultSet rs = db.getAllPosts();
        System.out.println(rs);
        try {
            while(rs.next()) {
                int postId = rs.getInt("postId");
                String desc = rs.getString("description");
                String city = rs.getString("city");
                String postTag = rs.getString("postTag");
                Posts post = new Posts(postId, 1, desc, null, postTag, null, city);
                posts.add(post);
            } 
        } catch(Exception e) {
            System.out.println("No posts");
        }
        
        renderItemsInFeed();
    }
    
    public void renderItemsInFeed() {
        for(Posts p : posts) {
            PostPanel pane = new PostPanel();
            feedPanel.add(pane.addPanel(p.getCity(), p.getDescription(), p.getPostTag()));
        }
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        lblUserImg = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblDesignation = new javax.swing.JLabel();
        btnDashboard = new javax.swing.JPanel();
        lblDashIcon = new javax.swing.JLabel();
        lblDashboard = new javax.swing.JLabel();
        btnEmployee = new javax.swing.JPanel();
        lblEmpIcon = new javax.swing.JLabel();
        lblEmployee = new javax.swing.JLabel();
        btnViewLogout = new javax.swing.JPanel();
        lblLogoutBtn = new javax.swing.JLabel();
        userPanel = new javax.swing.JPanel();
        postPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        feedPanel = new javax.swing.JPanel();
        appointmentPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        bookingPanel = new javax.swing.JPanel();
        hospitalLbl = new javax.swing.JLabel();
        bookBtn = new javax.swing.JButton();
        datePicker = new com.toedter.calendar.JDateChooser();
        vetCombo = new javax.swing.JComboBox<>();
        hospitalCombo = new javax.swing.JComboBox<>();
        hospitalLbl1 = new javax.swing.JLabel();
        hospitalLbl2 = new javax.swing.JLabel();
        hospitalLbl3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePanel.setBackground(new java.awt.Color(0, 0, 104));
        sidePanel.setPreferredSize(new java.awt.Dimension(130, 600));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUserImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/User_Icon.png"))); // NOI18N
        sidePanel.add(lblUserImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 80));

        lblUsername.setBackground(new java.awt.Color(255, 255, 255));
        lblUsername.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername.setText("Admin");
        sidePanel.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 130, 15));

        lblDesignation.setBackground(new java.awt.Color(255, 255, 255));
        lblDesignation.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblDesignation.setForeground(new java.awt.Color(255, 255, 255));
        lblDesignation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDesignation.setText("System Admin");
        sidePanel.add(lblDesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 130, -1));

        btnDashboard.setBackground(new java.awt.Color(0, 0, 51));
        btnDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDashboardMouseClicked(evt);
            }
        });
        btnDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDashIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Farheen Zubair\\Desktop\\AED logos\\posts edit.png")); // NOI18N
        btnDashboard.add(lblDashIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 130, 80));

        lblDashboard.setBackground(new java.awt.Color(240, 240, 240));
        lblDashboard.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        lblDashboard.setForeground(new java.awt.Color(255, 255, 255));
        lblDashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboard.setText("Posts");
        btnDashboard.add(lblDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 130, 10));

        sidePanel.add(btnDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 130, 124, 110));

        btnEmployee.setBackground(new java.awt.Color(0, 0, 51));
        btnEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEmployeeMouseClicked(evt);
            }
        });
        btnEmployee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEmpIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Farheen Zubair\\Desktop\\AED logos\\book appointment edit.png")); // NOI18N
        btnEmployee.add(lblEmpIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 130, 90));

        lblEmployee.setBackground(new java.awt.Color(240, 240, 240));
        lblEmployee.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        lblEmployee.setForeground(new java.awt.Color(255, 255, 255));
        lblEmployee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmployee.setText("Book Appointment");
        btnEmployee.add(lblEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 130, 20));

        sidePanel.add(btnEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 250, 124, 120));

        btnViewLogout.setBackground(new java.awt.Color(0, 0, 51));
        btnViewLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewLogoutMouseClicked(evt);
            }
        });

        lblLogoutBtn.setBackground(new java.awt.Color(240, 240, 240));
        lblLogoutBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        lblLogoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        lblLogoutBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogoutBtn.setText("Log Out");
        lblLogoutBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout btnViewLogoutLayout = new javax.swing.GroupLayout(btnViewLogout);
        btnViewLogout.setLayout(btnViewLogoutLayout);
        btnViewLogoutLayout.setHorizontalGroup(
            btnViewLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
        );
        btnViewLogoutLayout.setVerticalGroup(
            btnViewLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        sidePanel.add(btnViewLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 500, 124, 30));

        jPanel1.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 600));

        userPanel.setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Feeds");

        jButton1.setBackground(new java.awt.Color(0, 0, 102));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("+ Add New");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        feedPanel.setBackground(new java.awt.Color(218, 228, 230));
        feedPanel.setAutoscrolls(true);
        feedPanel.setLayout(new java.awt.GridLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 500, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(feedPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(feedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout postPanelLayout = new javax.swing.GroupLayout(postPanel);
        postPanel.setLayout(postPanelLayout);
        postPanelLayout.setHorizontalGroup(
            postPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        postPanelLayout.setVerticalGroup(
            postPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(postPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        userPanel.add(postPanel, "card2");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setText("Book Appointment");

        bookingPanel.setBackground(new java.awt.Color(218, 228, 230));
        bookingPanel.setAutoscrolls(true);

        hospitalLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        hospitalLbl.setForeground(new java.awt.Color(0, 0, 102));
        hospitalLbl.setText("Hospital");

        bookBtn.setBackground(new java.awt.Color(0, 0, 102));
        bookBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bookBtn.setForeground(new java.awt.Color(204, 204, 204));
        bookBtn.setText("Book");
        bookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBtnActionPerformed(evt);
            }
        });

        vetCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vetComboActionPerformed(evt);
            }
        });

        hospitalCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalComboActionPerformed(evt);
            }
        });

        hospitalLbl1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        hospitalLbl1.setForeground(new java.awt.Color(0, 0, 102));
        hospitalLbl1.setText("Vet");

        hospitalLbl2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        hospitalLbl2.setForeground(new java.awt.Color(0, 0, 102));
        hospitalLbl2.setText("Date");

        hospitalLbl3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        hospitalLbl3.setForeground(new java.awt.Color(0, 0, 102));
        hospitalLbl3.setText("Reason");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout bookingPanelLayout = new javax.swing.GroupLayout(bookingPanel);
        bookingPanel.setLayout(bookingPanelLayout);
        bookingPanelLayout.setHorizontalGroup(
            bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookingPanelLayout.createSequentialGroup()
                .addGroup(bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookingPanelLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hospitalLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hospitalLbl1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hospitalLbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hospitalLbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hospitalCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vetCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(datePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)))
                    .addGroup(bookingPanelLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(bookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(405, Short.MAX_VALUE))
        );
        bookingPanelLayout.setVerticalGroup(
            bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookingPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hospitalLbl)
                    .addComponent(hospitalCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vetCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hospitalLbl1))
                .addGap(24, 24, 24)
                .addGroup(bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hospitalLbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(datePicker, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookingPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(bookingPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(hospitalLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)))
                .addGap(2, 2, 2)
                .addComponent(bookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bookingPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout appointmentPanelLayout = new javax.swing.GroupLayout(appointmentPanel);
        appointmentPanel.setLayout(appointmentPanelLayout);
        appointmentPanelLayout.setHorizontalGroup(
            appointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        appointmentPanelLayout.setVerticalGroup(
            appointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appointmentPanelLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        userPanel.add(appointmentPanel, "card2");

        jPanel1.add(userPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 770, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseClicked
        // TODO add your handling code here:
        postPanel.setVisible(true);
        appointmentPanel.setVisible(false);
    }//GEN-LAST:event_btnDashboardMouseClicked

    private void btnEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmployeeMouseClicked
        // TODO add your handling code here:
        //        txtTotalEmp.setText(String.valueOf(this.employees.getTotalEmployeesCount()));
        //        txtActiveEmp.setText(String.valueOf(this.employees.getActiveEmployeesCount()));
        //        txtInactiveEmp.setText(String.valueOf(this.employees.getInActiveEmployeesCount()));
        //        addEmployeePane.setVisible(false);
        //        panelDashboard.setVisible(false);
        //        panelProducts.setVisible(true);
        //        updateEmployeePane.setVisible(false);
        //        deleteEmployeePane.setVisible(false);
        //        reportEmployeePane.setVisible(false);
        //
        //        populateEmployeesDataToTable(null);
        postPanel.setVisible(false);
        appointmentPanel.setVisible(true);
    }//GEN-LAST:event_btnEmployeeMouseClicked

    private void btnViewLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewLogoutMouseClicked
        // TODO add your handling code here:
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewLogoutMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        addPostDialog pos= new addPostDialog(this, true);
        pos.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBtnActionPerformed
        var valid = true;

//        if (cityCombo.getSelectedItem() == null || cityCombo.getSelectedItem().toString().isEmpty()) {
//            cityLbl.setText("Please Select City");
//            valid = false;
//        }

        if (hospitalCombo.getSelectedItem() == null || hospitalCombo.getSelectedItem().toString().isEmpty()) {
            hospitalLbl.setText("Please Select Hospital");
            valid = false;
        }

        //        if (!this.validations.ValidateEmpty(datePicker.getDateStringOrEmptyString()) ) {
            //            dateLbl.setText("Date of joining is required");
            //            valid = false;
            //        }

        if (vetCombo.getSelectedItem() == null || vetCombo.getSelectedItem().toString().isEmpty()) {
//            vetLbl.setText("Please Select doctor");
            valid = false;
        }

//        if (userCombo.getSelectedItem() == null || userCombo.getSelectedItem().toString().isEmpty()) {
//            userLbl.setText("Please Select patient");
//            valid = false;
//        }
        if (valid) {

            Date date;

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-M-dd");

            //            try {
                //                date = formatter.parse(datePicker.getDateStringOrEmptyString());
                //
                //            } catch (ParseException ex) {
                //                date = new Date(1970, 01, 01);
                //            }
            //
            //            MainJFrame.encounterDirectory.newEncounter(date, doctor, hospital, patient);

            JOptionPane.showMessageDialog(this, "encounter details Added");
//            cityCombo.setSelectedItem("");
            hospitalCombo.setSelectedItem("");
            vetCombo.setSelectedItem("");
//            userCombo.setSelectedItem("");
            datePicker.setDate(null);
//            cityLbl.setText(null);
//            dateLbl.setText(null);
//            vetLbl.setText(null);
            hospitalLbl.setText(null);
//            userLbl.setText(null);

        }
    }//GEN-LAST:event_bookBtnActionPerformed

    private void vetComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vetComboActionPerformed
        Object vetName = vetCombo.getSelectedItem();

        if (vetName == null || vetName.toString().equals("")) {
//            vetLbl.setText("Please Select Doctor");
        } else {
//            vetLbl.setText(null);
            //            vet = hospital.getVetByName(vetName.toString());

        }
    }//GEN-LAST:event_vetComboActionPerformed

    private void hospitalComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalComboActionPerformed
        Object hospitalName = hospitalCombo.getSelectedItem();

        if (hospitalName == null || hospitalName.toString().equals("")) {
            hospitalLbl.setText("Please Select Hospital");
            vetCombo.removeAllItems();
//            userCombo.removeAllItems();
//            vetLbl.setText(null);
//            userLbl.setText(null);
        } else {
            vetCombo.removeAllItems();
//            userCombo.removeAllItems();
            hospitalLbl.setText(null);

            vetCombo.addItem("");
            //            for (Vet c: hospital.getVetList()) {
                //                vetCombo.addItem(c.getName());
                //            }
            vetCombo.setSelectedItem("");

            vetCombo.addItem("");
            //            for (Person c: hospital.getPersonList()) {
                //                vetCombo.addItem(c.getName());
                //            }
            vetCombo.setSelectedItem("");

        }
    }//GEN-LAST:event_hospitalComboActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserLandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLandingPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel appointmentPanel;
    private javax.swing.JButton bookBtn;
    private javax.swing.JPanel bookingPanel;
    private javax.swing.JPanel btnDashboard;
    private javax.swing.JPanel btnEmployee;
    private javax.swing.JPanel btnViewLogout;
    private com.toedter.calendar.JDateChooser datePicker;
    private javax.swing.JPanel feedPanel;
    private javax.swing.JComboBox<String> hospitalCombo;
    private javax.swing.JLabel hospitalLbl;
    private javax.swing.JLabel hospitalLbl1;
    private javax.swing.JLabel hospitalLbl2;
    private javax.swing.JLabel hospitalLbl3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblDashIcon;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblDesignation;
    private javax.swing.JLabel lblEmpIcon;
    private javax.swing.JLabel lblEmployee;
    private javax.swing.JLabel lblLogoutBtn;
    private javax.swing.JLabel lblUserImg;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel postPanel;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JPanel userPanel;
    private javax.swing.JComboBox<String> vetCombo;
    // End of variables declaration//GEN-END:variables
}
