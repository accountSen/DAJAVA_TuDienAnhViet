
package TuDienAnhViet;
import java.sql.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import javax.swing.ImageIcon;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Pro Player
 */
public class Main extends javax.swing.JFrame {

//    private BufferedImage Null;
    
    
    public Main() {
        initComponents();
        
        
        setIconImage(Toolkit.getDefaultToolkit().getImage("src\\Image\\iconTDAV.png"));//sử dụng hình ảnh từ đường dẫn "src\Image\LogoTDAV.png" làm biểu tượng cho cửa sổ
        
        Image icon = new ImageIcon("src\\Image\\login.png").getImage();
        ImageIcon newicon   = new ImageIcon(icon.getScaledInstance(30, 30,  java.awt.Image.SCALE_SMOOTH));
        jButtonDangNhap.setIcon(newicon);
        
        icon = new ImageIcon("src\\Image\\add.png").getImage();
        newicon   = new ImageIcon(icon.getScaledInstance(30, 30,  java.awt.Image.SCALE_SMOOTH));
        jButtonThemTu.setIcon(newicon);
        
        icon = new ImageIcon("src\\Image\\delete.png").getImage();
        newicon   = new ImageIcon(icon.getScaledInstance(30, 30,  java.awt.Image.SCALE_SMOOTH));
        jButtonXoa.setIcon(newicon);
        
        icon = new ImageIcon("src\\Image\\pen.png").getImage();
        newicon   = new ImageIcon(icon.getScaledInstance(30, 30,  java.awt.Image.SCALE_SMOOTH));
        jButtonSua.setIcon(newicon);
        
        icon = new ImageIcon("src\\Image\\rgb.png").getImage();
        newicon   = new ImageIcon(icon.getScaledInstance(30, 30,  java.awt.Image.SCALE_SMOOTH));
        jButtonSetting.setIcon(newicon);
        
        icon = new ImageIcon("src\\Image\\switch.png").getImage();
        newicon   = new ImageIcon(icon.getScaledInstance(30, 30,  java.awt.Image.SCALE_SMOOTH));
        jButtonExit.setIcon(newicon);
        
        Image logo = new ImageIcon("src\\Image\\LogoTDAV.png").getImage();
        ImageIcon newlogo   = new ImageIcon(logo.getScaledInstance(200, 200,  java.awt.Image.SCALE_SMOOTH));
        jLabelLogo.setIcon(newlogo);
        
        ImageIcon trangtri = new ImageIcon("D:\\DA_Java\\DA_Java_TuDienAnhViet\\src\\Image\\TrangTri.png");
        //Image newImagett = trangtri.getScaledInstance(730, 91,  java.awt.Image.SCALE_SMOOTH);
        //ImageIcon newTT   = new ImageIcon(newImagett);
        jLabelTrangTri.setIcon(trangtri);
        
        
        //ket noi
//        var user = "sa";
//        var pass = "123";
//        var db = "QLTuDien";
//        var server = "PCNAPVIP";
//        var port = 1433;
//        SQLServerDataSource ds = new SQLServerDataSource();
//        ds.setUser(user);
//        ds.setPassword(pass);
//        ds.setDatabaseName(db);
//        ds.setServerName(server);
//        ds.setPortNumber(port);
//        ds.setEncrypt("encrypt=true;trustServerCertificate=true");
//        try(Connection conn = ds.getConnection()) {
//            System.out.println("Kết nối thành công đến SQL Server!");
//        } catch (SQLException e) {
//            System.out.println("Kết nối thất bại!");
//            e.printStackTrace();
//        }
        
//        try {
//            BufferedImage background = ImageIO.read(new File("D:\\DA_Java\\DA_Java_TuDienAnhViet\\src\\Image\\Backgr.png"));
//            Image newbackground = background.getScaledInstance(960, 540,  java.awt.Image.SCALE_SMOOTH);
//            Graphics2D g2d = (Graphics2D) jPanelbgr.getGraphics();
//            g2d.drawImage(background, 0, 0, null);
//            
//            //g.drawImage(background, null, 0, 0);
//        } catch (IOException ex) {
//            Logger.getLogger(Main1.class.getName()).log(Level.SEVERE, null, ex);
//            JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi khi đọc tệp hình ảnh: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
//        }

//        Graphics2D g = (Graphics2D) this.getGraphics();
//        File bgr = new File("D:\\DA_Java\\DA_Java_TuDienAnhViet\\src\\Image\\Backgr.png");
//        BufferedImage background = null;
//        try {
//            Image backgr = ImageIO.read(bgr);
//            backgr.getScaledInstance(960, 540,  java.awt.Image.SCALE_SMOOTH);
//            g.drawImage((BufferedImage)backgr, null, 0, 0);
//        } catch (IOException ex) {
//            Logger.getLogger(Main1.class.getName()).log(Level.SEVERE, null, ex);
//            JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi khi đọc tệp hình ảnh: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
//        }
    }
    
