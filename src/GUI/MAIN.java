package GUI;

import java.awt.Color;
import javax.swing.*;

public class MAIN extends javax.swing.JFrame {
    String ma="", quyen="";
    private JFrame frame;
    public MAIN() {
        initComponents();
    }
    public MAIN(String ma, String quyen) {
        initComponents();
        this.ma= ma;
        this.quyen= quyen;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnNV = new javax.swing.JButton();
        btnNSX = new javax.swing.JButton();
        btnThongke = new javax.swing.JButton();
        btnPN = new javax.swing.JButton();
        btnHD = new javax.swing.JButton();
        btnKM = new javax.swing.JButton();
        btnSP = new javax.swing.JButton();
        btnKH = new javax.swing.JButton();
        btnPBH = new javax.swing.JButton();
        btnBanHang = new javax.swing.JButton();
        btnNhapHang = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PHẦN MỀM QUẢN LÍ HỆ THỐNG BÁN MÁY TÍNH");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        btnNV.setBackground(new java.awt.Color(255, 255, 255));
        btnNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nhanvien.png"))); // NOI18N
        btnNV.setText("QUẢN LÍ NHÂN VIÊN");
        btnNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNVMouseClicked(evt);
            }
        });

        btnNSX.setBackground(new java.awt.Color(255, 255, 255));
        btnNSX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/doitac.png"))); // NOI18N
        btnNSX.setText("QUẢN LÍ NHÀ SX");
        btnNSX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNSXMouseClicked(evt);
            }
        });

        btnThongke.setBackground(new java.awt.Color(255, 255, 255));
        btnThongke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tke.jpg"))); // NOI18N
        btnThongke.setText("THỐNG KÊ");
        btnThongke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThongkeMouseClicked(evt);
            }
        });

        btnPN.setBackground(new java.awt.Color(255, 255, 255));
        btnPN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nhap.png"))); // NOI18N
        btnPN.setText("QUẢN LÍ PHIÊU NHẬP");
        btnPN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPNMouseClicked(evt);
            }
        });

        btnHD.setBackground(new java.awt.Color(255, 255, 255));
        btnHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hoadon.png"))); // NOI18N
        btnHD.setText("QUẢN LÍ HÓA ĐƠN");
        btnHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHDMouseClicked(evt);
            }
        });

        btnKM.setBackground(new java.awt.Color(255, 255, 255));
        btnKM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sale.png"))); // NOI18N
        btnKM.setText("QUẢN LÍ KHUYẾN MÃI");
        btnKM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKMMouseClicked(evt);
            }
        });

        btnSP.setBackground(new java.awt.Color(255, 255, 255));
        btnSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sanpham.png"))); // NOI18N
        btnSP.setText("QUẢN LÍ SẢN PHẨM");
        btnSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSPMouseClicked(evt);
            }
        });

        btnKH.setBackground(new java.awt.Color(255, 255, 255));
        btnKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/khachHang.png"))); // NOI18N
        btnKH.setText("QUẢN LÍ KHÁCH HÀNG");
        btnKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKHMouseClicked(evt);
            }
        });

        btnPBH.setBackground(new java.awt.Color(255, 255, 255));
        btnPBH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/baohanh.png"))); // NOI18N
        btnPBH.setText("QUẢN LÍ PHIẾU BẢO HÀNH");
        btnPBH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPBHMouseClicked(evt);
            }
        });

        btnBanHang.setBackground(new java.awt.Color(255, 255, 255));
        btnBanHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/banhang.jpg"))); // NOI18N
        btnBanHang.setText("BÁN HÀNG");
        btnBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBanHangMouseClicked(evt);
            }
        });

        btnNhapHang.setBackground(new java.awt.Color(255, 255, 255));
        btnNhapHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nhaphang.png"))); // NOI18N
        btnNhapHang.setText("NHẬP HÀNG");
        btnNhapHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNhapHangMouseClicked(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(255, 255, 255));
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/quaylai.jpg"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThoatMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(btnNhapHang, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThoat)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnNV, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNSX, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnPN, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnHD, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSP, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(btnKH, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnKM, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPBH, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThongke, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThoat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNhapHang, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSP, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPBH, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKH, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPN, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHD, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKM, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNV, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNSX, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThongke, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSPMouseClicked
        if("QL".equals(quyen)){
            PRODUCT product= new PRODUCT();
            product.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(frame, "Bạn không có quyền quản lý");
        }
    }//GEN-LAST:event_btnSPMouseClicked

    private void btnKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKHMouseClicked
        if("QL".equals(quyen)){
            COSTUMER costumer= new COSTUMER();
            costumer.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(frame, "Bạn không có quyền quản lý");
        }
    }//GEN-LAST:event_btnKHMouseClicked

    private void btnPBHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPBHMouseClicked
        if("QL".equals(quyen)){
            WARRANTYCARD warrantycard= new WARRANTYCARD();
            warrantycard.setVisible(true);
        } else JOptionPane.showMessageDialog(frame, "Bạn không có quyền quản lý");        
    }//GEN-LAST:event_btnPBHMouseClicked

    private void btnPNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPNMouseClicked
        if("QL".equals(quyen)){
            PN pn= new PN();
            pn.setVisible(true);
        } else JOptionPane.showMessageDialog(frame, "Bạn không có quyền quản lý"); 
    }//GEN-LAST:event_btnPNMouseClicked

    private void btnHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHDMouseClicked
        if("QL".equals(quyen)){
            BILL bill= new BILL();
            bill.setVisible(true);           
        } else JOptionPane.showMessageDialog(frame, "Bạn không có quyền quản lý"); 
    }//GEN-LAST:event_btnHDMouseClicked

    private void btnKMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKMMouseClicked
        if("QL".equals(quyen)){
            SALE sale= new SALE();
            sale.setVisible(true);
        } else JOptionPane.showMessageDialog(frame, "Bạn không có quyền quản lý");       
    }//GEN-LAST:event_btnKMMouseClicked

    private void btnNSXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNSXMouseClicked
        if("QL".equals(quyen)){
            PRODUCER producer= new PRODUCER();
            producer.setVisible(true);
        } else JOptionPane.showMessageDialog(frame, "Bạn không có quyền quản lý");
    }//GEN-LAST:event_btnNSXMouseClicked

    private void btnNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNVMouseClicked
        if("QL".equals(quyen)){
            STAFF staff= new STAFF();
            staff.setVisible(true);
        } else JOptionPane.showMessageDialog(frame, "Bạn không có quyền quản lý");
    }//GEN-LAST:event_btnNVMouseClicked

    private void btnThongkeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongkeMouseClicked
        if("QL".equals(quyen)){
            THKE thke= new THKE();
            thke.setVisible(true);
        } else JOptionPane.showMessageDialog(frame, "Bạn không có quyền thống kê");
    }//GEN-LAST:event_btnThongkeMouseClicked

    private void btnBanHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBanHangMouseClicked
        ORDER order= new ORDER(ma, quyen);
        order.setVisible(true);
    }//GEN-LAST:event_btnBanHangMouseClicked

    private void btnNhapHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNhapHangMouseClicked
        NhanHang nhanHang= new NhanHang();
        nhanHang.setVisible(true);
    }//GEN-LAST:event_btnNhapHangMouseClicked

    private void btnThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseClicked
        this.setVisible(false);
        LG login= new LG();
        login.setVisible(true);
    }//GEN-LAST:event_btnThoatMouseClicked
    
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
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MAIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBanHang;
    private javax.swing.JButton btnHD;
    private javax.swing.JButton btnKH;
    private javax.swing.JButton btnKM;
    private javax.swing.JButton btnNSX;
    private javax.swing.JButton btnNV;
    private javax.swing.JButton btnNhapHang;
    private javax.swing.JButton btnPBH;
    private javax.swing.JButton btnPN;
    private javax.swing.JButton btnSP;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnThongke;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
