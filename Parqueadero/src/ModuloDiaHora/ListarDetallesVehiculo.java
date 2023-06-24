
package ModuloDiaHora;

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
import Clases.FacturaVehiculo;
import Clases.Vehiculos;
import Principal.Menu;
import java.awt.Color;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JTextField;



public class ListarDetallesVehiculo extends javax.swing.JFrame {
    
    FacturaVehiculo arreglo_vehiculos [];
    Date fecha_salida = new Date();
    Menu ventanaMenu;
    int i = 0;
    int b = 1;
    public ListarDetallesVehiculo(Menu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/iconP.png")).getImage());
        this.setLocationRelativeTo(null);
        campoPlacaBuscar.requestFocus();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        EtqNombre = new javax.swing.JLabel();
        EtqTelefono5 = new javax.swing.JLabel();
        campoFechaLlegada = new javax.swing.JTextField();
        campoPagar = new javax.swing.JTextField();
        EtqCedula = new javax.swing.JLabel();
        etqEncontrado = new javax.swing.JLabel();
        EtqTelefono1 = new javax.swing.JLabel();
        campoPlacaBuscar = new javax.swing.JTextField();
        campoFechaSalida = new javax.swing.JTextField();
        campoTipoPago = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        EtqTelefono = new javax.swing.JLabel();
        EtqTelefono2 = new javax.swing.JLabel();
        campoTipoVehi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        campoDevuelta = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnImprimir = new javax.swing.JButton();
        EtqTelefono3 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        campoPlaca = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        EtqTelefono4 = new javax.swing.JLabel();
        campoTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        EtqNombre.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 18)); // NOI18N
        EtqNombre.setForeground(new java.awt.Color(0, 0, 0));
        EtqNombre.setText("Fecha llegada:");

        EtqTelefono5.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 18)); // NOI18N
        EtqTelefono5.setForeground(new java.awt.Color(0, 0, 0));
        EtqTelefono5.setText("Devuelta:");

        campoFechaLlegada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        campoPagar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPagarActionPerformed(evt);
            }
        });
        campoPagar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoPagarKeyReleased(evt);
            }
        });

        EtqCedula.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 18)); // NOI18N
        EtqCedula.setForeground(new java.awt.Color(0, 0, 0));
        EtqCedula.setText("Fecha Salida:");

        etqEncontrado.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        etqEncontrado.setForeground(new java.awt.Color(0, 0, 0));
        etqEncontrado.setText("Vehiculo Encontrado:");

        EtqTelefono1.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 18)); // NOI18N
        EtqTelefono1.setForeground(new java.awt.Color(0, 0, 0));
        EtqTelefono1.setText("Placa:");

        campoPlacaBuscar.setBackground(new java.awt.Color(255, 255, 102));
        campoPlacaBuscar.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        campoPlacaBuscar.setForeground(new java.awt.Color(0, 0, 0));
        campoPlacaBuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        campoFechaSalida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        campoTipoPago.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnBuscar.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        EtqTelefono.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 18)); // NOI18N
        EtqTelefono.setForeground(new java.awt.Color(0, 0, 0));
        EtqTelefono.setText("Tipo Vehiculo:");

        EtqTelefono2.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 18)); // NOI18N
        EtqTelefono2.setForeground(new java.awt.Color(0, 0, 0));
        EtqTelefono2.setText("Tipo Pago:");

        campoTipoVehi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Placa:");

        campoDevuelta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        btnImprimir.setBackground(new java.awt.Color(255, 255, 102));
        btnImprimir.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 18)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(0, 0, 0));
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon_imprimir.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        EtqTelefono3.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 18)); // NOI18N
        EtqTelefono3.setForeground(new java.awt.Color(0, 0, 0));
        EtqTelefono3.setText("Total:");

        btnAtras.setBackground(new java.awt.Color(255, 51, 51));
        btnAtras.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 18)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(0, 0, 0));
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon_atras.png"))); // NOI18N
        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        campoPlaca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        jLabel1.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono_salida.png"))); // NOI18N
        jLabel1.setText("SALIDA");

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

        EtqTelefono4.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 18)); // NOI18N
        EtqTelefono4.setForeground(new java.awt.Color(0, 0, 0));
        EtqTelefono4.setText("Pagar:");

        campoTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(campoPlacaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqEncontrado)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(323, 323, 323)
                                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnImprimir))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(EtqNombre)
                                        .addGap(9, 9, 9)
                                        .addComponent(campoFechaLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(EtqCedula)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(campoFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(EtqTelefono3)
                                                    .addComponent(EtqTelefono1)
                                                    .addComponent(EtqTelefono5))
                                                .addGap(38, 38, 38)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(campoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(campoDevuelta, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(campoTotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(EtqTelefono)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(campoTipoVehi, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(EtqTelefono2)
                                            .addGap(40, 40, 40))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(EtqTelefono4)
                                            .addGap(71, 71, 71)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(campoPagar)
                                        .addComponent(campoTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(476, 476, 476))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoPlacaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqEncontrado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtqNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoFechaLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtqCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTipoVehi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtqTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtqTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtqTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtqTelefono3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtqTelefono4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtqTelefono5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoDevuelta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImprimir)
                    .addComponent(btnAtras))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPagarActionPerformed

    private void campoPagarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPagarKeyReleased
        //Calculo de cuanto va a pagar y devuelta
        String pago = campoPagar.getText();
        String total = campoTotal.getText();

        if(Integer.parseInt(pago)<Integer.parseInt(total)){
            System.out.println("ERROR, PAGO INSUFICENTE");
        }else{
            System.out.println("PAGO EXITOSO");
        }

        int devuelta = Integer.parseInt(pago)-Integer.parseInt(total);
        campoDevuelta.setText(String.valueOf(devuelta));
    }//GEN-LAST:event_campoPagarKeyReleased

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String placa = campoPlacaBuscar.getText();
        Vehiculos temporal = ( this.ventanaMenu.database.buscarVehiculo(placa));

        if (temporal != null) {
            etqEncontrado.setText("Vehiculo encontrado:");
            deshabilitarCampo(campoTipoPago);
            deshabilitarCampo(campoTipoVehi);
            deshabilitarCampo(campoPlaca);
            deshabilitarCampo(campoTotal);
            deshabilitarCampo(campoFechaLlegada);
            deshabilitarCampo(campoFechaSalida);
            deshabilitarCampo(campoDevuelta);
            
            campoTipoPago.setText(temporal.getTipo_pago());
            campoTipoVehi.setText(temporal.getTipo_vehiculo());
            campoPlaca.setText(temporal.getPlaca());
            campoFechaLlegada.setText(temporal.getFecha());
            campoFechaSalida.setText(String.valueOf(fecha_salida));
            campoPagar.requestFocus();
            
            String tipo_pago = campoTipoPago.getText();
            String tipo_vehi = campoTipoVehi.getText();
            String fecha_llegada = campoFechaLlegada.getText();
        
            //Calcular pago dependiendo de los tipos
            if(tipo_pago.equals("Dia") && tipo_vehi.equals("Moto")){
                campoTotal.setText("3000");
            } else if(tipo_pago.equals("Dia") && tipo_vehi.equals("Carro")){
                campoTotal.setText("5000");
            }else if(tipo_pago.equals("Hora") && tipo_vehi.equals("Carro")){
                try {
                    SimpleDateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
                    Date fechaLlegada = formatter.parse(fecha_llegada);
                    long diferenciaEnMinutos = (new Date().getTime() - fechaLlegada.getTime()) / (1000 * 60);
                    if(diferenciaEnMinutos<60){
                        campoTotal.setText("1000");
                    }else{
                        long calculo_horas = diferenciaEnMinutos/60;
                        long total = calculo_horas*2000;
                        campoTotal.setText(String.valueOf(total));
                    }  
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }else if (tipo_pago.equals("Hora") && tipo_vehi.equals("Moto")){
                try {
                    SimpleDateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
                    Date fechaLlegada = formatter.parse(fecha_llegada);
                    long diferenciaEnMinutos = (new Date().getTime() - fechaLlegada.getTime()) / (1000 * 60);
                    if(diferenciaEnMinutos<60){
                        campoTotal.setText("500");
                    }else{
                       long calculo_horas = diferenciaEnMinutos/60;
                        long total = calculo_horas*1000; 
                        campoTotal.setText(String.valueOf(total));
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        
            
        }else{
            System.out.println("NO SE ENCONTRO LA PLACA");
            etqEncontrado.setText("Vehiculo NO encontrado:");
            campoTipoPago.setText("");
            campoTipoVehi.setText("");
            campoPlaca.setText("");
            campoFechaLlegada.setText("");
            campoFechaSalida.setText("");
            deshabilitarCampo(campoTipoPago);
            deshabilitarCampo(campoTipoVehi);
            deshabilitarCampo(campoPlaca);
            deshabilitarCampo(campoFechaLlegada);
            deshabilitarCampo(campoFechaSalida);
            campoPlacaBuscar.requestFocus();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        String tipo_pago = campoTipoPago.getText();
        String tipo_vehi = campoTipoVehi.getText();
        String placa = campoPlaca.getText();
        String fecha_llegada = campoFechaLlegada.getText();
        String fecha_salida = campoFechaSalida.getText();
        String total = campoTotal.getText();
        String pagar = campoPagar.getText();
        String devuelta = campoDevuelta.getText();

        // Generar código de barras para la placa del vehículo
        JBarcodeBean barcodeBean = new JBarcodeBean();
        barcodeBean.setCodeType(new Code128());
        barcodeBean.setCode(placa);
        
        // Crear el archivo PDF de la factura
        Document document = new Document();
        try {
            // Especifica la ruta y el nombre del archivo PDF
            String fileName = "Facturas/factura" + i + ".pdf";
            PdfWriter.getInstance(document, new FileOutputStream(fileName));
            i++;
            
            document.open();

            // Agrega los detalles de la factura al documento PDF
            document.add(new Paragraph("ExoticParking"));
            document.add(new Paragraph("Factura del Vehículo"));
            document.add(new Paragraph("NIT 10023424335"));
            document.add(new Paragraph("Juan David Monsalve"));
            document.add(new Paragraph("-----------------------------------"));
            document.add(new Paragraph("Tipo de pago: " + tipo_pago));
            document.add(new Paragraph("Tipo de vehículo: " + tipo_vehi));
            document.add(new Paragraph("Placa: " + placa));
            document.add(new Paragraph("Fecha de llegada: " + fecha_llegada));
            document.add(new Paragraph("Fecha de salida: " + fecha_salida));
            document.add(new Paragraph("Total a pagar: " + total));
            document.add(new Paragraph("Monto pagado: " + pagar));
            document.add(new Paragraph("Devuelta: " + devuelta));

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
            Logger.getLogger(ListarDetallesVehiculo.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed
         
    public void camposDeshabilitados(){
        deshabilitarCampo(campoFechaLlegada);
        deshabilitarCampo(campoFechaSalida);
        deshabilitarCampo(campoTipoVehi);
        deshabilitarCampo(campoPlaca);
        campoPagar.requestFocus();
        deshabilitarCampo(campoTipoPago);
        deshabilitarCampo(campoTotal);
        deshabilitarCampo(campoDevuelta);
    }
    
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

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EtqCedula;
    private javax.swing.JLabel EtqNombre;
    private javax.swing.JLabel EtqTelefono;
    private javax.swing.JLabel EtqTelefono1;
    private javax.swing.JLabel EtqTelefono2;
    private javax.swing.JLabel EtqTelefono3;
    private javax.swing.JLabel EtqTelefono4;
    private javax.swing.JLabel EtqTelefono5;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JTextField campoDevuelta;
    private javax.swing.JTextField campoFechaLlegada;
    private javax.swing.JTextField campoFechaSalida;
    private javax.swing.JTextField campoPagar;
    private javax.swing.JTextField campoPlaca;
    private javax.swing.JTextField campoPlacaBuscar;
    private javax.swing.JTextField campoTipoPago;
    private javax.swing.JTextField campoTipoVehi;
    private javax.swing.JTextField campoTotal;
    private javax.swing.JLabel etqEncontrado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