    public void Exit()
    {
        JFrame frame = new JFrame("Exit");

        int confirmed = JOptionPane.showConfirmDialog(frame, "Bạn có chắc chắn thoát?", "Exit", JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
    public void Them()
    {
        ThemTu them = new ThemTu(this);
        them.setVisible(true);
        jButtonThemTu.setEnabled(false);
    }
    public void Sua()
    {
        SuaTu sua = new SuaTu(this);
        sua.setVisible(true);
        jButtonSua.setEnabled(false);
    }
    public void Xoa()
    {
        XoaTu xoa = new XoaTu(this);
        xoa.setVisible(true);
        jButtonXoa.setEnabled(false);
    }
    public void DangNhap()
    {
        DangNhap log = new DangNhap(this);
        log.setVisible(true);
        jButtonDangNhap.setEnabled(false);
    }
    public void Setting()
    {
        Setting setting = new Setting(this);
        setting.setVisible(true);
        jButtonSetting.setEnabled(false);
        int indam =0, innghieng =0;
        Color color1 = jTextFieldNhap.getForeground();
        Color color2 = jTextFieldNhap.getBackground();
        Color color3 = jTextFieldXuat.getForeground();
        Color color4 = jTextFieldXuat.getBackground();
        Color color5 = jTextFieldViDu.getForeground();
        Color color6 = jTextFieldViDu.getBackground();
        if(jTextFieldNhap.getFont().isBold())
            indam = 1;
        else
            indam =0;
        
        if(jTextFieldNhap.getFont().isItalic())
            innghieng = 1;
        else
            innghieng =0;
        
        setting.updateTextFieldColors(color1, color2, color3, color4, color5, color6, indam, innghieng);
    }
    public void setbuttonSetting()
    {
        jButtonSetting.setEnabled(true);
    }
    public void setbuttonThem()
    {
        jButtonThemTu.setEnabled(true);
    }
    public void setbuttonXoa()
    {
        jButtonXoa.setEnabled(true);
    }
    public void setbuttonSua()
    {
        jButtonSua.setEnabled(true);
    }
    public void setbuttonDangNhap()
    {
        jButtonDangNhap.setEnabled(true);
    }
    public void updateTextFieldColorsmain(Color cl1, Color cl2, Color cl3, Color cl4, Color cl5, Color cl6, int InDam, int InNghieng) 
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
            f= new Font("Dialog", Font.BOLD, 24);
            jTextFieldNhap.setFont(f);
            jTextFieldXuat.setFont(f);
            jTextFieldViDu.setFont(f);
        }
        else if(InNghieng == 1)
        {
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
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelbgr = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jTextFieldNhap = new javax.swing.JTextField();
        jTextFieldXuat = new javax.swing.JTextField();
        jTextFieldViDu = new javax.swing.JTextField();
        jComboBoxNhap = new javax.swing.JComboBox<>();
        jComboBoxXuat = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButtonDangNhap = new javax.swing.JButton();
        jButtonThemTu = new javax.swing.JButton();
        jButtonSua = new javax.swing.JButton();
        jButtonXoa = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jButtonSetting = new javax.swing.JButton();
        jLabelTrangTri = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuLogin = new javax.swing.JMenu();
        jMenuAdd = new javax.swing.JMenu();
        jMenuRewrite = new javax.swing.JMenu();
        jMenuDelete = new javax.swing.JMenu();
        jMenuSetting = new javax.swing.JMenu();
        jMenuExit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelbgr.setBackground(new java.awt.Color(255, 204, 102));
        jPanelbgr.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jPanelbgr.setMaximumSize(new java.awt.Dimension(960, 540));
        jPanelbgr.setMinimumSize(new java.awt.Dimension(960, 540));
        jPanelbgr.setPreferredSize(new java.awt.Dimension(960, 540));

        jTextFieldNhap.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNhap.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextFieldNhap.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNhap.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldNhap.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldNhap.setMaximumSize(new java.awt.Dimension(400, 148));
        jTextFieldNhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNhapKeyReleased(evt);
            }
        });

        jTextFieldXuat.setEditable(false);
        jTextFieldXuat.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldXuat.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextFieldXuat.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldXuat.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldXuat.setMaximumSize(new java.awt.Dimension(400, 148));

        jTextFieldViDu.setEditable(false);
        jTextFieldViDu.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldViDu.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextFieldViDu.setForeground(new java.awt.Color(0, 0, 0));

        jComboBoxNhap.setBackground(new java.awt.Color(255, 255, 0));
        jComboBoxNhap.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jComboBoxNhap.setForeground(new java.awt.Color(0, 51, 0));
        jComboBoxNhap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiếng Việt", "English" }));
        jComboBoxNhap.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxNhapItemStateChanged(evt);
            }
        });

        jComboBoxXuat.setBackground(new java.awt.Color(255, 255, 0));
        jComboBoxXuat.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jComboBoxXuat.setForeground(new java.awt.Color(0, 51, 0));
        jComboBoxXuat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English", "Tiếng Việt" }));
        jComboBoxXuat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxXuatItemStateChanged(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(153, 255, 153));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Ví Dụ/Ex:");

        jButtonDangNhap.setBackground(new java.awt.Color(0, 51, 51));
        jButtonDangNhap.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jButtonDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDangNhap.setText("Đăng Nhập");
        jButtonDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDangNhapActionPerformed(evt);
            }
        });

        jButtonThemTu.setBackground(new java.awt.Color(0, 51, 51));
        jButtonThemTu.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jButtonThemTu.setForeground(new java.awt.Color(255, 255, 255));
        jButtonThemTu.setText("Thêm Từ");
        jButtonThemTu.setEnabled(false);
        jButtonThemTu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemTuActionPerformed(evt);
            }
        });

        jButtonSua.setBackground(new java.awt.Color(0, 51, 51));
        jButtonSua.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jButtonSua.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSua.setText("  Sửa");
        jButtonSua.setEnabled(false);
        jButtonSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSuaActionPerformed(evt);
            }
        });

        jButtonXoa.setBackground(new java.awt.Color(0, 51, 51));
        jButtonXoa.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jButtonXoa.setForeground(new java.awt.Color(255, 255, 255));
        jButtonXoa.setText("  Xóa");
        jButtonXoa.setEnabled(false);
        jButtonXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXoaActionPerformed(evt);
            }
        });

        jButtonExit.setBackground(new java.awt.Color(0, 51, 51));
        jButtonExit.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExit.setText("  Thoát");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jButtonSetting.setBackground(new java.awt.Color(0, 51, 51));
        jButtonSetting.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jButtonSetting.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSetting.setText("Cài Đặt");
        jButtonSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSettingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelbgrLayout = new javax.swing.GroupLayout(jPanelbgr);
        jPanelbgr.setLayout(jPanelbgrLayout);
        jPanelbgrLayout.setHorizontalGroup(
            jPanelbgrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelbgrLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelbgrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelbgrLayout.createSequentialGroup()
                        .addGroup(jPanelbgrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelTrangTri, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelbgrLayout.createSequentialGroup()
                                .addGroup(jPanelbgrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(76, 76, 76)
                                .addGroup(jPanelbgrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonThemTu, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonSua, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(69, 69, 69)
                                .addGroup(jPanelbgrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelbgrLayout.createSequentialGroup()
                        .addGroup(jPanelbgrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelbgrLayout.createSequentialGroup()
                                .addGroup(jPanelbgrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                                .addGroup(jPanelbgrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelbgrLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextFieldViDu))
                        .addContainerGap())))
        );
        jPanelbgrLayout.setVerticalGroup(
            jPanelbgrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelbgrLayout.createSequentialGroup()
                .addGroup(jPanelbgrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelbgrLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanelbgrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonThemTu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelbgrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSua, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTrangTri, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelbgrLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(jPanelbgrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelbgrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(jTextFieldXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextFieldViDu, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenuLogin.setText("Đăng Nhập");
        jMenuLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuLoginMouseClicked(evt);
            }
        });
        jMenuBar.add(jMenuLogin);

        jMenuAdd.setText("Thêm Từ");
        jMenuAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAddMouseClicked(evt);
            }
        });
        jMenuBar.add(jMenuAdd);

        jMenuRewrite.setText("Sửa Từ");
        jMenuRewrite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuRewriteMouseClicked(evt);
            }
        });
        jMenuBar.add(jMenuRewrite);

        jMenuDelete.setText("Xóa Từ");
        jMenuDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuDeleteMouseClicked(evt);
            }
        });
        jMenuBar.add(jMenuDelete);

        jMenuSetting.setText("Cài Đặt");
        jMenuSetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSettingMouseClicked(evt);
            }
        });
        jMenuBar.add(jMenuSetting);

        jMenuExit.setText("Thoát");
        jMenuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuExitMouseClicked(evt);
            }
        });
        jMenuBar.add(jMenuExit);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelbgr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelbgr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxNhapItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxNhapItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED)
        {
            if(jComboBoxNhap.getSelectedItem().equals("English"))
            {
                jComboBoxXuat.setSelectedItem("Tiếng Việt");
            }
            if(jComboBoxNhap.getSelectedItem().equals("Tiếng Việt"))
            {
                jComboBoxXuat.setSelectedItem("English");
            }
        }
    }//GEN-LAST:event_jComboBoxNhapItemStateChanged

    private void jComboBoxXuatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxXuatItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED)
        {
            if(jComboBoxXuat.getSelectedItem().equals("English"))
            {
                jComboBoxNhap.setSelectedItem("Tiếng Việt");
            }
            if(jComboBoxXuat.getSelectedItem().equals("Tiếng Việt"))
            {
                jComboBoxNhap.setSelectedItem("English");
            }
        }
    }//GEN-LAST:event_jComboBoxXuatItemStateChanged

    private void jButtonSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSettingActionPerformed
        Setting();
    }//GEN-LAST:event_jButtonSettingActionPerformed
    
    private void jButtonDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDangNhapActionPerformed
        DangNhap();
    }//GEN-LAST:event_jButtonDangNhapActionPerformed

    private void jButtonThemTuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemTuActionPerformed
        Them();
    }//GEN-LAST:event_jButtonThemTuActionPerformed
    
    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        Exit();
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoaActionPerformed
        Xoa();
    }//GEN-LAST:event_jButtonXoaActionPerformed

    private void jButtonSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuaActionPerformed
        Sua();
    }//GEN-LAST:event_jButtonSuaActionPerformed

    private void jTextFieldNhapKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNhapKeyReleased
        String Nhap = jTextFieldNhap.getText(); // Lấy dữ liệu từ JTextField nhập

        // Thực hiện tìm kiếm dữ liệu từ cột "TuAnh" dựa trên "TuViet"
        if(jComboBoxNhap.getSelectedItem().equals("Tiếng Việt"))
        {
            String sql = "SELECT TuAnh FROM TuDien WHERE TuViet = ?";

            try (Connection connection = DriverManager.getConnection("jdbc:sqlserver://PCNapVip:1433;databaseName=QLTuDien;encrypt=true;trustServerCertificate=true", "sa", "123");
                PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, Nhap); // Thiết lập tham số cho truy vấn

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next())
                    {
                        String tuAnh = resultSet.getString("TuAnh"); // Lấy giá trị từ cột "TuAnh"
                        jTextFieldXuat.setText(tuAnh); // Đưa giá trị vào JTextField xuất
                        String Vd = resultSet.getString("Vd");
                        jTextFieldViDu.setText(Vd);
                    } else
                    {
                        jTextFieldXuat.setText("Từ này chưa được thêm vào từ điển");
                    }
                }
            } catch (SQLException e){
                e.printStackTrace();
                System.out.println("Kết nối 7 bại!");
            }
        }
        if(jComboBoxNhap.getSelectedItem().equals("English"))
        {
            String sql = "SELECT TuViet, Vd FROM TuDien WHERE TuAnh = ?";

            try (Connection connection = DriverManager.getConnection("jdbc:sqlserver://PCNapVip:1433;databaseName=QLTuDien;encrypt=true;trustServerCertificate=true", "sa", "123");
                PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, Nhap); // Thiết lập tham số cho truy vấn

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next())
                    {
                        String tuAnh = resultSet.getString("TuViet"); // Lấy giá trị từ cột "TuAnh"
                        jTextFieldXuat.setText(tuAnh); // Đưa giá trị vào JTextField xuất
                        String Vd = resultSet.getString("Vd");
                        jTextFieldViDu.setText(Vd);
                    } else
                    {
                        jTextFieldXuat.setText("Từ này chưa được thêm vào từ điển");
                    }
                }
            } catch (SQLException e){
                e.printStackTrace();
                System.out.println("Kết nối 7 bại!");
            }
        }
    }//GEN-LAST:event_jTextFieldNhapKeyReleased

    private void jMenuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuExitMouseClicked
        Exit();  
    }//GEN-LAST:event_jMenuExitMouseClicked

    private void jMenuSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSettingMouseClicked
        Setting();
    }//GEN-LAST:event_jMenuSettingMouseClicked

    private void jMenuDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuDeleteMouseClicked
        Xoa();
    }//GEN-LAST:event_jMenuDeleteMouseClicked

    private void jMenuRewriteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuRewriteMouseClicked
        Sua();
    }//GEN-LAST:event_jMenuRewriteMouseClicked

    private void jMenuAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAddMouseClicked
        Them();
    }//GEN-LAST:event_jMenuAddMouseClicked

    private void jMenuLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuLoginMouseClicked
        DangNhap();
    }//GEN-LAST:event_jMenuLoginMouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDangNhap;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonSetting;
    private javax.swing.JButton jButtonSua;
    private javax.swing.JButton jButtonThemTu;
    private javax.swing.JButton jButtonXoa;
    private javax.swing.JComboBox<String> jComboBoxNhap;
    private javax.swing.JComboBox<String> jComboBoxXuat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelTrangTri;
    private javax.swing.JMenu jMenuAdd;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuDelete;
    private javax.swing.JMenu jMenuExit;
    private javax.swing.JMenu jMenuLogin;
    private javax.swing.JMenu jMenuRewrite;
    private javax.swing.JMenu jMenuSetting;
    private javax.swing.JPanel jPanelbgr;
    private javax.swing.JTextField jTextFieldNhap;
    private javax.swing.JTextField jTextFieldViDu;
    private javax.swing.JTextField jTextFieldXuat;
    // End of variables declaration//GEN-END:variables

}
