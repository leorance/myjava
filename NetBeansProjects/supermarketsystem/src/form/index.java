/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

//import data_class.brg;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.nocrala.tools.texttablefmt.*;

/**
 *
 * @author leorence
 */
public class index extends javax.swing.JFrame {
//    brg barang;
    protected int sub;
    protected int val;
    DefaultTableModel model;
    final static String Driver = "com.mysql.jdbc.Driver";
    final static String Url = "jdbc:mysql://localhost/supermarket";
    final static String User = "root";
    final static String Pass = "";
    static Connection conn;
    static Statement st;
    static ResultSet rs;
    
    /**
     * Creates new form index
     */
    public index() {
        initComponents();
        //DefaultTableModel model; (Dibawah public class)
        String judul[] = {"Kode Barang", "Nama barang", "Harga", "Quantity"};
        model = new DefaultTableModel(judul, 0);
        jTable1.setModel(model);
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        int x = layar.width / 2 - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;
        this.setLocation(x, y);
        quan.setText("1");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JSeparator();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        barcode = new javax.swing.JTextField();
        skode = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        output = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        quan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cetak = new javax.swing.JButton();
        bayar = new javax.swing.JTextField();
        pay = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        change = new javax.swing.JLabel();
        cl = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        login = new javax.swing.JMenuItem();
        logout = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        lk = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        lb = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenuItem3.setText("jMenuItem3");

        jMenu8.setText("File");
        jMenuBar3.add(jMenu8);

        jMenu9.setText("Edit");
        jMenuBar3.add(jMenu9);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setText("Total :");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Supermarket System");
        setResizable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setEnabled(false);
        jScrollPane1.setViewportView(jTable1);

        barcode.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        barcode.setEnabled(false);
        barcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barcodeActionPerformed(evt);
            }
        });
        barcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                barcodeKeyPressed(evt);
            }
        });

        skode.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        skode.setText("Cari");
        skode.setEnabled(false);
        skode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skodeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Total :");

        output.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        output.setText("-");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Masukkan kode");

        quan.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        quan.setEnabled(false);
        quan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                quanKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setText("Qty");

        cetak.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cetak.setText("Hitung");
        cetak.setEnabled(false);
        cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakActionPerformed(evt);
            }
        });

        bayar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        bayar.setEnabled(false);
        bayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bayarKeyPressed(evt);
            }
        });

        pay.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        pay.setText("-");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel6.setText("Kembalian :");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setText("Anda bayar :");

        change.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        change.setText("-");

        cl.setText("Clear");
        cl.setEnabled(false);
        cl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenu1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu1MouseEntered(evt);
            }
        });

        login.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_MASK));
        login.setText("Login     ");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jMenu1.add(login);

        logout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.SHIFT_MASK));
        logout.setText("Logout");
        logout.setEnabled(false);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jMenu1.add(logout);
        jMenu1.add(jSeparator1);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Exit");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Data Master");

        lk.setText("List Karyawan");
        lk.setEnabled(false);
        lk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lkActionPerformed(evt);
            }
        });
        jMenu2.add(lk);
        jMenu2.add(jSeparator4);

        lb.setText("List Barang");
        lb.setEnabled(false);
        lb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbActionPerformed(evt);
            }
        });
        jMenu2.add(lb);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cl)
                .addGap(566, 566, 566))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(quan, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3)
                                .addGap(30, 30, 30)
                                .addComponent(skode, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cetak, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(barcode, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(output)
                                    .addComponent(pay)
                                    .addComponent(change))))
                        .addGap(84, 84, 84))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(output))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(pay))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(2, 2, 2))
                            .addComponent(change, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(barcode, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cetak, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(skode, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(quan, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(cl)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        log x = new log();
        x.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_loginActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        lk.setEnabled(false);
        lb.setEnabled(false);
        logout.setEnabled(false);
        barcode.setEnabled(false);
        skode.setEnabled(false);
        barcode.setText("");
        quan.setText("");
        quan.setEnabled(false);
        cetak.setEnabled(false);
        cl.setEnabled(false);
        sub *= 0;
        output.setText("-");
        pay.setText("-");
        change.setText("-");
        bayar.setEnabled(false);
        if (jTable1.getRowCount() > 0) {
            for (int i = jTable1.getRowCount() - 1; i > -1; i--) {
                model.removeRow(i);
                quan.setText("");
                barcode.setText("");
            }
        }
        JOptionPane.showMessageDialog(null, "Anda telah logout!");
    }//GEN-LAST:event_logoutActionPerformed

    private void jMenu1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseEntered

    }//GEN-LAST:event_jMenu1MouseEntered

    private void jMenu1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseExited

    }//GEN-LAST:event_jMenu1MouseExited

    private void lkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lkActionPerformed
        karyawan x = new karyawan();
        x.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lkActionPerformed

    private void lbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbActionPerformed
        barang x = new barang();
        x.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbActionPerformed

    private void skodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skodeActionPerformed
        ArrayList list = new ArrayList();
        try {
            conn = DriverManager.getConnection(Url, User, Pass);
            st = conn.createStatement();
            String sql = "SELECT * FROM data_barang where kode = " + barcode.getText();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                jTable1.setAutoCreateColumnsFromModel(true);
                list.add(rs.getString("kode"));
                list.add(rs.getString("nama"));
                list.add(rs.getString("harga"));
                list.add(quan.getText());
                model.addRow(list.toArray());
                sum();
                quan.setText("1");
                barcode.setText("");
                barcode.requestFocus();
            }
        } catch (Exception e) {
            System.err.println("Error : " + e);
        }
    }//GEN-LAST:event_skodeActionPerformed

    private void barcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barcodeActionPerformed
        
    }//GEN-LAST:event_barcodeActionPerformed

    private void cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakActionPerformed
        bayar();
    }//GEN-LAST:event_cetakActionPerformed

    private void barcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barcodeKeyPressed
        if (quan.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Tolong isi banyak barang");
        } else {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                ArrayList list = new ArrayList();
                try {
                    conn = DriverManager.getConnection(Url, User, Pass);
                    st = conn.createStatement();
                    String sql = "SELECT * FROM data_barang where kode = " + barcode.getText();
                    rs = st.executeQuery(sql);
                    while (rs.next()) {
                        jTable1.setAutoCreateColumnsFromModel(true);
                        list.add(rs.getString("kode"));
                        list.add(rs.getString("nama"));
                        list.add(rs.getString("harga"));
                        list.add(quan.getText());
                        model.addRow(list.toArray());
                        sum();
                        quan.setText("1");
                        barcode.setText("");
                        barcode.requestFocus();
                    }
                } catch (SQLException e) {
                    System.err.println("Error : " + e);
                }
            }
        }
    }//GEN-LAST:event_barcodeKeyPressed

    private void quanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quanKeyPressed
        if (barcode.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Tolong isi kode barang");
        } else {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                ArrayList list = new ArrayList();
                try {
                    conn = DriverManager.getConnection(Url, User, Pass);
                    st = conn.createStatement();
                    String sql = "SELECT * FROM data_barang where kode = " + barcode.getText();
                    rs = st.executeQuery(sql);
                    while (rs.next()) {
                        jTable1.setAutoCreateColumnsFromModel(true);
                        list.add(rs.getString("kode"));
                        list.add(rs.getString("nama"));
                        list.add(rs.getString("harga"));
                        list.add(quan.getText());
                        model.addRow(list.toArray());
                        sum();
                        quan.setText("1");
                        barcode.setText("");
                        barcode.requestFocus();
                    }
                } catch (SQLException e) {
                    System.err.println("Error : " + e);
                }
            }
        }
    }//GEN-LAST:event_quanKeyPressed

    private void bayarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bayarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            bayar();
        }
    }//GEN-LAST:event_bayarKeyPressed

    private void clActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clActionPerformed
        sub *= 0;
        output.setText("-");
        pay.setText("-");
        change.setText("-");
    }//GEN-LAST:event_clActionPerformed

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
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField barcode;
    private javax.swing.JTextField bayar;
    private javax.swing.JButton cetak;
    private javax.swing.JLabel change;
    private javax.swing.JButton cl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuItem lb;
    private javax.swing.JMenuItem lk;
    private javax.swing.JMenuItem login;
    private javax.swing.JMenuItem logout;
    private javax.swing.JLabel output;
    private javax.swing.JLabel pay;
    private javax.swing.JTextField quan;
    private javax.swing.JButton skode;
    // End of variables declaration//GEN-END:variables
    void Login() {
        lk.setEnabled(true);
        lb.setEnabled(true);
        logout.setEnabled(true);
        skode.setEnabled(true);
        barcode.setEnabled(true);
        quan.setEnabled(true);
        jTable1.setEnabled(true);
        cetak.setEnabled(true);
        bayar.setEnabled(true);
        cl.setEnabled(true);
    }

    private void sum() {
        int jumlah = jTable1.getRowCount();
        int total, dataqty, datahrg;
        for (int i = 0; i < jumlah; i++) {
            datahrg = Integer.valueOf(jTable1.getValueAt(i, 2).toString());
            dataqty = Integer.valueOf(jTable1.getValueAt(i, 3).toString());
            total = datahrg * dataqty;
            sub += total;
            total *= 0;
        }
        DecimalFormat erpe = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols rp = new DecimalFormatSymbols();
        rp.setCurrencySymbol("Rp. ");
        rp.setMonetaryDecimalSeparator(',');
        rp.setGroupingSeparator('.');
        erpe.setDecimalFormatSymbols(rp);
        output.setText(""+erpe.format(sub));
    }
    private void bayar(){
        int x = Integer.parseInt(bayar.getText());
        int y = sub - x;
        DecimalFormat erpe = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols rp = new DecimalFormatSymbols();
        rp.setCurrencySymbol("Rp. ");
        rp.setMonetaryDecimalSeparator(',');
        rp.setGroupingSeparator('.');
        erpe.setDecimalFormatSymbols(rp);
        pay.setText(""+erpe.format(x));
        change.setText(""+erpe.format(y));
        if (jTable1.getRowCount() > 0) {
            for (int i = jTable1.getRowCount() - 1; i > -1; i--) {
                model.removeRow(i);
                bayar.setText("");
            }
        }
    }
}