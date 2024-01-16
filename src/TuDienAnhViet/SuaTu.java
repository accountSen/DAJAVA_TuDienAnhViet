/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TuDienAnhViet;

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
public class SuaTu extends javax.swing.JFrame {

    /**
     * Creates new form SuaTu
     */
    
    private Main main;
    
    public SuaTu(Main main) {
        initComponents();
        loadDatabase();
        this.main = main;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton_Thoat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_TA = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_TV = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton_Sua = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField_TimKiem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_db = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_Vd = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jTextField_Id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Từ Điển Anh - Việt");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));

        jButton_Thoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Thoat.setForeground(new java.awt.Color(0, 153, 255));
        jButton_Thoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/log-out.png"))); // NOI18N
        jButton_Thoat.setText("Thoát");
        jButton_Thoat.setBorder(null);
        jButton_Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ThoatActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sửa Từ");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo_TuDien.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jButton_Thoat))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("Từ Tiếng Anh");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("Từ Tiếng Việt");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 255));
        jLabel4.setText("Ví Dụ");

        jButton_Sua.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Sua.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_Sua.setForeground(new java.awt.Color(0, 153, 255));
        jButton_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refresh.png"))); // NOI18N
        jButton_Sua.setText("Sửa");
        jButton_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SuaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        jLabel6.setText("Tìm kiếm");

        jTextField_TimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_TimKiemKeyReleased(evt);
            }
        });

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
        if (jTable_db.getColumnModel().getColumnCount() > 0) {
            jTable_db.getColumnModel().getColumn(0).setResizable(false);
            jTable_db.getColumnModel().getColumn(1).setResizable(false);
            jTable_db.getColumnModel().getColumn(2).setResizable(false);
        }

        jTextArea_Vd.setColumns(20);
        jTextArea_Vd.setRows(5);
        jScrollPane2.setViewportView(jTextArea_Vd);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 255));
        jLabel7.setText("Id");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField_TA, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addComponent(jTextField_TV, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel2)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField_Id, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_TimKiem)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jSeparator2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jButton_Sua)
                            .addComponent(jTextField_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_TA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_TV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void loadDatabase()
    {
        // Tạo một DefaultTableModel mới để lưu trữ dữ liệu từ cơ sở dữ liệu
        DefaultTableModel model = new DefaultTableModel();
        try {        
            // Chuỗi kết nối đến cơ sở dữ liệu SQL Server
             String connectionUrl = "jdbc:sqlserver://VU2003:1433;databaseName=QLTuDien;user=sa;password=123456;" +"encrypt=true;trustServerCertificate=true";
            try {
                // Mở kết nối đến cơ sở dữ liệu
                try (java.sql.Connection connection = DriverManager.getConnection(connectionUrl))        {
                    // Tạo một đối tượng Statement để thực thi truy vấn SQL
                    java.sql.Statement command = connection.createStatement(); 
                    // Thực hiện truy vấn SQL để lấy dữ liệu từ bảng "Sach"
                    ResultSet rs = command.executeQuery("Select * from TuDien");
                   // Lấy thông tin về cấu trúc dữ liệu (metadata) từ ResultSet
                    ResultSetMetaData metaData = rs.getMetaData();
                     // Lấy số lượng cột từ metadata
                    int columnCount = metaData.getColumnCount();
                    // Thêm cột vào DefaultTableModel dựa trên thông tin cấu trúc của cột từ metadata
                    for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++)
                    {
                        model.addColumn(metaData.getColumnLabel(columnIndex));
                    }
                    // Thêm dữ liệu từ ResultSet vào DefaultTableModel
                    while(rs.next())
                    {
                        // Tạo một mảng rowData để lưu trữ dữ liệu từng hàng
                        Object[] rowData = new Object[columnCount];
                        for (int i = 0; i < columnCount; i++)
                        {
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
    private void jButton_ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ThoatActionPerformed
        int traloi = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát không???", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if(traloi == JOptionPane.YES_OPTION)
            setVisible(false);
        main.setbuttonSua();
    }//GEN-LAST:event_jButton_ThoatActionPerformed

    private void jTable_dbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_dbMouseClicked
        int selectedRow = jTable_db.getSelectedRow();
        if (selectedRow >= 0) {
        // Lấy dữ liệu từ hàng được chọn và hiển thị lên các ô văn bản
        String id = jTable_db.getValueAt(selectedRow, 0).toString();
        String tuViet = jTable_db.getValueAt(selectedRow, 1).toString();
        String tuAnh = jTable_db.getValueAt(selectedRow, 2).toString();
        String viDu = jTable_db.getValueAt(selectedRow, 3).toString();

        // Hiển thị dữ liệu lên các ô văn bản
        jTextField_Id.setText(id);
        jTextField_TV.setText(tuViet);
        jTextField_TA.setText(tuAnh);
        jTextArea_Vd.setText(viDu);
        }
    }//GEN-LAST:event_jTable_dbMouseClicked

    private void jTextField_TimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_TimKiemKeyReleased
        DefaultTableModel obj = (DefaultTableModel) jTable_db.getModel();
        TableRowSorter<DefaultTableModel> obj1 = new TableRowSorter<>(obj);
        jTable_db.setRowSorter(obj1);
        obj1.setRowFilter(RowFilter.regexFilter(jTextField_TimKiem.getText()));
    }//GEN-LAST:event_jTextField_TimKiemKeyReleased

    private void jButton_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SuaActionPerformed
        int selectedRow = jTable_db.getSelectedRow();
        var Result = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn sửa không ?", "Câu hỏi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (Result == JOptionPane.YES_OPTION) {
            if (selectedRow >= 0) {
                
                String updatedTuAnh = jTextField_TA.getText();
                String updatedTuViet = jTextField_TV.getText();
                String updatedVd = jTextArea_Vd.getText();

                // Kiểm tra dữ liệu rỗng và số lượng không phải là số
                if (updatedTuAnh.isEmpty() || updatedTuViet.isEmpty() ) {
                    // Hiển thị thông báo cho người dùng nếu có trường dữ liệu rỗng
                    JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                } else {
                    try {
                        // Kết nối đến cơ sở dữ liệu
                        java.sql.Connection connection = DriverManager.getConnection("jdbc:sqlserver://VU2003:1433;databaseName=QLTuDien;user=sa;password=123456;" +"encrypt=true;trustServerCertificate=true");

                        // Chuẩn bị câu truy vấn UPDATE
                        String updateQuery = "UPDATE TuDien SET TuViet=?, TuAnh=?, Vd=? WHERE Id=?";
                        PreparedStatement statement = connection.prepareStatement(updateQuery);//cho phép tạo câu lệnh sql có thể chứa tham số

                        // Thiết lập các giá trị vào câu truy vấn
                        statement.setString(1, updatedTuViet);
                        statement.setString(2, updatedTuAnh);
                        statement.setString(3, updatedVd);
                        statement.setString(4, jTextField_Id.getText());
                        // Thực thi câu truy vấn UPDATE
                        int rowsUpdated = statement.executeUpdate();

                        if (rowsUpdated > 0) {
                            JOptionPane.showMessageDialog(this, "Cập nhật dữ liệu thành công !");
                            loadDatabase();
                        } else {
                            JOptionPane.showMessageDialog(this, "Không có dữ liệu nào được cập nhật.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                        }

                        statement.close();
                        connection.close();    
                    } catch (SQLException e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(this, "Lỗi khi cập nhật dữ liệu.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else {
                // Thông báo cho người dùng chưa chọn hàng nào để cập nhật
                JOptionPane.showMessageDialog(this, "Vui lòng chọn hàng cần cập nhật.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton_SuaActionPerformed

    
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
            java.util.logging.Logger.getLogger(SuaTu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaTu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaTu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaTu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Main main = new Main(); 
                new SuaTu(main).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Sua;
    private javax.swing.JButton jButton_Thoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable_db;
    private javax.swing.JTextArea jTextArea_Vd;
    private javax.swing.JTextField jTextField_Id;
    private javax.swing.JTextField jTextField_TA;
    private javax.swing.JTextField jTextField_TV;
    private javax.swing.JTextField jTextField_TimKiem;
    // End of variables declaration//GEN-END:variables
}
