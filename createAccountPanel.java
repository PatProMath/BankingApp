/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking_app;

import java.sql.*;
import javax.swing.*;
import java.time.*;
import com.sun.istack.internal.logging.Logger;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.Random;
import java.util.logging.Level;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

/**
 *
 * @author CLEMENT O. A-U
 */
public class createAccountPanel extends javax.swing.JPanel {

    Connection conn;
    PreparedStatement ps, pst;
    final String url = "jdbc:mysql://localhost:3306/banking_app";
    final String user = "root";
    final String pass = "";
    String s;
    Icon img = new ImageIcon("button-ok.png");

    /**
     * Creates new form createAccountPanel
     */
    public createAccountPanel() {
        initComponents();
        DoConnect();
    }

    public void DoConnect() {
        try {
            conn = DriverManager.getConnection(url, user, pass);
        } catch (SQLException ex) {
            ex.printStackTrace();
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        generateAcctNoButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        init_depo = new javax.swing.JTextField();
        mar_status = new javax.swing.JComboBox<>();
        religion = new javax.swing.JComboBox<>();
        state = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        lname = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        acct_type = new javax.swing.JComboBox<>();
        photo = new javax.swing.JLabel();
        attachPicButton = new javax.swing.JButton();
        acct_no = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        bvn = new javax.swing.JTextField();
        generateBVNbutton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        dob = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cre_date = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Account Type");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 80, -1));

        jLabel3.setText("First Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 70, -1));

        jLabel4.setText("Last Name");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 70, -1));

        jLabel5.setText("Gender");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 338, -1, -1));

        jLabel6.setText("State");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 379, -1, -1));

        jLabel7.setText("Religion");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 420, -1, -1));

        jLabel8.setText("Marital Status");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 458, -1, -1));

        jLabel9.setText("Initial Deposit");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 490, -1, -1));

        generateAcctNoButton.setBackground(new java.awt.Color(204, 204, 255));
        generateAcctNoButton.setForeground(new java.awt.Color(102, 0, 153));
        generateAcctNoButton.setText("Generate Account No");
        generateAcctNoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateAcctNoButtonActionPerformed(evt);
            }
        });
        add(generateAcctNoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 510, -1, -1));

        saveButton.setBackground(new java.awt.Color(204, 204, 255));
        saveButton.setForeground(new java.awt.Color(102, 0, 153));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 627, 243, -1));

        init_depo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                init_depoActionPerformed(evt);
            }
        });
        add(init_depo, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 484, 79, -1));

        mar_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married" }));
        add(mar_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 452, 79, -1));

        religion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Islam", "Christianity" }));
        add(religion, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 414, -1, -1));
        add(state, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 373, 79, -1));

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 332, 79, -1));
        add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 120, 30));
        add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 120, 30));

        acct_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Savings", "Current" }));
        add(acct_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 79, -1));

        photo.setBackground(new java.awt.Color(153, 153, 255));
        photo.setForeground(new java.awt.Color(153, 153, 255));
        photo.setText("Customer's Image");
        photo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 75, 156, 169));

        attachPicButton.setBackground(new java.awt.Color(204, 204, 255));
        attachPicButton.setForeground(new java.awt.Color(102, 0, 153));
        attachPicButton.setText("Attach Picture");
        attachPicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attachPicButtonActionPerformed(evt);
            }
        });
        add(attachPicButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 285, -1, -1));
        add(acct_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 511, 79, -1));

        jLabel12.setText("Phone");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 64, 20));

        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 103, -1));
        add(bvn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 79, 20));

        generateBVNbutton.setBackground(new java.awt.Color(204, 204, 255));
        generateBVNbutton.setForeground(new java.awt.Color(102, 0, 153));
        generateBVNbutton.setText("Generate bvn");
        generateBVNbutton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 204), new java.awt.Color(153, 51, 255), null, null));
        generateBVNbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateBVNbuttonActionPerformed(evt);
            }
        });
        add(generateBVNbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel13.setText("Date of Birth");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 76, -1));
        add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 551, 79, -1));

        jLabel14.setText("Creation_date");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, -1, -1));

        cre_date.setEditable(false);
        add(cre_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 589, 79, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banking_app/images/backgroung1.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 660));
    }// </editor-fold>//GEN-END:initComponents

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void generateBVNbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateBVNbuttonActionPerformed
        // TODO add your handling code here:
        Random rand = new Random();
        String gen_num = "";
        for (int i = 1; i < 11; i++) {
            int rand_int = rand.nextInt(10);
            gen_num += rand_int;
        }
        System.out.println("gen_num");
        bvn.setText(gen_num);
    }//GEN-LAST:event_generateBVNbuttonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        String insertData = "insert into customers(customer_id,account_no,bvn,firstname,lastname,gender,phone"
                + ",religion,state,marital_status,dob,image,creation_date,account_type,Initial_deposit) "
                + "values(null,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        String insert_into_acct = "insert into account values(null, ?, ?, ?, ?, ?, ?, ?)";
        try {

            ps = conn.prepareStatement(insertData, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            pst = conn.prepareStatement(insert_into_acct, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);//SENSITIVE Allows you to move back and forth
            //int tcust_id = Integer.parseInt(cust_id.getText());
            String tfname = fname.getText();
            String tlname = lname.getText();
            String tphone = phone.getText();
            String tstate = state.getText();
            String tgender = gender.getSelectedItem().toString();
            String tacct_type = acct_type.getSelectedItem().toString();
            String tdob = dob.getText();

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY-MM-DD HH-MM-SS");
            LocalDateTime tcre_date = LocalDateTime.now();

            String treligion = religion.getSelectedItem().toString();
            String tmar_status = mar_status.getSelectedItem().toString();
            String tbvn = bvn.getText();
            String tacct_no = acct_no.getText();
            double tinit_deposit = CheckDoubleForEmptyString(init_depo.getText());
            File file;

            if (tacct_no.equals("") || tfname.equals("") || tlname.equals("")
                    || tphone.equals("") || tstate.equals("") || tdob.equals("") 
                    || init_depo.getText().equals("") && s == null) {
                JOptionPane.showMessageDialog(null, "Please Fill the Fields With The Appropriate Info!",
                        "Empty Fields", JOptionPane.ERROR_MESSAGE);
            } else {
                file = new File(s);
                //Create the Customer's Record
                InputStream IS = new FileInputStream(file);
                ps.setString(1, tacct_no);
                ps.setString(2, tbvn);
                ps.setString(3, tfname);
                ps.setString(4, tlname);
                ps.setString(5, tgender);
                ps.setString(6, tphone);
                ps.setString(7, treligion);
                ps.setString(8, tstate);
                ps.setString(9, tmar_status);
                ps.setString(10, tdob);
                ps.setBlob(11, IS);
                ps.setString(12, tcre_date.toString());
                ps.setString(13, tacct_type);
                ps.setDouble(14, tinit_deposit);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Customer record added!", "Info",
                        JOptionPane.INFORMATION_MESSAGE, img);

                // Create/Add the Customer's Account
                pst.setString(1, tacct_no);
                pst.setString(2, tfname.toUpperCase()+ " " + tlname.toUpperCase());
                pst.setString(3, tacct_type);
                pst.setDouble(4, tinit_deposit);
                pst.setString(5, "D - Deposit");
                pst.setDouble(6, tinit_deposit);
                pst.setString(7, tcre_date.toString());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Customer's Account created!", "Info",
                        JOptionPane.INFORMATION_MESSAGE, img);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void attachPicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attachPicButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser filechooser = new JFileChooser();
        filechooser.setCurrentDirectory(new File("C:\\Users\\Patricia Osifo\\Pictures\\image photos"));
        int result = filechooser.showSaveDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = filechooser.getSelectedFile();
            if (selectedFile.length() <= (1024 * 1024)) {
                String path = selectedFile.getAbsolutePath();
                s = path;
                photo.setIcon(ResizeImage(path));
            } else {
                JOptionPane.showMessageDialog(this, "The file you have chosen is too large. Size should  be less than 1MB",
                        "Unsupported File", JOptionPane.INFORMATION_MESSAGE);
            }
//            String path = selectedFile.getAbsolutePath();
//            s = path;
//            photo.setIcon(ResizeImage(path));
        } else if (result == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showInternalMessageDialog(null, "No data inputted!");
        }
    }//GEN-LAST:event_attachPicButtonActionPerformed

    private void generateAcctNoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateAcctNoButtonActionPerformed
        // TODO add your handling code here:
        Random rand = new Random();
        String gen_num = "";
        String choice = acct_type.getSelectedItem().toString();
        if (choice.equalsIgnoreCase("savings")) {
            gen_num += "02";
        } else {
            gen_num += "01";
        }
        for (int i = 1; i < 9; i++) {
            int rand_int = rand.nextInt(10);
            gen_num += rand_int;
        }
        System.out.println("gen_num");
        acct_no.setText(gen_num);
    }//GEN-LAST:event_generateAcctNoButtonActionPerformed

    private void init_depoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_init_depoActionPerformed
        // TODO add your handling code here:
//        init_depo.setText(Double.toString(0.00));
    }//GEN-LAST:event_init_depoActionPerformed
    public ImageIcon ResizeImage(String imgPath) {
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(photo.getWidth(), photo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }

    public double CheckDoubleForEmptyString(String str) {
        if (str == null && str.isEmpty()) {
            return 0;
        } else {
            try {
                return Double.parseDouble(str);
            } catch (NumberFormatException e) {
                return 1.00;
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField acct_no;
    private javax.swing.JComboBox<String> acct_type;
    private javax.swing.JButton attachPicButton;
    private javax.swing.JTextField bvn;
    private javax.swing.JTextField cre_date;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JButton generateAcctNoButton;
    private javax.swing.JButton generateBVNbutton;
    private javax.swing.JTextField init_depo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lname;
    private javax.swing.JComboBox<String> mar_status;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel photo;
    private javax.swing.JComboBox<String> religion;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField state;
    // End of variables declaration//GEN-END:variables
}
