/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TuDienAnhViet;

import com.sun.jdi.connect.Connector;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Pc
 */
public class XoaTu extends javax.swing.JFrame {

    /**
     * Creates new form XoaTu
     */
    private Main main;
    public XoaTu(Main main) {
        initComponents();
        loadDatabase();
        this.main = main;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton_Thoat = new javax.swing.JButton();
        jButton_Xoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_db = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jTextField_TA = new javax.swing.JTextField();
        jTextField_TV = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_TK = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_VD = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_id = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Từ Điển Anh-Việt");

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 506));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo_TuDien_100x100.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("Xóa Từ");

        jButton_Thoat.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Thoat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_Thoat.setForeground(new java.awt.Color(51, 153, 255));
        jButton_Thoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/log-out.png"))); // NOI18N
        jButton_Thoat.setText("Thoát");
        jButton_Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ThoatActionPerformed(evt);
            }
        });

        jButton_Xoa.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Xoa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_Xoa.setForeground(new java.awt.Color(51, 153, 255));
        jButton_Xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        jButton_Xoa.setText("Xóa");
        jButton_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_XoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel2)))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Thoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_Xoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(jButton_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Thoat)
                .addContainerGap())
        );

        jTable_db.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Từ Việt", "Từ Anh", "Ví dụ"
            }
        ));
        jTable_db.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_dbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_db);

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Id");

        jTextField_TK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_TKKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Từ tiếng Anh");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tìm kiếm");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ví dụ/ Ex:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Từ tiếng Việt");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_TA, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_TV, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_TK))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_VD)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_TK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_TA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_TV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_VD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Danh sách Từ:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void loadDatabase() {
        // Tạo một DefaultTableModel mới để lưu trữ dữ liệu từ cơ sở dữ liệu
        DefaultTableModel model = new DefaultTableModel();
        try {
            // Chuỗi kết nối đến cơ sở dữ liệu SQL Server
            String connectionUrl = "jdbc:sqlserver://VU2003:1433;databaseName=QLTuDien;user=sa;password=123456;" + "encrypt=true;trustServerCertificate=true";
            try {
                // Mở kết nối đến cơ sở dữ liệu
                try (java.sql.Connection connection = DriverManager.getConnection(connectionUrl)) {
                    // Tạo một đối tượng Statement để thực thi truy vấn SQL
                    java.sql.Statement command = connection.createStatement();
                    // Thực hiện truy vấn SQL để lấy dữ liệu từ bảng "Sach"
                    ResultSet rs = command.executeQuery("Select * from TuDien");
                    // Lấy thông tin về cấu trúc dữ liệu (metadata) từ ResultSet
                    ResultSetMetaData metaData = rs.getMetaData();
                    // Lấy số lượng cột từ metadata
                    int columnCount = metaData.getColumnCount();
                    // Thêm cột vào DefaultTableModel dựa trên thông tin cấu trúc của cột từ metadata
                    for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                        model.addColumn(metaData.getColumnLabel(columnIndex));
                    }
                    // Thêm dữ liệu từ ResultSet vào DefaultTableModel
                    while (rs.next()) {
                        // Tạo một mảng rowData để lưu trữ dữ liệu từng hàng
                        Object[] rowData = new Object[columnCount];
                        for (int i = 0; i < columnCount; i++) {
                            rowData[i] = rs.getObject(i + 1);
                        }
                        // Lấy dữ liệu từng cột và thêm vào mảng rowData
                        model.addRow(rowData);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            jTable_db.setModel(model);//gán dữ liệu cho bảng jTable để hiển thị
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
    private void jButton_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_XoaActionPerformed
        var Result = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa không ?", "Câu hỏi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        int selectedRowIndex = jTable_db.getSelectedRow();
        if (Result == JOptionPane.YES_OPTION) { // Xác nhận nếu người dùng chọn Yes
            if (selectedRowIndex >= 0) { // Kiểm tra xem có hàng được chọn không
                try {
                    String id = jTable_db.getValueAt(selectedRowIndex, 0).toString(); // Lấy giá trị ở cột MaSach

                    // Chuỗi truy vấn DELETE dữ liệu từ bảng "Sach" dựa trên MaSach
                    String query = "DELETE FROM TuDien WHERE Id = ?";

                    // Tạo kết nối đến cơ sở dữ liệu
                    String connectionUrl = "jdbc:sqlserver://VU2003:1433;databaseName=QLTuDien;user=sa;password=123456;" + "encrypt=true;trustServerCertificate=true";
                    try (java.sql.Connection connection = DriverManager.getConnection(connectionUrl); PreparedStatement statement = connection.prepareStatement(query)) {

                        // Thiết lập giá trị cho tham số trong truy vấn DELETE
                        statement.setString(1, id);

                        // Thực thi truy vấn DELETE
                        int i = statement.executeUpdate();

                        if (i > 0) {
                            JOptionPane.showMessageDialog(this, "Xóa dữ liệu thành công !");
                        } else {
                            JOptionPane.showMessageDialog(this, "Xóa dữ liệu không thành công !");
                        }

                        // Sau khi xóa dữ liệu, cần load lại bảng để cập nhật dữ liệu mới
                        loadDatabase();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                    // Xử lý lỗi khi xóa dữ liệu không thành công
                    JOptionPane.showMessageDialog(this, "Lỗi khi xóa dữ liệu từ SQL: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn một hàng để xóa!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton_XoaActionPerformed

    private void jTable_dbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_dbMouseClicked
        int selectedRow = jTable_db.getSelectedRow();

        if (selectedRow >= 0) {
            // Lấy dữ liệu từ hàng được chọn và hiển thị lên các ô văn bản
            String id = jTable_db.getValueAt(selectedRow, 0).toString();
            String tuViet = jTable_db.getValueAt(selectedRow, 1).toString();
            String tuAnh = jTable_db.getValueAt(selectedRow, 2).toString();
            String viDu = jTable_db.getValueAt(selectedRow, 3).toString();

            // Hiển thị dữ liệu lên các ô văn bản
            jTextField_id.setText(id);
            jTextField_TV.setText(tuViet);
            jTextField_TA.setText(tuAnh);
            jTextField_VD.setText(viDu);
        }
    }//GEN-LAST:event_jTable_dbMouseClicked

    private void jTextField_TKKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_TKKeyReleased
        DefaultTableModel obj = (DefaultTableModel) jTable_db.getModel();
        TableRowSorter<DefaultTableModel> obj1 = new TableRowSorter<>(obj);
        jTable_db.setRowSorter(obj1);
        obj1.setRowFilter(RowFilter.regexFilter(jTextField_TK.getText()));
    }//GEN-LAST:event_jTextField_TKKeyReleased

    private void jButton_ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ThoatActionPerformed
        int traloi = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát???", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (traloi == JOptionPane.YES_OPTION) {
            setVisible(false);
        }
        main.setbuttonXoa();
    }//GEN-LAST:event_jButton_ThoatActionPerformed

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
            java.util.logging.Logger.getLogger(XoaTu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XoaTu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XoaTu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XoaTu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Main main = new Main(); 
                new XoaTu(main).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Thoat;
    private javax.swing.JButton jButton_Xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_db;
    private javax.swing.JTextField jTextField_TA;
    private javax.swing.JTextField jTextField_TK;
    private javax.swing.JTextField jTextField_TV;
    private javax.swing.JTextField jTextField_VD;
    private javax.swing.JTextField jTextField_id;
    // End of variables declaration//GEN-END:variables
}
