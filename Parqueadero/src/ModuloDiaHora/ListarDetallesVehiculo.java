
package ModuloDiaHora;

import Clases.FacturaVehiculo;
import Clases.Vehiculos;
import Principal.Menu;
import java.awt.Color;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Locale;
import javax.swing.JTextField;


public class ListarDetallesVehiculo extends javax.swing.JFrame {
    
    FacturaVehiculo arreglo_vehiculos [];
    Date fecha_salida = new Date();
    Menu ventanaMenu;

    public ListarDetallesVehiculo(Menu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        initComponents();
        campoPlacaBuscar.requestFocus();
        
    }
    
    /*public void imprimirFactura(){
        campoFechaLlegada.setText(this.fecha);
        
        campoTipoVehi.setText(this.tipo_vehiculo);
        campoPlaca.setText(this.placa);
        campoTipoPago.setText(this.tipo_pago);
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
        
    }*/
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campoFechaSalida = new javax.swing.JTextField();
        EtqTelefono = new javax.swing.JLabel();
        campoTipoVehi = new javax.swing.JTextField();
        btnImprimir = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        EtqNombre = new javax.swing.JLabel();
        campoFechaLlegada = new javax.swing.JTextField();
        EtqCedula = new javax.swing.JLabel();
        EtqTelefono1 = new javax.swing.JLabel();
        campoTipoPago = new javax.swing.JTextField();
        EtqTelefono2 = new javax.swing.JLabel();
        campoDevuelta = new javax.swing.JTextField();
        EtqTelefono3 = new javax.swing.JLabel();
        campoPlaca = new javax.swing.JTextField();
        EtqTelefono4 = new javax.swing.JLabel();
        campoTotal = new javax.swing.JTextField();
        EtqTelefono5 = new javax.swing.JLabel();
        campoPagar = new javax.swing.JTextField();
        etqEncontrado = new javax.swing.JLabel();
        campoPlacaBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        EtqTelefono.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 18)); // NOI18N
        EtqTelefono.setForeground(new java.awt.Color(0, 0, 0));
        EtqTelefono.setText("Tipo Vehiculo:");

        btnImprimir.setBackground(new java.awt.Color(255, 255, 102));
        btnImprimir.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 14)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(0, 0, 0));
        btnImprimir.setText("Imprimir");

        btnAtras.setBackground(new java.awt.Color(255, 51, 51));
        btnAtras.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 14)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(0, 0, 0));
        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        jLabel1.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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

        EtqNombre.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 18)); // NOI18N
        EtqNombre.setForeground(new java.awt.Color(0, 0, 0));
        EtqNombre.setText("Fecha llegada:");

        EtqCedula.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 18)); // NOI18N
        EtqCedula.setForeground(new java.awt.Color(0, 0, 0));
        EtqCedula.setText("Fecha Salida:");

        EtqTelefono1.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 18)); // NOI18N
        EtqTelefono1.setForeground(new java.awt.Color(0, 0, 0));
        EtqTelefono1.setText("Placa:");

        EtqTelefono2.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 18)); // NOI18N
        EtqTelefono2.setForeground(new java.awt.Color(0, 0, 0));
        EtqTelefono2.setText("Tipo Pago:");

        EtqTelefono3.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 18)); // NOI18N
        EtqTelefono3.setForeground(new java.awt.Color(0, 0, 0));
        EtqTelefono3.setText("Total:");

        EtqTelefono4.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 18)); // NOI18N
        EtqTelefono4.setForeground(new java.awt.Color(0, 0, 0));
        EtqTelefono4.setText("Pagar:");

        EtqTelefono5.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 18)); // NOI18N
        EtqTelefono5.setForeground(new java.awt.Color(0, 0, 0));
        EtqTelefono5.setText("Devuelta:");

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

        etqEncontrado.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        etqEncontrado.setForeground(new java.awt.Color(0, 0, 0));
        etqEncontrado.setText("Vehiculo Encontrado:");

        campoPlacaBuscar.setBackground(new java.awt.Color(255, 255, 102));
        campoPlacaBuscar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        campoPlacaBuscar.setForeground(new java.awt.Color(0, 0, 0));

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Placa:");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 212, Short.MAX_VALUE)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EtqNombre)
                                    .addComponent(EtqCedula)
                                    .addComponent(EtqTelefono)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(EtqTelefono1)
                                            .addComponent(EtqTelefono3))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(EtqTelefono2)
                                .addGap(29, 29, 29)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoFechaSalida)
                            .addComponent(campoFechaLlegada)
                            .addComponent(campoTipoVehi)
                            .addComponent(campoTipoPago, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoPlaca, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoTotal, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EtqTelefono5)
                            .addComponent(EtqTelefono4))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoPagar)
                            .addComponent(campoDevuelta))))
                .addContainerGap())
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel9)
                .addGap(42, 42, 42)
                .addComponent(campoPlacaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnBuscar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqEncontrado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(campoPlacaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etqEncontrado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtqNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoFechaLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtqCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTipoVehi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtqTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtqTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtqTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtqTelefono3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtqTelefono4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtqTelefono5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoDevuelta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
