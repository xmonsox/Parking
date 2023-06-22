
package ModuloDiaHora;

import Clases.Database;
import Clases.FacturaVehiculo;
import Clases.Membresias;
import Clases.Vehiculos;
import Principal.Menu;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

public class ConsultarVehiculo extends javax.swing.JFrame {
    
    private Menu ventanaMenu;
    private JLabel etqTemporal;
    private JButton btnDetalles [];
    
    public ConsultarVehiculo(Menu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        initComponents();
        initAlternComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contenVehiculos = new javax.swing.JTextArea();
        btnAtras = new javax.swing.JButton();
        btnBuscarPorPlaca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consultar Vehiculo");

        contenVehiculos.setEditable(false);
        contenVehiculos.setColumns(20);
        contenVehiculos.setRows(5);
        jScrollPane1.setViewportView(contenVehiculos);

        btnAtras.setBackground(new java.awt.Color(0, 0, 0));
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnBuscarPorPlaca.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscarPorPlaca.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnBuscarPorPlaca.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarPorPlaca.setText("BUSCAR POR PLACA");
        btnBuscarPorPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPorPlacaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBuscarPorPlaca)
                                .addGap(306, 306, 306))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnBuscarPorPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnBuscarPorPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPorPlacaActionPerformed
        ConsultarVehiculoEspecifico ventana = new ConsultarVehiculoEspecifico(this.ventanaMenu);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnBuscarPorPlacaActionPerformed
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        contenVehiculos.setLayout( new BoxLayout(contenVehiculos, BoxLayout.Y_AXIS) );
        contenVehiculos.setBackground(Color.WHITE);
        imprimirVehiculos();
    }
    
    public void imprimirVehiculos(){
       
        Vehiculos listaVehiculos [] = ( this.ventanaMenu.database.listaVehiculos()); 
        //btnDetalles = new JButton [listaVehiculos.length];
        
        if (listaVehiculos!=null) {
            for(int i = 0; i < listaVehiculos.length; i++) {
                Vehiculos vehiculo = listaVehiculos[i];
                
                if(vehiculo != null) {
                    etqTemporal = new JLabel("Placa: " + vehiculo.getPlaca() + " - Tipo Vehiculo: " + vehiculo.getTipo_vehiculo() + " - Tipo Pago: " + vehiculo.getTipo_pago() + "- Fecha: " + vehiculo.getFecha() + " - ");
                    //btnDetalles[i] = new JButton("Salida");

                    /*ActionListener evento_01 = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            Database instancia = new Database();
                            FacturaVehiculo arreglo_vehiculos [] = instancia.buscarVehiculoFactura(String.valueOf(vehiculo.getPlaca()));
                            ListarDetallesVehiculo ventana = new ListarDetallesVehiculo(vehiculo.getPlaca(), vehiculo.getTipo_vehiculo(), vehiculo.getTipo_pago(), vehiculo.getFecha(), arreglo_vehiculos);
                            
                            ventana.setVisible(true);
                        }
                    };*/
                    //btnDetalles[i].addActionListener(evento_01);

                    etqTemporal.setFont(new Font("Arial", Font.PLAIN, 12));
                    etqTemporal.setBorder(new EmptyBorder(2, 10, 2, 10));
                    contenVehiculos.add(etqTemporal);
                    //contenVehiculos.add(btnDetalles[i]);
                } else {
                    break;
                }
            }

            revalidate();
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscarPorPlaca;
    private javax.swing.JTextArea contenVehiculos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
