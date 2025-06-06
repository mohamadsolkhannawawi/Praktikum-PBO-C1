// Nama file    : Program.java
// Nama Pembuat : Mohamad Solkhan Nawawi - 24060123120020
// Tanggal      : 21/05/2025
// Deskripsi    : Kelas sebagai program utama untuk mensimulasikan sudah dalam bentuk GUI dengan beberapa button,
//                sebagai implementasi penggunaan GUI disesuaikan dengan materi yang sudah dipelajari.

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jdbc.program;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.util.List;

/**
 *
 * @author Solkhann
 */
public class JFrameUtama extends javax.swing.JFrame {
    private MysqlMahasiswaService service;
    private DefaultListModel<String> listModelId;
    private DefaultListModel<String> listModelNama;
    /**
     * Creates new form JFrameUtama
     */
    public JFrameUtama() {
        initComponents();
        service = new MysqlMahasiswaService();  // Inisialisasi service
        
        // Inisialisasi DefaultListModel
        listModelId = new DefaultListModel<>();
        listModelNama = new DefaultListModel<>();
        
        // Set model ke JList
        jListID.setModel(listModelId);
        jListNama.setModel(listModelNama);
        
        // Tambahkan listener untuk sinkronisasi pilihan antara jListID dan jListNama
        addListSelectionListeners();
        
        // Muat data saat form pertama kali dibuka, sengaja tidak di aktifkan agar
        // saat memulai program, kita perlu menekan button Ambil Semua Data terlebih dahulu
//        loadDataToLists();
    }
    
