
package timetable_management_system;

import javax.swing.JFrame;


public class Admin_Home extends javax.swing.JFrame {

    
    public Admin_Home() {
        initComponents();
        
        //center form
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_logout = new javax.swing.JLabel();
        jLabel2Minimize = new javax.swing.JLabel();
        jLabel1close = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1_viewWorking = new javax.swing.JMenu();
        jMenuItem1_addWorking = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem_addlec = new javax.swing.JMenuItem();
        jMenuItem_viewlec = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem_addSub = new javax.swing.JMenuItem();
        jMenuItem_viewSub = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        Add_Student = new javax.swing.JMenuItem();
        jMenuItem8_viewStudent = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        Add_Tags = new javax.swing.JMenuItem();
        Tags_For_Module = new javax.swing.JMenuItem();
        jMenu8_viewSession = new javax.swing.JMenu();
        jMenuItem3_addSession = new javax.swing.JMenuItem();
        jMenuItem4_ViewSession = new javax.swing.JMenuItem();
        Parrarel_Session = new javax.swing.JMenuItem();
        Available_Time = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        Statistics = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        Add_Location = new javax.swing.JMenuItem();
        Add_Room = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        jMenuItem6.setText("jMenuItem6");

        jMenuItem7.setText("jMenuItem7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1400, 750));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1400, 750));

        jPanel2.setBackground(new java.awt.Color(1, 152, 117));
        jPanel2.setMinimumSize(new java.awt.Dimension(1400, 60));
        jPanel2.setPreferredSize(new java.awt.Dimension(1400, 60));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Time Table Management System");

        jLabel_logout.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_logout.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_logout.setText("Logout");
        jLabel_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_logoutMouseClicked(evt);
            }
        });

        jLabel2Minimize.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2Minimize.setText("-");
        jLabel2Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MinimizeMouseClicked(evt);
            }
        });

        jLabel1close.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1close.setText("X");
        jLabel1close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1closeMouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(549, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167)
                .addComponent(jLabel_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(54, 54, 54)
                .addComponent(jLabel2Minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1close, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel_logout)
                    .addComponent(jLabel2Minimize)
                    .addComponent(jLabel1close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/4.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(1440, 630));
        jLabel2.setMinimumSize(new java.awt.Dimension(1440, 630));
        jLabel2.setPreferredSize(new java.awt.Dimension(1440, 630));

        jMenuBar1.setBackground(new java.awt.Color(236, 236, 236));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jMenuBar1.setMinimumSize(new java.awt.Dimension(1400, 60));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(1400, 60));

        jMenu1_viewWorking.setBackground(new java.awt.Color(1, 152, 117));
        jMenu1_viewWorking.setText("Working Days & Hours  ");
        jMenu1_viewWorking.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        jMenuItem1_addWorking.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jMenuItem1_addWorking.setText("Add ");
        jMenuItem1_addWorking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1_addWorkingActionPerformed(evt);
            }
        });
        jMenu1_viewWorking.add(jMenuItem1_addWorking);

        jMenuItem1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jMenuItem1.setText("View");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1_viewWorking.add(jMenuItem1);

        jMenuBar1.add(jMenu1_viewWorking);

        jMenu2.setText("  Lecturers  ");
        jMenu2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        jMenuItem_addlec.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jMenuItem_addlec.setText("Add Lecturer");
        jMenuItem_addlec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem_addlecMouseClicked(evt);
            }
        });
        jMenuItem_addlec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_addlecActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_addlec);

        jMenuItem_viewlec.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jMenuItem_viewlec.setText("View Lecturer");
        jMenuItem_viewlec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem_viewlecMouseClicked(evt);
            }
        });
        jMenuItem_viewlec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_viewlecActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_viewlec);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("  Subjects  ");
        jMenu3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        jMenuItem_addSub.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jMenuItem_addSub.setText("Add Subject");
        jMenuItem_addSub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem_addSubMouseClicked(evt);
            }
        });
        jMenuItem_addSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_addSubActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_addSub);

        jMenuItem_viewSub.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jMenuItem_viewSub.setText("View Subject");
        jMenuItem_viewSub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem_viewSubMouseClicked(evt);
            }
        });
        jMenuItem_viewSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_viewSubActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_viewSub);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("  Students  ");
        jMenu4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        Add_Student.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        Add_Student.setText("Add Student");
        Add_Student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_StudentActionPerformed(evt);
            }
        });
        jMenu4.add(Add_Student);

        jMenuItem8_viewStudent.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jMenuItem8_viewStudent.setText("View Student");
        jMenuItem8_viewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8_viewStudentActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8_viewStudent);

        jMenuBar1.add(jMenu4);

        jMenu6.setText(" Tags");
        jMenu6.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        Add_Tags.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        Add_Tags.setText("Add_Tags");
        Add_Tags.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_TagsActionPerformed(evt);
            }
        });
        jMenu6.add(Add_Tags);

        Tags_For_Module.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        Tags_For_Module.setText("Tags For Module");
        Tags_For_Module.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tags_For_ModuleActionPerformed(evt);
            }
        });
        jMenu6.add(Tags_For_Module);

        jMenuBar1.add(jMenu6);

        jMenu8_viewSession.setText("  Sessions  ");
        jMenu8_viewSession.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        jMenuItem3_addSession.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jMenuItem3_addSession.setText("Add Session");
        jMenuItem3_addSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3_addSessionActionPerformed(evt);
            }
        });
        jMenu8_viewSession.add(jMenuItem3_addSession);

        jMenuItem4_ViewSession.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jMenuItem4_ViewSession.setText("View Session");
        jMenuItem4_ViewSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4_ViewSessionActionPerformed(evt);
            }
        });
        jMenu8_viewSession.add(jMenuItem4_ViewSession);

        Parrarel_Session.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        Parrarel_Session.setText("Parallels Session");
        Parrarel_Session.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Parrarel_SessionActionPerformed(evt);
            }
        });
        jMenu8_viewSession.add(Parrarel_Session);

        Available_Time.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        Available_Time.setText("Not Available Time");
        Available_Time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Available_TimeActionPerformed(evt);
            }
        });
        jMenu8_viewSession.add(Available_Time);

        jMenuBar1.add(jMenu8_viewSession);

        jMenu9.setText("  Statistics   ");
        jMenu9.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        Statistics.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Statistics.setText("View Statistics");
        Statistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatisticsActionPerformed(evt);
            }
        });
        jMenu9.add(Statistics);

        jMenuBar1.add(jMenu9);

        jMenu10.setText("Locations");
        jMenu10.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        Add_Location.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        Add_Location.setText("Add Location");
        Add_Location.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_LocationActionPerformed(evt);
            }
        });
        jMenu10.add(Add_Location);

        Add_Room.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        Add_Room.setText("Add Room");
        Add_Room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_RoomActionPerformed(evt);
            }
        });
        jMenu10.add(Add_Room);

        jMenuBar1.add(jMenu10);

        jMenu11.setText("  Generate Timetable  ");
        jMenu11.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jMenuItem3.setText("Lecturer");
        jMenu11.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jMenuItem4.setText("Student");
        jMenu11.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jMenuItem5.setText("Location");
        jMenu11.add(jMenuItem5);

        jMenuBar1.add(jMenu11);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_logoutMouseClicked
        
        Admin_Login adlogin = new Admin_Login();
        adlogin.setVisible(true);
        adlogin.pack();
        adlogin.setLocationRelativeTo(null);
        adlogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel_logoutMouseClicked

    private void jMenuItem_addlecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem_addlecMouseClicked
      
    }//GEN-LAST:event_jMenuItem_addlecMouseClicked

    private void jMenuItem_viewlecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem_viewlecMouseClicked
      
    }//GEN-LAST:event_jMenuItem_viewlecMouseClicked

    private void jMenuItem_addlecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_addlecActionPerformed
        
        Add_Lecturer adLec = new Add_Lecturer();
        adLec.setVisible(true);
        adLec.pack();
        adLec.setLocationRelativeTo(null);
        adLec.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jMenuItem_addlecActionPerformed

    private void jMenuItem_viewlecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_viewlecActionPerformed
        
        View_Lecturer vLec = new View_Lecturer();
        vLec.setVisible(true);
        vLec.pack();
        vLec.setLocationRelativeTo(null);
        vLec.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_jMenuItem_viewlecActionPerformed

    private void jMenuItem_addSubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem_addSubMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_addSubMouseClicked

    private void jMenuItem_addSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_addSubActionPerformed
       
        Add_Subject adSub = new Add_Subject();
        adSub.setVisible(true);
        adSub.pack();
        adSub.setLocationRelativeTo(null);
        adSub.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_jMenuItem_addSubActionPerformed

    private void jMenuItem_viewSubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem_viewSubMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_viewSubMouseClicked

    private void jMenuItem_viewSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_viewSubActionPerformed
       
        View_Subject vSub = new View_Subject();
        vSub.setVisible(true);
        vSub.pack();
        vSub.setLocationRelativeTo(null);
        vSub.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_jMenuItem_viewSubActionPerformed

    private void jLabel2MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel2MinimizeMouseClicked

    private void jLabel1closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1closeMouseClicked

    private void jMenuItem3_addSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3_addSessionActionPerformed
         Add_Session addSes = new Add_Session();
         addSes.setVisible(true);
         addSes.pack();
         addSes.setLocationRelativeTo(null);
         addSes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.dispose();
    }//GEN-LAST:event_jMenuItem3_addSessionActionPerformed

    private void jMenuItem4_ViewSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4_ViewSessionActionPerformed
         View_Session viewses = new View_Session();
         viewses.setVisible(true);
         viewses.pack();
         viewses.setLocationRelativeTo(null);
         viewses.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.dispose();
    }//GEN-LAST:event_jMenuItem4_ViewSessionActionPerformed

    private void Add_TagsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_TagsActionPerformed
        // TODO add your handling code here:
        
         Tags viewses = new Tags();
         viewses.setVisible(true);
         viewses.pack();
         viewses.setLocationRelativeTo(null);
         viewses.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.dispose();
    }//GEN-LAST:event_Add_TagsActionPerformed

    private void Tags_For_ModuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tags_For_ModuleActionPerformed
        // TODO add your handling code here:
         Tag2 viewses = new Tag2();
         viewses.setVisible(true);
         viewses.pack();
         viewses.setLocationRelativeTo(null);
         viewses.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.dispose();
    }//GEN-LAST:event_Tags_For_ModuleActionPerformed

    private void Add_StudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_StudentActionPerformed
        // TODO add your handling code here:
        StudentsGroups viewses = new StudentsGroups();
         viewses.setVisible(true);
         viewses.pack();
         viewses.setLocationRelativeTo(null);
         viewses.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.dispose();
    }//GEN-LAST:event_Add_StudentActionPerformed

    private void StatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatisticsActionPerformed
        // TODO add your handling code here
        //Statics_Faculty_VS_Lecture
        Statics_Faculty_VS_Lecture viewses = new Statics_Faculty_VS_Lecture();
         viewses.setVisible(true);
         viewses.pack();
         viewses.setLocationRelativeTo(null);
         viewses.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.dispose();
    }//GEN-LAST:event_StatisticsActionPerformed

    private void Add_LocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_LocationActionPerformed
        // TODO add your handling code here:
        
        AddLocation viewses = new AddLocation();
         viewses.setVisible(true);
         viewses.pack();
         viewses.setLocationRelativeTo(null);
         viewses.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.dispose();
         
    }//GEN-LAST:event_Add_LocationActionPerformed

    private void Add_RoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_RoomActionPerformed
        // TODO add your handling code here:
        //Add_Suitable_Room_Lecture_Sub_Group
          Add_Suitable_Room_Lecture_Sub_Group viewses = new Add_Suitable_Room_Lecture_Sub_Group();
         viewses.setVisible(true);
         viewses.pack();
         viewses.setLocationRelativeTo(null);
         viewses.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.dispose();
    }//GEN-LAST:event_Add_RoomActionPerformed

    private void Parrarel_SessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Parrarel_SessionActionPerformed
        // TODO add your handling code here:
         SessionT viewses = new SessionT();
         viewses.setVisible(true);
         viewses.pack();
         viewses.setLocationRelativeTo(null);
         viewses.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.dispose();
    }//GEN-LAST:event_Parrarel_SessionActionPerformed

    private void jMenuItem1_addWorkingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1_addWorkingActionPerformed
        // TODO add your handling code here:
        //AddWorkingDays
          AddWorkingDays viewses = new  AddWorkingDays();
         viewses.setVisible(true);
         viewses.pack();
         viewses.setLocationRelativeTo(null);
         viewses.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.dispose();
    }//GEN-LAST:event_jMenuItem1_addWorkingActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
        //SystemWorkingDays
        SystemWorkingDays viewses = new  SystemWorkingDays();
         viewses.setVisible(true);
         viewses.pack();
         viewses.setLocationRelativeTo(null);
         viewses.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void Available_TimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Available_TimeActionPerformed
        // TODO add your handling code here
       //ViewNotAvailable 
         ViewNotAvailable viewses = new  ViewNotAvailable();
         viewses.setVisible(true);
         viewses.pack();
         viewses.setLocationRelativeTo(null);
         viewses.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.dispose();
    }//GEN-LAST:event_Available_TimeActionPerformed

    private void jMenuItem8_viewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8_viewStudentActionPerformed
         TableStudentGroups viewStu = new TableStudentGroups();
         viewStu.setVisible(true);
         viewStu.pack();
         viewStu.setLocationRelativeTo(null);
         viewStu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.dispose();
    }//GEN-LAST:event_jMenuItem8_viewStudentActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Add_Location;
    private javax.swing.JMenuItem Add_Room;
    private javax.swing.JMenuItem Add_Student;
    private javax.swing.JMenuItem Add_Tags;
    private javax.swing.JMenuItem Available_Time;
    private javax.swing.JMenuItem Parrarel_Session;
    private javax.swing.JMenuItem Statistics;
    private javax.swing.JMenuItem Tags_For_Module;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1close;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2Minimize;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_logout;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu1_viewWorking;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu8_viewSession;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem1_addWorking;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem3_addSession;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem4_ViewSession;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8_viewStudent;
    private javax.swing.JMenuItem jMenuItem_addSub;
    private javax.swing.JMenuItem jMenuItem_addlec;
    private javax.swing.JMenuItem jMenuItem_viewSub;
    private javax.swing.JMenuItem jMenuItem_viewlec;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
