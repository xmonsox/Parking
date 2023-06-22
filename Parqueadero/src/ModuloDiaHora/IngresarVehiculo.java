
package ModuloDiaHora;

import Clases.Espacios;
import Clases.Vehiculos;
import Principal.Menu;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JTextField;

public class IngresarVehiculo extends javax.swing.JFrame {
    
    Menu ventanaMenu;
    Date fecha = new Date();
    Espacios  espacios_motos [] ;
    Espacios  espacios_carros [] ;
    
    
    public IngresarVehiculo(Menu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        this.espacios_motos = new Espacios [10];
        this.espacios_carros = new Espacios [10];
        initComponents();
        actualizarEstadoEspacios();
        
        campoIngreso.setText(String.valueOf(fecha) );
        deshabilitarCampo(campoIngreso);
        etqEstado.setText("Disponible");
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
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
        etqPlaca1 = new javax.swing.JLabel();
        etqEspacio = new javax.swing.JLabel();
        etqPlaca2 = new javax.swing.JLabel();
        etqEstado = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        m1 = new javax.swing.JButton();
        m2 = new javax.swing.JButton();
        m3 = new javax.swing.JButton();
        m4 = new javax.swing.JButton();
        m5 = new javax.swing.JButton();
        m6 = new javax.swing.JButton();
        m7 = new javax.swing.JButton();
        m8 = new javax.swing.JButton();
        c4 = new javax.swing.JButton();
        m10 = new javax.swing.JButton();
        c2 = new javax.swing.JButton();
        c3 = new javax.swing.JButton();
        m9 = new javax.swing.JButton();
        c5 = new javax.swing.JButton();
        c7 = new javax.swing.JButton();
        c6 = new javax.swing.JButton();
        c8 = new javax.swing.JButton();
        c9 = new javax.swing.JButton();
        c10 = new javax.swing.JButton();
        c1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jButton5.setBackground(new java.awt.Color(0, 204, 51));
        jButton5.setText("M4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        jLabel1.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingreso Parqueadero");

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

        etqPlaca1.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 24)); // NOI18N
        etqPlaca1.setForeground(new java.awt.Color(0, 0, 0));
        etqPlaca1.setText("Espacio:");

        etqEspacio.setBackground(new java.awt.Color(255, 255, 255));
        etqEspacio.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        etqEspacio.setForeground(new java.awt.Color(0, 0, 0));

        etqPlaca2.setFont(new java.awt.Font("Source Sans Pro SemiBold", 3, 24)); // NOI18N
        etqPlaca2.setForeground(new java.awt.Color(0, 0, 0));
        etqPlaca2.setText("Estado:");

        etqEstado.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        etqEstado.setForeground(new java.awt.Color(0, 0, 0));

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
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(etqTipoPago)
                                .addComponent(etqTipoVehiculo)
                                .addComponent(etqPlaca)
                                .addComponent(etqPlaca1)
                                .addComponent(etqPlaca2)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56))
                            .addComponent(campoPlaca)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(boxTipoVehi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etqEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(etqEspacio, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
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
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqTipoPago)
                    .addComponent(boxTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqPlaca)
                    .addComponent(campoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqPlaca1)
                    .addComponent(etqEspacio, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqPlaca2)
                    .addComponent(etqEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        m1.setBackground(new java.awt.Color(0, 204, 51));
        m1.setText("M1");
        m1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcarEspacio(evt);
            }
        });

        m2.setBackground(new java.awt.Color(0, 204, 51));
        m2.setText("M2");
        m2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcarEspacio(evt);
            }
        });

        m3.setBackground(new java.awt.Color(0, 204, 51));
        m3.setText("M3");
        m3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcarEspacio(evt);
            }
        });

        m4.setBackground(new java.awt.Color(0, 204, 51));
        m4.setText("M4");
        m4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcarEspacio(evt);
            }
        });

        m5.setBackground(new java.awt.Color(0, 204, 51));
        m5.setText("M5");
        m5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcarEspacio(evt);
            }
        });

        m6.setBackground(new java.awt.Color(0, 204, 51));
        m6.setText("M6");
        m6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcarEspacio(evt);
            }
        });

        m7.setBackground(new java.awt.Color(0, 204, 51));
        m7.setText("M7");
        m7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcarEspacio(evt);
            }
        });

        m8.setBackground(new java.awt.Color(0, 204, 51));
        m8.setText("M8");
        m8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcarEspacio(evt);
            }
        });

        c4.setBackground(new java.awt.Color(0, 204, 51));
        c4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        c4.setText("C4");
        c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcarEspacio(evt);
            }
        });

        m10.setBackground(new java.awt.Color(0, 204, 51));
        m10.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        m10.setText("M10");
        m10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcarEspacio(evt);
            }
        });

        c2.setBackground(new java.awt.Color(0, 204, 51));
        c2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        c2.setText("C2");
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcarEspacio(evt);
            }
        });

        c3.setBackground(new java.awt.Color(0, 204, 51));
        c3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        c3.setText("C3");
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcarEspacio(evt);
            }
        });

        m9.setBackground(new java.awt.Color(0, 204, 51));
        m9.setText("M9");
        m9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcarEspacio(evt);
            }
        });

        c5.setBackground(new java.awt.Color(0, 204, 51));
        c5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        c5.setText("C5");
        c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcarEspacio(evt);
            }
        });

        c7.setBackground(new java.awt.Color(0, 204, 51));
        c7.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        c7.setText("C7");
        c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcarEspacio(evt);
            }
        });

        c6.setBackground(new java.awt.Color(0, 204, 51));
        c6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        c6.setText("C6");
        c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcarEspacio(evt);
            }
        });

        c8.setBackground(new java.awt.Color(0, 204, 51));
        c8.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        c8.setText("C8");
        c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcarEspacio(evt);
            }
        });

        c9.setBackground(new java.awt.Color(0, 204, 51));
        c9.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        c9.setText("C9");
        c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcarEspacio(evt);
            }
        });

        c10.setBackground(new java.awt.Color(0, 204, 51));
        c10.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        c10.setText("C10");
        c10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcarEspacio(evt);
            }
        });

        c1.setBackground(new java.awt.Color(0, 204, 51));
        c1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        c1.setText("C1");
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcarEspacio(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("OCUPADO");

        jPanel5.setBackground(new java.awt.Color(0, 255, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("DISPONIBLE");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ESPACIOS");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("MOTOS");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("CARROS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(m6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(m7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(m8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(m9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(m10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(c9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(c10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)))))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(m3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(m4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(m5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(46, 46, 46))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed
    
    public void actualizarEstadoEspacios(){
        this.espacios_motos[0] = this.ventanaMenu.database.getEspacio("M1");
        this.espacios_motos[1] = this.ventanaMenu.database.getEspacio("M2");
        this.espacios_motos[2] = this.ventanaMenu.database.getEspacio("M3");
        this.espacios_motos[3] = this.ventanaMenu.database.getEspacio("M4");
        this.espacios_motos[4] = this.ventanaMenu.database.getEspacio("M5");
        this.espacios_motos[5] = this.ventanaMenu.database.getEspacio("M6");
        this.espacios_motos[6] = this.ventanaMenu.database.getEspacio("M7");
        this.espacios_motos[7] = this.ventanaMenu.database.getEspacio("M8");
        this.espacios_motos[8] = this.ventanaMenu.database.getEspacio("M9");
        this.espacios_motos[9] = this.ventanaMenu.database.getEspacio("M10");
        
        this.renderizarEstadoEspacio( this.m1, this.espacios_motos[0] );
        this.renderizarEstadoEspacio( this.m2, this.espacios_motos[1] );
        this.renderizarEstadoEspacio( this.m3, this.espacios_motos[2] );
        this.renderizarEstadoEspacio( this.m4, this.espacios_motos[3] );
        this.renderizarEstadoEspacio( this.m5, this.espacios_motos[4] );
        this.renderizarEstadoEspacio( this.m6, this.espacios_motos[5] );
        this.renderizarEstadoEspacio( this.m7, this.espacios_motos[6] );
        this.renderizarEstadoEspacio( this.m8, this.espacios_motos[7] );
        this.renderizarEstadoEspacio( this.m9, this.espacios_motos[8] );
        this.renderizarEstadoEspacio( this.m10, this.espacios_motos[9] );
        
        this.espacios_carros[0] = this.ventanaMenu.database.getEspacio("C1");
        this.espacios_carros[1] = this.ventanaMenu.database.getEspacio("C2");
        this.espacios_carros[2] = this.ventanaMenu.database.getEspacio("C3");
        this.espacios_carros[3] = this.ventanaMenu.database.getEspacio("C4");
        this.espacios_carros[4] = this.ventanaMenu.database.getEspacio("C5");
        this.espacios_carros[5] = this.ventanaMenu.database.getEspacio("C6");
        this.espacios_carros[6] = this.ventanaMenu.database.getEspacio("C7");
        this.espacios_carros[7] = this.ventanaMenu.database.getEspacio("C8");
        this.espacios_carros[8] = this.ventanaMenu.database.getEspacio("C9");
        this.espacios_carros[9] = this.ventanaMenu.database.getEspacio("C10");
        
        this.renderizarEstadoEspacio( this.c1, this.espacios_carros[0] );
        this.renderizarEstadoEspacio( this.c2, this.espacios_carros[1] );
        this.renderizarEstadoEspacio( this.c3, this.espacios_carros[2] );
        this.renderizarEstadoEspacio( this.c4, this.espacios_carros[3] );
        this.renderizarEstadoEspacio( this.c5, this.espacios_carros[4] );
        this.renderizarEstadoEspacio( this.c6, this.espacios_carros[5] );
        this.renderizarEstadoEspacio( this.c7, this.espacios_carros[6] );
        this.renderizarEstadoEspacio( this.c8, this.espacios_carros[7] );
        this.renderizarEstadoEspacio( this.c9, this.espacios_carros[8] );
        this.renderizarEstadoEspacio( this.c10, this.espacios_carros[9] );
        
        
    }
    
    public void renderizarEstadoEspacio(JButton boton, Espacios espacio){
        boton.setBackground(  (espacio.getEstado().equalsIgnoreCase("disponible"))?  Color.green : Color.red  );
        
        boton.setEnabled( espacio.getEstado().equalsIgnoreCase("disponible") );
    }

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String fecha = campoIngreso.getText();
        String tipo_vehiculo = boxTipoVehi.getSelectedItem().toString();
        String tipo_pago = boxTipoPago.getSelectedItem().toString();
        String placa = campoPlaca.getText();
        String espacio = etqEspacio.getText();
        String estado = etqEstado.getText();
        
        
        if (!fecha.equals("") && !tipo_vehiculo.equals("")  && !tipo_pago.equals("") && !placa.equals("")) {
            boolean repetido = false;
            if (!repetido) {
                Vehiculos temporal = new Vehiculos(placa,tipo_vehiculo,tipo_pago,fecha,espacio, estado );
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

    private void marcarEspacio(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcarEspacio
        JButton boton = (JButton) evt.getSource();
        etqEspacio.setText(String.valueOf(boton.getText()));
        etqEstado.setText("Ocupado");

    }//GEN-LAST:event_marcarEspacio
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxTipoPago;
    private javax.swing.JComboBox<String> boxTipoVehi;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton c1;
    private javax.swing.JButton c10;
    private javax.swing.JButton c2;
    private javax.swing.JButton c3;
    private javax.swing.JButton c4;
    private javax.swing.JButton c5;
    private javax.swing.JButton c6;
    private javax.swing.JButton c7;
    private javax.swing.JButton c8;
    private javax.swing.JButton c9;
    private javax.swing.JTextField campoIngreso;
    private javax.swing.JTextField campoPlaca;
    private javax.swing.JLabel etqEspacio;
    private javax.swing.JLabel etqEstado;
    private javax.swing.JLabel etqPlaca;
    private javax.swing.JLabel etqPlaca1;
    private javax.swing.JLabel etqPlaca2;
    private javax.swing.JLabel etqTipoPago;
    private javax.swing.JLabel etqTipoVehiculo;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton m1;
    private javax.swing.JButton m10;
    private javax.swing.JButton m2;
    private javax.swing.JButton m3;
    private javax.swing.JButton m4;
    private javax.swing.JButton m5;
    private javax.swing.JButton m6;
    private javax.swing.JButton m7;
    private javax.swing.JButton m8;
    private javax.swing.JButton m9;
    // End of variables declaration//GEN-END:variables
}
