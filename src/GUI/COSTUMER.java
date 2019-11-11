package GUI;

import BUS.KhachHangBUS;
import DTO.KhachHang;
import java.util.ArrayList;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class COSTUMER extends javax.swing.JFrame {

    private DefaultTableModel model=new DefaultTableModel();
    private ArrayList<KhachHang> listKH=new ArrayList<>();
    private JFrame frame;
    
    public COSTUMER() {
        initComponents();
        loadtblKH();
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
        txtMaKH = new javax.swing.JTextField();
        txtTenKH = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtDthoai = new javax.swing.JTextField();
        txtDiem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhachHang = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnTim = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXem = new javax.swing.JButton();
        btnTrove = new javax.swing.JButton();
        cbLoai = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THONG TIN KHACH HANG");

        jLabel2.setText("MA KH");

        jLabel3.setText("TEN KH");

        jLabel4.setText("DIA CHI");

        jLabel5.setText("SDT");

        jLabel6.setText("LOAI KH");

        jLabel7.setText("DIEM TL");

        tblKhachHang.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "MA KH", "TEN KH", "DIA CHI", "SDT", "LOAI KH", "DIEM TL"
            }
        ));
        tblKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhachHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKhachHang);
        if (tblKhachHang.getColumnModel().getColumnCount() > 0) {
            tblKhachHang.getColumnModel().getColumn(0).setHeaderValue("MA KH");
            tblKhachHang.getColumnModel().getColumn(1).setHeaderValue("TEN KH");
            tblKhachHang.getColumnModel().getColumn(2).setHeaderValue("DIA CHI");
            tblKhachHang.getColumnModel().getColumn(3).setHeaderValue("SDT");
            tblKhachHang.getColumnModel().getColumn(4).setHeaderValue("LOAI KH");
            tblKhachHang.getColumnModel().getColumn(5).setHeaderValue("DIEM TL");
        }

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

        btnSua.setText("SUA");
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaMouseClicked(evt);
            }
        });

        btnXem.setText("XEM DS KH");
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

        cbLoai.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "KHThuong", "KHTThiet" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnXem, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(txtMaKH, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(txtDthoai, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(txtDiem, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(cbLoai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnTrove)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(318, 318, 318))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTrove)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDthoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnTim)
                    .addComponent(btnXem))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXemMouseClicked
        loadtblKH();
    }//GEN-LAST:event_btnXemMouseClicked

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        KhachHang khachHangDTO=new KhachHang();
        khachHangDTO.makh=txtMaKH.getText();
        khachHangDTO.tenkh=txtTenKH.getText();
        khachHangDTO.diachi=txtDiaChi.getText();
        khachHangDTO.dienthoai=txtDthoai.getText();
        khachHangDTO.LoaiKH=cbLoai.getSelectedItem().toString();
        khachHangDTO.diem=Integer.parseInt(txtDiem.getText());
        listKH.add(khachHangDTO);
        KhachHangBUS khachHangBUS=new KhachHangBUS();
        boolean kiemtra = KiemTraNhapKhachHang(0);
        if (kiemtra) {        
            khachHangBUS.them(khachHangDTO);
            Vector row= new Vector();
            row.add(txtMaKH.getText());
            row.add(txtTenKH.getText());
            row.add(txtDiaChi.getText());
            row.add(txtDthoai.getText());
            row.add(cbLoai.getSelectedItem());
            row.add(txtDiem.getText());
            model.addRow(row);
            tblKhachHang.setModel(model);
            JOptionPane.showMessageDialog(frame, "Thêm thành công!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/thanhcong.png")));
        } else {
            JOptionPane.showMessageDialog(frame, "Thêm thất bại!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/message.jpg")));
        } 
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        int i=tblKhachHang.getSelectedRow();
        String MaKH=tblKhachHang.getModel().getValueAt(i, 0).toString();
        String TenKH=tblKhachHang.getModel().getValueAt(i, 1).toString();
        KhachHangBUS khachHangBUS=new KhachHangBUS();
        int ret = JOptionPane.showOptionDialog(this,"Bạn chắc chắn muốn xóa khách hàng "+TenKH+" ?", "Confirm"
                ,JOptionPane.YES_NO_OPTION
                ,JOptionPane.QUESTION_MESSAGE, null
                ,new String[] {"OK","Bỏ chọn"}, "OK");
        if(ret == JOptionPane.YES_OPTION) {
            if(i>=0){
                khachHangBUS.xoa(MaKH); 
                model.removeRow(i);
                tblKhachHang.setModel(model);
                JOptionPane.showMessageDialog(frame, "Xóa thành công!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/thanhcong.png")));
            }else{
                JOptionPane.showMessageDialog(null, "Bạn chưa chọn khách hàng muốn xóa!");
            }
        }else {
            //trường hợp chon cancel
            JOptionPane.showMessageDialog(frame, "Bạn đã bỏ lựa chọn vừa rồi. Xóa thất bại!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/message.jpg")));
        } 
    }//GEN-LAST:event_btnXoaMouseClicked

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked
        KhachHang khachHangDTO=new KhachHang();
        khachHangDTO.makh=txtMaKH.getText();
        khachHangDTO.tenkh=txtTenKH.getText();
        khachHangDTO.diachi=txtDiaChi.getText();
        khachHangDTO.dienthoai=txtDthoai.getText();
        khachHangDTO.LoaiKH=cbLoai.getSelectedItem().toString();
        khachHangDTO.diem=Integer.parseInt(txtDiem.getText());
        KhachHangBUS khachHangBUS=new KhachHangBUS();
        boolean kiemtra = KiemTraNhapKhachHang(1);
        if (kiemtra) {        
            khachHangBUS.sua(khachHangDTO);
            int i=tblKhachHang.getSelectedRow();
            if(i>=0){            
                model.setValueAt(txtTenKH.getText(), i, 1);  
                model.setValueAt(txtDiaChi.getText(), i, 2);
                model.setValueAt(txtDthoai.getText(), i, 3);   
                model.setValueAt(cbLoai.getSelectedItem(), i, 4);
                model.setValueAt(txtDiem.getText(), i, 5); 
                tblKhachHang.setModel(model);
            }    
            JOptionPane.showMessageDialog(frame, "Sửa thành công!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/thanhcong.png")));
        } else {
            JOptionPane.showMessageDialog(frame, "Sửa thất bại!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/message.jpg")));
        }
    }//GEN-LAST:event_btnSuaMouseClicked

    private void btnTimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimMouseClicked
        String MaKhachHang, TenKhachHang, Loai;
        MaKhachHang = txtMaKH.getText();
        TenKhachHang = txtTenKH.getText();
        Loai=cbLoai.getSelectedItem().toString();
        KhachHangBUS khachHangBUS= new KhachHangBUS();
        if(!"".equals(MaKhachHang)){
            listKH= khachHangBUS.timTheoma(MaKhachHang);
        } else {
            if(!"".equals(TenKhachHang)) listKH= khachHangBUS.timTheoten(TenKhachHang);
            else listKH= khachHangBUS.timTheoloai(Loai);
        }
        if(listKH.isEmpty()){
            JOptionPane.showMessageDialog(frame, "Không tìm thấy khách hàng");
        }
        Vector header=new Vector();
        header.add("Mã KH");
        header.add("Tên KH");
        header.add("Địa chỉ");
        header.add("SĐT");
        header.add("Loại KH");
        header.add("Điểm tích lũy");

        model=new DefaultTableModel(header,0);
        for(KhachHang khachHangDTO : listKH){
            Vector row=new Vector();
            row.add(khachHangDTO.makh);
            row.add(khachHangDTO.tenkh);
            row.add(khachHangDTO.diachi);
            row.add(khachHangDTO.dienthoai);
            row.add(khachHangDTO.LoaiKH);
            row.add(khachHangDTO.diem);
            model.addRow(row);
            tblKhachHang.setModel(model);
        }
    }//GEN-LAST:event_btnTimMouseClicked

    private void tblKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachHangMouseClicked
        try {
            int i=tblKhachHang.getSelectedRow();
            txtMaKH.setText(tblKhachHang.getModel().getValueAt(i, 0).toString());
            txtTenKH.setText(tblKhachHang.getModel().getValueAt(i, 1).toString());
            txtDiaChi.setText(tblKhachHang.getModel().getValueAt(i, 2).toString());
            txtDthoai.setText(tblKhachHang.getModel().getValueAt(i, 3).toString()); 
            cbLoai.setSelectedItem(tblKhachHang.getModel().getValueAt(i, 4).toString());
            txtDiem.setText(tblKhachHang.getModel().getValueAt(i, 5).toString());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tblKhachHangMouseClicked

    private void btnTroveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTroveMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_btnTroveMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    public void loadtblKH(){
        KhachHangBUS khachHangBUS=new KhachHangBUS();
        listKH=khachHangBUS.docDSKH();
        Vector header=new Vector();
        header.add("Mã KH");
        header.add("Tên KH");
        header.add("Địa chỉ");
        header.add("SĐT");
        header.add("Loại KH");
        header.add("Điểm tích lũy");

        model=new DefaultTableModel(header,0);
        for(KhachHang khachHangDTO : listKH){
            Vector row=new Vector();
            row.add(khachHangDTO.makh);
            row.add(khachHangDTO.tenkh);
            row.add(khachHangDTO.diachi);
            row.add(khachHangDTO.dienthoai);
            row.add(khachHangDTO.LoaiKH);
            row.add(khachHangDTO.diem);
            model.addRow(row);
            tblKhachHang.setModel(model);
        }
    }
    public boolean KiemTraNhapKhachHang(int ts) {
        String MaKhachHang, TenKhachHang, DiaChi, SDT, Loai, Diem;
        boolean kiemtra;
        String ThongBao = "";
        MaKhachHang = txtMaKH.getText();
        TenKhachHang = txtTenKH.getText();
        DiaChi = txtDiaChi.getText();
        SDT = txtDthoai.getText();
        Loai=cbLoai.getSelectedItem().toString();
        Diem=txtDiem.getText();
        if(ts==0){
            if (MaKhachHang.equals("")) {
                ThongBao += "Bạn chưa nhập mã khách hàng\n";
                txtMaKH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
                txtMaKH.requestFocus();
            }else {
                KhachHangBUS khachHangBUS=new KhachHangBUS();
                listKH=khachHangBUS.docDSKH();
                for(KhachHang khachHangDTO : listKH){
                    if (MaKhachHang.equals(khachHangDTO.makh)) {
                        ThongBao += "Mã khách hàng bị trùng lặp\n";
                        txtMaKH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
                        txtMaKH.requestFocus();
                        txtMaKH.setText("");
                    }
                }
            }
        }
        if (TenKhachHang.equals("")) {
            ThongBao += "Bạn chưa nhập tên khách hàng\n";
            txtTenKH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
            txtTenKH.requestFocus();
        }
        if (DiaChi.equals("")) {
            txtDiaChi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
            ThongBao += "Bạn chưa nhập địa chỉ khách hàng\n";
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
        Matcher matcher = pattern.matcher(Diem); 
        if (Diem.equals("")) {
            txtDiem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
            ThongBao += "Bạn chưa nhập điểm tích lũy KH\n";
            txtDiem.requestFocus();
        }else if (!matcher.matches()) {
            txtDiem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
            ThongBao += "Dữ liệu nhập không hợp lệ\n";
            txtDiem.requestFocus();
        }else {
            if(Integer.parseInt(Diem) < 100){
                if ("KHTThiet".equals(cbLoai.getSelectedItem().toString())) {
                    cbLoai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
                    ThongBao += "Điểm không hợp lệ so với loại KH\n";
                    txtDiem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
                }
            }else if("KHThuong".equals(cbLoai.getSelectedItem().toString())) {
                cbLoai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
                ThongBao += "Điểm không hợp lệ so với loại KH\n";
                txtDiem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
            }
        }
        
        if (ThongBao.equals("")) {
            kiemtra = true;
            txtMaKH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
            txtTenKH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
            txtDiaChi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
            txtDthoai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
            cbLoai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
            txtDiem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
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
            java.util.logging.Logger.getLogger(COSTUMER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(COSTUMER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(COSTUMER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(COSTUMER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new COSTUMER().setVisible(true);
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
    private javax.swing.JComboBox cbLoai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKhachHang;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtDiem;
    private javax.swing.JTextField txtDthoai;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtTenKH;
    // End of variables declaration//GEN-END:variables
}