package view;

import logic.PC;
import java.awt.Color;
import javax.swing.ImageIcon;

public class PCWindow extends javax.swing.JFrame {

    //variables
    PC pc;
    LaboratoryWindow ventanaLaboratorio;
    CentralWindow vPrincipal;

    //constructor
    public PCWindow(PC p, LaboratoryWindow vl, CentralWindow vp) {
        pc = p;
        ventanaLaboratorio = vl;
        vPrincipal = vp;
        initComponents();
        if (pc.isTurnedOn()) {
            estado.setText("Turned on");
            estado.setForeground(new Color(0, 204, 0));
            jPanel1.setBackground(new Color(172, 246, 183));
        } else {
            estado.setText("Turned off");
            estado.setForeground(Color.red);
            jPanel1.setBackground(new Color(242, 95, 76));
        }
        consumo.setText(pc.calculateConsumption(pc.getVoltage(), pc.getCurrent(), pc.getTime()) + "W/h");
        titulo.setText("PC " + pc.getId());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        estado = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        consumo = new javax.swing.JLabel();
        botonVolver = new javax.swing.JButton();
        apagaEncender = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(172, 246, 183));

        titulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(51, 51, 51));
        titulo.setText("PC 1");

        estado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        estado.setForeground(new java.awt.Color(0, 204, 0));
        estado.setText("Turned on");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Consumption:");

        consumo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        consumo.setText("10 W");

        botonVolver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonVolver.setText("BACK");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        apagaEncender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/switch_turned.png"))); // NOI18N
        apagaEncender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagaEncenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(estado)
                .addGap(133, 133, 133))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(consumo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(titulo)))
                .addContainerGap(104, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(apagaEncender, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                    .addComponent(botonVolver)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(titulo)
                .addGap(4, 4, 4)
                .addComponent(estado)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consumo)
                    .addComponent(jLabel3))
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(123, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(apagaEncender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(botonVolver)
                            .addGap(4, 4, 4)))
                    .addContainerGap()))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void apagaEncenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagaEncenderActionPerformed
        try {
            pc.turnOff();
            estado.setText("Turned off");
            estado.setForeground(Color.red);
            jPanel1.setBackground(new Color(246, 172, 172));
            consumo.setText(pc.calculateConsumption(pc.getVoltage(), pc.getCurrent(), pc.getTime()) + "W/h");
            ventanaLaboratorio.getLabelTotalConsumption().setText("TOTAL CONSUMPTION: " + ventanaLaboratorio.getLaboratory().totalConsumptionLab() + "W/h");
            vPrincipal.consumoTotalInstitucion.setText("TOTAL CONSUMPTION: " + vPrincipal.central.totalConsumptionCentral(vPrincipal.central.getLaboratoriesList()) + "W/h");
            ventanaLaboratorio.buttons[pc.getId() - 1].setIcon(new ImageIcon("src/images/turned_off.png"));

        } catch (Exception e) {
            pc.setTurnedOn(true);
            pc.setTime(2);
            estado.setText("Turned on");
            estado.setForeground(new Color(0, 204, 0));
            jPanel1.setBackground(new Color(172, 246, 183));
            consumo.setText(pc.calculateConsumption(pc.getVoltage(), pc.getCurrent(), pc.getTime()) + "W/h");
            ventanaLaboratorio.buttons[pc.getId() - 1].setIcon(new ImageIcon("src/images/turned_on.png"));
            try {
                ventanaLaboratorio.getLabelTotalConsumption().setText("TOTAL CONSUMPTION: " + ventanaLaboratorio.getLaboratory().totalConsumptionLab() + "W/h");
                vPrincipal.consumoTotalInstitucion.setText("TOTAL CONSUMPTION: " + vPrincipal.central.totalConsumptionCentral(vPrincipal.central.getLaboratoriesList()) + "W/h");
            } catch (Exception f) {
            }
        }
    }//GEN-LAST:event_apagaEncenderActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apagaEncender;
    private javax.swing.JButton botonVolver;
    private javax.swing.JLabel consumo;
    private javax.swing.JLabel estado;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
