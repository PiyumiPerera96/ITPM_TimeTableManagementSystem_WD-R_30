
package timetable_management_system;

import DB.DBconnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;


public class AddNotAvailableTime extends javax.swing.JFrame {

    String type = "";
    String day = "";
    String xxx = "";
    String sessionId = "";
    
    public AddNotAvailableTime() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    public void createDBTable() throws SQLException, ClassNotFoundException {
      
    }
    
    
    public void showDetails() throws SQLException{
    
        selectbox.removeAllItems();
        if(type.equals("Lecturer")){
            
              System.out.println("l");
       Statement stmt = null;
       Connection con = new DBconnection().getDB();
       stmt = con.createStatement();
       String sql = "SELECT lec_id from lecturer";
       
       ResultSet result = stmt.executeQuery(sql);
 
       
       while(result.next()){
             
         selectbox.addItem(result.getString("lec_id"));
             
       
       }
       con.close();
       }else if(type.equals("Session")){
     System.out.println("s");
       Statement stmt = null;
       Connection con = new DBconnection().getDB();
       stmt = con.createStatement();
       String sql = "SELECT sub_code, tag, full_grpID from session";
       
       ResultSet result = stmt.executeQuery(sql);
 
       
       while(result.next()){
             
         selectbox.addItem(result.getString("sub_code")+"/"+result.getString("tag")+"/"+result.getString("full_grpID"));
           
       }
           con.close();
       }else if(type.equals("Group")){
           System.out.println("g");
       Statement stmt = null;
       Connection con = new DBconnection().getDB();
       stmt = con.createStatement();
       String sql = "SELECT sMainGroupId from student";
       
       ResultSet result = stmt.executeQuery(sql);
 
       
       while(result.next()){
             
         selectbox.addItem(result.getString("sMainGroupId"));
           
       }
       con.close();
       }else if(type.equals("Sub-group")){
           System.out.println("sub");
        Statement stmt = null;
       Connection con = new DBconnection().getDB();
       stmt = con.createStatement();
       String sql = "SELECT sSubGroupId from student";
       
       ResultSet result = stmt.executeQuery(sql);
 
       
       while(result.next()){
             
         selectbox.addItem(result.getString("sSubGroupId"));
           
       }
       con.close();
       }
    
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        viewlist1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        typebox = new javax.swing.JComboBox<>();
        stype = new javax.swing.JLabel();
        selectbox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        daybox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        SpinnerModel spinnerModel = new SpinnerNumberModel(00, //initial value
            0, //min
            12, //max
            1);//step
        startHour = new javax.swing.JSpinner(spinnerModel);
        SpinnerModel spinnerModel1 = new SpinnerNumberModel(00, //initial value
            0, //min
            59, //max
            1);//step
        startMin = new javax.swing.JSpinner(spinnerModel1);
        amPm = new javax.swing.JComboBox<>();
        amPm1 = new javax.swing.JComboBox<>();
        SpinnerModel spinnerModel3 = new SpinnerNumberModel(00, //initial value
            0, //min
            59, //max
            1);//step
        endMin = new javax.swing.JSpinner(spinnerModel3);
        SpinnerModel spinnerModel2 = new SpinnerNumberModel(00, //initial value
            0, //min
            12, //max
            1);//step
        endHour = new javax.swing.JSpinner(spinnerModel2);
        jLabel2 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel1_home = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Not Available Time");
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1200, 650));
        setMinimumSize(new java.awt.Dimension(1200, 650));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));
        jPanel1.setMaximumSize(new java.awt.Dimension(1200, 650));
        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 650));

        viewlist1.setBackground(new java.awt.Color(207, 0, 15));
        viewlist1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        viewlist1.setForeground(new java.awt.Color(255, 255, 255));
        viewlist1.setText("VIEW");
        viewlist1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewlist1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Select Type");

        typebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Lecturer", "Session", "Group", "Sub-group" }));
        typebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeboxActionPerformed(evt);
            }
        });

        stype.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        stype.setForeground(new java.awt.Color(255, 255, 255));
        stype.setText("Select ID");

        selectbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        selectbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectboxActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select Day");

        daybox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday ", "Saturday", "Sunday" }));
        daybox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayboxActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Select Start Time");

        amPm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));

        amPm1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select End Time");

        add.setBackground(new java.awt.Color(1, 152, 117));
        add.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add NotAvailable Time");

        jLabel1_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home2.jpg"))); // NOI18N
        jLabel1_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stype, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(typebox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(daybox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(startHour, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(endHour, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(startMin, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(amPm, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(endMin, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(amPm1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(360, 360, 360))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187)
                        .addComponent(viewlist1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1_home)
                        .addGap(409, 409, 409)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1_home)))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typebox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectbox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stype, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(daybox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(startHour, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(startMin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(amPm, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endHour, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endMin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amPm1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewlist1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel10.setText("Time Table Management System");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1224, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(449, 449, 449))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel10)
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewlist1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewlist1ActionPerformed
        new ViewNotAvailable().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewlist1ActionPerformed

    private void typeboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeboxActionPerformed
        // TODO add your handling code here:

        type = (String) typebox.getSelectedItem();
        System.out.println(type);
        if(type.equals("Select")){
            stype.setText("Select ID");
            
        }else if(type.equals("Lecturer")){
            stype.setText("Select Lecturer ID");
            
        }else if(type.equals("Session")){
            stype.setText("Select Session");
            
        }else if(type.equals("Group")){
            stype.setText("Select Group ID");
        }else if(type.equals("Sub-group")){
            stype.setText("Select Sub-group ID");
        }
        try {
            System.out.println("1");
            showDetails();
        } catch (SQLException ex) {
           // Logger.getLogger(this.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_typeboxActionPerformed

    private void selectboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectboxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_selectboxActionPerformed

    private void dayboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayboxActionPerformed
        day = (String) selectbox.getSelectedItem();

    }//GEN-LAST:event_dayboxActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
       
        
        
        
        day = (String) daybox.getSelectedItem();
        int sHour = (int) startHour.getValue();
        int eHour = (int) endHour.getValue();
        int sMin  = (int) startMin.getValue();
        int eMin  = (int) endMin.getValue();
        String ampm = (String) amPm.getSelectedItem();
        String ampm1 = (String) amPm1.getSelectedItem();
        String startTime = "";
        String endTime = "";
        String id = (String) selectbox.getSelectedItem();

        if(type.equals("") ||day.equals("") || sHour == 0 || eHour == 0  ){

            JOptionPane.showMessageDialog(this,"Select Required Information","Error",JOptionPane.ERROR_MESSAGE);
           
        }
        else{

            try {
                if(ampm.equals("PM")){
                    
                    if(sHour == 1){
                        sHour = 13;
                    }else if(sHour == 2){
                        
                        sHour = 14;
                    }else if(sHour == 3){
                        
                        sHour = 15;
                    }else if(sHour == 4){
                        
                        sHour = 16;
                    }else if(sHour == 5){
                        
                        sHour = 17;
                    }else if(sHour == 6){
                        
                        sHour = 18;
                    }else if(sHour == 7){
                        
                        sHour = 19;
                    }else if(sHour == 8){
                        
                        sHour = 20;
                    }else if(sHour == 9){
                        
                        sHour = 21;
                    }else if(sHour == 10){
                        
                        sHour = 22;
                    }else if(sHour == 11){
                        
                        sHour = 23;
                    }
                    
                }else if(ampm.equals("AM") && sHour == 12){
                    sHour = 00;
                }
                //------------------------------------------------------------------------------------------
                if(ampm1.equals("PM")){
                    
                    if(eHour == 1){
                        eHour = 13;
                    }else if(eHour == 2){
                        
                        eHour = 14;
                    }else if(eHour == 3){
                        
                        eHour = 15;
                    }else if(eHour == 4){
                        
                        eHour = 16;
                    }else if(eHour == 5){
                        
                        eHour = 17;
                    }else if(eHour == 6){
                        
                        eHour = 18;
                    }else if(eHour == 7){
                        
                        eHour = 19;
                    }else if(eHour == 8){
                        
                        eHour = 20;
                    }else if(eHour == 9){
                        
                        eHour = 21;
                    }else if(eHour == 10){
                        
                        eHour = 22;
                    }else if(eHour == 11){
                        
                        eHour = 23;
                    }
                    
                }else if(ampm1.equals("AM") && eHour == 12){
                    eHour = 00;
                }
                
                
                //----------------------------------------------------------------------------------
                if(sHour > eHour){
                    
                 startHour.setValue(0);
                 endHour.setValue(0);
                 startMin.setValue(0);
                 endMin.setValue(0);
                 throw new ArithmeticException("exception");
                
                }else if(sHour == eHour && sMin > eMin){
                
                 startHour.setValue(0);
                 endHour.setValue(0);
                 startMin.setValue(0);
                 endMin.setValue(0);
                 throw new ArithmeticException("exception");
                
                }
                
                
                //----------------------------------------------------------------------------------
                
                
                
                
                startTime = sHour+":"+sMin+":00";
                endTime = eHour+":"+eMin+":00";
                
                if(type.equals("Session")){
                    
                    
                    try {
                        String[] sessionArray = id.split("/",3);
                        
                        
                        
                        Statement stmt = null;
                        Connection con = new DBconnection().getDB();
                        stmt = con.createStatement();
                        String sql = "SELECT session_ID from session where sub_code = '"+sessionArray[0]+"' and tag = '"+sessionArray[1]+"' and full_grpID = '"+sessionArray[2]+"'";
                        System.out.println(sql);
                        ResultSet result = stmt.executeQuery(sql);
                        
                        
                        while(result.next()){
                            
                            id = result.getString("id");
                            
                            
                            
                        }      
                    con.close();
                    } catch (Exception ex) {
                            Logger.getLogger(AddNotAvailableTime.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    
                }
                
                
                
                String uniqueID = UUID.randomUUID().toString();
                
                
                Connection con = new DBconnection().getDB();
                
                Statement stmt = con.createStatement();
                
                String sql = "INSERT INTO notavailabletime (type, typeId, Day, startTime, endTime)  "
                        +" VALUES ("
                        +"'"+type+"' ,"
                        +"'"+id+"' ,"
                         +"'"+day+"' ,"
                         +"'"+startTime+"' ,"
                         +"'"+endTime+"' )";
                       
                
                
                stmt.executeUpdate(sql);
                con.close();
                
                //succes msg
                JOptionPane.showMessageDialog(this," Details added succesfully","Succesful",JOptionPane.INFORMATION_MESSAGE);
                
            } catch (SQLException ex) {
                Logger.getLogger(AddNotAvailableTime.class.getName()).log(Level.SEVERE, null, ex);
               
            }catch (ArithmeticException ex) {
               JOptionPane.showMessageDialog(this, "Start time should be less than end time","Error",JOptionPane.ERROR_MESSAGE);
               
            }
          
    }//GEN-LAST:event_addActionPerformed
    }
   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNotAvailableTime().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JComboBox<String> amPm;
    private javax.swing.JComboBox<String> amPm1;
    private javax.swing.JComboBox<String> daybox;
    private javax.swing.JSpinner endHour;
    private javax.swing.JSpinner endMin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel1_home;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> selectbox;
    private javax.swing.JSpinner startHour;
    private javax.swing.JSpinner startMin;
    private javax.swing.JLabel stype;
    private javax.swing.JComboBox<String> typebox;
    private javax.swing.JButton viewlist1;
    // End of variables declaration//GEN-END:variables
}
