/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import DomainModels.HoaDon;
import Services.HoaDonChiTietService;
import Services.HoaDonService;
import Services.SanPhamService;
import Services.impl.HoaDonChiTietServiceImpl;
import Services.impl.HoaDonServiceImpl;
import Services.impl.SanPhamServiceImpl;
import ViewModels.HoaDonChiTietResponse;
import ViewModels.HoaDonResponse;
import ViewModels.SanPhamResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hangnt
 */
public class ViewBanHang extends javax.swing.JFrame {

    private final List<SanPhamResponse> listSanPhams;
    private List<HoaDonChiTietResponse> listHoaDonChiTiets;
    private List<HoaDonResponse> listHoaDons;
    private Map<SanPhamResponse, Integer> maps;
    private final DefaultTableModel dtmHoaDon;
    private DefaultTableModel dtmHoaDonChiTiet;
    private final DefaultTableModel dtmSanPham;
    private final HoaDonService hoaDonService;
    private final HoaDonChiTietService hoaDonChiTietService;
    private final SanPhamService sanPhamService;
    private int indexHoaDonSelected;

    /**
     * Creates new form ViewBanHang
     */
    public ViewBanHang() {
        initComponents();
        hoaDonService = new HoaDonServiceImpl();
        hoaDonChiTietService = new HoaDonChiTietServiceImpl();
        sanPhamService = new SanPhamServiceImpl();
        listHoaDonChiTiets = new ArrayList<>();
        maps = new HashMap<>();
        dtmHoaDonChiTiet = (DefaultTableModel) tbHoaDonChiTiet.getModel();
        indexHoaDonSelected = 0;

        // get all hoa don
        dtmHoaDon = (DefaultTableModel) tbHoaDon.getModel();
        listHoaDons = hoaDonService.getAll();
        showTableHoaDon(listHoaDons);

        // get all san pham
        dtmSanPham = (DefaultTableModel) tbSanPham.getModel();
        listSanPhams = sanPhamService.getAll();
        showTableSanPham(listSanPhams);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTaoHoaDon = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbHoaDon = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHoaDonChiTiet = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbSanPham = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNgayTao = new javax.swing.JTextField();
        txtNguoiNhan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDiaChi = new javax.swing.JTextArea();
        btnThanhToan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTaoHoaDon.setText("Tạo hoá đơn");
        btnTaoHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoHoaDonActionPerformed(evt);
            }
        });

        tbHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Ngày Tạo", "Tình trạng"
            }
        ));
        tbHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHoaDonMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbHoaDon);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Giỏ hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N

        tbHoaDonChiTiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên SP", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ));
        jScrollPane1.setViewportView(tbHoaDonChiTiet);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N

        tbSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Tên SP", "Số lượng", "Giá nhập", "Giá bán", "Miêu tả"
            }
        ));
        tbSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSanPhamMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbSanPham);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Giỏ hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N

        jLabel1.setText("Ngày tạo");

        jLabel2.setText("Tên người nhận");

        jLabel3.setText("Địa chỉ");

        jLabel4.setText("SĐT");

        txtDiaChi.setColumns(20);
        txtDiaChi.setRows(5);
        jScrollPane4.setViewportView(txtDiaChi);

        btnThanhToan.setText("Thanh Toán");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(34, 34, 34)
                        .addComponent(txtNguoiNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(90, 90, 90)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(233, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThanhToan)
                .addGap(284, 284, 284))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNguoiNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(39, 39, 39))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnThanhToan)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTaoHoaDon)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(173, 173, 173)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(724, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTaoHoaDon)
                        .addGap(186, 186, 186)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(637, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHoaDonMouseClicked
        int row = tbHoaDon.getSelectedRow();
        indexHoaDonSelected = row;

        // fill table hoa don chi tiet
        HoaDonResponse hoaDonResponse = listHoaDons.get(row);
        dtmHoaDonChiTiet = (DefaultTableModel) tbHoaDonChiTiet.getModel();
        listHoaDonChiTiets = hoaDonChiTietService.getAllByHoaDonID(hoaDonResponse.getId());
        showTableHoaDonChiTiet(listHoaDonChiTiets);

        // fill data
        txtNgayTao.setText(hoaDonResponse.getNgayTao() + "");
        txtNguoiNhan.setText(hoaDonResponse.getTenNguoiNhan());
        txtDiaChi.setText(hoaDonResponse.getDiaChi());
        txtSDT.setText(hoaDonResponse.getSoDienThoai());
    }//GEN-LAST:event_tbHoaDonMouseClicked

    private void tbSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSanPhamMouseClicked
        int row = tbSanPham.getSelectedRow();
        // fill table hoa don chi tiet
        SanPhamResponse sanPhamResponse = listSanPhams.get(row);
        HoaDonResponse hoaDonResponse = listHoaDons.get(indexHoaDonSelected);

        // add to list hoa don chi tiet
        String soLuong = JOptionPane.showInputDialog("Số lương ", "0");
        HoaDonChiTietResponse hoaDonChiTietResponse = new HoaDonChiTietResponse();
        hoaDonChiTietResponse.setDonGia(sanPhamResponse.getGiaNhap());
        hoaDonChiTietResponse.setTenSanPham(sanPhamResponse.getTenSanPham());
        hoaDonChiTietResponse.setSoLuong(Integer.valueOf(soLuong));
        hoaDonChiTietResponse.setSanPhamID(sanPhamResponse.getId());
        hoaDonChiTietResponse.setHoaDonID(hoaDonResponse.getId());
        listHoaDonChiTiets.add(hoaDonChiTietResponse);

        // tru so luong san pham da chon
        sanPhamResponse.setSoLuong(sanPhamResponse.getSoLuong() - Integer.valueOf(soLuong));
        listSanPhams.set(row, sanPhamResponse);
        showTableSanPham(listSanPhams);
        maps.put(sanPhamResponse, sanPhamResponse.getSoLuong());

        // show table hoa don chi tiet
        showTableHoaDonChiTiet(listHoaDonChiTiets);
    }//GEN-LAST:event_tbSanPhamMouseClicked

    private void btnTaoHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoHoaDonActionPerformed
        dtmHoaDonChiTiet.setRowCount(0);

        // insert hoa don
        HoaDon hoaDon = new HoaDon();
        JOptionPane.showMessageDialog(this, hoaDonService.addHoaDon(hoaDon));
        listHoaDons = hoaDonService.getAll();
        showTableHoaDon(listHoaDons);
    }//GEN-LAST:event_btnTaoHoaDonActionPerformed

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        String nguoiNhan = txtNguoiNhan.getText();
        String sdt = txtSDT.getText();
        String diaChi = txtDiaChi.getText();
        HoaDonResponse hoaDonResponse = listHoaDons.get(indexHoaDonSelected);

        // tao 1 hoa don
        HoaDon hoaDon = new HoaDon(nguoiNhan, diaChi, sdt);
        // update hoa don
        hoaDonService.updateHoaDon(hoaDonResponse.getId(), hoaDon);

        // insert hoa don chi tiet
        JOptionPane.showMessageDialog(this,
                hoaDonChiTietService.addListOrder(hoaDonResponse.getId(),
                        listHoaDonChiTiets));

        // update số lượng product 
        sanPhamService.update(maps);
    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void showTableHoaDon(List<HoaDonResponse> lists) {
        dtmHoaDon.setRowCount(0);
        for (HoaDonResponse hd : lists) {
            dtmHoaDon.addRow(hd.toDataRow());
        }
    }

    private void showTableSanPham(List<SanPhamResponse> lists) {
        dtmSanPham.setRowCount(0);
        for (SanPhamResponse sp : lists) {
            dtmSanPham.addRow(sp.toDataRow());
        }
    }

    private void showTableHoaDonChiTiet(List<HoaDonChiTietResponse> lists) {
        dtmHoaDonChiTiet.setRowCount(0);
        for (HoaDonChiTietResponse hdct : lists) {
            dtmHoaDonChiTiet.addRow(hdct.toDataRow());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTaoHoaDon;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tbHoaDon;
    private javax.swing.JTable tbHoaDonChiTiet;
    private javax.swing.JTable tbSanPham;
    private javax.swing.JTextArea txtDiaChi;
    private javax.swing.JTextField txtNgayTao;
    private javax.swing.JTextField txtNguoiNhan;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables
}
