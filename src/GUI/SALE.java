package GUI;

import DTO.KhuyenMai;
import BUS.KhuyenMaiBUS;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SALE extends javax.swing.JFrame {

    private DefaultTableModel model=new DefaultTableModel();
    private ArrayList<KhuyenMai> listKM=new ArrayList<>();
    SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
    private JFrame frame;
    
    public SALE() {
        initComponents();
        loadtblKM();
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
        txtMaKM = new javax.swing.JTextField();
        txtTenKM = new javax.swing.JTextField();
        txtGiaTri = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKM = new javax.swing.JTable();
        btnXem = new javax.swing.JButton();
        btnTim = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnTrove = new javax.swing.JButton();
        dcNgaybd = new com.toedter.calendar.JDateChooser();
        dcNgaykt = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THONG TIN KHUYEN MAI");

        jLabel2.setText("MA KM");

        jLabel3.setText("TEN KM");

        jLabel4.setText("GIA TRI");

        jLabel5.setText("NGAY BD");

        jLabel6.setText("NGAY KT");

        tblKM.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null}
            },
            new String [] {
                "MA KM", "TEN KM", "GIA TRI", "NGAY BD", "NGAY KT"
            }
        ));
        tblKM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKMMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKM);

        btnXem.setText("DS KM");
        btnXem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXemMouseClicked(evt);
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

        btnThem.setText("THEM");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
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
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTrove)
                        .addGap(208, 208, 208)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaKM, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(txtTenKM)
                            .addComponent(txtGiaTri)
                            .addComponent(dcNgaybd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dcNgaykt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnXem, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTrove)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGiaTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dcNgaybd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dcNgaykt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXem)
                    .addComponent(btnTim)
                    .addComponent(btnSua)
                    .addComponent(btnThem)
                    .addComponent(btnXoa))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblKMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKMMouseClicked
        try {
            int i=tblKM.getSelectedRow();
            txtMaKM.setText(tblKM.getModel().getValueAt(i, 0).toString());
            txtTenKM.setText(tblKM.getModel().getValueAt(i, 1).toString());
            txtGiaTri.setText(tblKM.getModel().getValueAt(i, 2).toString());
            Date dateBD=new SimpleDateFormat("yyyy-MM-dd").parse((String) tblKM.getModel().getValueAt(i, 3));
            dcNgaybd.setDate(dateBD);
            Date dateKT=new SimpleDateFormat("yyyy-MM-dd").parse((String)tblKM.getModel().getValueAt(i, 4));
            dcNgaykt.setDate(dateKT);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tblKMMouseClicked

    private void btnXemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXemMouseClicked
        loadtblKM();
    }//GEN-LAST:event_btnXemMouseClicked

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        KhuyenMai kmDTO= new KhuyenMai();
        kmDTO.MaKM=txtMaKM.getText();
        kmDTO.TenKM=txtTenKM.getText();
        kmDTO.GiaTri=txtGiaTri.getText();
        kmDTO.NgayBD=dateFormat.format(dcNgaybd.getDate());
        kmDTO.NgayKT=dateFormat.format(dcNgaykt.getDate());
        listKM.add(kmDTO);
        KhuyenMaiBUS kmBUS=new KhuyenMaiBUS();
        boolean kiemtra = KiemTraNhapKhuyenMai(0);
        if (kiemtra) {        
            kmBUS.them(kmDTO);
            Vector row= new Vector();
            row.add(txtMaKM.getText());
            row.add(txtTenKM.getText());
            row.add(txtGiaTri.getText());
            row.add(dateFormat.format(dcNgaybd.getDate()));
            row.add(dateFormat.format(dcNgaykt.getDate()));
            model.addRow(row);
            tblKM.setModel(model);
            JOptionPane.showMessageDialog(frame, "Thêm thành công!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/thanhcong.png")));
        } else {
            JOptionPane.showMessageDialog(frame, "Thêm thất bại!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/message.jpg")));
        }
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        int i=tblKM.getSelectedRow();
        String MaKM=tblKM.getModel().getValueAt(i, 0).toString();
        KhuyenMaiBUS kmBUS=new KhuyenMaiBUS();
        int ret = JOptionPane.showOptionDialog(this,"Bạn chắc chắn muốn xóa thông tin KM này ?", "Confirm"
                ,JOptionPane.YES_NO_OPTION
                ,JOptionPane.QUESTION_MESSAGE, null
                ,new String[] {"OK","Bỏ chọn"}, "OK");
        if(ret == JOptionPane.YES_OPTION) {
            if(i>=0){
                kmBUS.xoa(MaKM);
                model.removeRow(i);
                tblKM.setModel(model);
            }
            JOptionPane.showMessageDialog(frame, "Xóa thành công!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/thanhcong.png")));
        }else {
            //trường hợp chon cancel
            JOptionPane.showMessageDialog(frame, "Bạn đã bỏ lựa chọn vừa rồi. Xóa thất bại!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/message.jpg")));
        }
    }//GEN-LAST:event_btnXoaMouseClicked

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked
        KhuyenMai kmDTO= new KhuyenMai();
        kmDTO.MaKM=txtMaKM.getText();
        kmDTO.TenKM=txtTenKM.getText();
        kmDTO.GiaTri=txtGiaTri.getText();
        kmDTO.NgayBD=dateFormat.format(dcNgaybd.getDate());
        kmDTO.NgayKT=dateFormat.format(dcNgaykt.getDate());
        KhuyenMaiBUS kmBUS=new KhuyenMaiBUS();
        boolean kiemtra = KiemTraNhapKhuyenMai(1);        
        if (kiemtra) {        
            kmBUS.sua(kmDTO);
            int i=tblKM.getSelectedRow();
            if(i>=0){
                model.setValueAt(txtTenKM.getText(), i, 1);
                model.setValueAt(txtGiaTri.getText(), i, 2);
                model.setValueAt(dateFormat.format(dcNgaybd.getDate()), i, 3);   
                model.setValueAt(dateFormat.format(dcNgaykt.getDate()), i, 4);
                tblKM.setModel(model);
            }
            JOptionPane.showMessageDialog(frame, "Sửa thành công!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/thanhcong.png")));
        } else {
            JOptionPane.showMessageDialog(frame, "Sửa thất bại!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/message.jpg")));
        }
    }//GEN-LAST:event_btnSuaMouseClicked

    private void btnTroveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTroveMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_btnTroveMouseClicked

    private void btnTimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimMouseClicked
        String MaKM, TenKM, Giatri, NgayBD, NgayKT;
        MaKM = txtMaKM.getText();
        TenKM = txtTenKM.getText();
        Giatri = txtGiaTri.getText();
        NgayBD = dateFormat.format(dcNgaybd.getDate());
        NgayKT = dateFormat.format(dcNgaykt.getDate());
        KhuyenMaiBUS khuyenMaiBUS= new KhuyenMaiBUS();
        if(!"".equals(NgayBD) && !"".equals(NgayKT)){
            listKM= khuyenMaiBUS.timTheongay(NgayBD, NgayKT);
        } else {
            if(!"".equals(MaKM)){
                listKM= khuyenMaiBUS.timTheoma(MaKM);
            } else {
                if(!"".equals(TenKM)) listKM= khuyenMaiBUS.timTheoten(TenKM);
                else {
                    if(!"".equals(Giatri)) listKM= khuyenMaiBUS.timTheogtri(Giatri);
                }
            }
        }        
        if(listKM.isEmpty()){
            JOptionPane.showMessageDialog(frame, "Không tìm thấy khuyến mãi");
        }
        Vector header=new Vector();
        header.add("Mã KM");
        header.add("Tên KM");
        header.add("Giá trị");      
        header.add("Ngày bắt đầu");
        header.add("Ngày kết thúc");
        
        model=new DefaultTableModel(header,0);
        for(KhuyenMai kmDTO : listKM){
            Vector row=new Vector();
            row.add(kmDTO.MaKM);
            row.add(kmDTO.TenKM);
            row.add(kmDTO.GiaTri);        
            row.add(kmDTO.NgayBD);
            row.add(kmDTO.NgayKT);
            model.addRow(row);
            tblKM.setModel(model);
        }
    }//GEN-LAST:event_btnTimMouseClicked

    public void loadtblKM(){
        KhuyenMaiBUS kmBUS=new KhuyenMaiBUS();
        listKM=kmBUS.docDSKM();
        Vector header=new Vector();
        header.add("Mã KM");
        header.add("Tên KM");
        header.add("Giá trị");      
        header.add("Ngày bắt đầu");
        header.add("Ngày kết thúc");
        
        model=new DefaultTableModel(header,0);
        for(KhuyenMai kmDTO : listKM){
            Vector row=new Vector();
            row.add(kmDTO.MaKM);
            row.add(kmDTO.TenKM);
            row.add(kmDTO.GiaTri);        
            row.add(kmDTO.NgayBD);
            row.add(kmDTO.NgayKT);
            model.addRow(row);
            tblKM.setModel(model);
        }
    }
    public boolean KiemTraNhapKhuyenMai(int ts) {
        String MaKM, TenKM, Giatri, NgayBD, NgayKT;
        boolean kiemtra;
        MaKM = txtMaKM.getText();
        TenKM = txtTenKM.getText();
        Giatri = txtGiaTri.getText();
        NgayBD = dateFormat.format(dcNgaybd.getDate());
        NgayKT = dateFormat.format(dcNgaykt.getDate());
        String ThongBao = "";
        if(ts==0){
            if (MaKM.equals("")) {
                ThongBao += "Bạn chưa nhập mã KM\n";
                txtMaKM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
                txtMaKM.requestFocus();
            }
        }
        if (TenKM.equals("")) {
            ThongBao += "Bạn chưa nhập tên KM\n";
            txtTenKM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
            txtTenKM.requestFocus();
        }
        if (Giatri.equals("")) {
            txtGiaTri.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
            ThongBao += "Bạn chưa nhập giá trị\n";
            txtGiaTri.requestFocus();
        }
        if (NgayBD.equals("")) {
            dcNgaybd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
            ThongBao += "Bạn chưa nhập ngày bắt đầu \n";
            dcNgaybd.requestFocus();
        }
        if (NgayKT.equals("")){
            dcNgaykt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
            ThongBao += "Bạn chưa nhập ngày kết thúc \n";
            dcNgaykt.requestFocus();
        }
        if (ThongBao.equals("")) {
            kiemtra = true;
            txtMaKM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
            txtTenKM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
            txtGiaTri.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
            dcNgaybd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
            dcNgaykt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
        } else {
            kiemtra = false;
            ThongBao(ThongBao, "Lỗi nhập liệu", 2);
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
            java.util.logging.Logger.getLogger(SALE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SALE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SALE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SALE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SALE().setVisible(true);
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
    private com.toedter.calendar.JDateChooser dcNgaybd;
    private com.toedter.calendar.JDateChooser dcNgaykt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKM;
    private javax.swing.JTextField txtGiaTri;
    private javax.swing.JTextField txtMaKM;
    private javax.swing.JTextField txtTenKM;
    // End of variables declaration//GEN-END:variables
}
