
package ModuloMembresia;

import Clases.Membresias;
import Principal.Menu;
import java.util.Calendar;
import java.util.Date;

public class RegistrarMembresia extends javax.swing.JFrame {

    Menu ventanaMenu;
    Date fecha_comienzo = new Date();
    
    public RegistrarMembresia(Menu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        initComponents();
        Fecha();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenPrincipal = new javax.swing.JPanel();
        campoPlaca = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoFechaInicio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoFechaVencimiento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoPropietario = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        boxTipoMembresia = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        boxTipoVehiculo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        campoPlaca.setBackground(new java.awt.Color(255, 255, 102));
        campoPlaca.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        campoPlaca.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar Membresia");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Fecha Inicio:");

        campoFechaInicio.setBackground(new java.awt.Color(255, 255, 102));
        campoFechaInicio.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        campoFechaInicio.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Fecha Vencimiento:");

        campoFechaVencimiento.setBackground(new java.awt.Color(255, 255, 102));
        campoFechaVencimiento.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        campoFechaVencimiento.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Propietario:");

        campoPropietario.setBackground(new java.awt.Color(255, 255, 102));
        campoPropietario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        campoPropietario.setForeground(new java.awt.Color(0, 0, 0));

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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Telefono:");

        campoTelefono.setBackground(new java.awt.Color(255, 255, 102));
        campoTelefono.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        campoTelefono.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tipo Membresia:");

        boxTipoMembresia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Mensual", "Quincenal" }));
        boxTipoMembresia.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                boxTipoMembresiaMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                boxTipoMembresiaMouseMoved(evt);
            }
        });
        boxTipoMembresia.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                boxTipoMembresiaMouseWheelMoved(evt);
            }
        });
        boxTipoMembresia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boxTipoMembresiaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boxTipoMembresiaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boxTipoMembresiaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boxTipoMembresiaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                boxTipoMembresiaMouseReleased(evt);
            }
        });
        boxTipoMembresia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTipoMembresiaActionPerformed(evt);
            }
        });
        boxTipoMembresia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                boxTipoMembresiaKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Placa:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Tipo Vehiculo:");

        boxTipoVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Moto", "Carro" }));

        javax.swing.GroupLayout contenPrincipalLayout = new javax.swing.GroupLayout(contenPrincipal);
        contenPrincipal.setLayout(contenPrincipalLayout);
        contenPrincipalLayout.setHorizontalGroup(
            contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contenPrincipalLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campoPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenPrincipalLayout.createSequentialGroup()
                        .addGroup(contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxTipoMembresia, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoFechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12))
            .addGroup(contenPrincipalLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenPrincipalLayout.setVerticalGroup(
            contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenPrincipalLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(boxTipoMembresia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(boxTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoFechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed
    
    public void Fecha(){
        campoFechaInicio.setText(String.valueOf(fecha_comienzo));
    }
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String propietario = campoPropietario.getText();
        String telefono = campoTelefono.getText();
        String tipo_membresia = boxTipoMembresia.getSelectedItem().toString();
        String tipo_vehiculo = boxTipoVehiculo.getSelectedItem().toString();
        String placa = campoPlaca.getText();
        String fecha_inicio = campoFechaInicio.getText();
        String fecha_vencimiento = campoFechaVencimiento.getText();
        
        if (!propietario.equals("") && !telefono.equals("") && !tipo_vehiculo.equals("") && !tipo_membresia.equals("") && !placa.equals("") && !fecha_inicio.equals("") && !fecha_vencimiento.equals("")) {
            boolean repetido = false;
            if (!repetido) {
                Membresias temporal = new Membresias(propietario,telefono,tipo_vehiculo,tipo_membresia,placa,fecha_inicio,fecha_vencimiento);
                this.ventanaMenu.database.insertarMembresia(temporal); 
                this.ventanaMenu.setVisible(true);
                System.out.println("Membresia Ingresado correctamente");
                dispose();
            }else{
      
                System.out.println("ERRRRORRRRR");
            }
        }else{
            System.out.println("Diligencie todos los campos");
            
        } 
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void boxTipoMembresiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boxTipoMembresiaMouseClicked
        
    }//GEN-LAST:event_boxTipoMembresiaMouseClicked

    private void boxTipoMembresiaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boxTipoMembresiaMouseReleased
        
    }//GEN-LAST:event_boxTipoMembresiaMouseReleased

    private void boxTipoMembresiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTipoMembresiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxTipoMembresiaActionPerformed

    private void boxTipoMembresiaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boxTipoMembresiaMousePressed
        
    }//GEN-LAST:event_boxTipoMembresiaMousePressed

    private void boxTipoMembresiaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boxTipoMembresiaMouseMoved
        String tipo_membresia = boxTipoMembresia.getSelectedItem().toString();
        String tipo_vehiculo = boxTipoVehiculo.getSelectedItem().toString();
        
        if(tipo_membresia.equals("Mensual")){
            Calendar calendario = Calendar.getInstance();
            calendario.setTime(fecha_comienzo);

            calendario.add(Calendar.DAY_OF_MONTH, 30);

            Date fecha_vencimiento = calendario.getTime();
            campoFechaVencimiento.setText(String.valueOf(fecha_vencimiento)); 
        }else if(tipo_membresia.equals("Quincenal")){
            Calendar calendario = Calendar.getInstance();
            calendario.setTime(fecha_comienzo);

            calendario.add(Calendar.DAY_OF_MONTH, 15);

            Date fecha_vencimiento = calendario.getTime();
            campoFechaVencimiento.setText(String.valueOf(fecha_vencimiento)); 
        }
    }//GEN-LAST:event_boxTipoMembresiaMouseMoved

    private void boxTipoMembresiaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boxTipoMembresiaMouseExited
        
    }//GEN-LAST:event_boxTipoMembresiaMouseExited

    private void boxTipoMembresiaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boxTipoMembresiaMouseDragged
        
    }//GEN-LAST:event_boxTipoMembresiaMouseDragged

    private void boxTipoMembresiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boxTipoMembresiaMouseEntered
        
    }//GEN-LAST:event_boxTipoMembresiaMouseEntered

    private void boxTipoMembresiaMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_boxTipoMembresiaMouseWheelMoved
        
    }//GEN-LAST:event_boxTipoMembresiaMouseWheelMoved

    private void boxTipoMembresiaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxTipoMembresiaKeyReleased
        
    }//GEN-LAST:event_boxTipoMembresiaKeyReleased

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxTipoMembresia;
    private javax.swing.JComboBox<String> boxTipoVehiculo;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JTextField campoFechaInicio;
    private javax.swing.JTextField campoFechaVencimiento;
    private javax.swing.JTextField campoPlaca;
    private javax.swing.JTextField campoPropietario;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JPanel contenPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
