package GUI;

import DTO.HoaDon;
import BUS.HoaDonBUS;
import DTO.ChiTietHoaDon;
import BUS.CTHoaDonBUS;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BILL extends javax.swing.JFrame {
    
    private DefaultTableModel model=new DefaultTableModel();
    private DefaultTableModel modelCT=new DefaultTableModel();
    private ArrayList<HoaDon> listHD=new ArrayList<>();
    private ArrayList<ChiTietHoaDon> listCTHD=new ArrayList<>();
    private JFrame frame;
    
    public BILL() {
        initComponents();
        loadtblHD();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnTrove = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHD = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtMahd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMakh = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtManv = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMakm = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTtien = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCTHD = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnXem = new javax.swing.JButton();
        btnTim = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnXemCT = new javax.swing.JButton();
        btnTaomoi = new javax.swing.JButton();
        dcNglap = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÔNG TIN HÓA ĐƠN");

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

        tblHD.setModel(new javax.swing.table.DefaultTableModel(
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
                "MA HD", "MA KH", "MA NV", "NG LAP", "MA KM", "T.TIEN"
            }
        ));
        tblHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHDMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHD);

        jLabel2.setText("MÃ HD");

        jLabel3.setText("MÃ KH");

        jLabel4.setText("MA NV");

        jLabel5.setText("NG LAP");

        jLabel6.setText("MÃ KM");

        jLabel7.setText("TỔNG TIỀN");

        jLabel8.setText("Chi Tiết Hóa Đơn ");

        tblCTHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "MA HD", "MA SP", "SO LUONG", "DON GIA"
            }
        ));
        jScrollPane2.setViewportView(tblCTHD);

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
        btnXem.setText("XEM DS");
        btnXem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXemMouseClicked(evt);
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

        btnXoa.setBackground(new java.awt.Color(255, 255, 255));
        btnXoa.setForeground(new java.awt.Color(255, 51, 51));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        btnXoa.setText("XÓA");
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });

        btnXemCT.setBackground(new java.awt.Color(255, 255, 255));
        btnXemCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fileview_text.png"))); // NOI18N
        btnXemCT.setText("XEM CT");
        btnXemCT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXemCTMouseClicked(evt);
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTrove)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnXem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnXemCT, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTaomoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTtien))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMahd, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(txtMakh)
                                    .addComponent(txtManv)
                                    .addComponent(txtMakm)
                                    .addComponent(dcNglap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTrove)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMahd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMakh, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtManv, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dcNglap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMakm, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTtien, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXem, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnXemCT, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(btnTaomoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTroveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTroveMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_btnTroveMouseClicked

    private void tblHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHDMouseClicked
        try {
            int i=tblHD.getSelectedRow();
            txtMahd.setText(tblHD.getModel().getValueAt(i, 0).toString());
            txtMakh.setText(tblHD.getModel().getValueAt(i, 1).toString());
            txtManv.setText(tblHD.getModel().getValueAt(i, 2).toString());
            Date date=new SimpleDateFormat("yyyy-MM-dd").parse((String) tblHD.getModel().getValueAt(i, 3));
            dcNglap.setDate(date);
            txtMakm.setText(tblHD.getModel().getValueAt(i, 4).toString());
            txtTtien.setText(tblHD.getModel().getValueAt(i, 5).toString());
            String ma=tblHD.getModel().getValueAt(i, 0).toString();
            CTHoaDonBUS cthdBUS=new CTHoaDonBUS();
            listCTHD=cthdBUS.timCTHD(ma);
            Vector header=new Vector();
            header.add("Mã HD");
            header.add("Mã SP");
            header.add("Số lượng");      
            header.add("Đơn giá");

            modelCT=new DefaultTableModel(header,0);
            for(ChiTietHoaDon cthdDTO : listCTHD){
                Vector row=new Vector();
                row.add(cthdDTO.mahd);
                row.add(cthdDTO.masp);
                row.add(cthdDTO.soluong);        
                row.add(cthdDTO.dongia);
                modelCT.addRow(row);
                tblCTHD.setModel(modelCT);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tblHDMouseClicked

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        ORDER order= new ORDER();
        order.setVisible(true);
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        int i=tblHD.getSelectedRow();
        String MaHD=tblHD.getModel().getValueAt(i, 0).toString();
        HoaDonBUS hoaDonBUS= new HoaDonBUS();
        CTHoaDonBUS cTHoaDonBUS= new CTHoaDonBUS();
        int ret = JOptionPane.showOptionDialog(this,"Bạn chắc chắn muốn xóa hóa đơn này", "Confirm"
                ,JOptionPane.YES_NO_OPTION
                ,JOptionPane.QUESTION_MESSAGE, null
                ,new String[] {"OK","Bỏ chọn"}, "OK");
        if(ret == JOptionPane.YES_OPTION) {
            if(i>=0){
                hoaDonBUS.xoa(MaHD);
                cTHoaDonBUS.xoa(MaHD);
                model.removeRow(i);
                tblHD.setModel(model);
                //-----xóa tất cả các dòng trong tblCTHD----------
                JOptionPane.showMessageDialog(frame, "Xóa thành công!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/thanhcong.png")));
            }else{
                JOptionPane.showMessageDialog(null, "Bạn chưa chọn hóa đơn muốn xóa!");
            }
        }else {
            //trường hợp chon cancel
            JOptionPane.showMessageDialog(frame, "Bạn đã bỏ lựa chọn vừa rồi. Xóa thất bại!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/message.jpg")));
        } 
    }//GEN-LAST:event_btnXoaMouseClicked

    private void btnTimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimMouseClicked
        String Mahd= txtMahd.getText();
        String Makh= txtMakh.getText();
        String Manv= txtManv.getText();
        String Makm= txtMakm.getText();
        HoaDonBUS hoaDonBUS= new HoaDonBUS();
        if(!Mahd.equals("")){
            listHD= hoaDonBUS.timTheomahd(Mahd);
        } else {
            if(!Makh.equals("")) listHD= hoaDonBUS.timTheomakh(Makh);
            else{
                if(!Manv.equals("")) listHD= hoaDonBUS.timTheomanv(Manv);
                else listHD= hoaDonBUS.timTheomakm(Makm);
            }
        }
        if(listHD.isEmpty()){
            JOptionPane.showMessageDialog(frame, "Không tìm thấy hóa đơn");
        }
        Vector header=new Vector();
        header.add("Mã HĐ");
        header.add("Mã KH");      
        header.add("Mã NV");
        header.add("Ngày lập");
        header.add("Mã KM");
        header.add("Tổng tiền");
        
        model=new DefaultTableModel(header,0);
        for(HoaDon hdDTO : listHD){
            Vector row=new Vector();
            row.add(hdDTO.mahd);
            row.add(hdDTO.makh);        
            row.add(hdDTO.manv);
            row.add(hdDTO.ngaylap);
            row.add(hdDTO.makm);
            row.add(hdDTO.tongtien);

            model.addRow(row);
            tblHD.setModel(model);
        }
    }//GEN-LAST:event_btnTimMouseClicked

    private void btnXemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXemMouseClicked
        loadtblHD();
    }//GEN-LAST:event_btnXemMouseClicked

    private void btnXemCTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXemCTMouseClicked
        CTHoaDonBUS cthdBUS=new CTHoaDonBUS();
        listCTHD=cthdBUS.docDSCTHD();
        Vector header=new Vector();
        header.add("Mã HD");
        header.add("Mã SP");
        header.add("Số lượng");      
        header.add("Đơn giá");

        modelCT=new DefaultTableModel(header,0);
        for(ChiTietHoaDon cthdDTO : listCTHD){
            Vector row=new Vector();
            row.add(cthdDTO.mahd);
            row.add(cthdDTO.masp);
            row.add(cthdDTO.soluong);        
            row.add(cthdDTO.dongia);
            modelCT.addRow(row);
            tblCTHD.setModel(modelCT);
        }
    }//GEN-LAST:event_btnXemCTMouseClicked

    private void btnTaomoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaomoiMouseClicked
        txtMahd.setText("");
        txtMakh.setText("");
        txtMakm.setText("");
        txtManv.setText("");
        txtTtien.setText("");
        dcNglap.setCalendar(null);
    }//GEN-LAST:event_btnTaomoiMouseClicked
    public void loadtblHD(){
        HoaDonBUS hdBUS=new HoaDonBUS();
        listHD=hdBUS.docDSHD();
        Vector header=new Vector();
        header.add("Mã HĐ");
        header.add("Mã KH");      
        header.add("Mã NV");
        header.add("Ngày lập");
        header.add("Mã KM");
        header.add("Tổng tiền");
        
        model=new DefaultTableModel(header,0);
        for(HoaDon hdDTO : listHD){
            Vector row=new Vector();
            row.add(hdDTO.mahd);
            row.add(hdDTO.makh);        
            row.add(hdDTO.manv);
            row.add(hdDTO.ngaylap);
            row.add(hdDTO.makm);
            row.add(hdDTO.tongtien);

            model.addRow(row);
            tblHD.setModel(model);
        }
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
            java.util.logging.Logger.getLogger(BILL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BILL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BILL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BILL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BILL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTaomoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnTrove;
    private javax.swing.JButton btnXem;
    private javax.swing.JButton btnXemCT;
    private javax.swing.JButton btnXoa;
    private com.toedter.calendar.JDateChooser dcNglap;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblCTHD;
    private javax.swing.JTable tblHD;
    private javax.swing.JTextField txtMahd;
    private javax.swing.JTextField txtMakh;
    private javax.swing.JTextField txtMakm;
    private javax.swing.JTextField txtManv;
    private javax.swing.JTextField txtTtien;
    // End of variables declaration//GEN-END:variables
}
