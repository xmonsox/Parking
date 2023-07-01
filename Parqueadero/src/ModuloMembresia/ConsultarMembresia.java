
package ModuloMembresia;

import Clases.Membresias;
import Principal.Menu;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;


public class ConsultarMembresia extends javax.swing.JFrame {
    Menu ventanaMenu;
    
    public ConsultarMembresia(Menu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/iconP.png")).getImage());
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoFechaInicio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campoFechaVencimiento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoPlacaBuscar = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        campoPlaca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        campoPropietario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        campoTipoMembresia = new javax.swing.JTextField();
        campoTipoVehiculo = new javax.swing.JTextField();
        etqEncontrado = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        etqPago = new javax.swing.JLabel();
        campoPago = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consultar Membresia");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        campoTelefono.setBackground(new java.awt.Color(255, 255, 102));
        campoTelefono.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        campoTelefono.setForeground(new java.awt.Color(0, 0, 0));
        campoTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTelefonoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tipo Membresia:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Fecha Inicio:");

        campoFechaInicio.setBackground(new java.awt.Color(255, 255, 102));
        campoFechaInicio.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        campoFechaInicio.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Placa:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Fecha Vencimiento:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Tipo Vehiculo:");

        campoFechaVencimiento.setBackground(new java.awt.Color(255, 255, 102));
        campoFechaVencimiento.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        campoFechaVencimiento.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Propietario:");

        campoPlacaBuscar.setBackground(new java.awt.Color(255, 255, 102));
        campoPlacaBuscar.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        campoPlacaBuscar.setForeground(new java.awt.Color(0, 0, 0));
        campoPlacaBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoPlacaBuscarKeyTyped(evt);
            }
        });

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

        campoPlaca.setBackground(new java.awt.Color(255, 255, 102));
        campoPlaca.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        campoPlaca.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Telefono:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Placa:");

        campoPropietario.setBackground(new java.awt.Color(255, 255, 102));
        campoPropietario.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        campoPropietario.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        campoTipoMembresia.setBackground(new java.awt.Color(255, 255, 102));
        campoTipoMembresia.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        campoTipoMembresia.setForeground(new java.awt.Color(0, 0, 0));
        campoTipoMembresia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTipoMembresiaActionPerformed(evt);
            }
        });

        campoTipoVehiculo.setBackground(new java.awt.Color(255, 255, 102));
        campoTipoVehiculo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        campoTipoVehiculo.setForeground(new java.awt.Color(0, 0, 0));
        campoTipoVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTipoVehiculoActionPerformed(evt);
            }
        });

        etqEncontrado.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        etqEncontrado.setForeground(new java.awt.Color(0, 0, 0));
        etqEncontrado.setText("Vehiculo Encontrado:");

        btnBuscar.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        etqPago.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        etqPago.setForeground(new java.awt.Color(0, 0, 0));
        etqPago.setText("Pago --:");

        campoPago.setBackground(new java.awt.Color(255, 255, 102));
        campoPago.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        campoPago.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel9)
                        .addGap(33, 33, 33)
                        .addComponent(campoPlacaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(etqEncontrado)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(campoFechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(campoPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(campoPlaca, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(campoTelefono)
                                                .addComponent(campoTipoVehiculo)
                                                .addComponent(campoFechaInicio)
                                                .addComponent(campoTipoMembresia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(435, 435, 435))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(228, 228, 228)
                                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(61, 61, 61)
                                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(etqPago)
                                        .addGap(68, 68, 68)
                                        .addComponent(campoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoPlacaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqEncontrado)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(campoPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(campoTipoMembresia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(campoTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(campoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(campoFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(campoFechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etqPago)
                            .addComponent(campoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 170, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(99, 99, 99))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void campoTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTelefonoActionPerformed

    private void campoTipoMembresiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTipoMembresiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTipoMembresiaActionPerformed

    private void campoTipoVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTipoVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTipoVehiculoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String placa = campoPlacaBuscar.getText();
        Membresias temporal = ( this.ventanaMenu.database.buscarMembresia(placa));
        
        String telefono = String.valueOf(temporal.getTelefono());
       
        if (temporal != null) {
            etqEncontrado.setText("Membresia encontrada:");
            deshabilitarCampo(campoPropietario);
            deshabilitarCampo(campoTelefono);
            deshabilitarCampo(campoTipoMembresia);
            deshabilitarCampo(campoTipoVehiculo);
            deshabilitarCampo(campoPlaca);
            deshabilitarCampo(campoFechaInicio);
            deshabilitarCampo(campoFechaVencimiento);
            deshabilitarCampo(campoPago);
            campoPropietario.setText(temporal.getPropietario());
            campoTelefono.setText(telefono);
            campoTipoMembresia.setText(temporal.getTipo_membresia());
            campoTipoVehiculo.setText(temporal.getTipo_vehiculo());
            campoPlaca.setText(temporal.getPlaca());
            campoFechaInicio.setText(temporal.getFecha_inicio());
            campoFechaVencimiento.setText(temporal.getFecha_vencimiento());
            campoPago.setText(String.valueOf(temporal.getTotal()));
        }else{
            System.out.println("NO SE ENCONTRO LA PLACA");
            etqEncontrado.setText("Membresia NO encontrada:");
            campoPropietario.setText("");
            campoTelefono.setText("");
            campoTipoMembresia.setText("");
            campoTipoVehiculo.setText("");
            campoPlaca.setText("");
            campoFechaInicio.setText("");
            campoFechaVencimiento.setText("");
            campoPago.setText("");
            deshabilitarCampo(campoPropietario);
            deshabilitarCampo(campoTelefono);
            deshabilitarCampo(campoTipoMembresia);
            deshabilitarCampo(campoTipoVehiculo);
            deshabilitarCampo(campoPlaca);
            deshabilitarCampo(campoFechaInicio);
            deshabilitarCampo(campoFechaVencimiento);
            deshabilitarCampo(campoPago);
            campoPlacaBuscar.requestFocus();
        }
        calculoPago();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void campoPlacaBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPlacaBuscarKeyTyped
        char c=evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad=(""+c).toUpperCase();
            c=cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_campoPlacaBuscarKeyTyped
    
    public void calculoPago(){
        String tipo_vehiculo = campoTipoVehiculo.getText();
        String tipo_membresia = campoTipoMembresia.getText();
        
        if(tipo_vehiculo.equals("Moto") && tipo_membresia.equals("Mensual") ){
           etqPago.setText("Pago Mensual:");
        }else if(tipo_vehiculo.equals("Moto") && tipo_membresia.equals("Quincenal")){
            etqPago.setText("Pago Quincenal:");
        }else if(tipo_vehiculo.equals("Carro") && tipo_membresia.equals("Mensual")){
            etqPago.setText("Pago Mensual:");
        }else if(tipo_vehiculo.equals("Carro") && tipo_membresia.equals("Quincenal")){
            etqPago.setText("Pago Quincenal:");
        }
        
    }
    public void deshabilitarCampo(JTextField campo){
        JTextField referencia = new JTextField();
        campo.setBorder( referencia.getBorder() );
        campo.setEnabled(false);
        campo.setBackground(Color.GRAY );
    }
    
    public void habilitarCampo(JTextField campo){
        campo.setEnabled(true);
        campo.setBackground(Color.WHITE );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JTextField campoFechaInicio;
    private javax.swing.JTextField campoFechaVencimiento;
    private javax.swing.JTextField campoPago;
    private javax.swing.JTextField campoPlaca;
    private javax.swing.JTextField campoPlacaBuscar;
    private javax.swing.JTextField campoPropietario;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JTextField campoTipoMembresia;
    private javax.swing.JTextField campoTipoVehiculo;
    private javax.swing.JLabel etqEncontrado;
    private javax.swing.JLabel etqPago;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
