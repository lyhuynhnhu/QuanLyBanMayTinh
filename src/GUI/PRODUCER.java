package GUI;

import BUS.NhaSXBUS;
import DTO.NhaSX;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class PRODUCER extends javax.swing.JFrame {

    private DefaultTableModel model=new DefaultTableModel();
    private ArrayList<NhaSX> listNSX=new ArrayList<>();
    private JFrame frame;
    
    public PRODUCER() {
        initComponents();
        loadtbl();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnTrove = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaNSX = new javax.swing.JTextField();
        txtTenNSX = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNSX = new javax.swing.JTable();
        btnXem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnTim = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnTaomoi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NHÀ SẢN XUẤT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnTrove.setText("Trở về");
        btnTrove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTroveMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("MÃ NSX");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("TÊN NSX");

        tblNSX.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "MA NSX", "TEN NSX"
            }
        ));
        tblNSX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNSXMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNSX);

        btnXem.setBackground(null);
        btnXem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fileview_text.png"))); // NOI18N
        btnXem.setText("XEM DS");
        btnXem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXemMouseClicked(evt);
            }
        });

        btnSua.setBackground(null);
        btnSua.setForeground(new java.awt.Color(51, 204, 0));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/update.png"))); // NOI18N
        btnSua.setText("SỬA");
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaMouseClicked(evt);
            }
        });

        btnThem.setBackground(null);
        btnThem.setForeground(new java.awt.Color(102, 204, 255));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/them.png"))); // NOI18N
        btnThem.setText("THÊM");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });

        btnTim.setBackground(null);
        btnTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search (1).png"))); // NOI18N
        btnTim.setText("TÌM KIẾM");
        btnTim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimMouseClicked(evt);
            }
        });

        btnXoa.setBackground(null);
        btnXoa.setForeground(new java.awt.Color(255, 51, 51));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        btnXoa.setText("XÓA");
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });

        btnTaomoi.setBackground(null);
        btnTaomoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reset.png"))); // NOI18N
        btnTaomoi.setText("TẠO MỚI ");
        btnTaomoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTaomoiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTrove)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTenNSX, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtMaNSX, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3))))
                            .addComponent(btnXem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnTaomoi, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(136, 136, 136)
                                .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTrove)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaNSX))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addComponent(txtTenNSX)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 47, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTaomoi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblNSXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNSXMouseClicked
        try {
            int i=tblNSX.getSelectedRow();
            txtMaNSX.setText(tblNSX.getModel().getValueAt(i, 0).toString());
            txtTenNSX.setText(tblNSX.getModel().getValueAt(i, 1).toString());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tblNSXMouseClicked

    private void btnXemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXemMouseClicked
        loadtbl();
    }//GEN-LAST:event_btnXemMouseClicked

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        NhaSX nhaSX= new NhaSX();
        nhaSX.Mansx=txtMaNSX.getText();
        nhaSX.Tennsx=txtTenNSX.getText();
        listNSX.add(nhaSX);
        NhaSXBUS nhaSXBUS=new NhaSXBUS();
        boolean kiemtra = KiemTraNhapNSX(0);
        if (kiemtra) {        
            nhaSXBUS.them(nhaSX);
            Vector row= new Vector();
            row.add(txtMaNSX.getText());
            row.add(txtTenNSX.getText());
            model.addRow(row);
            tblNSX.setModel(model);
            JOptionPane.showMessageDialog(frame, "Thêm thành công!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/thanhcong.png")));
        } else {
            JOptionPane.showMessageDialog(frame, "Thêm thất bại!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/message.jpg")));
        }
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        int i=tblNSX.getSelectedRow();
        String Ma=tblNSX.getModel().getValueAt(i, 0).toString();
        String Ten=tblNSX.getModel().getValueAt(i, 1).toString();
        NhaSXBUS nhaSXBUS= new NhaSXBUS();
        int ret = JOptionPane.showOptionDialog(this,"Bạn chắc chắn muốn xóa nhà sx "+Ten+" ?", "Confirm"
                ,JOptionPane.YES_NO_OPTION
                ,JOptionPane.QUESTION_MESSAGE, null
                ,new String[] {"OK","Bỏ chọn"}, "OK");
        if(ret == JOptionPane.YES_OPTION) {
            if(i>=0){
                nhaSXBUS.xoa(Ma);
                model.removeRow(i);
                tblNSX.setModel(model);
                JOptionPane.showMessageDialog(frame, "Xóa thành công!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/thanhcong.png")));
            }else{
                JOptionPane.showMessageDialog(null, "Bạn chưa chọn nhà sx muốn xóa!");
            }            
        }else {
            //trường hợp chon cancel
            JOptionPane.showMessageDialog(frame, "Bạn đã bỏ lựa chọn vừa rồi. Xóa thất bại!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/message.jpg")));
        } 
    }//GEN-LAST:event_btnXoaMouseClicked

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked
        NhaSX nhaSX= new NhaSX();
        nhaSX.Mansx=txtMaNSX.getText();
        nhaSX.Tennsx=txtTenNSX.getText();
        NhaSXBUS nhaSXBUS=new NhaSXBUS();
        boolean kiemtra = KiemTraNhapNSX(1);        
        if (kiemtra) {        
            nhaSXBUS.sua(nhaSX);
            int i=tblNSX.getSelectedRow();
            if(i>=0){
                model.setValueAt(txtTenNSX.getText(), i, 1);
                tblNSX.setModel(model);
            }
            JOptionPane.showMessageDialog(frame, "Sửa thành công!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/thanhcong.png")));
        } else {
            JOptionPane.showMessageDialog(frame, "Sửa thất bại!", "Lời nhắn", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/message.jpg")));
        }
    }//GEN-LAST:event_btnSuaMouseClicked

    private void btnTimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimMouseClicked
        String Ma = txtMaNSX.getText();
        String Ten = txtTenNSX.getText();
        NhaSXBUS nhaSXBUS= new NhaSXBUS();
        if(!"".equals(Ma)) listNSX= nhaSXBUS.timTheoma(Ma);
        else listNSX= nhaSXBUS.timTheoten(Ten);
        if(listNSX.isEmpty()){
            JOptionPane.showMessageDialog(frame, "Không tìm thấy nhà sx");
        }
        Vector header=new Vector();
        header.add("Mã NSX");
        header.add("Tên NSX");

        model=new DefaultTableModel(header,0);
        for(NhaSX nhaSXDTO : listNSX){
            Vector row=new Vector();
            row.add(nhaSXDTO.Mansx);
            row.add(nhaSXDTO.Tennsx);
            model.addRow(row);
            tblNSX.setModel(model);
        }
    }//GEN-LAST:event_btnTimMouseClicked

    private void btnTroveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTroveMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_btnTroveMouseClicked

    private void btnTaomoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaomoiMouseClicked
        txtMaNSX.setText("");
        txtTenNSX.setText("");
    }//GEN-LAST:event_btnTaomoiMouseClicked

    public void loadtbl(){
        NhaSXBUS nhaSX=new NhaSXBUS();
        listNSX=nhaSX.docDSNSX();
        Vector header=new Vector();
        header.add("Mã NSX");
        header.add("Tên NSX");

        model=new DefaultTableModel(header,0);
        for(NhaSX nhaSXDTO : listNSX){
            Vector row=new Vector();
            row.add(nhaSXDTO.Mansx);
            row.add(nhaSXDTO.Tennsx);
            model.addRow(row);
            tblNSX.setModel(model);
        }
    }
    public boolean KiemTraNhapNSX(int ts) {
        String Ma, Ten;
        boolean kiemtra;
        int i=tblNSX.getSelectedRow();
        Ma = txtMaNSX.getText();
        Ten = txtTenNSX.getText();
        String ThongBao = "";
        
        if(ts==1){
            if(Ma.equalsIgnoreCase(tblNSX.getModel().getValueAt(i, 0).toString())){
                ThongBao += "Không được sửa mã\n";
                txtMaNSX.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
                txtMaNSX.requestFocus();
            }
        }
        if (Ma.equals("")) {
            ThongBao += "Bạn chưa nhập mã nhà sx\n";
            txtMaNSX.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
            txtMaNSX.requestFocus();
        }else {
            NhaSXBUS nhaSXBUS=new NhaSXBUS();
            listNSX=nhaSXBUS.docDSNSX();
            for(NhaSX nhaSX : listNSX){
                if (Ma.equalsIgnoreCase(nhaSX.Mansx)) {
                    ThongBao += "Mã nhà sx bị trùng lặp\n";
                    txtMaNSX.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
                    txtMaNSX.requestFocus();
                    txtMaNSX.setText("");
                }
            }
        }
        if (Ten.equals("")) {
            ThongBao += "Bạn chưa nhập tên nhà sx\n";
            txtTenNSX.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
            txtTenNSX.requestFocus();
        }
        if (ThongBao.equals("")) {
            kiemtra = true;
            txtMaNSX.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
            txtTenNSX.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
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
            java.util.logging.Logger.getLogger(PRODUCER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PRODUCER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PRODUCER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PRODUCER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PRODUCER().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblNSX;
    private javax.swing.JTextField txtMaNSX;
    private javax.swing.JTextField txtTenNSX;
    // End of variables declaration//GEN-END:variables
}