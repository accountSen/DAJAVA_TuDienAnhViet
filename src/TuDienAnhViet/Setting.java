
package TuDienAnhViet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Setting extends javax.swing.JFrame {

    private Main main;

    Color color;
    public Setting(Main main) {
        initComponents();
        
        this.main = main;
        
        setIconImage(Toolkit.getDefaultToolkit().getImage("src\\Image\\iconTDAV.png"));//sử dụng hình ảnh từ đường dẫn "src\Image\LogoTDAV.png" làm biểu tượng cho cửa sổ

        Image icon = new ImageIcon("src\\Image\\previous.png").getImage();
        ImageIcon newicon   = new ImageIcon(icon.getScaledInstance(30, 30,  java.awt.Image.SCALE_SMOOTH));
        jButtonBack.setIcon(newicon);
                
        icon = new ImageIcon("src\\Image\\save-file.png").getImage();
        newicon   = new ImageIcon(icon.getScaledInstance(40, 40,  java.awt.Image.SCALE_SMOOTH));
        jButtonSave.setIcon(newicon);
        
        Image logo = new ImageIcon("src\\Image\\LogoTDAV.png").getImage();
        Image newImage = logo.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon newlogo   = new ImageIcon(newImage);
        jLabelLogo.setIcon(newlogo);
        
        
        //--đoạn code biết đc thứ tự của JColorChooser trong jpanel
//        Component[] components = jPanelForm.getComponents();
//        int colorChooserIndex = -1;
//
//        for (int i = 0; i < components.length; i++) {
//            if (components[i] instanceof JColorChooser) 
//            {
//                colorChooserIndex = i;
//                break;
//            }
//        }
//
//        if (colorChooserIndex != -1) {
//            System.out.println("Vị trí của JColorChooser trong JPanel là: " + colorChooserIndex);
//        } 
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelForm = new javax.swing.JPanel();
        ChooseColor = new javax.swing.JColorChooser();
        jLabelLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldViDu = new javax.swing.JTextField();
        jTextFieldXuat = new javax.swing.JTextField();
        jTextFieldNhap = new javax.swing.JTextField();
        jComboBoxXuat = new javax.swing.JComboBox<>();
        jComboBoxNhap = new javax.swing.JComboBox<>();
        jButtonBack = new javax.swing.JButton();
        jButtonNenNhap = new javax.swing.JButton();
        jButtonChuNhap = new javax.swing.JButton();
        jButtonChuVD = new javax.swing.JButton();
        jButtonNenVD = new javax.swing.JButton();
        jButtonChuXuat = new javax.swing.JButton();
        jButtonNenXuat = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jRadioButtoInDam = new javax.swing.JRadioButton();
        jRadioButtonInNghieng = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 102));
        setSize(new java.awt.Dimension(600, 600));

        jPanelForm.setBackground(new java.awt.Color(255, 204, 102));

        jLabel1.setBackground(new java.awt.Color(153, 255, 153));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Ví Dụ/Ex:");

        jTextFieldViDu.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldViDu.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextFieldViDu.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldViDu.setText("The Technology of computers : Công nghệ máy tính");

        jTextFieldXuat.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldXuat.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextFieldXuat.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldXuat.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldXuat.setText("Technology");

        jTextFieldNhap.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNhap.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextFieldNhap.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNhap.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldNhap.setText("Công nghệ");
        jTextFieldNhap.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jComboBoxXuat.setBackground(new java.awt.Color(255, 255, 0));
        jComboBoxXuat.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jComboBoxXuat.setForeground(new java.awt.Color(0, 51, 0));
        jComboBoxXuat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English", "Tiếng Việt" }));

        jComboBoxNhap.setBackground(new java.awt.Color(255, 255, 0));
        jComboBoxNhap.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jComboBoxNhap.setForeground(new java.awt.Color(0, 51, 0));
        jComboBoxNhap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiếng Việt", "English" }));

        jButtonBack.setBackground(new java.awt.Color(0, 51, 51));
        jButtonBack.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jButtonBack.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack.setText("Trở Lại");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jButtonNenNhap.setBackground(new java.awt.Color(0, 0, 204));
        jButtonNenNhap.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButtonNenNhap.setForeground(new java.awt.Color(153, 255, 255));
        jButtonNenNhap.setText("Màu Nền");
        jButtonNenNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNenNhapActionPerformed(evt);
            }
        });

        jButtonChuNhap.setBackground(new java.awt.Color(0, 0, 204));
        jButtonChuNhap.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButtonChuNhap.setForeground(new java.awt.Color(153, 255, 255));
        jButtonChuNhap.setText("Màu Chữ");
        jButtonChuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChuNhapActionPerformed(evt);
            }
        });

        jButtonChuVD.setBackground(new java.awt.Color(0, 0, 204));
        jButtonChuVD.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButtonChuVD.setForeground(new java.awt.Color(153, 255, 255));
        jButtonChuVD.setText("Màu Chữ");
        jButtonChuVD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChuVDActionPerformed(evt);
            }
        });

        jButtonNenVD.setBackground(new java.awt.Color(0, 0, 204));
        jButtonNenVD.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButtonNenVD.setForeground(new java.awt.Color(153, 255, 255));
        jButtonNenVD.setText("Màu Nền");
        jButtonNenVD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNenVDActionPerformed(evt);
            }
        });

        jButtonChuXuat.setBackground(new java.awt.Color(0, 0, 204));
        jButtonChuXuat.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButtonChuXuat.setForeground(new java.awt.Color(153, 255, 255));
        jButtonChuXuat.setText("Màu Chữ");
        jButtonChuXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChuXuatActionPerformed(evt);
            }
        });

        jButtonNenXuat.setBackground(new java.awt.Color(0, 0, 204));
        jButtonNenXuat.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButtonNenXuat.setForeground(new java.awt.Color(153, 255, 255));
        jButtonNenXuat.setText("Màu Nền");
        jButtonNenXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNenXuatActionPerformed(evt);
            }
        });

        jButtonSave.setBackground(new java.awt.Color(0, 255, 0));
        jButtonSave.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButtonSave.setForeground(new java.awt.Color(0, 0, 255));
        jButtonSave.setText("  Lưu");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jRadioButtoInDam.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButtoInDam.setForeground(new java.awt.Color(0, 0, 204));
        jRadioButtoInDam.setText("In Đậm");
        jRadioButtoInDam.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtoInDamItemStateChanged(evt);
            }
        });

        jRadioButtonInNghieng.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jRadioButtonInNghieng.setForeground(new java.awt.Color(0, 0, 204));
        jRadioButtonInNghieng.setText("In Nghiêng");
        jRadioButtonInNghieng.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonInNghiengItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanelFormLayout = new javax.swing.GroupLayout(jPanelForm);
        jPanelForm.setLayout(jPanelFormLayout);
        jPanelFormLayout.setHorizontalGroup(
            jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormLayout.createSequentialGroup()
                            .addComponent(jTextFieldNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(386, 386, 386))
                        .addGroup(jPanelFormLayout.createSequentialGroup()
                            .addComponent(jComboBoxNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonNenNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonChuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldXuat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelFormLayout.createSequentialGroup()
                                    .addComponent(jComboBoxXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonNenXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonChuXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanelFormLayout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelFormLayout.createSequentialGroup()
                                    .addComponent(jButtonNenVD, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonChuVD, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jTextFieldViDu))))
                    .addGroup(jPanelFormLayout.createSequentialGroup()
                        .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFormLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelFormLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonInNghieng)
                                    .addComponent(jRadioButtoInDam))))
                        .addGap(5, 5, 5)
                        .addComponent(ChooseColor, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelFormLayout.setVerticalGroup(
            jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormLayout.createSequentialGroup()
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtoInDam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonInNghieng))
                    .addComponent(ChooseColor, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBoxNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelFormLayout.createSequentialGroup()
                                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonNenNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonChuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormLayout.createSequentialGroup()
                        .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonNenXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonChuXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNenVD, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonChuVD, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldViDu, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNenNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNenNhapActionPerformed
        //JColorChooser Colorchoose = (JColorChooser) jPanelForm.getComponent(9);// Lấy đối tượng JColorChooser từ jPanelForm và số thứ tự của JColorChooser trong jPanelForm là 10
        color = ChooseColor.getColor();
        jTextFieldNhap.setBackground(color);
    }//GEN-LAST:event_jButtonNenNhapActionPerformed

    private void jButtonChuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChuNhapActionPerformed
        color = ChooseColor.getColor();
        jTextFieldNhap.setForeground(color);
    }//GEN-LAST:event_jButtonChuNhapActionPerformed

    private void jButtonNenXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNenXuatActionPerformed
        color = ChooseColor.getColor();
        jTextFieldXuat.setBackground(color);
    }//GEN-LAST:event_jButtonNenXuatActionPerformed

    private void jButtonChuXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChuXuatActionPerformed
        color = ChooseColor.getColor();
        jTextFieldXuat.setForeground(color);
    }//GEN-LAST:event_jButtonChuXuatActionPerformed

    private void jButtonNenVDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNenVDActionPerformed
        color = ChooseColor.getColor();
        jTextFieldViDu.setBackground(color);
    }//GEN-LAST:event_jButtonNenVDActionPerformed

    private void jButtonChuVDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChuVDActionPerformed
        color = ChooseColor.getColor();
        jTextFieldViDu.setForeground(color);
    }//GEN-LAST:event_jButtonChuVDActionPerformed

    public void updateTextFieldColors(Color cl1, Color cl2, Color cl3, Color cl4, Color cl5, Color cl6, int InDam, int InNghieng) 
    {
        jTextFieldNhap.setForeground(cl1);
        jTextFieldNhap.setBackground(cl2);
        jTextFieldXuat.setForeground(cl3);
        jTextFieldXuat.setBackground(cl4);
        jTextFieldViDu.setForeground(cl5);
        jTextFieldViDu.setBackground(cl6);
        Font f;
        if(InDam == 1)
        {
            jRadioButtoInDam.setSelected(true);
            f= new Font("Dialog", Font.BOLD, 24);
            jTextFieldNhap.setFont(f);
            jTextFieldXuat.setFont(f);
            jTextFieldViDu.setFont(f);
        }
        else if(InNghieng == 1)
        {
            jRadioButtonInNghieng.setSelected(true);
            f= new Font("Dialog", Font.ITALIC, 24);
            jTextFieldNhap.setFont(f);
            jTextFieldXuat.setFont(f);
            jTextFieldViDu.setFont(f);
        }
        else
        {
            f= new Font("Dialog", Font.PLAIN, 24);
            jTextFieldNhap.setFont(f);
            jTextFieldXuat.setFont(f);
            jTextFieldViDu.setFont(f);
        }
    }
    
    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        Color color1 = jTextFieldNhap.getForeground();
        Color color2 = jTextFieldNhap.getBackground();
        Color color3 = jTextFieldXuat.getForeground();
        Color color4 = jTextFieldXuat.getBackground();
        Color color5 = jTextFieldViDu.getForeground();
        Color color6 = jTextFieldViDu.getBackground();
        if(jRadioButtoInDam.isSelected())
        {
            main.updateTextFieldColorsmain(color1, color2, color3, color4, color5, color6, 1,0);
        }
        else if(jRadioButtonInNghieng.isSelected())
        {
            main.updateTextFieldColorsmain(color1, color2, color3, color4, color5, color6, 0,1);
        }
        else
        {
            main.updateTextFieldColorsmain(color1, color2, color3, color4, color5, color6, 0,0);
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        JFrame frame = new JFrame("Back");

        int confirmed = JOptionPane.showConfirmDialog(frame, "Bạn có chắc chắn muốn trở lại?", "Back", JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {
            setVisible(false);
        }
        main.setbuttonSetting();
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jRadioButtoInDamItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtoInDamItemStateChanged
        if(jRadioButtoInDam.isSelected())
        {
            jRadioButtonInNghieng.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButtoInDamItemStateChanged

    private void jRadioButtonInNghiengItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonInNghiengItemStateChanged
        if(jRadioButtonInNghieng.isSelected())
        {
            jRadioButtoInDam.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButtonInNghiengItemStateChanged

    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() { 
                Main main = new Main(); 
                new Setting(main).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JColorChooser ChooseColor;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonChuNhap;
    private javax.swing.JButton jButtonChuVD;
    private javax.swing.JButton jButtonChuXuat;
    private javax.swing.JButton jButtonNenNhap;
    private javax.swing.JButton jButtonNenVD;
    private javax.swing.JButton jButtonNenXuat;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox<String> jComboBoxNhap;
    private javax.swing.JComboBox<String> jComboBoxXuat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPanel jPanelForm;
    private javax.swing.JRadioButton jRadioButtoInDam;
    private javax.swing.JRadioButton jRadioButtonInNghieng;
    private javax.swing.JTextField jTextFieldNhap;
    private javax.swing.JTextField jTextFieldViDu;
    private javax.swing.JTextField jTextFieldXuat;
    // End of variables declaration//GEN-END:variables
}
