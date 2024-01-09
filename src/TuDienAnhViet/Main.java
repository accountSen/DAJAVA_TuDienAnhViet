
package TuDienAnhViet;

import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        
        setIconImage();
        ImageIcon icon = new ImageIcon("src\\Image\\icon_TDAV.png");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuLogin = new javax.swing.JMenu();
        jMenuAdd = new javax.swing.JMenu();
        jMenuRewrite = new javax.swing.JMenu();
        jMenuSearch = new javax.swing.JMenu();
        jMenuDelete = new javax.swing.JMenu();
        jMenuHistori = new javax.swing.JMenu();
        jMenuSetting = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Main"); // NOI18N
        setResizable(false);

        jMenuLogin.setText("Đăng Nhập");
        jMenuBar1.add(jMenuLogin);

        jMenuAdd.setText("Thêm Từ");
        jMenuBar1.add(jMenuAdd);

        jMenuRewrite.setText("Sửa Từ");
        jMenuBar1.add(jMenuRewrite);

        jMenuSearch.setText("Tìm Kiếm");
        jMenuBar1.add(jMenuSearch);

        jMenuDelete.setText("Xóa Từ");
        jMenuBar1.add(jMenuDelete);

        jMenuHistori.setText("Lịch Sử");
        jMenuBar1.add(jMenuHistori);

        jMenuSetting.setText("Cài Đặt");
        jMenuBar1.add(jMenuSetting);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(730, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(383, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenuAdd;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuDelete;
    private javax.swing.JMenu jMenuHistori;
    private javax.swing.JMenu jMenuLogin;
    private javax.swing.JMenu jMenuRewrite;
    private javax.swing.JMenu jMenuSearch;
    private javax.swing.JMenu jMenuSetting;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon_TDAV.png")));
    }
}
