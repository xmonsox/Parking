package ModuloMembresia;

import Clases.Database;
import Clases.FacturaVehiculo;
import Clases.Membresias;
import Clases.Vehiculos;
import ModuloDiaHora.ListarDetallesVehiculo;
import Principal.Menu;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

public class ListaGeneral extends javax.swing.JFrame {
    
    Menu ventanaMenu;
    private JLabel etqTemporal;
    private JButton btnDetalles [];
    
    public ListaGeneral(Menu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        initComponents();
        initAlternComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        contenMembresias = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consulta Membresias");

        btnAtras.setBackground(new java.awt.Color(0, 0, 0));
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        contenMembresias.setBackground(new java.awt.Color(255, 255, 255));
        contenMembresias.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout contenMembresiasLayout = new javax.swing.GroupLayout(contenMembresias);
        contenMembresias.setLayout(contenMembresiasLayout);
        contenMembresiasLayout.setHorizontalGroup(
            contenMembresiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1121, Short.MAX_VALUE)
        );
        contenMembresiasLayout.setVerticalGroup(
            contenMembresiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(contenMembresias);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAtras, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
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

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        contenMembresias.setLayout( new BoxLayout(contenMembresias, BoxLayout.Y_AXIS) );
        contenMembresias.setBackground(Color.WHITE);
        imprimirMembresias();
    }
    
    public void imprimirMembresias(){
       
        Membresias listaMembresias [] = ( this.ventanaMenu.database.listaMembresias()); 
        btnDetalles = new JButton [listaMembresias.length];
        
        if (listaMembresias!=null) {
            for(int i = 0; i < listaMembresias.length; i++) {
                Membresias membresia = listaMembresias[i];
                
                if(membresia != null) {
                    etqTemporal = new JLabel("Propietario: " + membresia.getPropietario() + " - Telefono: " + membresia.getTelefono() + " - Tipo Membresia: " + membresia.getTipo_membresia() + "- Tipo Vehiculo: " + membresia.getTipo_vehiculo() + " - Placa: "+ membresia.getPlaca()+ " - Fecha Inicio: "+membresia.getFecha_inicio()+" - Fecha Vencimiento: "+membresia.getFecha_vencimiento()+" - Total: "+membresia.getTotal());
                    etqTemporal.setFont(new Font("Arial", Font.PLAIN, 14));
                    etqTemporal.setBorder(new EmptyBorder(2, 10, 2, 10));
                    contenMembresias.add(etqTemporal);
                } else {
                    break;
                }
            }

            revalidate();
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JPanel contenMembresias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
