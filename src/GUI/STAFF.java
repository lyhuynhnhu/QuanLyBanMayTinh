package GUI;

import BUS.NhanVienBUS;
import DTO.NhanVien;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class STAFF extends javax.swing.JFrame {
    private DefaultTableModel model=new DefaultTableModel();
    private ArrayList<NhanVien> listNV=new ArrayList<>();
    private JFrame frame;
    SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
    
    public STAFF() {
        initComponents();
        loadtbl();
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
        txtMaNV = new javax.swing.JTextField();
        txtTenNV = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtDthoai = new javax.swing.JTextField();
        txtChucVu = new javax.swing.JTextField();
        txtLuong = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnTim = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtGtinh = new javax.swing.JTextField();
        btnXem = new javax.swing.JButton();
        btnTrove = new javax.swing.JButton();
        dcNgsinh = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÔNG TIN NHÂN VIÊN");

        jLabel2.setText("MA NV");

        jLabel3.setText("TEN NV");

        jLabel4.setText("DIA CHI");

        jLabel5.setText("SDT");

        jLabel6.setText("CHUC VU");

        jLabel7.setText("NGAY SINH");

        jLabel8.setText("LUONG");

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "MA NV", "TEN NV", "NGSINH", "GIOI TINH", "DIA CHI", "SĐT", "LUONG", "CHUC VU"
            }
        ));
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhanVien);

        btnThem.setText("THEM");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnTim.setText("TIM KIEM");
        btnTim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimMouseClicked(evt);
            }
        });

        btnXoa.setText("XOA");
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setText("SUA");
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaMouseClicked(evt);
            }
        });

        jLabel9.setText("GIOI TINH");

        btnXem.setText("XEM DS NV");
        btnXem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXemMouseClicked(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnXem, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnTrove)
                        .addGap(209, 209, 209)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLuong)
                            .addComponent(txtChucVu)
                            .addComponent(txtDthoai)
                            .addComponent(txtDiaChi)
                            .addComponent(txtTenNV)
                            .addComponent(txtMaNV)
                            .addComponent(txtGtinh, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(dcNgsinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTrove))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDthoai, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dcNgsinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGtinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnTim)
                    .addComponent(btnXem))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXemMouseClicked
        loadtbl();
    }//GEN-LAST:event_btnXemMouseClicked

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        int count=0;
        count=tblNhanVien.getRowCount();
        String chuoi2="";
                chuoi2=tblNhanVien.getModel().getValueAt(count-1, 0).toString();
       // JOptionPane.showMessageDialog(frame, chuoi2);
        chuoi2=chuoi2.substring(2);
        count=Integer.parseInt(chuoi2);
        String chuoi1="";
        //int chuoi2=0;
        
        if(count<10)
        { chuoi1="NV00"+String.valueOf(count+1);
            txtMaNV.setText(chuoi1);}
        else if (count<99)
        {
            chuoi1="NV0"+String.valueOf(count+1);
            txtMaNV.setText(chuoi1);
        }        else if (count>=99)
        {
            chuoi1="NV"+String.valueOf(count+1);
            txtMaNV.setText(chuoi1);
        }
            
        
        {NhanVien nhanVienDTO= new NhanVien();
        nhanVienDTO.MaNV=txtMaNV.getText();
        nhanVienDTO.Ten=txtTenNV.getText();
        nhanVienDTO.NgaySinh=dateFormat.format(dcNgsinh.getDate());
        nhanVienDTO.GioiTinh=txtGtinh.getText();
        nhanVienDTO.DiaChi=txtDiaChi.getText();
        nhanVienDTO.Dthoai=txtDthoai.getText();
        nhanVienDTO.Luong=Integer.parseInt(txtLuong.getText());
        nhanVienDTO.ChucVu=txtChucVu.getText();
        listNV.add(nhanVienDTO);
        NhanVienBUS nhanVienBUS=new NhanVienBUS();
        boolean kiemtra = KiemTraNhapNhanVien(0);
        if (kiemtra) {        
            nhanVienBUS.them(nhanVienDTO);
            Vector row= new Vector();
            row.add(txtMaNV.getText());
            row.add(txtTenNV.getText());
            row.add(dateFormat.format(dcNgsinh.getDate()));
            row.add(txtGtinh.getText());
            row.add(txtDiaChi.getText());
            row.add(txtDthoai.getText());
            row.add(txtLuong.getText());
            row.add(txtChucVu.getText());
            model.addRow(row);
            tblNhanVien.setModel(model);
            JOptionPane.showMessageDialog(frame, "Thêm thành công!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/thanhcong.png")));
        } else {
            JOptionPane.showMessageDialog(frame, "Thêm thất bại!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/message.jpg")));
        }
        }
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        int i=tblNhanVien.getSelectedRow();
        String MaNV=tblNhanVien.getModel().getValueAt(i, 0).toString();
        String TenNV=tblNhanVien.getModel().getValueAt(i, 1).toString();
        NhanVienBUS nhanVienBUS= new NhanVienBUS();
        int ret = JOptionPane.showOptionDialog(this,"Bạn chắc chắn muốn xóa nhân viên "+TenNV+" ?", "Confirm"
                ,JOptionPane.YES_NO_OPTION
                ,JOptionPane.QUESTION_MESSAGE, null
                ,new String[] {"OK","Bỏ chọn"}, "OK");
        if(ret == JOptionPane.YES_OPTION) {
            if(i>=0){
                nhanVienBUS.xoa(MaNV);
                model.removeRow(i);
                tblNhanVien.setModel(model);
                JOptionPane.showMessageDialog(frame, "Xóa thành công!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/thanhcong.png")));
            }else{
                JOptionPane.showMessageDialog(null, "Bạn chưa chọn nhân viên muốn xóa!");
            }            
        }else {
            //trường hợp chon cancel
            JOptionPane.showMessageDialog(frame, "Bạn đã bỏ lựa chọn vừa rồi. Xóa thất bại!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/message.jpg")));
        } 
    }//GEN-LAST:event_btnXoaMouseClicked

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked
        NhanVien nhanVienDTO= new NhanVien();
        nhanVienDTO.MaNV=txtMaNV.getText();
        nhanVienDTO.Ten=txtTenNV.getText();
        nhanVienDTO.NgaySinh=dateFormat.format(dcNgsinh.getDate());
        nhanVienDTO.GioiTinh=txtGtinh.getText();
        nhanVienDTO.DiaChi=txtDiaChi.getText();
        nhanVienDTO.Dthoai=txtDthoai.getText();
        nhanVienDTO.Luong=Integer.parseInt(txtLuong.getText());
        nhanVienDTO.ChucVu=txtChucVu.getText();
        NhanVienBUS nhanVienBUS=new NhanVienBUS();
        boolean kiemtra = KiemTraNhapNhanVien(1);        
        if (kiemtra) {        
            nhanVienBUS.sua(nhanVienDTO);
            int i=tblNhanVien.getSelectedRow();
            if(i>=0){
                model.setValueAt(txtTenNV.getText(), i, 1);
                model.setValueAt(dateFormat.format(dcNgsinh.getDate()), i, 2);
                model.setValueAt(txtGtinh.getText(), i, 3);   
                model.setValueAt(txtDiaChi.getText(), i, 4);   
                model.setValueAt(txtDthoai.getText(), i, 5);
                model.setValueAt(txtLuong.getText(), i, 6);   
                model.setValueAt(txtChucVu.getText(), i, 7);
                tblNhanVien.setModel(model);
            }
            JOptionPane.showMessageDialog(frame, "Sửa thành công!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/thanhcong.png")));
        } else {
            JOptionPane.showMessageDialog(frame, "Sửa thất bại!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/message.jpg")));
        }
    }//GEN-LAST:event_btnSuaMouseClicked

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        try {
            int i=tblNhanVien.getSelectedRow();
            txtMaNV.setText(tblNhanVien.getModel().getValueAt(i, 0).toString());
            txtTenNV.setText(tblNhanVien.getModel().getValueAt(i, 1).toString());
            Date date=new SimpleDateFormat("yyyy-MM-dd").parse((String) tblNhanVien.getModel().getValueAt(i, 2));
            dcNgsinh.setDate(date);
            txtGtinh.setText(tblNhanVien.getModel().getValueAt(i, 3).toString());
            txtDiaChi.setText(tblNhanVien.getModel().getValueAt(i, 4).toString()); 
            txtDthoai.setText(tblNhanVien.getModel().getValueAt(i, 5).toString());
            txtLuong.setText(tblNhanVien.getModel().getValueAt(i, 6).toString());
            txtChucVu.setText(tblNhanVien.getModel().getValueAt(i, 7).toString());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void btnTroveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTroveMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_btnTroveMouseClicked

    private void btnTimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimMouseClicked
        String MaNhanVien, TenNhanVien,Gtinh, Chucvu;
        MaNhanVien = txtMaNV.getText();
        TenNhanVien = txtTenNV.getText();
        Gtinh = txtGtinh.getText();
        Chucvu = txtChucVu.getText();
        NhanVienBUS nhanVienBUS= new NhanVienBUS();
        if(!"".equals(MaNhanVien)){
            listNV= nhanVienBUS.timTheoma(MaNhanVien);
        } else {
            if(!"".equals(TenNhanVien)) listNV= nhanVienBUS.timTheoten(TenNhanVien);
            else {
                if(!"".equals(Chucvu)) listNV= nhanVienBUS.timTheochucvu(Chucvu);
                else listNV= nhanVienBUS.timTheogtinh(Gtinh);
            }
        }
        if(listNV.isEmpty()){
            JOptionPane.showMessageDialog(frame, "Không tìm thấy nhân viên");
        }
        Vector header=new Vector();
        header.add("Mã");
        header.add("Tên");
        header.add("Ngày sinh");
        header.add("Giới tính");
        header.add("Địa chỉ");
        header.add("Số điện thoại");
        header.add("Lương");
        header.add("Chức vụ");

        model=new DefaultTableModel(header,0);
        for(NhanVien nhanVienDTO : listNV){
            Vector row=new Vector();
            row.add(nhanVienDTO.MaNV);
            row.add(nhanVienDTO.Ten);
            row.add(nhanVienDTO.NgaySinh);
            row.add(nhanVienDTO.GioiTinh);
            row.add(nhanVienDTO.DiaChi);
            row.add(nhanVienDTO.Dthoai);
            row.add(nhanVienDTO.Luong);
            row.add(nhanVienDTO.ChucVu);
            model.addRow(row);
            tblNhanVien.setModel(model);
        }
    }//GEN-LAST:event_btnTimMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed
    
    public void loadtbl(){
        NhanVienBUS nhanVienBUS=new NhanVienBUS();
        listNV=nhanVienBUS.docDSNV();
        Vector header=new Vector();
        header.add("Mã");
        header.add("Tên");
        header.add("Ngày sinh");
        header.add("Giới tính");
        header.add("Địa chỉ");
        header.add("Số điện thoại");
        header.add("Lương");
        header.add("Chức vụ");

        model=new DefaultTableModel(header,0);
        for(NhanVien nhanVienDTO : listNV){
            Vector row=new Vector();
            row.add(nhanVienDTO.MaNV);
            row.add(nhanVienDTO.Ten);
            row.add(nhanVienDTO.NgaySinh);
            row.add(nhanVienDTO.GioiTinh);
            row.add(nhanVienDTO.DiaChi);
            row.add(nhanVienDTO.Dthoai);
            row.add(nhanVienDTO.Luong);
            row.add(nhanVienDTO.ChucVu);
            model.addRow(row);
            tblNhanVien.setModel(model);
        }
    }
    public boolean KiemTraNhapNhanVien(int ts) {
        String MaNhanVien, TenNhanVien,Gtinh, Ngsinh, DiaChi, SDT, Luong, Chucvu;
        boolean kiemtra;
        MaNhanVien = txtMaNV.getText();
        TenNhanVien = txtTenNV.getText();
        DiaChi = txtDiaChi.getText();
        SDT = txtDthoai.getText();
        Gtinh = txtGtinh.getText();
        Ngsinh = dateFormat.format(dcNgsinh.getDate());
        Luong = txtLuong.getText();
        Chucvu = txtChucVu.getText();
        String ThongBao = "";
        if(ts==0){
            if (MaNhanVien.equals("")) {
                ThongBao += "Bạn chưa nhập mã nhân viên\n";
                txtMaNV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
                txtMaNV.requestFocus();
            }else {
                NhanVienBUS nhanVienBUS=new NhanVienBUS();
                listNV=nhanVienBUS.docDSNV();
                for(NhanVien nhanVienDTO : listNV){
                    if (MaNhanVien.equals(nhanVienDTO.MaNV)) {
                        ThongBao += "Mã nhân viên bị trùng lặp\n";
                        txtMaNV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
                        txtMaNV.requestFocus();
                        txtMaNV.setText("");
                    }
                }
            }
        }
        if (TenNhanVien.equals("")) {
            ThongBao += "Bạn chưa nhập tên nhân viên\n";
            txtTenNV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
            txtTenNV.requestFocus();
        }
        if (Gtinh.equals("")) {
            ThongBao += "Bạn chưa nhập giới tính\n";
            txtGtinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
            txtGtinh.requestFocus();
        }
        if (Ngsinh.equals("")) {
            dcNgsinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
            ThongBao += "Bạn chưa nhập ngày sinh\n";
            dcNgsinh.requestFocus();
        }
        if (DiaChi.equals("")) {
            txtDiaChi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
            ThongBao += "Bạn chưa nhập Địa Chỉ\n";
            txtDiaChi.requestFocus();
        }
        if (SDT.equals("")) {
            txtDthoai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
            ThongBao += "Bạn chưa nhập Số ĐT \n";
            txtDthoai.requestFocus();
        }else if (SDT.length()!=10) {
            txtDthoai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
            ThongBao += "Số ĐT không hợp lệ. Vui lòng nhập lại! \n";
            txtDthoai.requestFocus();
        }
        Pattern pattern = Pattern.compile("\\d*"); 
        Matcher matcher = pattern.matcher(Luong); 
        if (Luong.equals("")) {
            ThongBao += "Bạn chưa nhập lương\n";
            txtLuong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
            txtLuong.requestFocus();
        }else if (!matcher.matches()) {
            txtLuong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
            ThongBao += "Dữ liệu nhập không hợp lệ\n";
            txtLuong.requestFocus();
        }
        if (Chucvu.equals("")) {
            txtChucVu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
            ThongBao += "Bạn chưa nhập chức vụ\n";
            txtChucVu.requestFocus();
        }
        if (ThongBao.equals("")) {
            kiemtra = true;
            txtMaNV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
            txtTenNV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
            txtDiaChi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
            txtDthoai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
            txtGtinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
            dcNgsinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
            txtLuong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
            txtChucVu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
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
            java.util.logging.Logger.getLogger(STAFF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(STAFF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(STAFF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(STAFF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new STAFF().setVisible(true);
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
    private com.toedter.calendar.JDateChooser dcNgsinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtChucVu;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtDthoai;
    private javax.swing.JTextField txtGtinh;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtTenNV;
    // End of variables declaration//GEN-END:variables
}
