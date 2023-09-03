package Frontend;

import Backend.Consumidor;
import Backend.Productor;
import Backend.Recurso;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class InterfazGrafica extends javax.swing.JFrame {

    ImageIcon imagenDormidoProductor = new ImageIcon(getClass().getResource("/IMG/ShaggyDormido.jpg"));
    ImageIcon imagenDespiertoProductor = new ImageIcon(getClass().getResource("/IMG/ShaggyCocinero.jpg"));
    ImageIcon imagenDormidoConsumidor = new ImageIcon(getClass().getResource("/IMG/ScoobyDormido.jpg"));
    ImageIcon imagenDespiertoConsumidor = new ImageIcon(getClass().getResource("/IMG/ScoobyConsumidor.jpg"));
    ImageIcon imagenRecursoCompartido = new ImageIcon(getClass().getResource("/IMG/Pizza.png"));

    public Recurso recursoCompartido;
    public Productor productor;
    public Consumidor consumidor;
    int capacidadMaxima = 5;
    public boolean detener;
    public List<EspacioLabel> procesosConVista;
    private int indiceSiguienteLabel = 0;

    public InterfazGrafica() {

        initComponents();

        this.procesosConVista = new ArrayList<>();
        this.procesosConVista.add(new EspacioLabel(false, 1, lblProceso1));

        recursoCompartido = new Recurso(capacidadMaxima, procesosConVista);
        productor = new Productor(recursoCompartido);
        consumidor = new Consumidor(recursoCompartido);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblIMGEstadoProductor = new javax.swing.JLabel();
        lblIMGEstadoConsumidor = new javax.swing.JLabel();
        lblEstadoProductor = new javax.swing.JLabel();
        lblEstadoConsumidor = new javax.swing.JLabel();
        btnEmpezar = new javax.swing.JButton();
        btnDetener = new javax.swing.JButton();
        lblProceso1 = new javax.swing.JLabel();
        lblProceso2 = new javax.swing.JLabel();
        lblProceso3 = new javax.swing.JLabel();
        lblProceso4 = new javax.swing.JLabel();
        lblProceso5 = new javax.swing.JLabel();
        lblTituloProceso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        lblIMGEstadoProductor.setForeground(new java.awt.Color(0, 0, 0));

        lblEstadoProductor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEstadoProductor.setForeground(new java.awt.Color(0, 0, 0));

        lblEstadoConsumidor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEstadoConsumidor.setForeground(new java.awt.Color(0, 0, 0));

        btnEmpezar.setBackground(new java.awt.Color(0, 153, 153));
        btnEmpezar.setText("EMPEZAR");
        btnEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpezarActionPerformed(evt);
            }
        });

        btnDetener.setBackground(new java.awt.Color(0, 153, 153));
        btnDetener.setText("DETENER");
        btnDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetenerActionPerformed(evt);
            }
        });

        lblProceso1.setBackground(new java.awt.Color(0, 153, 153));
        lblProceso1.setForeground(new java.awt.Color(0, 204, 204));

        lblTituloProceso.setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        lblTituloProceso.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloProceso.setText("Proceso");

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
                .addComponent(lblProceso1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblProceso2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblProceso3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(lblProceso4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblProceso5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(lblTituloProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(lblIMGEstadoProductor, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(lblEstadoProductor, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIMGEstadoConsumidor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblEstadoConsumidor, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addGap(93, 93, 93))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEmpezar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDetener, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIMGEstadoConsumidor, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIMGEstadoProductor, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEstadoProductor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstadoConsumidor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(lblTituloProceso)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProceso4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblProceso2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblProceso3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblProceso5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblProceso1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
//        iniciarConsumidor();
    }//GEN-LAST:event_btnEmpezarActionPerformed

    private void btnDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetenerActionPerformed
//        detener();
    }//GEN-LAST:event_btnDetenerActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
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
        Thread productorThread = new Thread(() -> {
            int indice = 0;

            while (!Thread.currentThread().isInterrupted()) {

                lblEstadoProductor.setText("DORMIDO");
                lblEstadoProductor.setForeground(Color.RED);
                lblEstadoProductor.setFont(lblEstadoProductor.getFont().deriveFont(Font.BOLD));
                lblIMGEstadoProductor.setIcon(imagenDormidoProductor);

                actualizarInterfazProductor(); // Actualizar la interfaz en función del estado actual
                if (productor.estadoProductor() == true) {
                    try {
                        productor.estadoProductor();
                        while (true) {
                            int elemento = recursoCompartido.producir();
                            interfazProduciendo();
                            System.out.println("Productor produjo el elemento: " + elemento);
                            productor.estadoProductor();

                            if (!recursoCompartido.espacioDisponible()) {
                                System.out.println("Esta Lleno!!!");
                                Thread.sleep(productor.dormirProductor());
                                actualizarInterfazProductor();
                                break; // Salir del ciclo interno para dormirse
                            } else {
                                actualizarLabels();
//                                indice++;
//                                if (indice >= procesosConVista.size()) {
//                                    // Si el índice supera el tamaño de la lista, reinícialo a 0
//                                    indice = 0;
//                                }
                            }
                        }
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }

                } else {
                    productor.detenerHilo();
                }
                try {
                    Thread.sleep(1000); // Esperar un tiempo antes de volver a verificar el estado
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        productorThread.start();
    }

    public void iniciarConsumidor() {
        Thread consumidorThread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                lblEstadoConsumidor.setText("DORMIDO");
                lblEstadoConsumidor.setForeground(Color.RED);
                lblEstadoConsumidor.setFont(lblEstadoProductor.getFont().deriveFont(Font.BOLD));
                lblIMGEstadoConsumidor.setIcon(imagenDormidoConsumidor);
                
                actualizarInterfazConsumidor();
                try {
                    int tiempoDeEspera = consumidor.dormirConsumidor();
                    Thread.sleep(tiempoDeEspera);

                    if (recursoCompartido.hayElementos()) {
                        if (consumidor.estadoConsumidor() == true) {

                            interfazConsumiendo();
                            int elemento = recursoCompartido.consumir();
                            System.out.println("Consumidor consumio: " + elemento);

                        }
                    } else {
                        consumidor.estadoConsumidor();
                        actualizarInterfazConsumidor();
                        Thread.sleep(2000); // Tiempo de dormir antes de revisar nuevamente
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        consumidorThread.start();
    }

    public void interfazConsumiendo() {
        lblEstadoConsumidor.setText("CONSUMIENDO");
        lblEstadoConsumidor.setForeground(Color.YELLOW);
        lblEstadoConsumidor.setFont(lblEstadoConsumidor.getFont().deriveFont(Font.BOLD));
    }

    public void interfazProduciendo() {
        lblEstadoProductor.setText("PRODUCIENDO");
        lblEstadoProductor.setForeground(Color.YELLOW);
        lblEstadoProductor.setFont(lblEstadoProductor.getFont().deriveFont(Font.BOLD));
    }

    public void actualizarInterfazProductor() {
        SwingUtilities.invokeLater(() -> {
            if (productor.estadoProductor() == true) {
                lblEstadoProductor.setText("DESPIERTO");
                lblEstadoProductor.setForeground(Color.GREEN);
                lblEstadoProductor.setFont(lblEstadoProductor.getFont().deriveFont(Font.BOLD));
                lblIMGEstadoProductor.setIcon(imagenDespiertoProductor);
            } else {
                lblEstadoProductor.setText("DORMIDO");
                lblEstadoProductor.setForeground(Color.RED);
                lblEstadoProductor.setFont(lblEstadoProductor.getFont().deriveFont(Font.BOLD));
                lblIMGEstadoProductor.setIcon(imagenDormidoProductor);
            }
        });
    }

    public void actualizarInterfazConsumidor() {
        SwingUtilities.invokeLater(() -> {
            if (consumidor.estadoConsumidor() == true) {
                lblEstadoConsumidor.setText("DESPIERTO");
                lblEstadoConsumidor.setForeground(Color.GREEN);
                lblEstadoConsumidor.setFont(lblEstadoProductor.getFont().deriveFont(Font.BOLD));
                lblIMGEstadoConsumidor.setIcon(imagenDespiertoConsumidor);
            } else {
                lblEstadoConsumidor.setText("DORMIDO");
                lblEstadoConsumidor.setForeground(Color.RED);
                lblEstadoConsumidor.setFont(lblEstadoProductor.getFont().deriveFont(Font.BOLD));
                lblIMGEstadoConsumidor.setIcon(imagenDormidoConsumidor);
            }
        });
    }

    public void actualizarLabels() {
        ImageIcon imagenRecursoCompartido = new ImageIcon(getClass().getResource("/IMG/Pizza.png"));

        // Utiliza el índice para determinar el nombre del JLabel
        String labelName = "lblProceso" + (indiceSiguienteLabel + 1);

        try {
            java.lang.reflect.Field field = getClass().getDeclaredField(labelName);
            JLabel lbl = (JLabel) field.get(this);

            Icon icon = lbl.getIcon();

            if (icon == null) {
                lbl.setIcon(imagenRecursoCompartido);
            }

            // Incrementa el índice para el próximo JLabel
            indiceSiguienteLabel++;

            // Si alcanzamos el último JLabel, volvemos al primero
            if (indiceSiguienteLabel > 6) {
                indiceSiguienteLabel = 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetener;
    private javax.swing.JButton btnEmpezar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEstadoConsumidor;
    private javax.swing.JLabel lblEstadoProductor;
    private javax.swing.JLabel lblIMGEstadoConsumidor;
    private javax.swing.JLabel lblIMGEstadoProductor;
    private javax.swing.JLabel lblProceso1;
    private javax.swing.JLabel lblProceso2;
    private javax.swing.JLabel lblProceso3;
    private javax.swing.JLabel lblProceso4;
    private javax.swing.JLabel lblProceso5;
    private javax.swing.JLabel lblTituloProceso;
    // End of variables declaration//GEN-END:variables
}
