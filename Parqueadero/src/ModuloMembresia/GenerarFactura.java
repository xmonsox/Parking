
package ModuloMembresia;
import Clases.FacturaMembresias;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sourceforge.jbarcodebean.JBarcodeBean;
import net.sourceforge.jbarcodebean.model.Code128;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

import Clases.Membresias;
import ModuloDiaHora.SalidaVehiculo;
import Principal.Menu;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;


public class GenerarFactura extends javax.swing.JFrame {

    Menu ventanaMenu;
    int i = 0;
    int b = 1;
    public GenerarFactura(Menu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/iconP.png")).getImage());
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campoPlaca = new javax.swing.JTextField();
        EtqTelefono = new javax.swing.JLabel();
        EtqTelefono2 = new javax.swing.JLabel();
        campoTipoVehiculo = new javax.swing.JTextField();
        campoTotalPagar = new javax.swing.JTextField();
        btnImprimir = new javax.swing.JButton();
        EtqTelefono3 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        campoTipoMembresia = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        EtqTelefono4 = new javax.swing.JLabel();
        campoFechaInicio = new javax.swing.JTextField();
        EtqNombre = new javax.swing.JLabel();
        EtqTelefono5 = new javax.swing.JLabel();
        campoPlacaBuscar = new javax.swing.JTextField();
        campoFechaVencimiento = new javax.swing.JTextField();
        EtqCedula = new javax.swing.JLabel();
        EtqTelefono1 = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        EtqTelefono6 = new javax.swing.JLabel();
        campoDevuelta = new javax.swing.JTextField();
        EtqTelefono7 = new javax.swing.JLabel();
        campoCuantoPago = new javax.swing.JTextField();
        EtqNombre1 = new javax.swing.JLabel();
        campoPropietario = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        campoPlaca.setBackground(new java.awt.Color(255, 255, 153));
        campoPlaca.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        campoPlaca.setEnabled(false);

        EtqTelefono.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 24)); // NOI18N
        EtqTelefono.setForeground(new java.awt.Color(0, 0, 0));
        EtqTelefono.setText("Tipo Vehiculo:");

        EtqTelefono2.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 24)); // NOI18N
        EtqTelefono2.setForeground(new java.awt.Color(0, 0, 0));
        EtqTelefono2.setText("Placa:");

        campoTipoVehiculo.setBackground(new java.awt.Color(255, 255, 153));
        campoTipoVehiculo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        campoTipoVehiculo.setEnabled(false);

        campoTotalPagar.setBackground(new java.awt.Color(255, 255, 153));
        campoTotalPagar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        campoTotalPagar.setEnabled(false);
        campoTotalPagar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoTotalPagarKeyReleased(evt);
            }
        });

        btnImprimir.setBackground(new java.awt.Color(255, 255, 102));
        btnImprimir.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 14)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(0, 0, 0));
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon_imprimir.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        EtqTelefono3.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 24)); // NOI18N
        EtqTelefono3.setForeground(new java.awt.Color(0, 0, 0));
        EtqTelefono3.setText("Fecha Inicio:");

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

        campoTipoMembresia.setBackground(new java.awt.Color(255, 255, 153));
        campoTipoMembresia.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        campoTipoMembresia.setEnabled(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        jLabel1.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono_salida.png"))); // NOI18N
        jLabel1.setText("FACTURA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );

        EtqTelefono4.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 24)); // NOI18N
        EtqTelefono4.setForeground(new java.awt.Color(0, 0, 0));
        EtqTelefono4.setText("Fecha Vencimiento:");

        campoFechaInicio.setBackground(new java.awt.Color(255, 255, 153));
        campoFechaInicio.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        campoFechaInicio.setEnabled(false);

        EtqNombre.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 36)); // NOI18N
        EtqNombre.setForeground(new java.awt.Color(0, 0, 0));
        EtqNombre.setText("Placa:");

        EtqTelefono5.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 24)); // NOI18N
        EtqTelefono5.setForeground(new java.awt.Color(0, 0, 0));
        EtqTelefono5.setText("Total a pagar:");

        campoPlacaBuscar.setBackground(new java.awt.Color(255, 255, 153));
        campoPlacaBuscar.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        campoPlacaBuscar.setForeground(new java.awt.Color(0, 0, 0));
        campoPlacaBuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoPlacaBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoPlacaBuscarKeyTyped(evt);
            }
        });

        campoFechaVencimiento.setBackground(new java.awt.Color(255, 255, 153));
        campoFechaVencimiento.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        campoFechaVencimiento.setEnabled(false);
        campoFechaVencimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoFechaVencimientoActionPerformed(evt);
            }
        });
        campoFechaVencimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoFechaVencimientoKeyReleased(evt);
            }
        });

        EtqCedula.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 24)); // NOI18N
        EtqCedula.setForeground(new java.awt.Color(0, 0, 0));
        EtqCedula.setText("Telefono:");

        EtqTelefono1.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 24)); // NOI18N
        EtqTelefono1.setForeground(new java.awt.Color(0, 0, 0));
        EtqTelefono1.setText("Tipo Membresia:");

        campoTelefono.setBackground(new java.awt.Color(255, 255, 153));
        campoTelefono.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        campoTelefono.setEnabled(false);

        EtqTelefono6.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 24)); // NOI18N
        EtqTelefono6.setForeground(new java.awt.Color(0, 0, 0));
        EtqTelefono6.setText("Con cuanto pagó:");

        campoDevuelta.setBackground(new java.awt.Color(255, 255, 153));
        campoDevuelta.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        campoDevuelta.setEnabled(false);

        EtqTelefono7.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 24)); // NOI18N
        EtqTelefono7.setForeground(new java.awt.Color(0, 0, 0));
        EtqTelefono7.setText("Devuelta:");

        campoCuantoPago.setBackground(new java.awt.Color(255, 255, 153));
        campoCuantoPago.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        campoCuantoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCuantoPagoActionPerformed(evt);
            }
        });
        campoCuantoPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoCuantoPagoKeyReleased(evt);
            }
        });

        EtqNombre1.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 24)); // NOI18N
        EtqNombre1.setForeground(new java.awt.Color(0, 0, 0));
        EtqNombre1.setText("Propietario:");

        campoPropietario.setBackground(new java.awt.Color(255, 255, 153));
        campoPropietario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        campoPropietario.setEnabled(false);

        btnBuscar.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(btnImprimir)
                .addGap(210, 210, 210))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(EtqNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addComponent(campoPlacaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EtqTelefono2)
                                    .addComponent(EtqTelefono1)
                                    .addComponent(EtqTelefono3)
                                    .addComponent(EtqTelefono4)
                                    .addComponent(EtqTelefono5)
                                    .addComponent(EtqTelefono)
                                    .addComponent(EtqCedula)
                                    .addComponent(EtqTelefono6)
                                    .addComponent(EtqTelefono7)
                                    .addComponent(EtqNombre1))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoTipoMembresia, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                                    .addComponent(campoTipoVehiculo)
                                    .addComponent(campoPropietario)
                                    .addComponent(campoTelefono)
                                    .addComponent(campoDevuelta, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(campoFechaVencimiento)
                                    .addComponent(campoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoTotalPagar)
                                    .addComponent(campoCuantoPago))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 247, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoPlacaBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(EtqNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtqNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtqCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtqTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtqTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTipoMembresia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtqTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtqTelefono3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtqTelefono4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoFechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtqTelefono5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtqTelefono6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCuantoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtqTelefono7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoDevuelta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImprimir)
                    .addComponent(btnAtras))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void campoFechaVencimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoFechaVencimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoFechaVencimientoActionPerformed

    private void campoFechaVencimientoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoFechaVencimientoKeyReleased
        
    }//GEN-LAST:event_campoFechaVencimientoKeyReleased

    private void campoTotalPagarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTotalPagarKeyReleased
        
    }//GEN-LAST:event_campoTotalPagarKeyReleased

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String placa = campoPlacaBuscar.getText();
        Membresias temporal = ( this.ventanaMenu.database.buscarMembresia(placa));
        String telefono = String.valueOf(temporal.getTelefono());
       
        if (temporal != null) {
            deshabilitarCampo(campoPropietario);
            deshabilitarCampo(campoTelefono);
            deshabilitarCampo(campoTipoMembresia);
            deshabilitarCampo(campoTipoVehiculo);
            deshabilitarCampo(campoPlaca);
            deshabilitarCampo(campoFechaInicio);
            deshabilitarCampo(campoFechaVencimiento);
            deshabilitarCampo(campoTotalPagar);
            deshabilitarCampo(campoDevuelta);
            
            campoPropietario.setText(temporal.getPropietario());
            campoTelefono.setText(telefono);
            campoTipoMembresia.setText(temporal.getTipo_membresia());
            campoTipoVehiculo.setText(temporal.getTipo_vehiculo());
            campoPlaca.setText(temporal.getPlaca());
            campoFechaInicio.setText(temporal.getFecha_inicio());
            campoFechaVencimiento.setText(temporal.getFecha_vencimiento());
            campoTotalPagar.setText(String.valueOf(temporal.getTotal()));
            campoCuantoPago.requestFocus();
        }else{
            System.out.println("NO SE ENCONTRO LA PLACA");
            campoPropietario.setText("");
            campoTelefono.setText("");
            campoTipoMembresia.setText("");
            campoTipoVehiculo.setText("");
            campoPlaca.setText("");
            campoFechaInicio.setText("");
            campoFechaVencimiento.setText("");
            campoTotalPagar.setText("");
            campoCuantoPago.setText("");
            deshabilitarCampo(campoPropietario);
            deshabilitarCampo(campoTelefono);
            deshabilitarCampo(campoTipoMembresia);
            deshabilitarCampo(campoTipoVehiculo);
            deshabilitarCampo(campoPlaca);
            deshabilitarCampo(campoFechaInicio);
            deshabilitarCampo(campoFechaVencimiento);
            deshabilitarCampo(campoCuantoPago);
            campoPlacaBuscar.requestFocus();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void campoCuantoPagoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCuantoPagoKeyReleased
        //Calculo de cuanto va a pagar y devuelta
        String pago = campoCuantoPago.getText();
        String total = campoTotalPagar.getText();

        if (pago.isEmpty()) { // Verificar si el campo de pago está vacío
            campoDevuelta.setText(""); // Establecer el valor del campo de devuelta como vacío
        } else {
            if (Integer.parseInt(pago) < Integer.parseInt(total)) {
                System.out.println("ERROR, PAGO INSUFICIENTE");
            } else {
                System.out.println("PAGO EXITOSO");
            }

            int devuelta = Integer.parseInt(pago) - Integer.parseInt(total);
            campoDevuelta.setText(String.valueOf(devuelta));
        }

        int devuelta = Integer.parseInt(pago)-Integer.parseInt(total);
        campoDevuelta.setText(String.valueOf(devuelta));
    }//GEN-LAST:event_campoCuantoPagoKeyReleased

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        String propietario = campoPropietario.getText();
        String telefono = campoTelefono.getText();
        String tipo_membresia = campoTipoMembresia.getText();
        String tipo_vehi = campoTipoVehiculo.getText();
        String placa = campoPlaca.getText();
        String fecha_inicio = campoFechaInicio.getText();
        String fecha_vencimiento = campoFechaVencimiento.getText();
        String texto_total = campoTotalPagar.getText();
        String texto_recibe = campoCuantoPago.getText();
        String texto_devuelta = campoDevuelta.getText();
        
        
        int total = Integer.parseInt(texto_total);
        int recibe = Integer.parseInt(texto_recibe);
        int devuelta = Integer.parseInt(texto_devuelta);
        
        
        // Generar código de barras para la placa del vehículo
        JBarcodeBean barcodeBean = new JBarcodeBean();
        barcodeBean.setCodeType(new Code128());
        barcodeBean.setCode(placa);
        
        // Crear el archivo PDF de la factura
        Document document = new Document();
        try {
            // Especifica la ruta y el nombre del archivo PDF
            String fileName = "FacturasM/factura" + i + ".pdf";
            PdfWriter.getInstance(document, new FileOutputStream(fileName));
            i++;
            
            document.open();

            // Agrega los detalles de la factura al documento PDF
            document.add(new Paragraph("ParkingCentro"));
            document.add(new Paragraph("Factura del Vehículo"));
            document.add(new Paragraph("NIT 10023424335"));
            document.add(new Paragraph("ExoticSoft"));
            document.add(new Paragraph("-----------------------------------"));
            document.add(new Paragraph("Tipo de pago: " + tipo_membresia));
            document.add(new Paragraph("Tipo de vehículo: " + tipo_vehi));
            document.add(new Paragraph("Placa: " + placa));
            document.add(new Paragraph("Fecha de llegada: " + fecha_inicio));
            document.add(new Paragraph("Fecha de salida: " + fecha_vencimiento));
            document.add(new Paragraph("Total a pagar: " + texto_total));
            document.add(new Paragraph("Monto pagado: " + texto_recibe));
            document.add(new Paragraph("Devuelta: " + texto_devuelta));

            // Generar el código de barras como una imagen y agregarlo al documento PDF
            BufferedImage barcodeImage = barcodeBean.draw(new BufferedImage(300, 100, BufferedImage.TYPE_INT_RGB));
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(barcodeImage, "png", baos);
            Image barcodePdfImage = Image.getInstance(baos.toByteArray());
            document.add(barcodePdfImage);
            
            document.close();

            System.out.println("Factura generada exitosamente como 'factura.pdf'.");
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(SalidaVehiculo.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        if (!propietario.equals("") && !telefono.equals("") && !tipo_membresia.equals("") && !placa.equals("") && !fecha_inicio.equals("") && !fecha_vencimiento.equals("") && !texto_total.equals("") && !texto_recibe.equals("") && !texto_devuelta.equals("")) {
            boolean repetido = false;
            if (!repetido) {
                FacturaMembresias temporal = new FacturaMembresias(propietario,telefono,tipo_vehi,tipo_membresia,placa,fecha_inicio,fecha_vencimiento,total,recibe,devuelta);
                this.ventanaMenu.database.insertarSalidaMembresias(temporal); 
                this.ventanaMenu.setVisible(true);
                System.out.println("Factura creada correctamente");        
                dispose();
            }else{
                System.out.println("ERRRRORRRRR");
            }
        }else{
            System.out.println("Diligencie todos los campos");
        } 
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void campoPlacaBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPlacaBuscarKeyTyped
        
        char c=evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad=(""+c).toUpperCase();
            c=cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_campoPlacaBuscarKeyTyped

    private void campoCuantoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCuantoPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCuantoPagoActionPerformed
    
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
    private javax.swing.JLabel EtqCedula;
    private javax.swing.JLabel EtqNombre;
    private javax.swing.JLabel EtqNombre1;
    private javax.swing.JLabel EtqTelefono;
    private javax.swing.JLabel EtqTelefono1;
    private javax.swing.JLabel EtqTelefono2;
    private javax.swing.JLabel EtqTelefono3;
    private javax.swing.JLabel EtqTelefono4;
    private javax.swing.JLabel EtqTelefono5;
    private javax.swing.JLabel EtqTelefono6;
    private javax.swing.JLabel EtqTelefono7;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JTextField campoCuantoPago;
    private javax.swing.JTextField campoDevuelta;
    private javax.swing.JTextField campoFechaInicio;
    private javax.swing.JTextField campoFechaVencimiento;
    private javax.swing.JTextField campoPlaca;
    private javax.swing.JTextField campoPlacaBuscar;
    private javax.swing.JTextField campoPropietario;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JTextField campoTipoMembresia;
    private javax.swing.JTextField campoTipoVehiculo;
    private javax.swing.JTextField campoTotalPagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
