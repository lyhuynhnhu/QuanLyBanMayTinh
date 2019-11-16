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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDthoai = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDchi = new javax.swing.JTextField();
        btnLuuIn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtKM = new javax.swing.JTextField();
        txtNglap = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNvien = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lbTongtien = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtsl = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtMasp = new javax.swing.JTextField();
        btnChonSP = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();
        btnTrove = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBanhang = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setText("Thông Tin Khách Hàng");

        jLabel3.setText("MÃ KH");

        jLabel4.setText("TÊN KH");

        jLabel5.setText("SDT");

        txtDthoai.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDthoaiFocusLost(evt);
            }
        });

        jLabel6.setText("DỊA CHỈ");

        btnLuuIn.setBackground(new java.awt.Color(51, 204, 255));
        btnLuuIn.setForeground(new java.awt.Color(255, 255, 255));
        btnLuuIn.setText("LƯU VA IN HD");
        btnLuuIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLuuInMouseClicked(evt);
            }
        });

        jLabel11.setText("Khuyến mãi");

        txtKM.setText("0");

        jLabel8.setText("Ngày lập");

        jLabel7.setText("NV bán hàng");

        jLabel10.setText("Tổng tiền:");

        lbTongtien.setForeground(new java.awt.Color(255, 51, 51));
        lbTongtien.setText("0");

        jLabel12.setText("Số lượng");

        jLabel9.setText("Mã SP");

        btnChonSP.setText("...");
        btnChonSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChonSPMouseClicked(evt);
            }
        });

        btnEnter.setBackground(new java.awt.Color(102, 204, 255));
        btnEnter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ok.png"))); // NOI18N
        btnEnter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnterMouseClicked(evt);
            }
        });

        btnTrove.setText("Trở về");

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BÁN HÀNG ");
        jLabel1.setAlignmentX(1.0F);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(txtMasp, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtsl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnChonSP)
                        .addGap(27, 27, 27)
                        .addComponent(btnEnter))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLuuIn)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnTrove)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDthoai, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(100, 100, 100)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtKM, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNvien, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDchi, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(154, 154, 154))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(100, 100, 100)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtNglap, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTrove)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMasp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChonSP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMaKH)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNvien, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNglap, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKM, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDthoai, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDchi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(btnLuuIn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    
    private void txtDthoaiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDthoaiFocusLost
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
            JOptionPane.showMessageDialog(frame, "Khách hàng chưa đăng kí thành viên");
            txtMaKH.setText("");
            txtTenKH.setText("");
            txtDchi.setText("");
            txtKM.setText("0");
        }
    }//GEN-LAST:event_txtDthoaiFocusLost

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
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
