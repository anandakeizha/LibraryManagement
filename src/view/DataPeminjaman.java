/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import core.Util;
import data.dao.AnggotaDAO;
import data.dao.BukuDAO;
import data.dao.DetailPeminjamanDAO;
import data.dao.PeminjamanDAO;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Buku;
import model.DetailPeminjaman;
import model.Peminjaman;
import model.PinjamBuku;

/**
 *
 * @author anandakeiza
 */
public class DataPeminjaman extends javax.swing.JFrame {

    /**
     * Creates new form dataPeminjaman
     */
    public static int idAnggota = -1;
    public static ArrayList<PinjamBuku> listPinjamBuku = new ArrayList();
    public static Set<Integer> setId = new HashSet<>();
    
    private int idPeminjaman = -1;
    private PeminjamanDAO peminjamanDao;
    private DetailPeminjamanDAO detailPeminjamanDao;
    private AnggotaDAO anggotaDao;
    private BukuDAO bukuDao;
    
    private String status = "Pinjam";
    
    public DataPeminjaman() {
        initComponents();
        peminjamanDao = new PeminjamanDAO();
        detailPeminjamanDao = new DetailPeminjamanDAO();
        anggotaDao = new AnggotaDAO();
        bukuDao = new BukuDAO();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        menuDataAnggota = new javax.swing.JLabel();
        menuDataBuku = new javax.swing.JLabel();
        menuPeminjamanBuku = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnLookAnggota = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetail = new javax.swing.JTable();
        btnLookBuku = new javax.swing.JButton();
        tbDataAnggota = new javax.swing.JTextField();
        btnClearBuku = new javax.swing.JButton();
        btnPinjam = new javax.swing.JButton();
        btnKembalikan = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPeminjaman = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tbSearchNamaPeminjam = new javax.swing.JTextField();
        tbSearchNamaPetugas = new javax.swing.JTextField();
        btnClearSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(169, 222, 249));
        jLabel2.setText("24Library");

        jLabel3.setFont(new java.awt.Font("Heiti TC", 0, 13)); // NOI18N
        jLabel3.setText("Menu");

