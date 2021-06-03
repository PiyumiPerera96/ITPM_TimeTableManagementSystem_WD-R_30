

package timetable_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NISHADI
 */
public class ConsecutiveStudent extends javax.swing.JFrame {

    /** Creates new form ConsecutiveStudent */
    public ConsecutiveStudent() {
        initComponents();
        Show_Consecutives();
        
         //center form
        this.setLocationRelativeTo(null);
    }

      public ArrayList<Consecutives> consecutivesList(){
      
            ArrayList<Consecutives> consecutivesList = new ArrayList<>();
         
            
        try {
              
             Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/itpmnew","root","");
            
            
            String query = "SELECT * FROM `student_consecutive`";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            Consecutives consecutives;
            while(rs.next()){
               consecutives = new Consecutives(rs.getInt("con_Stu_ID"),rs.getString("con_Stu_GroupID"),rs.getString("con_Stu_Code1"),rs.getString("con_Stu_Code2"),rs.getString("con_Stu_Code3"),rs.getString("con_Stu_Se1"),rs.getString("con_Stu_Se2"),rs.getString("con_Stu_Se3"));
                consecutivesList.add(consecutives );
            }
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
            
          return consecutivesList;
       
      }
      
      
      
      //display data in jTable
      public void Show_Consecutives(){
        ArrayList<Consecutives> list = consecutivesList();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        Object[] row = new Object[8];
        for(int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).getCon_Stu_ID();
            row[1] = list.get(i).getCon_Stu_GroupID();
            row[2] = list.get(i).getCon_Stu_Code1();
            row[3] = list.get(i).getCon_Stu_Code2();
            row[4] = list.get(i).getCon_Stu_Code3();
            
            row[5] = list.get(i).getCon_Stu_Se1();
            row[6] = list.get(i).getCon_Stu_Se2();           
            row[7] = list.get(i).getCon_Stu_Se3();
         
           
            
            model.addRow(row);
            
            
        }
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1_home = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel2_logout = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2Minimize = new javax.swing.JLabel();
        jLabel1close = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consecutive Student Session");

        jTable1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Con_Stu_ID", "Group ID", "SubjectID1", "SubjectID2", "SubjectID3", "SessionID1", "SessionID2", "SessionID3"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jToggleButton1.setBackground(new java.awt.Color(207, 0, 15));
        jToggleButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("BACK");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(429, 429, 429)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        jPanel2.setBackground(new java.awt.Color(236, 236, 236));

        jLabel1_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home2.jpg"))); // NOI18N
        jLabel1_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1_homeMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setText("Time Table Management System");

        jLabel2_logout.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2_logout.setText("Logout");
        jLabel2_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2_logoutMouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.jpg"))); // NOI18N

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1_home)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(149, 149, 149)
                .addComponent(jLabel2_logout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(28, 28, 28)
                .addComponent(jLabel2Minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1close, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel2_logout))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1_home))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2Minimize)
                                    .addComponent(jLabel1close))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        Consecutive con = new Consecutive();
        con.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jLabel1_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1_homeMouseClicked
        //redirect to the home page
        Admin_Home adHome = new Admin_Home();
        adHome.setVisible(true);
        adHome.pack();
        adHome.setLocationRelativeTo(null);
        adHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel1_homeMouseClicked

    private void jLabel2_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2_logoutMouseClicked
        Admin_Login adlogin = new Admin_Login();
        adlogin.setVisible(true);
        adlogin.pack();
        adlogin.setLocationRelativeTo(null);
        adlogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel2_logoutMouseClicked

    private void jLabel2MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel2MinimizeMouseClicked

    private void jLabel1closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1closeMouseClicked

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsecutiveStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel1_home;
    private javax.swing.JLabel jLabel1close;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2Minimize;
    private javax.swing.JLabel jLabel2_logout;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables

}
