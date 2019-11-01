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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        txtTenSP = new javax.swing.JTextField();
        txtXuatXu = new javax.swing.JTextField();
        txtNhaSX = new javax.swing.JTextField();
        txtKhluong = new javax.swing.JTextField();
        txtKichthuoc = new javax.swing.JTextField();
        txtSL = new javax.swing.JTextField();
        txtTgBH = new javax.swing.JTextField();
        txtDonGia = new javax.swing.JTextField();
        txtGhiChu = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        btnXem = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnTim = new javax.swing.JButton();
        btnTrove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THONG TIN SAN PHAM");

        jLabel2.setText("MA SP");

        jLabel3.setText("TEN SP");

        jLabel4.setText("XUAT XU");

        jLabel5.setText("NHA SX");

        jLabel6.setText("KH LUONG");

        jLabel7.setText("KICH THUOC");

        jLabel8.setText("SO LUONG");

        jLabel9.setText("TGBH");

        jLabel10.setText("DON GIA");

        jLabel11.setText("GHI CHU");

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
                "MA SP", "TEN SP", "XUAT XU", "NHA SX", "KH LUONG", "KICH THUOC", "SO LUONG", "TGBH", "DON GIA", "GHI CHUl"
            }
        ));
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSanPham);

        btnXem.setText("XEM DS SP");
        btnXem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXemMouseClicked(evt);
            }
        });

        btnThem.setText("THEM");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });

        btnXoa.setText("XOA");
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });

        btnSua.setText("SUA");
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaMouseClicked(evt);
            }
        });

        btnTim.setText("TIM KIEM");
        btnTim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimMouseClicked(evt);
            }
        });

        btnTrove.setText("Trở về");
        btnTrove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTroveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnXem)
                .addGap(132, 132, 132)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155)
                .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtMaSP, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(txtTenSP)
                            .addComponent(txtXuatXu, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNhaSX, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKhluong, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKichthuoc, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSL, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTgBH, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDonGia, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGhiChu, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTrove)
                        .addGap(381, 381, 381)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTrove)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtXuatXu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNhaSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKhluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKichthuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTgBH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua)
                    .addComponent(btnTim)
                    .addComponent(btnXoa)
                    .addComponent(btnThem)
                    .addComponent(btnXem))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        // TODO add your handling code here:
        loadtblSP();
    }//GEN-LAST:event_btnXemMouseClicked

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

    private void btnTroveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTroveMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_btnTroveMouseClicked

    public void loadtblSP(){
        SanPhamBUS sanPhamBUS=new SanPhamBUS();
        listSP=sanPhamBUS.docDSSP();
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
