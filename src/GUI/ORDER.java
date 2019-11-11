package GUI;

import BUS.CTHoaDonBUS;
import BUS.HoaDonBUS;
import BUS.KhachHangBUS;
import BUS.KhuyenMaiBUS;
import BUS.SanPhamBUS;
import DTO.ChiTietHoaDon;
import DTO.HoaDon;
import DTO.KhachHang;
import DTO.KhuyenMai;
import DTO.SanPham;
import com.sun.jmx.snmp.BerDecoder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ORDER extends javax.swing.JFrame {
    public static DefaultTableModel model= new DefaultTableModel();
    private DefaultTableModel modelKM= new DefaultTableModel();
    private ArrayList<SanPham> listSP= new ArrayList<>();
    private ArrayList<KhuyenMai> listKM= new ArrayList<>();
    private ArrayList<HoaDon> listHD= new ArrayList<>();
    private ArrayList<KhachHang> listKH= new ArrayList<>();
    SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
    private ArrayList<ChiTietHoaDon> listCTHD= new ArrayList<>();
    //chuyển đổi ngày hiện tại sang chuỗi
    String date = dateFormat.format(new Date());
    private JFrame frame;
    public ORDER() {
        initComponents();        
        loadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtMasp = new javax.swing.JTextField();
        btnEnter = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBanhang = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        txtTenKH = new javax.swing.JTextField();
        txtDthoai = new javax.swing.JTextField();
        txtDchi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNvien = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNglap = new javax.swing.JTextField();
        btnLuuIn = new javax.swing.JButton();
        btnTrove = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnChonSP = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lbTongtien = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtKM = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel12 = new javax.swing.JLabel();
        txtsl = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("BAN HANG");
        jLabel1.setAlignmentX(1.0F);

        btnEnter.setText("Enter");
        btnEnter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnterMouseClicked(evt);
            }
        });
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        tblBanhang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MA SP", "TEN SP", "DON GIA", "SO LUONG "
            }
        ));
        jScrollPane1.setViewportView(tblBanhang);

        jLabel2.setText("Thong Tin Khach Hang");

        jLabel3.setText("MA KH");

        jLabel4.setText("TEN KH");

        jLabel5.setText("SDT");

        jLabel6.setText("DIA CHI");

        txtDthoai.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDthoaiFocusLost(evt);
            }
        });

        jLabel7.setText("NV bán hàng");

        jLabel8.setText("Ngày lập");

        btnLuuIn.setText("LUU VA IN HD");
        btnLuuIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLuuInMouseClicked(evt);
            }
        });

        btnTrove.setText("Trở về");

        jLabel9.setText("Mã SP");

        btnChonSP.setText("...");
        btnChonSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChonSPMouseClicked(evt);
            }
        });

        jLabel10.setText("Tổng tiền:");

        lbTongtien.setForeground(new java.awt.Color(255, 51, 51));
        lbTongtien.setText("0");

        jLabel11.setText("Khuyến mãi");

        txtKM.setText("0");

        jToolBar1.setRollover(true);

        jLabel12.setText("Số lượng");

        txtsl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtslActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel12)
                .addGap(33, 33, 33)
                .addComponent(txtsl, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(txtMasp, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnChonSP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEnter)
                .addContainerGap(192, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(312, 312, 312)
                            .addComponent(btnLuuIn))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtTenKH))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtMaKH))
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtDthoai, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtDchi, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(42, 42, 42)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel7))
                                            .addGap(44, 44, 44)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtNglap, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                                .addComponent(txtNvien)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                            .addComponent(txtKM, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbTongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnTrove)
                        .addGap(215, 215, 215)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnTrove)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtsl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnChonSP)
                        .addComponent(txtMasp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(lbTongtien))
                .addGap(8, 8, 8)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNglap))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDthoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDchi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLuuIn)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnterMouseClicked
        int tongtien=0;
        int dem=0;
        SanPhamBUS sanPhamBUS=new SanPhamBUS();
        listSP= sanPhamBUS.timTheoma(txtMasp.getText());
        tblBanhang.setModel(model);
        String col[]={"Mã SP","Tên SP","Đơn giá","Số lượng"};
        model.setColumnIdentifiers(col);
        for(SanPham sp: listSP){
            int row= tblBanhang.getRowCount();
            if(row>0){
                for(int j=0; j<row; j++){
                    if(sp.getMa().equals(tblBanhang.getModel().getValueAt(j, 0).toString())){
                        
                        int sl= Integer.parseInt(tblBanhang.getModel().getValueAt(j, 3).toString());
                        //sl++; 
                        dem++;
                        sl=sl+Integer.parseInt(txtsl.getText());
                        model.setValueAt(sl, j, 3);
                        break;
                    }                   
                }
                if(dem==0){
                    String value[]={sp.getMa(),sp.getTenSP(), sp.getDG(), txtsl.getText()};
                    model.addRow(value);
                }
            }                               
            else  {
                String value[]={sp.getMa(),sp.getTenSP(), sp.getDG(), txtsl.getText()};
                model.addRow(value);
            }                                      
        }
        for(int i=0; i<tblBanhang.getRowCount(); i++){
            int dongia= Integer.parseInt(tblBanhang.getModel().getValueAt(i, 2).toString());
            int sl= Integer.parseInt(tblBanhang.getModel().getValueAt(i, 3).toString());
            String kmaiString= Character.toString(txtKM.getText().charAt(0));
            double km= Double.parseDouble(kmaiString)/100;
            tongtien += (dongia*sl)- (dongia*sl*km);
        }       
        lbTongtien.setText(Integer.toString(tongtien));
    }//GEN-LAST:event_btnEnterMouseClicked

    private void btnChonSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChonSPMouseClicked
        TableSP tableSP=new TableSP();
        tableSP.setVisible(true);
    }//GEN-LAST:event_btnChonSPMouseClicked
    public void loadData(){
        try {
            txtNglap.setText(date);
            KhuyenMaiBUS kmBUS=new KhuyenMaiBUS();
            Date nglap= dateFormat.parse(txtNglap.getText());
            listKM=kmBUS.docDSKM();
            for(KhuyenMai km: listKM){               
                Date ngaybd= dateFormat.parse(km.getNgayBD());
                Date ngaykt= dateFormat.parse(km.getNgayKT());
                if(nglap.after(ngaybd) && nglap.before(ngaykt)) {
                    txtKM.setText(km.getGiaTri());
                } 
            }         
        } catch (ParseException ex) {       
            Logger.getLogger(ORDER.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   

    private void btnLuuInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuuInMouseClicked
        try {
            luuHD();
        } catch (SQLException ex) {
            Logger.getLogger(ORDER.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLuuInMouseClicked

    private void txtslActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtslActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtslActionPerformed

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed



        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnterActionPerformed

    private void txtDthoaiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDthoaiFocusLost
      
            // TODO add your handling code here:\
            int dem=0;
            KhachHangBUS khbus=new KhachHangBUS();
            ArrayList<KhachHang> listkh = khbus.docDSKH();
            for(KhachHang kh:listkh){
                //String sdt=kh.getsdt();
                //SJOptionPane.showMessageDialog(frame, kh.getdiachi());
                if(kh.getdiachi().equals(txtDthoai.getText()))
                {
                    //JOptionPane.showMessageDialog(frame, kh.getsdt());
                    txtMaKH.setText(kh.getmakh());
                    txtTenKH.setText(kh.gettenkh());
                    txtDchi.setText(kh.getsdt());
                    if(kh.diem>100 && kh.diem<200)
                        txtKM.setText("0.5");
                    else if (kh.diem>200)
                            txtKM.setText("1");
                    break;
                }
                else dem++;
            }
            //JOptionPane.showMessageDialog(frame, listkh.size());
        if(dem==listkh.size()){
            JOptionPane.showMessageDialog(frame, "Khác hàng chưa đăng kí thành viên");
            txtMaKH.setText("");
            txtTenKH.setText("");
            txtDchi.setText("");
            txtKM.setText("0");
        }
    }//GEN-LAST:event_txtDthoaiFocusLost
    public void luuHD() throws SQLException{
        HoaDonBUS hdbus= new HoaDonBUS();
        CTHoaDonBUS cthdbus= new CTHoaDonBUS();
        HoaDon hd= new HoaDon();
//        hd.mahd=...........
        KhachHangBUS khbus=new KhachHangBUS();
          ArrayList<KhachHang> listkh = khbus.docDSKH();
          KhachHang kh=new KhachHang();
        int count=0;
        int dem=0;
                    for(KhachHang KH:listkh){
                        if(txtMaKH.getText().equals(KH.makh)) 
                        {
                            kh.makh=txtMaKH.getText();
                            kh.tenkh=txtTenKH.getText();
                    kh.diachi=txtDchi.getText();
                    kh.dienthoai=txtDthoai.getText();
                    kh.LoaiKH=KH.LoaiKH;
                            kh.diem=(int)KH.diem+(Integer.parseInt(lbTongtien.getText())/1000000);
                            khbus.sua(kh);
                            break;}
                        else dem++;
          
                    }
                    if(dem==listkh.size()){
        count=listkh.size();
        KhachHang KH=listkh.get(count-1);
        String chuoi3=KH.makh;
        chuoi3=chuoi3.substring(2);
        count=Integer.parseInt(chuoi3);
        String chuoi1="";
        if(count<10)
        { chuoi1="KH00"+String.valueOf(count+1);
            kh.makh=chuoi1;}
        else if (count<99)
        {
            chuoi1="KH0"+String.valueOf(count+1);
            kh.makh=chuoi1;
        }        else if (count>=99)
        {
            chuoi1="KH"+String.valueOf(count+1);
            kh.makh=chuoi1;
        }
                    kh.tenkh=txtTenKH.getText();
                    kh.diachi=txtDchi.getText();
                    kh.dienthoai=txtDthoai.getText();
                    kh.LoaiKH="KHThuong";
                    kh.diem=Integer.parseInt(lbTongtien.getText())/1000000;
                    khbus.them(kh);
                    }
        {
           
            ArrayList<HoaDon> listhd = hdbus.docDSHD();
        count=0;
        count=listhd.size();
        HoaDon HD=listhd.get(count-1);
        String chuoi3=HD.mahd;
        chuoi3=chuoi3.substring(2);
        count=Integer.parseInt(chuoi3);
        String chuoi2="";
        if(count<10)
        { chuoi2="HD00"+String.valueOf(count+1);
           hd.mahd=chuoi2;}
        else if (count<99)
        {
            chuoi2="KH0"+String.valueOf(count+1);
          hd.mahd=chuoi2;
        }        else
        {
            chuoi2="KH"+String.valueOf(count+1);
            hd.mahd=chuoi2;
        }
        
        {
        //hd.makh= txtMaKH.getText();
        hd.makm= txtKM.getText();
        hd.manv= txtNvien.getText();
        hd.ngaylap= txtNglap.getText();
        hd.tongtien= lbTongtien.getText();
        hd.makh=txtMaKH.getText();
        hdbus.them(hd);
        ChiTietHoaDon cthd= new ChiTietHoaDon();
        for(int i=0; i<tblBanhang.getRowCount(); i++){
//            cthd.mahd=........
            cthd.mahd=hd.mahd;
            cthd.masp= tblBanhang.getModel().getValueAt(i, 0).toString();
            cthd.dongia= tblBanhang.getModel().getValueAt(i, 2).toString();
            cthd.soluong= Integer.parseInt(tblBanhang.getModel().getValueAt(i, 3).toString());
            cthdbus.them(cthd);
        }
        JOptionPane.showMessageDialog(frame, "Đã lưu hóa đơn");
        }}
        /*txtsl.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent e) {
            if (e.getKeyCode()==KeyEvent.VK_ENTER) {
               txtMasp.isFocusable();
            }
         }
      });*/
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
            java.util.logging.Logger.getLogger(ORDER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ORDER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ORDER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ORDER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ORDER().setVisible(true);
            }
        });
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChonSP;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnLuuIn;
    private javax.swing.JButton btnTrove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbTongtien;
    private javax.swing.JTable tblBanhang;
    private javax.swing.JTextField txtDchi;
    private javax.swing.JTextField txtDthoai;
    private javax.swing.JTextField txtKM;
    private javax.swing.JTextField txtMaKH;
    public static javax.swing.JTextField txtMasp;
    private javax.swing.JTextField txtNglap;
    private javax.swing.JTextField txtNvien;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtsl;
    // End of variables declaration//GEN-END:variables
}