        menuDataAnggota.setFont(new java.awt.Font("Heiti TC", 0, 13)); // NOI18N
        menuDataAnggota.setText("Data Anggota");
        menuDataAnggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuDataAnggotaMouseClicked(evt);
            }
        });

        menuDataBuku.setFont(new java.awt.Font("Heiti TC", 0, 13)); // NOI18N
        menuDataBuku.setText("Data Buku");
        menuDataBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuDataBukuMouseClicked(evt);
            }
        });

        menuPeminjamanBuku.setFont(new java.awt.Font("Heiti TC", 0, 13)); // NOI18N
        menuPeminjamanBuku.setText("Peminjaman Buku");
        menuPeminjamanBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuPeminjamanBukuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuDataAnggota)
                    .addComponent(menuDataBuku)
                    .addComponent(menuPeminjamanBuku)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addComponent(menuDataAnggota)
                .addGap(18, 18, 18)
                .addComponent(menuDataBuku)
                .addGap(18, 18, 18)
                .addComponent(menuPeminjamanBuku)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Peminjaman Buku");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setText("Anggota :");

        btnLookAnggota.setText("LookUp");
        btnLookAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLookAnggotaActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel13.setText("Form Manipulasi Data Peminjaman");

        jLabel4.setText("Buku :");

        tblDetail.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblDetail);

        btnLookBuku.setText("LookUp");
        btnLookBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLookBukuActionPerformed(evt);
            }
        });

        tbDataAnggota.setEditable(false);

        btnClearBuku.setText("Clear List Buku");
        btnClearBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearBukuActionPerformed(evt);
            }
        });

        btnPinjam.setText("Pinjam");
        btnPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPinjamActionPerformed(evt);
            }
        });

        btnKembalikan.setText("Kembalikan");
        btnKembalikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembalikanActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnPinjam)
                        .addGap(18, 18, 18)
                        .addComponent(btnKembalikan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReset))
                    .addComponent(jScrollPane1)
                    .addComponent(btnClearBuku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLookAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(253, 253, 253)
                                        .addComponent(jLabel7))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(tbDataAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLookBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(btnLookAnggota)
                        .addComponent(tbDataAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(btnLookBuku))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClearBuku)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPinjam)
                    .addComponent(btnKembalikan)
                    .addComponent(btnReset))
                .addContainerGap())
        );

        tblPeminjaman.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPeminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPeminjamanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPeminjaman);

        jLabel14.setText("Cari Peminjaman");

        jLabel15.setText("Nama Peminjam :");

        jLabel16.setText("Nama Petugas :");

        tbSearchNamaPeminjam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbSearchNamaPeminjamKeyTyped(evt);
            }
        });

        tbSearchNamaPetugas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbSearchNamaPetugasKeyTyped(evt);
            }
        });

        btnClearSearch.setText("Clear Search");
        btnClearSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tbSearchNamaPeminjam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnClearSearch))
                            .addComponent(tbSearchNamaPetugas)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tbSearchNamaPeminjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearSearch))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tbSearchNamaPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fillTable() {
        String namaPeminjam = tbSearchNamaPeminjam.getText();
        String namaPetugas = tbSearchNamaPetugas.getText();
        tblPeminjaman.setModel(peminjamanDao.getModel(namaPeminjam, namaPetugas));
    }
    
    private void fillTableDetail() {
        btnClearBuku.setEnabled(false);
        btnLookAnggota.setEnabled(false);
        btnLookBuku.setEnabled(false);
        btnPinjam.setEnabled(false);
        if (status.equals("Selesai")) btnKembalikan.setEnabled(false);
        else btnKembalikan.setEnabled(true);
        tblDetail.setModel(detailPeminjamanDao.getModel(idPeminjaman));
        Peminjaman data = peminjamanDao.findPeminjamanByID(idPeminjaman);
        tbDataAnggota.setText(data.getNamaAnggota());
    }
    
    public void fillBookOnList(){
        btnClearBuku.setEnabled(true);
        btnLookAnggota.setEnabled(true);
        btnLookBuku.setEnabled(true);
        btnPinjam.setEnabled(true);
        btnKembalikan.setEnabled(false);
        Object[][] dataTable = new Object[listPinjamBuku.size()][2];
        
        for (int i = 0; i < listPinjamBuku.size(); i++) {
            dataTable[i][0] = listPinjamBuku.get(i).getJudulBuku();
            dataTable[i][1] = listPinjamBuku.get(i).getJumlah();
        }
        
        String[] colNames = {"Judul Buku", "Jumlah"};
        
        DefaultTableModel model = new DefaultTableModel(dataTable, colNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 1;
            }

            @Override
            public void setValueAt(Object aValue, int row, int column) {
                Buku buku = bukuDao.findBukuByJudul(getValueAt(row, 0).toString());
                
                try {
                    int jumlah = Integer.parseInt(aValue.toString());
                    
                    if (jumlah < 1) {
                        JOptionPane.showMessageDialog(null, "Jumlah tidak boleh kurang dari 1", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else if (jumlah > buku.getStok()) {
                        JOptionPane.showMessageDialog(null, "Jumlah tidak boleh lebih dari " + buku.getStok(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else {
                        super.setValueAt(jumlah, row, column);
                        listPinjamBuku.get(row).setJumlah(jumlah);
                    }
                }
                catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Masukkan angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        };
        
        tblDetail.setModel(model);
    }
    
    private void btnLookAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLookAnggotaActionPerformed
        LookupView look = new LookupView(this, true);
        look.showDataAnggota();
        look.setVisible(true);
    }//GEN-LAST:event_btnLookAnggotaActionPerformed

    private void tbSearchNamaPeminjamKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbSearchNamaPeminjamKeyTyped
        fillTable();
    }//GEN-LAST:event_tbSearchNamaPeminjamKeyTyped

    private void tbSearchNamaPetugasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbSearchNamaPetugasKeyTyped
        fillTable();
    }//GEN-LAST:event_tbSearchNamaPetugasKeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        fillTable();
    }//GEN-LAST:event_formWindowOpened

    private void menuDataAnggotaMouseClicked(java.awt.event.MouseEvent evt) {
        this.dispose();
        new DataAnggota().setVisible(true);
    }

    private void menuDataBukuMouseClicked(java.awt.event.MouseEvent evt) {
        this.dispose();
        new DataBuku().setVisible(true);
    }

    private void menuPeminjamanBukuMouseClicked(java.awt.event.MouseEvent evt) {
        this.dispose();
        new DataPeminjaman().setVisible(true);
    }

    private void tblPeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPeminjamanMouseClicked
        idPeminjaman = Integer.parseInt(tblPeminjaman.getValueAt(tblPeminjaman.getSelectedRow(), 0).toString());
        Boolean tglKembali = tblPeminjaman.getValueAt(tblPeminjaman.getSelectedRow(), 3) != null;
        if (tglKembali) status = "Selesai";
        else {
            status = "Kembalikan";
            idAnggota = peminjamanDao.findPeminjamanByID(idPeminjaman).getIdAnggota();
        }
        fillTableDetail();
    }//GEN-LAST:event_tblPeminjamanMouseClicked

    private void btnClearSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearSearchActionPerformed
        tbSearchNamaPeminjam.setText("");
        tbSearchNamaPetugas.setText("");
        fillTable();
    }//GEN-LAST:event_btnClearSearchActionPerformed

    private void btnLookBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLookBukuActionPerformed
        LookupView look = new LookupView(this, true);
        look.showDataBuku();
        look.setVisible(true);
        fillBookOnList();
    }//GEN-LAST:event_btnLookBukuActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        idAnggota = -1;
        tbDataAnggota.setText("");
        status = "Pinjam";
        clearBook();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnClearBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearBukuActionPerformed
        clearBook();
    }//GEN-LAST:event_btnClearBukuActionPerformed

    private void btnPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPinjamActionPerformed
        if (idAnggota == -1 || listPinjamBuku.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
            return;
        }
        Peminjaman peminjaman = new Peminjaman();
        peminjaman.setIdAnggota(idAnggota);
        peminjaman.setIdPetugas(Util.petugas.getId());
        
        int id = peminjamanDao.addPeminjaman(peminjaman);
        if (id == -1) return;
        
        for (int i = 0; i < listPinjamBuku.size(); i++) {
            DetailPeminjaman detail = new DetailPeminjaman();
            detail.setIdPeminjaman(id);
            detail.setIdBuku(listPinjamBuku.get(i).getIdBuku());
            detail.setJumlah(listPinjamBuku.get(i).getJumlah());
            
            if (!detailPeminjamanDao.addDetailPeminjaman(detail)) {
                JOptionPane.showMessageDialog(null, "Terjadi kesalahan!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
        
        clearBook();
        idAnggota = -1;
        tbDataAnggota.setText("");
        fillTable();
    }//GEN-LAST:event_btnPinjamActionPerformed

    private void btnKembalikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembalikanActionPerformed
        if (peminjamanDao.returnPeminjaman(idPeminjaman)) JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
        else JOptionPane.showMessageDialog(null, "Data gagal disimpan");
        
        idPeminjaman = -1;
        clearBook();
        idAnggota = -1;
        tbDataAnggota.setText("");
        fillTable();
    }//GEN-LAST:event_btnKembalikanActionPerformed

    private void clearBook() {
        idPeminjaman = -1;
        listPinjamBuku.removeAll(listPinjamBuku);
        setId.removeAll(setId);
        fillBookOnList();
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(DataPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataPeminjaman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearBuku;
    private javax.swing.JButton btnClearSearch;
    private javax.swing.JButton btnKembalikan;
    private javax.swing.JButton btnLookAnggota;
    private javax.swing.JButton btnLookBuku;
    private javax.swing.JButton btnPinjam;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel menuDataAnggota;
    private javax.swing.JLabel menuDataBuku;
    private javax.swing.JLabel menuPeminjamanBuku;
    public static javax.swing.JTextField tbDataAnggota;
    private javax.swing.JTextField tbSearchNamaPeminjam;
    private javax.swing.JTextField tbSearchNamaPetugas;
    private javax.swing.JTable tblDetail;
    private javax.swing.JTable tblPeminjaman;
    // End of variables declaration//GEN-END:variables
}
