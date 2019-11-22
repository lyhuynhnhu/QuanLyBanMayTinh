package GUI;

import DTO.SanPham;
import BUS.SanPhamBUS;
import java.util.ArrayList;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PRODUCT extends javax.swing.JFrame {

    public static DefaultTableModel model=new DefaultTableModel();
    private ArrayList<SanPham> listSP=new ArrayList<>();
    private JFrame frame;
    
    public PRODUCT() {
        initComponents();
        loadtblSP();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        btnXoa = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnXem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnTim = new javax.swing.JButton();
        txtXuatXu = new javax.swing.JTextField();
        txtNhaSX = new javax.swing.JTextField();
        txtKhluong = new javax.swing.JTextField();
        txtKichthuoc = new javax.swing.JTextField();
        txtSL = new javax.swing.JTextField();
        txtTgBH = new javax.swing.JTextField();
        txtDonGia = new javax.swing.JTextField();
        txtGhiChu = new javax.swing.JTextField();
        btnTrove = new javax.swing.JButton();
        btnTaomoi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÔNG TIN SẢN PHẨM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("MÃ SP");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("TÊN SP");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("XUẤT XỨ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("NHÀ SX");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("KH.LƯỢNG");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("KÍCH THƯỚC");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("SỐ LƯỢNG");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("TGBH");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("ĐƠN GIÁ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("GHI CHÚ");

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "MÃ SP", "TÊN SP", "XUẤT XỨ", "NHÀ SX", "KH.LƯỢNG", "KÍCH THƯỚC", "SỐ LƯỢNG", "TGBH", "ĐƠN GIÁ", "GHI CHÚ"
            }
        ));
        tblSanPham.setOpaque(false);
        tblSanPham.setRowHeight(25);
        tblSanPham.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSanPham);

        btnXoa.setBackground(new java.awt.Color(255, 255, 255));
        btnXoa.setForeground(new java.awt.Color(255, 51, 51));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        btnXoa.setText("XÓA");
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(255, 255, 255));
        btnThem.setForeground(new java.awt.Color(102, 204, 255));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/them.png"))); // NOI18N
        btnThem.setText("THÊM");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });

        btnXem.setBackground(new java.awt.Color(255, 255, 255));
        btnXem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fileview_text.png"))); // NOI18N
        btnXem.setText("XEM DS SP");
        btnXem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXemMouseClicked(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(255, 255, 255));
        btnSua.setForeground(new java.awt.Color(0, 204, 0));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/update.png"))); // NOI18N
        btnSua.setText("SỬA");
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaMouseClicked(evt);
            }
        });

        btnTim.setBackground(new java.awt.Color(255, 255, 255));
        btnTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search (1).png"))); // NOI18N
        btnTim.setText("TÌM KIẾM");
        btnTim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimMouseClicked(evt);
            }
        });

        btnTrove.setBackground(new java.awt.Color(255, 255, 255));
        btnTrove.setText("Trở về");
        btnTrove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTroveMouseClicked(evt);
            }
        });

        btnTaomoi.setBackground(new java.awt.Color(255, 255, 255));
        btnTaomoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reset.png"))); // NOI18N
        btnTaomoi.setText("TẠO MỚI");
        btnTaomoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTaomoiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnXem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(btnTaomoi, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTrove)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtDonGia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                    .addComponent(txtTgBH, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSL, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtKichthuoc, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtKhluong, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGhiChu)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNhaSX, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTenSP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                    .addComponent(txtMaSP, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtXuatXu, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTrove)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtXuatXu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNhaSX, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtKhluong, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtKichthuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTgBH, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnXem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoa)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTim)
                    .addComponent(btnTaomoi))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTaomoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaomoiMouseClicked
        txtMaSP.setText("");
        txtNhaSX.setText("");
        txtTenSP.setText("");
        txtDonGia.setText("");
        txtGhiChu.setText("");
        txtKhluong.setText("");
        txtKichthuoc.setText("");
        txtSL.setText("");
        txtTgBH.setText("");
        txtXuatXu.setText("");
    }//GEN-LAST:event_btnTaomoiMouseClicked

    private void btnTroveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTroveMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_btnTroveMouseClicked

    private void btnTimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimMouseClicked
        String MaSanPham, TenSanPham, Xuatxu, Nhasx;
        MaSanPham = txtMaSP.getText();
        TenSanPham = txtTenSP.getText();
        Xuatxu = txtXuatXu.getText();
        Nhasx = txtNhaSX.getText();
        SanPhamBUS sanPhamBUS=new SanPhamBUS();
        if(!"".equals(MaSanPham)){
            listSP=sanPhamBUS.timTheoma(MaSanPham);
        } else {
            if(!"".equals(TenSanPham)) listSP=sanPhamBUS.timTheoten(TenSanPham);
            else {
                if(!"".equals(Xuatxu)) listSP=sanPhamBUS.timTheoXuatxu(Xuatxu);
                else listSP=sanPhamBUS.timTheoNhasx(Nhasx);
            }
        }
        if(listSP.isEmpty()){
            JOptionPane.showMessageDialog(frame, "Không tìm thấy sản phẩm");
        }
        Vector header=new Vector();
        header.add("Mã SP");
        header.add("Tên SP");
        header.add("Xuất xứ");
        header.add("Nhà SX");
        header.add("Khối lượng");
        header.add("Kích thước");
        header.add("Số lượng");
        header.add("Tgian BH");
        header.add("Đơn giá");
        header.add("Ghi chú");

        model=new DefaultTableModel(header,0);
        for(SanPham sanPhamDTO : listSP){
            Vector row=new Vector();
            row.add(sanPhamDTO.masp);
            row.add(sanPhamDTO.tensp);
            row.add(sanPhamDTO.xuatxu);
            row.add(sanPhamDTO.nsx);
            row.add(sanPhamDTO.khluong);
            row.add(sanPhamDTO.kichthuoc);
            row.add(sanPhamDTO.sl);
            row.add(sanPhamDTO.tgbaohanh);
            row.add(sanPhamDTO.dongia);
            row.add(sanPhamDTO.ghichu);
            model.addRow(row);
            tblSanPham.setModel(model);
        }
    }//GEN-LAST:event_btnTimMouseClicked

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked
        SanPham sanPhamDTO=new SanPham();
        sanPhamDTO.masp=txtMaSP.getText();
        sanPhamDTO.tensp=txtTenSP.getText();
        sanPhamDTO.xuatxu=txtXuatXu.getText();
        sanPhamDTO.nsx=txtNhaSX.getText();
        sanPhamDTO.khluong=Float.parseFloat(txtKhluong.getText());
        sanPhamDTO.kichthuoc=Float.parseFloat(txtKichthuoc.getText());
        sanPhamDTO.sl=Integer.parseInt(txtSL.getText());
        sanPhamDTO.tgbaohanh=txtTgBH.getText();
        sanPhamDTO.dongia=txtDonGia.getText();
        sanPhamDTO.ghichu=txtGhiChu.getText();
        SanPhamBUS sanPhamBUS=new SanPhamBUS();
        boolean kiemtra = KiemTraNhapSanPham(1);
        if (kiemtra) {
            sanPhamBUS.sua(sanPhamDTO);
            int i=tblSanPham.getSelectedRow();
            if(i>=0){
                model.setValueAt(txtTenSP.getText(), i, 1);
                model.setValueAt(txtXuatXu.getText(), i, 2);
                model.setValueAt(txtNhaSX.getText(), i, 3);
                model.setValueAt(txtKhluong.getText(), i, 4);
                model.setValueAt(txtKichthuoc.getText(), i, 5);
                model.setValueAt(txtSL.getText(), i, 6);
                model.setValueAt(txtTgBH.getText(), i, 7);
                model.setValueAt(txtDonGia.getText(), i, 8);
                model.setValueAt(txtGhiChu.getText(), i, 9);
                tblSanPham.setModel(model);
            }
            JOptionPane.showMessageDialog(frame, "Sửa thành công rồi nhé!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/thanhcong.png")));
        } else {
            JOptionPane.showMessageDialog(frame, "Sửa thất bại!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/message.jpg")));
        }
    }//GEN-LAST:event_btnSuaMouseClicked

    private void btnXemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXemMouseClicked
        loadtblSP();
    }//GEN-LAST:event_btnXemMouseClicked

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        SanPham sanPhamDTO=new SanPham();
        sanPhamDTO.masp=txtMaSP.getText();
        sanPhamDTO.tensp=txtTenSP.getText();
        sanPhamDTO.xuatxu=txtXuatXu.getText();
        sanPhamDTO.nsx=txtNhaSX.getText();
        sanPhamDTO.khluong=Float.parseFloat(txtKhluong.getText());
        sanPhamDTO.kichthuoc=Float.parseFloat(txtKichthuoc.getText());
        sanPhamDTO.sl=Integer.parseInt(txtSL.getText());
        sanPhamDTO.tgbaohanh=txtTgBH.getText();
        sanPhamDTO.dongia=txtDonGia.getText();
        sanPhamDTO.ghichu=txtGhiChu.getText();
        listSP.add(sanPhamDTO);
        SanPhamBUS sanPhamBUS=new SanPhamBUS();
        boolean kiemtra = KiemTraNhapSanPham(0);
        if (kiemtra) {
            sanPhamBUS.them(sanPhamDTO);
            Vector row= new Vector();
            row.add(txtMaSP.getText());
            row.add(txtTenSP.getText());
            row.add(txtXuatXu.getText());
            row.add(txtNhaSX.getText());
            row.add(txtKhluong.getText());
            row.add(txtKichthuoc.getText());
            row.add(txtSL.getText());
            row.add(txtTgBH.getText());
            row.add(txtDonGia.getText());
            row.add(txtGhiChu.getText());
            model.addRow(row);
            tblSanPham.setModel(model);
            JOptionPane.showMessageDialog(frame, "Thêm thành công rồi nhé!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/thanhcong.png")));
        } else {
            JOptionPane.showMessageDialog(frame, "Thêm thất bại!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/message.jpg")));
        }
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        int i=tblSanPham.getSelectedRow();
        String MaSP=tblSanPham.getModel().getValueAt(i, 0).toString();
        String TenSP=tblSanPham.getModel().getValueAt(i, 1).toString();
        SanPhamBUS sanPhamBUS=new SanPhamBUS();
        int ret = JOptionPane.showOptionDialog(this,"Bạn chắc chắn muốn xóa sản phẩm "+TenSP+" ?", "Confirm"
            ,JOptionPane.YES_NO_OPTION
            ,JOptionPane.QUESTION_MESSAGE, null
            ,new String[] {"OK","Bỏ chọn"}, "OK");
        if(ret == JOptionPane.YES_OPTION) {
            if(i>=0){
                sanPhamBUS.xoa(MaSP);
                model.removeRow(i);
                tblSanPham.setModel(model);
            }
            JOptionPane.showMessageDialog(frame, "Xóa thành công rồi!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/thanhcong.png")));
        }else {
            //trường hợp chon cancel
            JOptionPane.showMessageDialog(frame, "Lần sau nghĩ kỹ rồi hãy bấm nút nhé!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/message.jpg")));
        }
    }//GEN-LAST:event_btnXoaMouseClicked

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        try {
            int i=tblSanPham.getSelectedRow();
            txtMaSP.setText(tblSanPham.getModel().getValueAt(i, 0).toString());
            txtTenSP.setText(tblSanPham.getModel().getValueAt(i, 1).toString());
            txtXuatXu.setText(tblSanPham.getModel().getValueAt(i, 2).toString());
            txtNhaSX.setText(tblSanPham.getModel().getValueAt(i, 3).toString());
            txtKhluong.setText(tblSanPham.getModel().getValueAt(i, 4).toString());
            txtKichthuoc.setText(tblSanPham.getModel().getValueAt(i, 5).toString());
            txtSL.setText(tblSanPham.getModel().getValueAt(i, 6).toString());
            txtTgBH.setText(tblSanPham.getModel().getValueAt(i, 7).toString());
            txtDonGia.setText(tblSanPham.getModel().getValueAt(i, 8).toString());
            txtGhiChu.setText(tblSanPham.getModel().getValueAt(i, 9).toString());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tblSanPhamMouseClicked

    public void loadtblSP(){
        SanPhamBUS sanPhamBUS=new SanPhamBUS();
        listSP=sanPhamBUS.docDSSP();
        Vector header=new Vector();
        header.add("Mã SP");
        header.add("Tên SP"); 
        header.add("Xuất xứ");
        header.add("Nhà SX");      
        header.add("Khlượng (kg)");
        header.add("Kthước (inch)");
        header.add("Số lượng");
        header.add("TGBH (tháng)");
        header.add("Đơn giá");
        header.add("Ghi chú");
        
        model=new DefaultTableModel(header,0);
        for(SanPham sanPhamDTO : listSP){
        Vector row=new Vector();
            row.add(sanPhamDTO.masp);
            row.add(sanPhamDTO.tensp);
            row.add(sanPhamDTO.xuatxu);
            row.add(sanPhamDTO.nsx);
            row.add(sanPhamDTO.khluong);
            row.add(sanPhamDTO.kichthuoc);
            row.add(sanPhamDTO.sl);
            row.add(sanPhamDTO.tgbaohanh);
            row.add(sanPhamDTO.dongia);
            row.add(sanPhamDTO.ghichu);        
            model.addRow(row);
            tblSanPham.setModel(model);
        }
    }
    
    public boolean KiemTraNhapSanPham(int ts) {
        String MaSanPham, TenSanPham, Xuatxu, Nhasx, Khluong, Kthuoc, Soluong, Dongia, TgBhanh,Ghichu;
        boolean kiemtra;
        Ghichu=txtGhiChu.getText();
        MaSanPham = txtMaSP.getText();
        TenSanPham = txtTenSP.getText();
        Xuatxu = txtXuatXu.getText();
        Nhasx = txtNhaSX.getText();
        Khluong = txtKhluong.getText();
        Kthuoc = txtKichthuoc.getText();
        Soluong = txtSL.getText();
        Dongia = txtDonGia.getText();
        TgBhanh = txtTgBH.getText();
        String ThongBao = "";
        if(ts==0){
            if (MaSanPham.equals("")) {
                ThongBao += "Bạn chưa nhập mã sản phẩm\n";
                txtMaSP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
                txtMaSP.requestFocus();
            }else {
                SanPhamBUS sanPhamBUS=new SanPhamBUS();
                listSP=sanPhamBUS.docDSSP();
                for(SanPham sanPhamDTO : listSP){
                    if (MaSanPham.equals(sanPhamDTO.masp)) {
                        ThongBao += "Mã sản phẩm bị trùng lặp\n";
                        txtMaSP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
                        txtMaSP.requestFocus();
                        txtMaSP.setText("");
                    }
                }
            }
        }        
        if (TenSanPham.equals("")) {
            ThongBao += "Bạn chưa nhập tên sản phẩm\n";
            txtTenSP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
            txtTenSP.requestFocus();
        }
        if (Xuatxu.equals("")) {
            txtXuatXu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
            ThongBao += "Bạn chưa nhập xuất xứ sp \n";
            txtXuatXu.requestFocus();
        }
        if (Nhasx.equals("")) {
            txtNhaSX.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
            ThongBao += "Bạn chưa nhập nhà sx \n";
            txtNhaSX.requestFocus();
        }
        Pattern patternSL = Pattern.compile("\\d*"); 
        Matcher matcherSL = patternSL.matcher(Soluong); 
        if (Soluong.equals("")) {
            txtSL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
            ThongBao += "Bạn chưa nhập số lượng\n";
            txtSL.requestFocus();
        }else if (!matcherSL.matches()) {
            txtSL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
            ThongBao += "Dữ liệu nhập không hợp lệ\n";
            txtSL.requestFocus();
        }
        Pattern patternDG = Pattern.compile("\\d*"); 
        Matcher matcherDG = patternDG.matcher(Dongia);
        if (Dongia.equals("")) {
            txtDonGia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
            ThongBao += "Bạn chưa nhập đơn giá \n";
            txtDonGia.requestFocus();
        }else if (!matcherDG.matches()) {
            txtDonGia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
            ThongBao += "Dữ liệu nhập không hợp lệ\n";
            txtDonGia.requestFocus();
        }
        if (TgBhanh.equals("")) {
            txtTgBH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
            ThongBao += "Bạn chưa nhập thời gian bảo hành \n";
            txtTgBH.requestFocus();
        }
        if (Khluong.equals("")) {
            txtKhluong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
            ThongBao += "Bạn chưa nhập khối lượng \n";
            txtKhluong.requestFocus();
        }
        if (Kthuoc.equals("")) {
            txtKichthuoc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
            ThongBao += "Bạn chưa nhập kích thước \n";
            txtKichthuoc.requestFocus();
        }
        if (ThongBao.equals("")) {
            kiemtra = true;
            txtMaSP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
            txtTenSP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
            txtDonGia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
            txtSL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
            txtXuatXu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
            txtNhaSX.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
            txtKhluong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
            txtKichthuoc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
            txtTgBH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
        } else {
            kiemtra = false;
            ThongBao(ThongBao, "lỗi nhập liệu", 2);
        }
        return kiemtra;
    }
    
    public void ThongBao(String noiDungThongBao, String tieuDeThongBao, int icon) {
        JOptionPane.showMessageDialog(new JFrame(), noiDungThongBao,
                tieuDeThongBao, icon);
    } 
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
            java.util.logging.Logger.getLogger(PRODUCT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PRODUCT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PRODUCT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PRODUCT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PRODUCT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTaomoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnTrove;
    private javax.swing.JButton btnXem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtGhiChu;
    private javax.swing.JTextField txtKhluong;
    private javax.swing.JTextField txtKichthuoc;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtNhaSX;
    private javax.swing.JTextField txtSL;
    private javax.swing.JTextField txtTenSP;
    private javax.swing.JTextField txtTgBH;
    private javax.swing.JTextField txtXuatXu;
    // End of variables declaration//GEN-END:variables
}
