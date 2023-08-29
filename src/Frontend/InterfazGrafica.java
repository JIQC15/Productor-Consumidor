package Frontend;

import Backend.Consumidor;
import Backend.Productor;
import Backend.Recurso;

import javax.swing.ImageIcon;

public class InterfazGrafica extends javax.swing.JFrame {

    ImageIcon imagenDormidoProductor = new ImageIcon(getClass().getResource("/IMG/ShaggyDormido.jpg"));
    ImageIcon imagenDespiertoProductor = new ImageIcon(getClass().getResource("/IMG/ShaggyCocinero.jpg"));
    ImageIcon imagenDormidoConsumidor = new ImageIcon(getClass().getResource("/IMG/ScoobyDormido.jpg"));
    ImageIcon imagenDespiertoConsumidor = new ImageIcon(getClass().getResource("/IMG/ScoobyConsumidor.jpg"));

    public Recurso recursoCompartido;
    public Productor productor;
    public Consumidor consumidor;
    int capacidadMaxima = 5;

    public InterfazGrafica() {
        initComponents();
        recursoCompartido = new Recurso(capacidadMaxima);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblIMGEstadoProductor = new javax.swing.JLabel();
        lblEstadoProductor = new javax.swing.JLabel();
        lblEstadoConsumidor = new javax.swing.JLabel();
        lblIMGEstadoConsumidor = new javax.swing.JLabel();
        btnEmpezar = new javax.swing.JButton();
        btnDetener = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblEstado2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        lblIMGEstadoProductor.setForeground(new java.awt.Color(0, 0, 0));
        lblIMGEstadoProductor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ShaggyCocinero.jpg"))); // NOI18N

        lblEstadoProductor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEstadoProductor.setForeground(new java.awt.Color(0, 0, 0));
        lblEstadoProductor.setText("Estado");

        lblEstadoConsumidor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEstadoConsumidor.setForeground(new java.awt.Color(0, 0, 0));
        lblEstadoConsumidor.setText("Estado");

        lblIMGEstadoConsumidor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ScoobyDormido.jpg"))); // NOI18N

        btnEmpezar.setText("EMPEZAR");
        btnEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpezarActionPerformed(evt);
            }
        });

        btnDetener.setText("DETENER");

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel1");

        jLabel3.setText("jLabel1");

        jLabel4.setText("jLabel1");

        jLabel5.setText("jLabel1");

        lblEstado2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEstado2.setForeground(new java.awt.Color(0, 0, 0));
        lblEstado2.setText("Proceso");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(btnEmpezar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDetener, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(355, 355, 355)
                .addComponent(lblEstado2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(lblIMGEstadoProductor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIMGEstadoConsumidor)
                .addGap(93, 93, 93))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(lblEstadoProductor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblEstadoConsumidor)
                .addGap(155, 155, 155))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEmpezar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDetener, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIMGEstadoProductor)
                    .addComponent(lblIMGEstadoConsumidor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEstadoProductor)
                    .addComponent(lblEstadoConsumidor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(lblEstado2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpezarActionPerformed
        iniciarProductor();
        iniciarConsumidor();


    }//GEN-LAST:event_btnEmpezarActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGrafica().setVisible(true);
            }
        });
    }

    //Metodos:
    public void iniciarProductor() {
        productor = new Productor();
        productor.setNombre("Productor");
        productor.setVelocidadProduccion(5000);
        productor.setRecursoCompartido(recursoCompartido);

        Thread productorThread = new Thread(() -> {
            while (btnEmpezar.isEnabled()) {
                if (productor.isProductorDespierto()) {
//                    productor.producirElemento();
                    productor.run();
                    actualizarInterfazProductor(productor.isProductorDespierto());
                } else {
                    productor.productorDormido();
                    actualizarInterfazProductor(productor.isProductorDespierto());
                }
            }
        });

        productorThread.start();
    }

    public void iniciarConsumidor(){
        consumidor = new Consumidor();
        consumidor.setNombre("Consumidor");
        consumidor.setVelocidadConsumo(1500);
        consumidor.setRecursoCompartido(recursoCompartido);

        Thread consumidorThread = new Thread(() -> {
//            while (!btnEmpezar.isEnabled()) {
                if (consumidor.isConsumidorDespierto()) {
                    consumidor.run();
//                    consumidor.consumirElementosHastaVacio();
//                    consumidor.dormirHastaProductorDespierto();
                    actualizarInterfazConsumidor(consumidor.isConsumidorDespierto());
                } else {
                    consumidor.consumidorDormido();
                    actualizarInterfazConsumidor(consumidor.isConsumidorDespierto());
                }
//            }
        });
        consumidorThread.start();
    }

    private void actualizarInterfazProductor(boolean despierto) {
        if (despierto) {
            lblEstadoProductor.setText("Despierto");
            lblIMGEstadoProductor.setIcon(imagenDespiertoProductor);
        } else {
            lblEstadoProductor.setText("Dormido");
            lblIMGEstadoProductor.setIcon(imagenDormidoProductor);
        }
    }

    private void actualizarInterfazConsumidor(boolean despierto) {
        if (despierto) {
            lblEstadoConsumidor.setText("Despierto");
            lblIMGEstadoConsumidor.setIcon(imagenDespiertoConsumidor);
        } else {
            lblEstadoConsumidor.setText("Dormido");
            lblIMGEstadoConsumidor.setIcon(imagenDormidoConsumidor);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetener;
    private javax.swing.JButton btnEmpezar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEstado2;
    private javax.swing.JLabel lblEstadoConsumidor;
    private javax.swing.JLabel lblEstadoProductor;
    private javax.swing.JLabel lblIMGEstadoConsumidor;
    private javax.swing.JLabel lblIMGEstadoProductor;
    // End of variables declaration//GEN-END:variables
}
