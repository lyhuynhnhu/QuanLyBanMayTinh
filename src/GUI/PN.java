package GUI;

import DTO.PhieuNhap;
import DTO.ChiTietPhieuNhap;
import BUS.PhieuNhapBUS;
import BUS.CTPhieuNhapBUS;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PN extends javax.swing.JFrame {
    
    public static DefaultTableModel modelPN=new DefaultTableModel();
    public static DefaultTableModel modelCTPN=new DefaultTableModel();
    private ArrayList<PhieuNhap> listPN=new ArrayList<>();
    private ArrayList<ChiTietPhieuNhap> listCTPN=new ArrayList<>();
    private JFrame frame;
    
    public PN() {
        initComponents();
        loadtblPN();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMapn = new javax.swing.JTextField();
        txtMansx = new javax.swing.JTextField();
        txtManv = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPN = new javax.swing.JTable();
        btnXem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnTim = new javax.swing.JButton();
        btnXemCT = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCTPN = new javax.swing.JTable();
        btnTrove = new javax.swing.JButton();
        dcNglap = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PHIẾU NHẬP HÀNG");

        jLabel2.setText("MA PN");

        jLabel3.setText("MA NSX");

        jLabel4.setText("MA NV");

        jLabel5.setText("NGAY LAP");

        tblPN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MA PN", "MA NSX", "MA NV", "NGAY LAP"
            }
        ));
        tblPN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPNMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPN);

        btnXem.setText("XEM DS PN");
        btnXem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXemMouseClicked(evt);
            }
        });

        btnXoa.setText("XOA");
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });

        btnThem.setText("THEM");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });

        btnTim.setText("TIM KIEM");
        btnTim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimMouseClicked(evt);
            }
        });

        btnXemCT.setText("XEM CTPN");
        btnXemCT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXemCTMouseClicked(evt);
            }
        });

        tblCTPN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MA PN", "MA SP", "S.LUONG", "DON GIA"
            }
        ));
        jScrollPane2.setViewportView(tblCTPN);

        btnTrove.setText("Trở về");
        btnTrove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTroveMouseClicked(evt);
            }
        });

        jLabel6.setText("Chi tiet phieu nhap");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMapn, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(txtMansx)
                            .addComponent(txtManv)
                            .addComponent(dcNglap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnTim, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnXem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnXemCT, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTrove)
                        .addGap(140, 140, 140)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTrove)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMapn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMansx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtManv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dcNglap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXem)
                            .addComponent(btnThem))
                        .addGap(28, 28, 28)
                        .addComponent(btnXoa)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTim)
                            .addComponent(btnXemCT)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTroveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTroveMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_btnTroveMouseClicked

    private void btnXemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXemMouseClicked
        loadtblPN();
    }//GEN-LAST:event_btnXemMouseClicked

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        int i=tblPN.getSelectedRow();
        String Ma=tblPN.getModel().getValueAt(i, 0).toString();
        PhieuNhapBUS phieuNhapBUS= new PhieuNhapBUS();
        CTPhieuNhapBUS cTPhieuNhapBUS= new CTPhieuNhapBUS();
        int ret = JOptionPane.showOptionDialog(this,"Bạn chắc chắn muốn xóa phiếu nhập hàng này", "Confirm"
                ,JOptionPane.YES_NO_OPTION
                ,JOptionPane.QUESTION_MESSAGE, null
                ,new String[] {"OK","Bỏ chọn"}, "OK");
        if(ret == JOptionPane.YES_OPTION) {
            if(i>=0){
                phieuNhapBUS.xoa(Ma);
                cTPhieuNhapBUS.xoa(Ma);
                modelPN.removeRow(i);
                tblPN.setModel(modelPN);
                //-----xóa tất cả các dòng trong tblCTPN----------
                JOptionPane.showMessageDialog(frame, "Xóa thành công!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/thanhcong.png")));
            }else{
                JOptionPane.showMessageDialog(null, "Bạn chưa chọn phiếu nhập hàng muốn xóa!");
            }
        }else {
            //trường hợp chon cancel
            JOptionPane.showMessageDialog(frame, "Bạn đã bỏ lựa chọn vừa rồi. Xóa thất bại!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/message.jpg")));
        }
    }//GEN-LAST:event_btnXoaMouseClicked

    private void btnTimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimMouseClicked
        String Mapn= txtMapn.getText();
        String Mansx= txtMansx.getText();
        String Manv= txtManv.getText();
        PhieuNhapBUS phieuNhapBUS= new PhieuNhapBUS();
        if(!Mapn.equals("")){
            listPN= phieuNhapBUS.timTheomapn(Mapn);
        } else {
            if(!Mansx.equals("")) listPN= phieuNhapBUS.timTheonsx(Mansx);
            else listPN= phieuNhapBUS.timTheonv(Manv);
        }
        if(listPN.isEmpty()){
            JOptionPane.showMessageDialog(frame, "Không tìm thấy phiếu nhập hàng");
        }
        Vector header=new Vector();
        header.add("Mã phiếu nhập");
        header.add("Mã nhà sx");
        header.add("Mã nhân viên");
        header.add("Ngày lập");

        modelPN=new DefaultTableModel(header,0);
        for(PhieuNhap phieuNhapDTO : listPN){
            Vector row=new Vector();
            row.add(phieuNhapDTO.mapn);
            row.add(phieuNhapDTO.mansx);
            row.add(phieuNhapDTO.manv);
            row.add(phieuNhapDTO.ngaylap);
            modelPN.addRow(row);
            tblPN.setModel(modelPN);
        }
    }//GEN-LAST:event_btnTimMouseClicked

    private void btnXemCTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXemCTMouseClicked
        CTPhieuNhapBUS ctpnbus=new CTPhieuNhapBUS();
        listCTPN=ctpnbus.docDSCTPN();
        Vector header=new Vector();
        header.add("Mã phiếu nhập");
        header.add("Mã sản phẩm");
        header.add("Số lượng nhập");
        header.add("Đơn giá nhập");

        modelCTPN=new DefaultTableModel(header,0);
        for(ChiTietPhieuNhap ctpndto : listCTPN){
            Vector row=new Vector();
            row.add(ctpndto.mapn);
            row.add(ctpndto.masp);
            row.add(ctpndto.slnhap);
            row.add(ctpndto.dgnhap);
            modelCTPN.addRow(row);
            tblCTPN.setModel(modelCTPN);
        }
    }//GEN-LAST:event_btnXemCTMouseClicked

    private void tblPNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPNMouseClicked
        try {
            int i= tblPN.getSelectedRow();
            String ma= tblPN.getModel().getValueAt(i, 0).toString();
            CTPhieuNhapBUS ctpnbus=new CTPhieuNhapBUS();
            listCTPN=ctpnbus.timCTPN(ma);
            Vector header=new Vector();
            header.add("Mã phiếu nhập");
            header.add("Mã sản phẩm");
            header.add("Số lượng nhập");
            header.add("Đơn giá nhập");

            modelCTPN=new DefaultTableModel(header,0);
            for(ChiTietPhieuNhap ctpndto : listCTPN){
                Vector row=new Vector();
                row.add(ctpndto.mapn);
                row.add(ctpndto.masp);
                row.add(ctpndto.slnhap);
                row.add(ctpndto.dgnhap);
                modelCTPN.addRow(row);
                tblCTPN.setModel(modelCTPN);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tblPNMouseClicked
    public void loadtblPN(){
        PhieuNhapBUS phieuNhapBUS=new PhieuNhapBUS();
        listPN=phieuNhapBUS.docDSPN();
        Vector header=new Vector();
        header.add("Mã phiếu nhập");
        header.add("Mã nhà sx");
        header.add("Mã nhân viên");
        header.add("Ngày lập");

        modelPN=new DefaultTableModel(header,0);
        for(PhieuNhap phieuNhapDTO : listPN){
            Vector row=new Vector();
            row.add(phieuNhapDTO.mapn);
            row.add(phieuNhapDTO.mansx);
            row.add(phieuNhapDTO.manv);
            row.add(phieuNhapDTO.ngaylap);
            modelPN.addRow(row);
            tblPN.setModel(modelPN);
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
            java.util.logging.Logger.getLogger(PN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblCTPN;
    private javax.swing.JTable tblPN;
    private javax.swing.JTextField txtMansx;
    private javax.swing.JTextField txtManv;
    private javax.swing.JTextField txtMapn;
    // End of variables declaration//GEN-END:variables
}
