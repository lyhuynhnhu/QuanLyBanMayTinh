package GUI;

import BUS.CTHoaDonBUS;
import BUS.HoaDonBUS;
import BUS.KhachHangBUS;
import BUS.SanPhamBUS;
import DTO.ChiTietHoaDon;
import DTO.HoaDon;
import DTO.KhachHang;
import DTO.SanPham;
import com.sun.glass.events.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class THKE extends javax.swing.JFrame {
    
    SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
    public THKE() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dcTu = new com.toedter.calendar.JDateChooser();
        dcDen = new com.toedter.calendar.JDateChooser();
        txtSP = new javax.swing.JTextField();
        txtKH = new javax.swing.JTextField();
        txtNSX = new javax.swing.JTextField();
        btnNsx = new javax.swing.JButton();
        btnSP = new javax.swing.JButton();
        btnKH = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThongke = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnTrove = new javax.swing.JButton();
        lbSoluong = new javax.swing.JLabel();
        lbTong = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THỐNG KÊ DOANH THU ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), javax.swing.BorderFactory.createCompoundBorder()));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Từ ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Sản Phẩm");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Khách Hàng ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Đến");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("NSX ");

        dcDen.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dcDenPropertyChange(evt);
            }
        });

        txtSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSPMouseClicked(evt);
            }
        });
        txtSP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSPKeyPressed(evt);
            }
        });

        txtKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtKHMouseClicked(evt);
            }
        });
        txtKH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKHKeyPressed(evt);
            }
        });

        txtNSX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNSXMouseClicked(evt);
            }
        });
        txtNSX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNSXKeyPressed(evt);
            }
        });

        btnNsx.setBackground(new java.awt.Color(255, 255, 255));
        btnNsx.setText("...");
        btnNsx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNsxMouseClicked(evt);
            }
        });

        btnSP.setBackground(new java.awt.Color(255, 255, 255));
        btnSP.setText("...");
        btnSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSPMouseClicked(evt);
            }
        });

        btnKH.setBackground(new java.awt.Color(255, 255, 255));
        btnKH.setText("...");
        btnKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKHMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtKH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKH))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dcTu, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSP)))
                .addGap(63, 63, 63)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dcDen, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtNSX)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNsx)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dcTu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dcDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSP)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(btnNsx))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKH))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblThongke.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "MÃ HD", "MÃ SP", "TÊN SP", "S.LƯỢNG", "THÀNH TIỀN"
            }
        ));
        tblThongke.setRowHeight(25);
        tblThongke.setSelectionBackground(new java.awt.Color(255, 102, 102));
        jScrollPane1.setViewportView(tblThongke);

        jLabel7.setText("S.LƯỢNG");

        jLabel8.setText("TỔNG ");

        btnTrove.setBackground(new java.awt.Color(255, 255, 255));
        btnTrove.setText("Trở về");
        btnTrove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTroveMouseClicked(evt);
            }
        });

        lbSoluong.setBackground(new java.awt.Color(255, 255, 255));
        lbSoluong.setText("0");

        lbTong.setBackground(new java.awt.Color(255, 255, 255));
        lbTong.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTrove)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbTong, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(131, 131, 131)))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTrove)
                .addGap(8, 8, 8)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSoluong)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTong))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTroveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTroveMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_btnTroveMouseClicked

    private void btnSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSPMouseClicked
        TableSP tableSP=new TableSP();
        tableSP.setVisible(true);
    }//GEN-LAST:event_btnSPMouseClicked

    private void btnKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKHMouseClicked
        TableKH tableKH= new TableKH();
        tableKH.setVisible(true);
    }//GEN-LAST:event_btnKHMouseClicked

    private void btnNsxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNsxMouseClicked
        TableNSX tableNSX= new TableNSX();
        tableNSX.setVisible(true);
    }//GEN-LAST:event_btnNsxMouseClicked

    private void dcDenPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dcDenPropertyChange
        try {
            DefaultTableModel model=new DefaultTableModel();
            ArrayList<HoaDon> listHD=new ArrayList<>();
            ArrayList<ChiTietHoaDon> listCTHD=new ArrayList<>();
            int stt=1, tongSluong=0, tongtien=0;
            String tu= dateFormat.format(dcTu.getDate());
            String den= dateFormat.format(dcDen.getDate());
            HoaDonBUS hoaDonBUS= new HoaDonBUS();
            listHD= hoaDonBUS.timTheongay(tu, den);
            tblThongke.setModel(model);
            String col[]={"STT","Mã HĐ","Ngày lập","Số lượng", "Tổng tiền"};
            model.setColumnIdentifiers(col);
            for(HoaDon hd: listHD){
                CTHoaDonBUS cTHoaDonBUS= new CTHoaDonBUS();
                listCTHD= cTHoaDonBUS.timCTHD(hd.getmahd());
                int demSoluong=0;
                for(ChiTietHoaDon cthd: listCTHD){
                    demSoluong += cthd.getSoluong();
                }
                tongSluong += demSoluong; tongtien += Integer.parseInt(hd.gettongtien());
                String value[]={String.valueOf(stt),hd.getmahd(),hd.getngaylap(),String.valueOf(demSoluong),hd.gettongtien()};
                model.addRow(value);
                stt++;
            }
            lbSoluong.setText(String.valueOf(tongSluong));
            lbTong.setText(String.valueOf(tongtien));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_dcDenPropertyChange

    private void txtKHKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKHKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            thkeKH();
        }
    }//GEN-LAST:event_txtKHKeyPressed

    private void txtKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtKHMouseClicked
        thkeKH();
    }//GEN-LAST:event_txtKHMouseClicked

    private void txtSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSPMouseClicked
        thkeSP();
    }//GEN-LAST:event_txtSPMouseClicked

    private void txtSPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSPKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            thkeSP();
        }
    }//GEN-LAST:event_txtSPKeyPressed

    private void txtNSXKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNSXKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            thkeNSX();
        }
    }//GEN-LAST:event_txtNSXKeyPressed

    private void txtNSXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNSXMouseClicked
        thkeNSX();
    }//GEN-LAST:event_txtNSXMouseClicked

    public void thkeKH(){
        try {
            int stt=1, tongSluong=0, tongtien=0;
            String maKH= txtKH.getText(); String tenKH="";
            DefaultTableModel model=new DefaultTableModel();
            ArrayList<KhachHang> listKH=new ArrayList<>();
            ArrayList<HoaDon> listHD=new ArrayList<>();
            ArrayList<ChiTietHoaDon> listCTHD=new ArrayList<>();
            KhachHangBUS khbus= new KhachHangBUS();
            listKH= khbus.timTheoma(maKH);
            for(KhachHang kh: listKH){
                tenKH= kh.gettenkh();
            }
            HoaDonBUS hoaDonBUS= new HoaDonBUS();
            listHD= hoaDonBUS.timTheomakh(maKH);
            tblThongke.setModel(model);
            String col[]={"STT","Mã HĐ","Mã KH","Tên KH","Ngày lập","Số lượng", "Tổng tiền"};
            model.setColumnIdentifiers(col);
            for(HoaDon hd: listHD){
                CTHoaDonBUS cTHoaDonBUS= new CTHoaDonBUS();
                listCTHD= cTHoaDonBUS.timCTHD(hd.getmahd());
                int demSoluong=0;
                for(ChiTietHoaDon cthd: listCTHD){
                    demSoluong += cthd.getSoluong();
                }
                tongSluong += demSoluong; tongtien += Integer.parseInt(hd.gettongtien());
                String value[]={String.valueOf(stt),hd.getmahd(),hd.getmakh(),tenKH,hd.getngaylap(),String.valueOf(demSoluong),hd.gettongtien()};
                model.addRow(value);
                stt++;
            }
            lbSoluong.setText(String.valueOf(tongSluong));
            lbTong.setText(String.valueOf(tongtien));
        } catch (Exception e) {
        } 
    }
    public void thkeSP(){
        try {
            int stt=1, tongSluong=0, tongtien=0; 
            String maSP= txtSP.getText(); String tensp="",nglap="";
            DefaultTableModel model=new DefaultTableModel();
            ArrayList<SanPham> listSP=new ArrayList<>();
            ArrayList<HoaDon> listHD=new ArrayList<>();
            ArrayList<ChiTietHoaDon> listCTHD=new ArrayList<>();
            SanPhamBUS spbus= new SanPhamBUS();
            listSP= spbus.timTheoma(maSP);
            for(SanPham sp: listSP){
                tensp= sp.getTenSP();
            }
            CTHoaDonBUS cthdbus= new CTHoaDonBUS();
            listCTHD= cthdbus.timTheomasp(maSP);
            tblThongke.setModel(model);
            String col[]={"STT","Mã HĐ","Mã SP","Tên SP","Ngày lập","Số lượng", "Thành tiền"};
            model.setColumnIdentifiers(col);
            for(ChiTietHoaDon cthd: listCTHD){
                HoaDonBUS hdbus= new HoaDonBUS();
                listHD= hdbus.timTheomahd(cthd.getMahd());
                for(HoaDon hd: listHD){
                    nglap= hd.getngaylap();
                }
                int thanhTien= cthd.getSoluong()*Integer.parseInt(cthd.getDongia());
                String value[]={String.valueOf(stt),cthd.getMahd(),cthd.getMasp(),tensp,nglap,String.valueOf(cthd.getSoluong()),String.valueOf(thanhTien)};
                model.addRow(value);
                stt++;
                tongSluong += cthd.getSoluong();
                tongtien += thanhTien;
            }
            lbSoluong.setText(String.valueOf(tongSluong));
            lbTong.setText(String.valueOf(tongtien));
        } catch (Exception e) {
        }
    }
    public void thkeNSX(){
        try {
            int stt=1, tongSluong=0, tongtien=0; 
            String maNSX= txtNSX.getText(); String mansx="",nglap="";
            DefaultTableModel model=new DefaultTableModel();
            ArrayList<SanPham> listSP=new ArrayList<>();
            ArrayList<HoaDon> listHD=new ArrayList<>();
            ArrayList<ChiTietHoaDon> listCTHD=new ArrayList<>();
            SanPhamBUS spbus= new SanPhamBUS();
            listSP= spbus.timTheoNhasx(maNSX);
            CTHoaDonBUS cthdbus= new CTHoaDonBUS();
            listCTHD= cthdbus.timTheomasp(maNSX);
            tblThongke.setModel(model);
            String col[]={"STT","Mã HĐ","Ngày lập","Số lượng", "Thành tiền"};
            model.setColumnIdentifiers(col);
            for(ChiTietHoaDon cthd: listCTHD){
                HoaDonBUS hdbus= new HoaDonBUS();
                listHD= hdbus.timTheomahd(cthd.getMahd());
                for(HoaDon hd: listHD){
                    nglap= hd.getngaylap();
                }
                int thanhTien= cthd.getSoluong()*Integer.parseInt(cthd.getDongia());
                String value[]={String.valueOf(stt),cthd.getMahd(),nglap,String.valueOf(cthd.getSoluong()),String.valueOf(thanhTien)};
                model.addRow(value);
                stt++;
                tongSluong += cthd.getSoluong();
                tongtien += thanhTien;
            }
            lbSoluong.setText(String.valueOf(tongSluong));
            lbTong.setText(String.valueOf(tongtien));
        } catch (Exception e) {
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
            java.util.logging.Logger.getLogger(THKE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(THKE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(THKE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(THKE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new THKE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKH;
    private javax.swing.JButton btnNsx;
    private javax.swing.JButton btnSP;
    private javax.swing.JButton btnTrove;
    private com.toedter.calendar.JDateChooser dcDen;
    private com.toedter.calendar.JDateChooser dcTu;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbSoluong;
    private javax.swing.JLabel lbTong;
    private javax.swing.JTable tblThongke;
    public static javax.swing.JTextField txtKH;
    public static javax.swing.JTextField txtNSX;
    public static javax.swing.JTextField txtSP;
    // End of variables declaration//GEN-END:variables
}
