
package ModuloMembresia;

import Clases.Espacios;
import Clases.Membresias;
import Principal.Menu;
import com.mysql.cj.Session;
import com.mysql.cj.protocol.Message;
import java.awt.Color;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.util.Properties;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.event.DocumentEvent;

public class RegistrarMembresia extends javax.swing.JFrame {

    Menu ventanaMenu;
    Date fecha_comienzo = new Date();
    Date fechaEspañolDate = new Date();
    Espacios  espacios_motos [] ;
    Espacios  espacios_carros [] ;
    
    public RegistrarMembresia(Menu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        this.espacios_motos = new Espacios [10];
        this.espacios_carros = new Espacios [10];
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/iconP.png")).getImage());
        this.setLocationRelativeTo(null);
        Fecha();
        camposDeshabilidatos();
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
        jLabel9 = new javax.swing.JLabel();
        campoTotal = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        campoPlaca.setBackground(new java.awt.Color(255, 255, 102));
        campoPlaca.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        campoPlaca.setForeground(new java.awt.Color(0, 0, 0));
        campoPlaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoPlacaKeyTyped(evt);
            }
        });

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

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Fecha Inicio:");

        campoFechaInicio.setBackground(new java.awt.Color(255, 255, 102));
        campoFechaInicio.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        campoFechaInicio.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Fecha Vencimiento:");

        campoFechaVencimiento.setBackground(new java.awt.Color(255, 255, 102));
        campoFechaVencimiento.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        campoFechaVencimiento.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Propietario:");

        campoPropietario.setBackground(new java.awt.Color(255, 255, 102));
        campoPropietario.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        campoPropietario.setForeground(new java.awt.Color(0, 0, 0));

        btnAceptar.setBackground(new java.awt.Color(255, 255, 102));
        btnAceptar.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 18)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(0, 0, 0));
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon_aceptar.png"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnAtras.setBackground(new java.awt.Color(255, 51, 51));
        btnAtras.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 14)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(0, 0, 0));
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon_atras.png"))); // NOI18N
        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Telefono:");

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

        boxTipoMembresia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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
                none(evt);
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

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Placa:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Tipo Vehiculo:");

        boxTipoVehiculo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boxTipoVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Moto", "Carro" }));
        boxTipoVehiculo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                boxTipoVehiculoMouseMoved(evt);
            }
        });
        boxTipoVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTipoVehiculoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Total  a pagar:");

        campoTotal.setBackground(new java.awt.Color(255, 255, 102));
        campoTotal.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        campoTotal.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout contenPrincipalLayout = new javax.swing.GroupLayout(contenPrincipal);
        contenPrincipal.setLayout(contenPrincipalLayout);
        contenPrincipalLayout.setHorizontalGroup(
            contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(contenPrincipalLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenPrincipalLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(campoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(contenPrincipalLayout.createSequentialGroup()
                        .addGroup(contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(contenPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addGroup(contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                                    .addComponent(campoFechaVencimiento)))
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addGroup(contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(campoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(contenPrincipalLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(48, 48, 48)
                                    .addGroup(contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(boxTipoMembresia, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(boxTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(contenPrincipalLayout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(132, 132, 132)
                                .addComponent(btnAceptar)))
                        .addContainerGap(71, Short.MAX_VALUE))))
        );
        contenPrincipalLayout.setVerticalGroup(
            contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenPrincipalLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoFechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30))
                    .addGroup(contenPrincipalLayout.createSequentialGroup()
                        .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(boxTipoMembresia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(boxTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(campoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    
    public void Fecha() {
        SimpleDateFormat formato = new SimpleDateFormat("EEEE, dd/MM/yyyy HH:mm");

        try {
            Date fechaDate = fecha_comienzo;  // No es necesario convertirlo a String
            DateFormatSymbols simbolos = new DateFormatSymbols(new Locale("es"));
            formato = new SimpleDateFormat("EEEE, dd/MM/yyyy HH:mm", simbolos);
            String fechaEspañol = formato.format(fechaDate);
            
            fechaEspañolDate = formato.parse(fechaEspañol);
                    
            campoFechaInicio.setText(fechaEspañol);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void camposDeshabilidatos(){
        deshabilitarCampo(campoFechaInicio);
        deshabilitarCampo(campoFechaVencimiento);
        deshabilitarCampo(campoTotal);
        
    }

    
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String propietario = campoPropietario.getText();
        String telefono = campoTelefono.getText();
        String tipo_membresia = boxTipoMembresia.getSelectedItem().toString();
        String tipo_vehiculo = boxTipoVehiculo.getSelectedItem().toString();
        String placa = campoPlaca.getText();
        String fecha_inicio = campoFechaInicio.getText();
        String fecha_vencimiento = campoFechaVencimiento.getText();
        String texto_total = campoTotal.getText();
        int total = Integer.parseInt(texto_total);
        
        
        if (!propietario.equals("") && !telefono.equals("") && !tipo_vehiculo.equals("") && !tipo_membresia.equals("") && !placa.equals("") && !fecha_inicio.equals("") && !fecha_vencimiento.equals("") && !texto_total.equals("")){
            boolean repetido = false;
            if (!repetido) {
                Membresias temporal = new Membresias(propietario,telefono,tipo_vehiculo,tipo_membresia,placa,fecha_inicio,fecha_vencimiento,total);
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

    private void none(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_none
        
    }//GEN-LAST:event_none

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

        if(tipo_membresia.equals("Mensual") && tipo_vehiculo.equals("Moto")){
            Calendar calendario = Calendar.getInstance();
            calendario.setTime(fechaEspañolDate);
            calendario.add(Calendar.DAY_OF_MONTH, 30);
            Date fecha_vencimiento = calendario.getTime();

            SimpleDateFormat formatoFecha = new SimpleDateFormat("EEEE, dd/MM/yyyy HH:mm");
            String fecha_vencimiento_str = formatoFecha.format(fecha_vencimiento);

            campoFechaVencimiento.setText(fecha_vencimiento_str); 
            campoTotal.setText("30000");
        }else if(tipo_membresia.equals("Quincenal") && tipo_vehiculo.equals("Moto")){
            Calendar calendario = Calendar.getInstance();
            calendario.setTime(fechaEspañolDate);
            calendario.add(Calendar.DAY_OF_MONTH, 15);
            Date fecha_vencimiento = calendario.getTime();

            SimpleDateFormat formatoFecha = new SimpleDateFormat("EEEE, dd/MM/yyyy HH:mm");
            String fecha_vencimiento_str = formatoFecha.format(fecha_vencimiento);

            campoFechaVencimiento.setText(fecha_vencimiento_str); 
            campoTotal.setText("15000");
        }else if(tipo_membresia.equals("Mensual") && tipo_vehiculo.equals("Carro")){
            Calendar calendario = Calendar.getInstance();
            calendario.setTime(fechaEspañolDate);
            calendario.add(Calendar.DAY_OF_MONTH, 30);
            Date fecha_vencimiento = calendario.getTime();

            SimpleDateFormat formatoFecha = new SimpleDateFormat("EEEE, dd/MM/yyyy HH:mm");
            String fecha_vencimiento_str = formatoFecha.format(fecha_vencimiento);

            campoFechaVencimiento.setText(fecha_vencimiento_str); 
            campoTotal.setText("40000");
        }else if(tipo_membresia.equals("Quincenal") && tipo_vehiculo.equals("Carro")){
            Calendar calendario = Calendar.getInstance();
            calendario.setTime(fechaEspañolDate);
            calendario.add(Calendar.DAY_OF_MONTH, 15);
            Date fecha_vencimiento = calendario.getTime();

            SimpleDateFormat formatoFecha = new SimpleDateFormat("EEEE, dd/MM/yyyy HH:mm");
            String fecha_vencimiento_str = formatoFecha.format(fecha_vencimiento);

            campoFechaVencimiento.setText(fecha_vencimiento_str); 
            campoTotal.setText("20000");
        }
        
    }//GEN-LAST:event_boxTipoMembresiaMouseMoved
    
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

    private void boxTipoVehiculoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boxTipoVehiculoMouseMoved
        
    }//GEN-LAST:event_boxTipoVehiculoMouseMoved

    private void boxTipoVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTipoVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxTipoVehiculoActionPerformed

    private void campoTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTelefonoActionPerformed

    private void campoPlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPlacaKeyTyped
        char c=evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad=(""+c).toUpperCase();
            c=cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_campoPlacaKeyTyped

    

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
    private javax.swing.JTextField campoTotal;
    private javax.swing.JPanel contenPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
