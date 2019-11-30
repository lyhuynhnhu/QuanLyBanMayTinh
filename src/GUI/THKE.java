package GUI;

import BUS.CTHoaDonBUS;
import BUS.HoaDonBUS;
import BUS.KhachHangBUS;
import BUS.SanPhamBUS;
import DTO.ChiTietHoaDon;
import DTO.HoaDon;
import DTO.KhachHang;
import DTO.SanPham;
import DTO.Thongke;
import com.sun.glass.events.KeyEvent;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;

public class THKE extends javax.swing.JFrame {
    
    SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
    public ArrayList<HoaDon> listHD=new ArrayList<>();
    public ArrayList<ChiTietHoaDon> listCTHD=new ArrayList<>();
    public ArrayList<SanPham> listSP=new ArrayList<>();
    public ArrayList<String> mang = new ArrayList<>();
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
        dcTu = new com.toedter.calendar.JDateChooser();
        dcDen = new com.toedter.calendar.JDateChooser();
        txtSP = new javax.swing.JTextField();
        txtKH = new javax.swing.JTextField();
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

        dcDen.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dcDenPropertyChange(evt);
            }
        });

        txtSP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSPKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSPKeyReleased(evt);
            }
        });

        txtKH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKHKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtKHKeyReleased(evt);
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
                        .addComponent(txtKH))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSP))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dcTu, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dcDen, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
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
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
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

        jLabel7.setText("SỐ LƯỢNG BÁN:");

        jLabel8.setText("TỔNG DOANH THU:");

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    ArrayList<HoaDon> HDtk=new ArrayList<>();
    ArrayList<ChiTietHoaDon> CTHDtk=new ArrayList<>();
    ArrayList<SanPham> SPtk=new ArrayList<>();
    ArrayList<KhachHang> KHtk=new ArrayList<>();
    //ArrayList<HoaDon> listHD=new ArrayList<>();
   // ArrayList<ChiTietHoaDon> listCTHD=new ArrayList<>();
    ArrayList<HoaDon> tam=new ArrayList<>();
    ArrayList<KhachHang> listKH=new ArrayList<>();
     //ArrayList<SanPham> listSP=new ArrayList<>();
    ArrayList<Thongke> tk=new ArrayList<Thongke>();
    int co=0;
     public ArrayList<HoaDon> laydstk(ArrayList<HoaDon> a, ArrayList<HoaDon> b, ArrayList<HoaDon> c)
     {
         //if(co==0){
         int dem;
        if(b.size()==0) b.addAll(a);
            else 
            {        c.clear();
                for(HoaDon hd:b)  
                { 
                    for(HoaDon hd1:a)                    
                        if(hd.mahd.equals(hd1.mahd))
                        {
                            dem=0;
                            for(HoaDon hd2:c)
                                if(hd.mahd.equals(hd2.mahd)) dem++;
                            if(dem==0)
                            c.add(hd);
                        }  
                }
                b.clear();
                b.addAll(c);
            }
        //if(c.size()==0) co=1;else co=0;
        //}
       /* else
        {
             c.clear();
            b.addAll(a);
                for(HoaDon hd:b)    
                {
                   
                    for(HoaDon hd1:a)                    
                        if(hd.mahd.equals(hd1.mahd)) c.add(hd); 
                }
                b.clear();
                b.addAll(c);
            
        if(c.size()==0) co=1;else co=0;
        }
             
      */
        return b;
        
    }
    public ArrayList<ChiTietHoaDon> laydscthd(ArrayList<ChiTietHoaDon> a,ArrayList<ChiTietHoaDon> b){
        ArrayList<ChiTietHoaDon> temp=new ArrayList<>();
        int dem=0;
        if(HDtk.size()==0)
            b.addAll(a);
       
            else 
            {              b.clear();
                for(ChiTietHoaDon cthd:a)                  
                    for(HoaDon hd:HDtk)                   
                        if(cthd.mahd.equals(hd.mahd)) b.add(cthd);                                                                  
            
            temp.clear();
            for(ChiTietHoaDon cthd:b){
                dem=0;
                for(ChiTietHoaDon cthd1:temp)
                    if(cthd1.mahd.equals(cthd.mahd)&& cthd1.masp.equals(cthd.masp))
                        dem++;
                if(dem==0) temp.add(cthd);
            }b.clear();
            b.addAll(temp);
                    }
        return b;
    }
    int khc=0;
    public ArrayList<KhachHang> laydskh(ArrayList<KhachHang> a,ArrayList<KhachHang> b,ArrayList<HoaDon> c){
      
        if(c.size()==0) b.addAll(a);
        else 
            {        b.clear();
                for(KhachHang kh:a)                               
                    for(HoaDon hd:c)                                          
                        if(kh.makh.equals(hd.makh)) b.add(kh);                                          
            }
        return b;
    }
    public void thkengay(){
        DefaultTableModel model=new DefaultTableModel();
            
            ArrayList<ChiTietHoaDon> listCTHD=new ArrayList<>();
            int stt=1, tongSluong=0, tongtien=0;
            String msp="",tensp="", makh="",tenkh="";
            String tu= dateFormat.format(dcTu.getDate());
            String den= dateFormat.format(dcDen.getDate());
            HoaDonBUS hoaDonBUS= new HoaDonBUS();
            listHD.clear();
            listHD= hoaDonBUS.timTheongay(tu, den);
            tblThongke.setModel(model);
            String col[]={"STT","Mã HĐ","Mã SP","Tên SP","Mã KH","Tên KH","Ngày lập","Số lượng", "Tổng tiền"};
            model.setColumnIdentifiers(col);            
            laydstk(listHD, HDtk,tam);
             SanPhamBUS spbus=new SanPhamBUS();
             listSP=spbus.docDSSP();
            KhachHangBUS khbus=new KhachHangBUS();
            listKH=khbus.docDSKH();
            for(HoaDon hd: HDtk){
                CTHoaDonBUS cTHoaDonBUS= new CTHoaDonBUS();
                listCTHD= cTHoaDonBUS.timCTHD(hd.getmahd());
                int demSoluong=0;
                for(ChiTietHoaDon cthd: listCTHD){
                    demSoluong += cthd.getSoluong();
                }
                for(ChiTietHoaDon cthd:listCTHD){
                   
                    //listSP=spbus.timTheoma(cthd.masp);
                    for(SanPham sp:listSP)
                        if(sp.masp.equals(cthd.masp)) {tensp=sp.tensp;
                        msp=sp.masp;break;}
                }
                for(KhachHang kh:listKH)
                    if(kh.makh.equals(hd.makh)) tenkh=kh.tenkh;
                tongSluong += demSoluong; tongtien += Integer.parseInt(hd.gettongtien());
                String value[]={String.valueOf(stt),hd.getmahd(),msp,tensp,hd.makh,tenkh,hd.getngaylap(),String.valueOf(demSoluong),hd.gettongtien()};
                model.addRow(value);
                stt++;
            }
            Locale locVN=new Locale("vi","VN");
            NumberFormat tienVN=NumberFormat.getCurrencyInstance(locVN);
            lbSoluong.setText(String.valueOf(tongSluong));
            lbTong.setText(tienVN.format(tongtien));
          
    }
    private void btnTroveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTroveMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_btnTroveMouseClicked

    private void dcDenPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dcDenPropertyChange
        try {
            //HDtk.clear();
            if(txtSP.getText()!="") thkeSP();
            if(txtKH.getText()!="") thkengay();
            thkengay();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_dcDenPropertyChange

    private void txtKHKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKHKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_BACKSPACE){
            HDtk.clear();
            if(dcDen.getDate()!=null) thkengay();
            if(txtSP.getText()!="") thkeSP();
        }
    }//GEN-LAST:event_txtKHKeyPressed

    private void txtSPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSPKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_BACKSPACE){
             
            HDtk.clear();
           System.out.print(HDtk.size());
           System.out.print(" ");
            if(dcDen.getDate()!=null) thkengay();
            if(txtKH.getText()!="") thkeKH();
           // thkeSP();
        }
    }//GEN-LAST:event_txtSPKeyPressed

    private void txtSPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSPKeyReleased
        // TODO add your handling code here:
        //if(evt.getKeyCode()!=KeyEvent.VK_BACKSPACE){
        thkeSP();
    }//GEN-LAST:event_txtSPKeyReleased

    private void txtKHKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKHKeyReleased
        // TODO add your handling code here:
        thkeKH();
    }//GEN-LAST:event_txtKHKeyReleased

    public void thkeKH(){
        try {
            
            int stt=1, tongSluong=0, tongtien=0;
            String maKH= txtKH.getText(); String tenKH="",masp="",tensp="";
            DefaultTableModel model=new DefaultTableModel();
            
            //ArrayList<HoaDon> listHD=new ArrayList<>();
            ArrayList<ChiTietHoaDon> listCTHD=new ArrayList<>();
            KhachHangBUS khbus= new KhachHangBUS();
            listKH.clear();
            listHD.clear();
            listKH= khbus.timTheoma(maKH);
            laydskh(listKH, KHtk,HDtk);
            HoaDonBUS hoaDonBUS= new HoaDonBUS();
            listHD= hoaDonBUS.timTheomakh(maKH);
            tblThongke.setModel(model);
            String col[]={"STT","Mã HĐ","Mã SP","Tên SP","Mã KH","Tên KH","Ngày lập","Số lượng", "Tổng tiền"};
            model.setColumnIdentifiers(col);
             SanPhamBUS spbus=new SanPhamBUS();
             listSP=spbus.docDSSP();
           int demSoluong=0;
            laydstk(listHD, HDtk,tam);
            for(HoaDon hd: HDtk){
                
                CTHoaDonBUS cTHoaDonBUS= new CTHoaDonBUS();
                listCTHD= cTHoaDonBUS.timCTHD(hd.mahd);
                demSoluong=0;
                //System.out.print(listCTHD.size());
                for(ChiTietHoaDon cthd: listCTHD){
                    demSoluong += cthd.soluong;
                    for(SanPham sp:listSP)
                        if(sp.masp.equals(cthd.masp)){
                            masp=sp.masp;
                            tensp=sp.tensp;
                            break;
                        }
                }
                
                
                for(KhachHang kh: KHtk){
                    if(hd.makh.equals(kh.makh))
                    {tenKH= kh.tenkh;break;}
                }
                tongSluong += demSoluong; tongtien += Integer.parseInt(hd.gettongtien());
                String value[]={String.valueOf(stt),hd.getmahd(),masp,tensp,hd.getmakh(),tenKH,hd.getngaylap(),String.valueOf(demSoluong),hd.gettongtien()};
                model.addRow(value);
                stt++;
            }
            
            Locale locVN=new Locale("vi","VN");
            NumberFormat tienVN=NumberFormat.getCurrencyInstance(locVN);
            lbSoluong.setText(String.valueOf(tongSluong));
            lbTong.setText(tienVN.format(tongtien));

        } catch (Exception e) {
        } 
    }
    public void thkeSP(){
        
        try {
            int stt=1, tongSluong=0, tongtien=0; 
            String maSP= txtSP.getText(); String tensp="",nglap="",mkh="",tenkh="";
            DefaultTableModel model=new DefaultTableModel();
            SanPhamBUS spbus= new SanPhamBUS();
            listSP= spbus.timTheoma(maSP);           
            CTHoaDonBUS cthdbus= new CTHoaDonBUS();         
            //CTHDtk.clear();
            listHD.clear();
            listCTHD.clear();
            listCTHD= cthdbus.timTheomasp(maSP); 
           
            laydscthd(listCTHD, CTHDtk); 
            System.out.print(CTHDtk.size());
           System.out.print(" ");
           
            KhachHangBUS khbus=new KhachHangBUS();
            listKH=khbus.docDSKH();
            listHD.clear();
            tblThongke.setModel(model);
            String col[]={"STT","Mã HĐ","Mã KH","Tên KH","Mã SP","Tên SP","Ngày lập","Số lượng", "Thành tiền"};
            model.setColumnIdentifiers(col);
            HoaDonBUS hdbus= new HoaDonBUS();
            for(ChiTietHoaDon cthd: CTHDtk){                    
               listHD.addAll(hdbus.timTheomahd(cthd.mahd));   
                for(HoaDon hd: listHD){
                    if(hd.mahd.equals(cthd.mahd))
                    {nglap= hd.getngaylap();
                    for(KhachHang kh:listKH)
                        if(kh.makh.equals(hd.makh)){
                            mkh=kh.makh;
                            tenkh=kh.tenkh;
                        }
                    }
                    
                }/*for(ChiTietHoaDon cthd:listCTHD)
                    if(hd.mahd.equals(cthd.mahd)){*/
                for(SanPham sp: listSP){                    
                if(sp.masp.equals(cthd.masp))
                tensp= sp.getTenSP();               
                }
                int thanhTien= cthd.getSoluong()*Integer.parseInt(cthd.getDongia());
                String value[]={String.valueOf(stt),cthd.getMahd(),mkh,tenkh,cthd.getMasp(),tensp,nglap,String.valueOf(cthd.getSoluong()),String.valueOf(thanhTien)};
                model.addRow(value);
                stt++;
                tongSluong += cthd.getSoluong();
                tongtien += thanhTien;
                
            }
                        laydstk(listHD, HDtk,tam);
                       //System.out.print(HDtk.size());
            
            Locale locVN=new Locale("vi","VN");
            NumberFormat tienVN=NumberFormat.getCurrencyInstance(locVN);
            lbSoluong.setText(String.valueOf(tongSluong));
            lbTong.setText(tienVN.format(tongtien));

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
    private javax.swing.JButton btnTrove;
    private com.toedter.calendar.JDateChooser dcDen;
    private com.toedter.calendar.JDateChooser dcTu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    public static javax.swing.JTextField txtSP;
    // End of variables declaration//GEN-END:variables
}
