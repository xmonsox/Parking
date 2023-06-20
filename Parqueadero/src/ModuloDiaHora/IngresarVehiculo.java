
package ModuloDiaHora;

import Clases.Vehiculos;
import Principal.Menu;
import java.awt.Color;
import java.util.Date;
import javax.swing.JTextField;

public class IngresarVehiculo extends javax.swing.JFrame {
    
    Menu ventanaMenu;
    Date fecha = new Date();
    
    
    public IngresarVehiculo(Menu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        initComponents();
        campoIngreso.setText(String.valueOf(fecha));
        deshabilitarCampo(campoIngreso);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        etqTitulo = new javax.swing.JLabel();
        campoIngreso = new javax.swing.JTextField();
        etqTipoVehiculo = new javax.swing.JLabel();
        etqTipoPago = new javax.swing.JLabel();
        etqPlaca = new javax.swing.JLabel();
        campoPlaca = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        boxTipoPago = new javax.swing.JComboBox<>();
        boxTipoVehi = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        jLabel1.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingreso Vehiculo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
        );

        etqTitulo.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 24)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(0, 0, 0));
        etqTitulo.setText("Fecha/Hora Ingreso: ");

        campoIngreso.setBackground(new java.awt.Color(255, 255, 153));
        campoIngreso.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 14)); // NOI18N
        campoIngreso.setForeground(new java.awt.Color(0, 0, 0));

        etqTipoVehiculo.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 24)); // NOI18N
        etqTipoVehiculo.setForeground(new java.awt.Color(0, 0, 0));
        etqTipoVehiculo.setText("Tipo Vehiculo:");

        etqTipoPago.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 24)); // NOI18N
        etqTipoPago.setForeground(new java.awt.Color(0, 0, 0));
        etqTipoPago.setText("Tipo Pago:");

        etqPlaca.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 24)); // NOI18N
        etqPlaca.setForeground(new java.awt.Color(0, 0, 0));
        etqPlaca.setText("Placa:");

        campoPlaca.setBackground(new java.awt.Color(255, 255, 153));
        campoPlaca.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 14)); // NOI18N
        campoPlaca.setForeground(new java.awt.Color(0, 0, 0));

        btnAceptar.setBackground(new java.awt.Color(255, 255, 102));
        btnAceptar.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 14)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(0, 0, 0));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnAtras.setBackground(new java.awt.Color(255, 51, 51));
        btnAtras.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 14)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(0, 0, 0));
        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        boxTipoPago.setBackground(new java.awt.Color(255, 255, 102));
        boxTipoPago.setForeground(new java.awt.Color(0, 0, 0));
        boxTipoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Dia", "Hora" }));
        boxTipoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTipoPagoActionPerformed(evt);
            }
        });

        boxTipoVehi.setBackground(new java.awt.Color(255, 255, 102));
        boxTipoVehi.setForeground(new java.awt.Color(0, 0, 0));
        boxTipoVehi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Moto", "Carro", "Bicicleta" }));
        boxTipoVehi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTipoVehiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(etqTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoIngreso))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(etqTipoPago)
                                .addGap(37, 37, 37))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etqPlaca))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(etqTipoVehiculo)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoPlaca)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boxTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxTipoVehi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqTitulo)
                    .addComponent(campoIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxTipoVehi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqTipoVehiculo))
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqTipoPago)
                    .addComponent(boxTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqPlaca)
                    .addComponent(campoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String fecha = campoIngreso.getText();
        String tipo_vehiculo = boxTipoVehi.getSelectedItem().toString();
        String tipo_pago = boxTipoPago.getSelectedItem().toString();
        String placa = campoPlaca.getText();
        
        
        
        if (!fecha.equals("") && !tipo_vehiculo.equals("")  && !tipo_pago.equals("") && !placa.equals("")) {
            boolean repetido = false;
            if (!repetido) {
                Vehiculos temporal = new Vehiculos(placa,tipo_vehiculo,tipo_pago,fecha);
                this.ventanaMenu.database.insertarVehiculo(temporal); 
                this.ventanaMenu.setVisible(true);
                System.out.println("Vehiculo Ingresado correctamente");
                dispose();
            }else{
      
                System.out.println("ERRRRORRRRR");
            }
        }else{
            System.out.println("Diligencie todos los campos");
            
        } 
    }//GEN-LAST:event_btnAceptarActionPerformed

    public void deshabilitarCampo(JTextField campo){
        JTextField referencia = new JTextField();
        campo.setBorder( referencia.getBorder() );
        campo.setEnabled(false);
        campo.setBackground(Color.GRAY );
        campo.setForeground(Color.BLACK);
    }
    
    public void habilitarCampo(JTextField campo){
        campo.setEnabled(true);
        campo.setBackground(Color.WHITE );
    }
    
    private void boxTipoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTipoPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxTipoPagoActionPerformed

    private void boxTipoVehiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTipoVehiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxTipoVehiActionPerformed
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxTipoPago;
    private javax.swing.JComboBox<String> boxTipoVehi;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JTextField campoIngreso;
    private javax.swing.JTextField campoPlaca;
    private javax.swing.JLabel etqPlaca;
    private javax.swing.JLabel etqTipoPago;
    private javax.swing.JLabel etqTipoVehiculo;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
