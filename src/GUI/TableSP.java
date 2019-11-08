package GUI;

import BUS.SanPhamBUS;
import DTO.SanPham;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TableSP extends javax.swing.JFrame {

    public static DefaultTableModel model=new DefaultTableModel();
    private ArrayList<SanPham> listSP=new ArrayList<>();
    private JFrame frame;
    public TableSP() {
        initComponents();
        loadtblSP();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTim = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        cbTim = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSP = new javax.swing.JTable();
        btnChon = new javax.swing.JButton();
        btnBochon = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTim.setText("Tìm kiếm");
        btnTim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimMouseClicked(evt);
            }
        });

        cbTim.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tìm theo", "Tên SP", "Nhà SX", "Xuất xứ" }));

        tblSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblSP);

        btnChon.setText("Chọn");
        btnChon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChonMouseClicked(evt);
            }
        });

        btnBochon.setText("Bỏ chọn");
        btnBochon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBochonMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Sản phẩm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addComponent(cbTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTim)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(btnChon, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBochon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTim)
                    .addComponent(cbTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChon)
                    .addComponent(btnBochon))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChonMouseClicked
        int i= tblSP.getSelectedRow();
        ORDER.txtMasp.setText(tblSP.getModel().getValueAt(i, 0).toString());
        setVisible(false);
    }//GEN-LAST:event_btnChonMouseClicked

    private void btnBochonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBochonMouseClicked
        setVisible(false);
    }//GEN-LAST:event_btnBochonMouseClicked

    private void btnTimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimMouseClicked
        String tim=txtTim.getText();
        String timtheo=cbTim.getSelectedItem().toString();
        SanPhamBUS sanPhamBUS=new SanPhamBUS();
        if(timtheo=="Tên SP"){
            listSP= sanPhamBUS.timTheoten(tim);
        } else{
            if(timtheo=="Nhà SX") listSP= sanPhamBUS.timTheoNhasx(tim);
            else if(timtheo=="Xuất xứ") listSP= sanPhamBUS.timTheoXuatxu(tim);
        }
        if(listSP.size()==0){
            JOptionPane.showMessageDialog(frame, "Không tìm thấy sản phẩm");
        }
        Vector header=new Vector();
        header.add("Mã SP");
        header.add("Tên SP"); 
        header.add("Xuất xứ");
        header.add("Nhà SX");      
        header.add("Số lượng");
        header.add("Tgian BH");
        header.add("Đơn giá");
        
        model=new DefaultTableModel(header,0);
        for(SanPham sanPhamDTO : listSP){
        Vector row=new Vector();
            row.add(sanPhamDTO.masp);
            row.add(sanPhamDTO.tensp);
            row.add(sanPhamDTO.xuatxu);
            row.add(sanPhamDTO.nsx);
            row.add(sanPhamDTO.sl);
            row.add(sanPhamDTO.tgbaohanh);
            row.add(sanPhamDTO.dongia);
            model.addRow(row);
            tblSP.setModel(model);
        }
    }//GEN-LAST:event_btnTimMouseClicked

    public void loadtblSP(){
        SanPhamBUS sanPhamBUS=new SanPhamBUS();
        listSP=sanPhamBUS.docDSSP();
        tblSP.setModel(model);
        String col[]={"Mã SP","Tên SP","Xuất xứ","Nhà SX","Số lượng","Tgian BH","Đơn giá"};
        model.setColumnIdentifiers(col);               
        for(SanPham sp : listSP){
            String value[]={sp.getMa(),sp.getTenSP(),sp.getXuatXu(),sp.getNSX(),String.valueOf(sp.getSL()),sp.getTGBaoHanh(),sp.getDG()};
            model.addRow(value);
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
            java.util.logging.Logger.getLogger(TableSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableSP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBochon;
    private javax.swing.JButton btnChon;
    private javax.swing.JButton btnTim;
    private javax.swing.JComboBox cbTim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSP;
    private javax.swing.JTextField txtTim;
    // End of variables declaration//GEN-END:variables
}