    private void addListSelectionListeners() {
        // Listener untuk jListID
        jListID.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting() && jListID.getSelectedIndex() != -1) {
                jListNama.setSelectedIndex(jListID.getSelectedIndex());
                populateEditDeleteFields(jListID.getSelectedIndex());
            }
        });

        // Listener untuk jListNama
        jListNama.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting() && jListNama.getSelectedIndex() != -1) {
                jListID.setSelectedIndex(jListNama.getSelectedIndex());
                populateEditDeleteFields(jListNama.getSelectedIndex());
            }
        });
    }

    private void populateEditDeleteFields(int selectedIndex) {
        if (selectedIndex != -1) {
            String selectedId = listModelId.getElementAt(selectedIndex);
            String selectedNama = listModelNama.getElementAt(selectedIndex);

            jTextFieldIDEdit.setText(selectedId);
            jTextFieldNamaEdit.setText(selectedNama);

            jTextFieldIDHapus.setText(selectedId);
            jTextFieldNamaHapus.setText(selectedNama);
        } else {
            jTextFieldIDEdit.setText("");
            jTextFieldNamaEdit.setText("");
            jTextFieldIDHapus.setText("");
            jTextFieldNamaHapus.setText("");
        }
    }
    
    private void loadDataToLists() {
        listModelId.clear();
        listModelNama.clear();

        List<Mahasiswa> daftarMahasiswa = service.getAll(); 
        if (daftarMahasiswa != null) {
            for (Mahasiswa mhs : daftarMahasiswa) {
                listModelId.addElement(String.valueOf(mhs.getId()));
                listModelNama.addElement(mhs.getNama());
            }
        }
    }
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListID = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListNama = new javax.swing.JList<>();
        jLabelTitleProgram = new javax.swing.JLabel();
        jLabelInputNama = new javax.swing.JLabel();
        jTextFieldInputNama = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jLabelNama = new javax.swing.JLabel();
        jButtonTambahkan = new javax.swing.JButton();
        jButtonHapus = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jTextFieldNamaEdit = new javax.swing.JTextField();
        jTextFieldIDEdit = new javax.swing.JTextField();
        jTextFieldIDHapus = new javax.swing.JTextField();
        jTextFieldNamaHapus = new javax.swing.JTextField();
        jButtonAmbilSemuaData = new javax.swing.JButton();
        jButtonResetIndeks = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jListID.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListID);

        jListNama.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListNama);

        jLabelTitleProgram.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelTitleProgram.setText("Kelola Data Mahasiswa");

        jLabelInputNama.setText("Nama :");

        jTextFieldInputNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldInputNamaActionPerformed(evt);
            }
        });

        jLabelID.setText("ID ");

        jLabelNama.setText("NAMA ");

        jButtonTambahkan.setText("Tambahkan");
        jButtonTambahkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTambahkanActionPerformed(evt);
            }
        });

        jButtonHapus.setText("Hapus");
        jButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapusActionPerformed(evt);
            }
        });

        jButtonEdit.setText("Edit");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonAmbilSemuaData.setText("Ambil Semua Data");
        jButtonAmbilSemuaData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAmbilSemuaDataActionPerformed(evt);
            }
        });

        jButtonResetIndeks.setText("Reset Indeks");
        jButtonResetIndeks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetIndeksActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel2.setText("NAMA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabelTitleProgram))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelID, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNama, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonTambahkan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAmbilSemuaData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonResetIndeks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabelInputNama))
                                    .addComponent(jTextFieldIDEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldIDHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldNamaHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonHapus))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldNamaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jTextFieldInputNama)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitleProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID)
                    .addComponent(jLabelNama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelInputNama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldInputNama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonTambahkan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNamaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldIDEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldIDHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldNamaHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAmbilSemuaData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonResetIndeks, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldInputNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldInputNamaActionPerformed
        // TODO add your handling code here:
        jButtonTambahkanActionPerformed(evt);
    }//GEN-LAST:event_jTextFieldInputNamaActionPerformed

    private void jButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusActionPerformed
        // TODO add your handling code here:
        try {
            String idStr = jTextFieldIDHapus.getText();
            if (idStr == null || idStr.trim().isEmpty()) {
                int selectedIndex = jListID.getSelectedIndex(); // Coba ambil dari JList jika field kosong
                if (selectedIndex != -1) {
                    idStr = listModelId.getElementAt(selectedIndex);
                } else {
                    JOptionPane.showMessageDialog(this, "ID untuk hapus tidak boleh kosong atau pilih item dari list.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            int id = Integer.parseInt(idStr);
            int confirm = JOptionPane.showConfirmDialog(this, "Anda yakin ingin menghapus mahasiswa dengan ID " + id + "?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                service.delete(id);
                loadDataToLists();
                JOptionPane.showMessageDialog(this, "Data mahasiswa dengan ID " + id + " berhasil dihapus.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID harus berupa angka.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonHapusActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        // TODO add your handling code here:
        try {
            String idStr = jTextFieldIDEdit.getText();
            String namaBaru = jTextFieldNamaEdit.getText();

            if (idStr == null || idStr.trim().isEmpty() || namaBaru == null || namaBaru.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "ID dan Nama untuk edit tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int id = Integer.parseInt(idStr);
            Mahasiswa mhsUpdate = new Mahasiswa(id, namaBaru);
            service.update(mhsUpdate);
            loadDataToLists();
            JOptionPane.showMessageDialog(this, "Data mahasiswa dengan ID " + id + " berhasil diupdate.", "Sukses", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID harus berupa angka.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonTambahkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTambahkanActionPerformed
        // TODO add your handling code here:
        String nama = jTextFieldInputNama.getText();
        if (nama == null || nama.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Buat objek Mahasiswa menggunakan konstruktor kosong
        Mahasiswa mhsBaru = new Mahasiswa();

        // Set nama untuk objek tersebut menggunakan setter
        mhsBaru.setNama(nama);
        // ID akan di-generate oleh database dan di-update oleh service.add()
        // Panggil service.add()
        service.add(mhsBaru);

        // Muat ulang data dan tampilkan pesan
        loadDataToLists();
        jTextFieldInputNama.setText("");
        JOptionPane.showMessageDialog(this, "Mahasiswa '" + nama + "' berhasil ditambahkan dengan ID: " + mhsBaru.getId(), "Sukses", JOptionPane.INFORMATION_MESSAGE);   
    }//GEN-LAST:event_jButtonTambahkanActionPerformed

    private void jButtonAmbilSemuaDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAmbilSemuaDataActionPerformed
        // TODO add your handling code here:
        loadDataToLists();
    }//GEN-LAST:event_jButtonAmbilSemuaDataActionPerformed

    private void jButtonResetIndeksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetIndeksActionPerformed
        // TODO add your handling code here:
        service.indexReset();
        JOptionPane.showMessageDialog(this, "Operasi reset indeks telah dijalankan.", "Info", JOptionPane.INFORMATION_MESSAGE);
        loadDataToLists();
    }//GEN-LAST:event_jButtonResetIndeksActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAmbilSemuaData;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JButton jButtonResetIndeks;
    private javax.swing.JButton jButtonTambahkan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelInputNama;
    private javax.swing.JLabel jLabelNama;
    private javax.swing.JLabel jLabelTitleProgram;
    private javax.swing.JList<String> jListID;
    private javax.swing.JList<String> jListNama;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldIDEdit;
    private javax.swing.JTextField jTextFieldIDHapus;
    private javax.swing.JTextField jTextFieldInputNama;
    private javax.swing.JTextField jTextFieldNamaEdit;
    private javax.swing.JTextField jTextFieldNamaHapus;
    // End of variables declaration//GEN-END:variables
}
