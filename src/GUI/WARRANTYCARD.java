package GUI;

import BUS.PhieuBaoHanhBUS;
import DTO.PhieuBaoHanh;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class WARRANTYCARD extends javax.swing.JFrame {
    
    private DefaultTableModel model=new DefaultTableModel();
    private ArrayList<PhieuBaoHanh> listBH=new ArrayList<>();
    private JFrame frame;
    
    public WARRANTYCARD() {
        initComponents();
        loadtblKH();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnTrove = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPBH = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtMaBH = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMaHD = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtLoai = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTinhTrang = new javax.swing.JTextField();
        btnXem = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnTim = new javax.swing.JButton();
        btnTaomoi = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PHIẾU BẢO HÀNH");

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

        btnTrove.setText("Trở về");
        btnTrove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTroveMouseClicked(evt);
            }
        });

        tblPBH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "MA  BH", "MA  HĐ", "MA  SP", "LOAI", "TINH TRANG"
            }
        ));
        tblPBH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPBHMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPBH);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("MÃ BH");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("MÃ HĐ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("MÃ SP");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("LOẠI");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("TÌNH TRẠNG");

        btnXem.setBackground(new java.awt.Color(255, 255, 255));
        btnXem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fileview_text.png"))); // NOI18N
        btnXem.setText("XEM DS");
        btnXem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXemMouseClicked(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(255, 255, 255));
        btnThem.setForeground(new java.awt.Color(51, 204, 255));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/them.png"))); // NOI18N
        btnThem.setText("THÊM");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(255, 255, 255));
        btnXoa.setForeground(new java.awt.Color(255, 51, 51));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        btnXoa.setText("XÓA");
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(255, 255, 255));
        btnSua.setForeground(new java.awt.Color(51, 204, 0));
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
        btnTim.setPreferredSize(new java.awt.Dimension(101, 45));
        btnTim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimMouseClicked(evt);
            }
        });

        btnTaomoi.setBackground(new java.awt.Color(255, 255, 255));
        btnTaomoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reset.png"))); // NOI18N
        btnTaomoi.setText("TẠO MỚI");
        btnTaomoi.setPreferredSize(new java.awt.Dimension(101, 45));
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTrove)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMaBH, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                    .addComponent(txtMaHD)
                                    .addComponent(txtMaSP)
                                    .addComponent(txtLoai)
                                    .addComponent(txtTinhTrang)))
                            .addComponent(btnXem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(216, 216, 216)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTaomoi, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTrove)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaBH, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE))))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnXem, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTaomoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblPBHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPBHMouseClicked
        try {
            int i=tblPBH.getSelectedRow();
            txtMaBH.setText(tblPBH.getModel().getValueAt(i, 0).toString());
            txtMaHD.setText(tblPBH.getModel().getValueAt(i, 1).toString());
            txtMaSP.setText(tblPBH.getModel().getValueAt(i, 2).toString());
            txtLoai.setText(tblPBH.getModel().getValueAt(i, 3).toString()); 
            txtTinhTrang.setText(tblPBH.getModel().getValueAt(i, 4).toString());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tblPBHMouseClicked

    private void btnXemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXemMouseClicked
        loadtblKH();
    }//GEN-LAST:event_btnXemMouseClicked

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        PhieuBaoHanh pbh=new PhieuBaoHanh();
        pbh.MaBH=txtMaBH.getText();
        pbh.MaHD=txtMaHD.getText();
        pbh.MaSP=txtMaSP.getText();
        pbh.Loai=txtLoai.getText();
        pbh.TinhTrang=txtTinhTrang.getText();
        listBH.add(pbh);
        PhieuBaoHanhBUS pbhbus=new PhieuBaoHanhBUS();
        boolean kiemtra = KiemTraNhapPBH(0);
        if (kiemtra) {        
            pbhbus.them(pbh);
            Vector row= new Vector();
            row.add(txtMaBH.getText());
            row.add(txtMaHD.getText());
            row.add(txtMaSP.getText());
            row.add(txtLoai.getText());
            row.add(txtTinhTrang.getText());
            model.addRow(row);
            tblPBH.setModel(model);
            JOptionPane.showMessageDialog(frame, "Thêm thành công!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/thanhcong.png")));
        } else {
            JOptionPane.showMessageDialog(frame, "Thêm thất bại!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/message.jpg")));
        } 
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        int i=tblPBH.getSelectedRow();
        String Ma=tblPBH.getModel().getValueAt(i, 0).toString();
        PhieuBaoHanhBUS pbhbus=new PhieuBaoHanhBUS();
        int ret = JOptionPane.showOptionDialog(this,"Bạn chắc chắn muốn xóa phiếu này ?", "Confirm"
                ,JOptionPane.YES_NO_OPTION
                ,JOptionPane.QUESTION_MESSAGE, null
                ,new String[] {"OK","Bỏ chọn"}, "OK");
        if(ret == JOptionPane.YES_OPTION) {
            if(i>=0){
                pbhbus.xoa(Ma);
                model.removeRow(i);
                tblPBH.setModel(model);
                JOptionPane.showMessageDialog(frame, "Xóa thành công!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/thanhcong.png")));
            }else{
                JOptionPane.showMessageDialog(null, "Bạn chưa chọn phiếu BH muốn xóa!");
            }
        }else {
            //trường hợp chon cancel
            JOptionPane.showMessageDialog(frame, "Bạn đã bỏ lựa chọn vừa rồi. Xóa thất bại!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/message.jpg")));
        } 
    }//GEN-LAST:event_btnXoaMouseClicked

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked
        PhieuBaoHanh pbh=new PhieuBaoHanh();
        pbh.MaBH=txtMaBH.getText();
        pbh.MaHD=txtMaHD.getText();
        pbh.MaSP=txtMaSP.getText();
        pbh.Loai=txtLoai.getText();
        pbh.TinhTrang=txtTinhTrang.getText();
        PhieuBaoHanhBUS pbhbus=new PhieuBaoHanhBUS();
        boolean kiemtra = KiemTraNhapPBH(1);
        if (kiemtra) {        
            pbhbus.sua(pbh);
            int i=tblPBH.getSelectedRow();
            if(i>=0){            
                model.setValueAt(txtMaHD.getText(), i, 1);  
                model.setValueAt(txtMaSP.getText(), i, 2);
                model.setValueAt(txtLoai.getText(), i, 3);   
                model.setValueAt(txtTinhTrang.getText(), i, 4); 
                tblPBH.setModel(model);
            }    
            JOptionPane.showMessageDialog(frame, "Sửa thành công!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/thanhcong.png")));
        } else {
            JOptionPane.showMessageDialog(frame, "Sửa thất bại!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/message.jpg")));
        }
    }//GEN-LAST:event_btnSuaMouseClicked

    private void btnTimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimMouseClicked
        String MaBH, MaHD, MaSP, Loai;
        MaBH = txtMaBH.getText();
        MaHD = txtMaHD.getText();
        MaSP = txtMaSP.getText();
        Loai = txtLoai.getText();
        PhieuBaoHanhBUS phieuBaoHanhBUS= new PhieuBaoHanhBUS();
        if(!"".equals(MaBH)){
            listBH= phieuBaoHanhBUS.timTheomabh(MaBH);
        } else {
            if(!"".equals(MaHD)) listBH= phieuBaoHanhBUS.timTheomahd(MaHD);
            else {
                if(!"".equals(MaSP)) listBH= phieuBaoHanhBUS.timTheomasp(MaSP);
                else listBH= phieuBaoHanhBUS.timTheoloai(Loai);
            }
        }
        if(listBH.isEmpty()){
            JOptionPane.showMessageDialog(frame, "Không tìm thấy phiếu bảo hành");
        }
        Vector header=new Vector();
        header.add("Mã BH");
        header.add("Mã HĐ");
        header.add("Mã SP");
        header.add("Loại");
        header.add("Tình trạng");

        model=new DefaultTableModel(header,0);
        for(PhieuBaoHanh pbh : listBH){
            Vector row=new Vector();
            row.add(pbh.MaBH);
            row.add(pbh.MaHD);
            row.add(pbh.MaSP);
            row.add(pbh.Loai);
            row.add(pbh.TinhTrang);
            model.addRow(row);
            tblPBH.setModel(model);
        }
    }//GEN-LAST:event_btnTimMouseClicked

    private void btnTroveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTroveMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_btnTroveMouseClicked

    private void btnTaomoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaomoiMouseClicked
        txtMaBH.setText("");
        txtMaHD.setText("");
        txtMaSP.setText("");
        txtLoai.setText("");
        txtTinhTrang.setText("");
    }//GEN-LAST:event_btnTaomoiMouseClicked

    public void loadtblKH(){
        PhieuBaoHanhBUS phieuBaoHanhBUS=new PhieuBaoHanhBUS();
        listBH=phieuBaoHanhBUS.docDSPBH();
        Vector header=new Vector();
        header.add("Mã BH");
        header.add("Mã HĐ");
        header.add("Mã SP");
        header.add("Loại");
        header.add("Tình trạng");

        model=new DefaultTableModel(header,0);
        for(PhieuBaoHanh pbh : listBH){
            Vector row=new Vector();
            row.add(pbh.MaBH);
            row.add(pbh.MaHD);
            row.add(pbh.MaSP);
            row.add(pbh.Loai);
            row.add(pbh.TinhTrang);
            model.addRow(row);
            tblPBH.setModel(model);
        }
    }
    public boolean KiemTraNhapPBH(int ts) {
        String MaBH, MaHD, MaSP, Loai, Ttrang;
        boolean kiemtra;
        String ThongBao = "";
        MaBH = txtMaBH.getText();
        MaHD = txtMaHD.getText();
        MaSP = txtMaSP.getText();
        Loai = txtLoai.getText();
        Ttrang=txtTinhTrang.getText();
        if(ts==0){
            if (MaBH.equals("")) {
                ThongBao += "Bạn chưa nhập mã BH\n";
                txtMaBH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
                txtMaBH.requestFocus();
            }else {
                PhieuBaoHanhBUS pbhbus=new PhieuBaoHanhBUS();
                listBH=pbhbus.docDSPBH();
                for(PhieuBaoHanh pbh : listBH){
                    if (MaBH.equals(pbh.MaBH)) {
                        ThongBao += "Mã BH bị trùng lặp\n";
                        txtMaBH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
                        txtMaBH.requestFocus();
                        txtMaBH.setText("");
                    }
                }
            }
        }
        if (MaHD.equals("")) {
            ThongBao += "Bạn chưa nhập mã HĐ\n";
            txtMaHD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
            txtMaHD.requestFocus();
        }
        if (MaSP.equals("")) {
            txtMaSP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
            ThongBao += "Bạn chưa nhập mã SP\n";
            txtMaSP.requestFocus();
        }
        if (Loai.equals("")) {
            ThongBao += "Bạn chưa nhập loại BH\n";
            txtLoai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
            txtLoai.requestFocus();
        }
        if (Ttrang.equals("")) {
            txtTinhTrang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
            ThongBao += "Bạn chưa nhập tình trạng\n";
            txtTinhTrang.requestFocus();
        }
        if (ThongBao.equals("")) {
            kiemtra = true;
            txtMaBH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
            txtMaHD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
            txtMaSP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
            txtLoai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
            txtTinhTrang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
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
            java.util.logging.Logger.getLogger(WARRANTYCARD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WARRANTYCARD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WARRANTYCARD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WARRANTYCARD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WARRANTYCARD().setVisible(true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPBH;
    private javax.swing.JTextField txtLoai;
    private javax.swing.JTextField txtMaBH;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtTinhTrang;
    // End of variables declaration//GEN-END:variables
}
