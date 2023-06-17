
package ModuloDiaHora;

import Principal.Menu;

public class ConsultarVehiculo extends javax.swing.JFrame {
    Menu ventanaMenu;
    
    public ConsultarVehiculo(Menu VentanaMenu) {
        this.ventanaMenu = ventanaMenu;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etqTipoPago = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        etqPlaca = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        campoPlaca = new javax.swing.JTextField();
        etqTipoVehiculo = new javax.swing.JLabel();
        etqSeparador = new javax.swing.JLabel();
        etqEncontrar = new javax.swing.JLabel();
        campoTipoVehiculo = new javax.swing.JTextField();
        campoTipoPago = new javax.swing.JTextField();
        etqFechaIngreso = new javax.swing.JLabel();
        campoFechaIngreso = new javax.swing.JTextField();
        etqTiempo = new javax.swing.JLabel();
        campoTiempo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        etqTipoPago.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 20)); // NOI18N
        etqTipoPago.setForeground(new java.awt.Color(0, 0, 0));
        etqTipoPago.setText("Tipo Pago:");

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        etqTitulo.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 36)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(0, 0, 0));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("Consultar Vehiculo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
        );

        btnAceptar.setBackground(new java.awt.Color(255, 255, 102));
        btnAceptar.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 14)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(0, 0, 0));
        btnAceptar.setText("Aceptar");

        etqPlaca.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 24)); // NOI18N
        etqPlaca.setForeground(new java.awt.Color(0, 0, 0));
        etqPlaca.setText("Placa:");

        btnAtras.setBackground(new java.awt.Color(255, 51, 51));
        btnAtras.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 14)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(0, 0, 0));
        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        campoPlaca.setBackground(new java.awt.Color(255, 255, 153));
        campoPlaca.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 14)); // NOI18N
        campoPlaca.setForeground(new java.awt.Color(0, 0, 0));

        etqTipoVehiculo.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 18)); // NOI18N
        etqTipoVehiculo.setForeground(new java.awt.Color(0, 0, 0));
        etqTipoVehiculo.setText("Tipo Vehiculo:");

        etqSeparador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        etqSeparador.setForeground(new java.awt.Color(0, 0, 0));
        etqSeparador.setText("___________________________________________________________________________________________________________");

        etqEncontrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqEncontrar.setForeground(new java.awt.Color(0, 0, 0));
        etqEncontrar.setText("Vehiculo Encontrado:");

        campoTipoVehiculo.setBackground(new java.awt.Color(255, 255, 153));
        campoTipoVehiculo.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 14)); // NOI18N
        campoTipoVehiculo.setForeground(new java.awt.Color(0, 0, 0));
        campoTipoVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTipoVehiculoActionPerformed(evt);
            }
        });

        campoTipoPago.setBackground(new java.awt.Color(255, 255, 153));
        campoTipoPago.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 14)); // NOI18N
        campoTipoPago.setForeground(new java.awt.Color(0, 0, 0));
        campoTipoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTipoPagoActionPerformed(evt);
            }
        });

        etqFechaIngreso.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 18)); // NOI18N
        etqFechaIngreso.setForeground(new java.awt.Color(0, 0, 0));
        etqFechaIngreso.setText("Fecha/Hora Ingreso: ");

        campoFechaIngreso.setBackground(new java.awt.Color(255, 255, 153));
        campoFechaIngreso.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 14)); // NOI18N
        campoFechaIngreso.setForeground(new java.awt.Color(0, 0, 0));
        campoFechaIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoFechaIngresoActionPerformed(evt);
            }
        });

        etqTiempo.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 18)); // NOI18N
        etqTiempo.setForeground(new java.awt.Color(0, 0, 0));
        etqTiempo.setText("Tiempo:");

        campoTiempo.setBackground(new java.awt.Color(255, 255, 153));
        campoTiempo.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 14)); // NOI18N
        campoTiempo.setForeground(new java.awt.Color(0, 0, 0));
        campoTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTiempoActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqSeparador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(etqTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(campoTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(etqFechaIngreso)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(campoFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(etqTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(etqEncontrar)
                                        .addComponent(etqTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(34, 34, 34)
                                    .addComponent(campoTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etqPlaca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqPlaca)
                    .addComponent(campoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqSeparador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqEncontrar)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqTipoVehiculo)
                    .addComponent(campoTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqTipoPago))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqFechaIngreso)
                    .addComponent(campoFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqTiempo))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void campoTipoVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTipoVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTipoVehiculoActionPerformed

    private void campoTipoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTipoPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTipoPagoActionPerformed

    private void campoFechaIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoFechaIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoFechaIngresoActionPerformed

    private void campoTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTiempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTiempoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JTextField campoFechaIngreso;
    private javax.swing.JTextField campoPlaca;
    private javax.swing.JTextField campoTiempo;
    private javax.swing.JTextField campoTipoPago;
    private javax.swing.JTextField campoTipoVehiculo;
    private javax.swing.JLabel etqEncontrar;
    private javax.swing.JLabel etqFechaIngreso;
    private javax.swing.JLabel etqPlaca;
    private javax.swing.JLabel etqSeparador;
    private javax.swing.JLabel etqTiempo;
    private javax.swing.JLabel etqTipoPago;
    private javax.swing.JLabel etqTipoVehiculo;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
