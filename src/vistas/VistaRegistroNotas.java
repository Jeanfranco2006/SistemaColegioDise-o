/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SistemaColegio.vistas;
import SistemaColegio.BaseDeDatos.SistemaNotas;
import SistemaColegio.clases.Alumno;
import sistemanotascolegio.clases.Competencias;
import sistemanotascolegio.clases.Curso;
import sistemanotascolegio.clases.Notas;
import sistemanotascolegio.clases.Persona;

public class VistaRegistroNotas extends javax.swing.JFrame {

    /**
     * Creates new form VistaRefistroNotas
     */
    public VistaRegistroNotas() {
        initComponents();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTFapellidoM = new javax.swing.JTextField();
        jTFnombres = new javax.swing.JTextField();
        jTFapellidoP = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTFdni = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jCBXcurso = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jTFseccion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jBTinsertar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jTFcompe1 = new javax.swing.JTextField();
        jTFcompe2 = new javax.swing.JTextField();
        jTFnotaFinal = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jBTmodificar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTFcompe3 = new javax.swing.JTextField();
        jTFprom = new javax.swing.JTextField();
        jTFedad = new javax.swing.JTextField();
        jTFgrado = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("REGISTRAR NOTAS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 400, 100));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("SimSun-ExtG", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("APELLIDO MATERNO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, 160, 40));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("SimSun-ExtG", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("DNI");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 50, 40));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("SimSun-ExtG", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("NOMBRES");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 80, 40));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("SimSun-ExtG", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("SECCION");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 80, 40));

        jTFapellidoM.setBackground(new java.awt.Color(255, 255, 255));
        jTFapellidoM.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jTFapellidoM.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTFapellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 120, 140, 30));

        jTFnombres.setBackground(new java.awt.Color(255, 255, 255));
        jTFnombres.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jTFnombres.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTFnombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 160, 30));

        jTFapellidoP.setBackground(new java.awt.Color(255, 255, 255));
        jTFapellidoP.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jTFapellidoP.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTFapellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 140, 30));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("SimSun-ExtG", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("APELLIDO PATERNO");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 160, 40));

        jTFdni.setBackground(new java.awt.Color(255, 255, 255));
        jTFdni.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jTFdni.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTFdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 130, 30));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("SimSun-ExtG", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("CURSO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 60, 40));

        jCBXcurso.setBackground(new java.awt.Color(255, 255, 255));
        jCBXcurso.setFont(new java.awt.Font("SimSun-ExtG", 1, 18)); // NOI18N
        jCBXcurso.setForeground(new java.awt.Color(0, 0, 0));
        jCBXcurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MATEMATICAS", "COMUNICACION", "ED.RELIGIOSA", "EPT" }));
        jCBXcurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBXcursoActionPerformed(evt);
            }
        });
        jPanel1.add(jCBXcurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, -1, 30));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("SimSun-ExtG", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("EDAD");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 40, 40));

        jTFseccion.setBackground(new java.awt.Color(255, 255, 255));
        jTFseccion.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jTFseccion.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTFseccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 130, 30));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("SimSun-ExtG", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("GRADO");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 80, 40));

        jBTinsertar.setBackground(new java.awt.Color(255, 255, 204));
        jBTinsertar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jBTinsertar.setForeground(new java.awt.Color(0, 0, 0));
        jBTinsertar.setText("INSERTAR");
        jBTinsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTinsertarActionPerformed(evt);
            }
        });
        jPanel1.add(jBTinsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 140, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setForeground(new java.awt.Color(255, 255, 204));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("ATRAS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(954, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, -1));

        jTFcompe1.setBackground(new java.awt.Color(255, 255, 255));
        jTFcompe1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jTFcompe1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTFcompe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 300, 130, 30));

        jTFcompe2.setBackground(new java.awt.Color(255, 255, 255));
        jTFcompe2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jTFcompe2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTFcompe2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 360, 130, 30));

        jTFnotaFinal.setBackground(new java.awt.Color(255, 255, 255));
        jTFnotaFinal.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jTFnotaFinal.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTFnotaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 510, 130, 30));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("SimSun-ExtG", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("COMPETENCIA 1");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 130, 40));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("SimSun-ExtG", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("COMPETENCIA 2");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 130, 40));

        jBTmodificar.setBackground(new java.awt.Color(255, 255, 204));
        jBTmodificar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jBTmodificar.setForeground(new java.awt.Color(0, 0, 0));
        jBTmodificar.setText("MODIFICAR");
        jPanel1.add(jBTmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, 140, 40));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("SimSun-ExtG", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("COMPETENCIA 3");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 130, 40));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("SimSun-ExtG", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("NOTA FINAL");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 510, 110, 40));

        jTFcompe3.setBackground(new java.awt.Color(255, 255, 255));
        jTFcompe3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jTFcompe3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTFcompe3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, 130, 30));

        jTFprom.setBackground(new java.awt.Color(255, 255, 255));
        jTFprom.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jTFprom.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTFprom, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 130, 30));

        jTFedad.setBackground(new java.awt.Color(255, 255, 255));
        jTFedad.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jTFedad.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTFedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 130, 30));

        jTFgrado.setBackground(new java.awt.Color(255, 255, 255));
        jTFgrado.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jTFgrado.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTFgrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 130, 30));

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("SimSun-ExtG", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("PROMEDIO");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 130, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBXcursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBXcursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBXcursoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        VistaGeneral vg = new VistaGeneral();
        vg.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jBTinsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTinsertarActionPerformed
        
        Alumno alumno  = new Alumno(WIDTH, nombre, Apellido_M, Apellido_P, WIDTH, ERROR, 0, idCurso);
        
    }//GEN-LAST:event_jBTinsertarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        VistaRegistroNotas vg = new VistaRegistroNotas();
        vg.setVisible(true);
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
            java.util.logging.Logger.getLogger(VistaRegistroNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaRegistroNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaRegistroNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaRegistroNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaRegistroNotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBTinsertar;
    private javax.swing.JButton jBTmodificar;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jCBXcurso;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTFapellidoM;
    private javax.swing.JTextField jTFapellidoP;
    private javax.swing.JTextField jTFcompe1;
    private javax.swing.JTextField jTFcompe2;
    private javax.swing.JTextField jTFcompe3;
    private javax.swing.JTextField jTFdni;
    private javax.swing.JTextField jTFedad;
    private javax.swing.JTextField jTFgrado;
    private javax.swing.JTextField jTFnombres;
    private javax.swing.JTextField jTFnotaFinal;
    private javax.swing.JTextField jTFprom;
    private javax.swing.JTextField jTFseccion;
    // End of variables declaration//GEN-END:variables
}
