package view;

import logic.Laboratory;
import logic.PC;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JLabel;

public class LaboratoryWindow extends javax.swing.JFrame {

    //variables
    Color green;
    Laboratory laboratory;
    boolean[] added;
    JButton[] buttons;
    CentralWindow centralWindow;

    //constructor
    public LaboratoryWindow(Laboratory lab, CentralWindow vp) {
        added = new boolean[16];
        buttons = new JButton[16];
        green = new Color(178, 248, 160);
        laboratory = lab;
        centralWindow = vp;
        initComponents();
        loadPCs();
        titulo.setText("Laboratory " + laboratory.getId());
        try {
            labelTotalConsumptionLaboratory.setText("TOTAL CONSUMPTION: " + laboratory.totalConsumptionLab() + "W/h");
        } catch (Exception e) {
            labelTotalConsumptionLaboratory.setText("TOTAL CONSUMPTION: 0W/h");
        }
    }

    //methods
    public JLabel getLabelTotalConsumption() {
        return labelTotalConsumptionLaboratory;
    }

    public Laboratory getLaboratory() {
        return laboratory;
    }

    void addPC(int i) {
        PC pc = new PC(laboratory.PCList.size() + 1);
        try {
            laboratory.add(pc, i);
            labelTotalConsumptionLaboratory.setText("TOTAL CONSUMPTION: " + laboratory.totalConsumptionLab() + "W/h");
            centralWindow.consumoTotalInstitucion.setText("TOTAL CONSUMPTION: " + centralWindow.central.totalConsumptionCentral(centralWindow.central.getLaboratoriesList()) + "W/h");
        } catch (Exception e) {

        }
        if (laboratory.has(pc)) {
            added[i] = true;
            buttons[i].setText("PC" + pc.getId());
            buttons[i].setFont(new Font("Arial", Font.BOLD, 9));
            buttons[i].setIcon(new ImageIcon("src/images/turned_on.png"));
            if (i < 15) {
                changeColor(buttons[i + 1], green);
            }
            changeColor(buttons[i], Color.white);
        }

    }

    public void loadPCs() {
        buttons[0] = pc1;
        buttons[1] = pc2;
        buttons[2] = pc3;
        buttons[3] = pc4;
        buttons[4] = pc5;
        buttons[5] = pc6;
        buttons[6] = pc7;
        buttons[7] = pc8;
        buttons[8] = pc9;
        buttons[9] = pc10;
        buttons[10] = pc11;
        buttons[11] = pc12;
        buttons[12] = pc13;
        buttons[13] = pc14;
        buttons[14] = pc15;
        buttons[15] = pc16;

        int i;
        for (i = 0; i < laboratory.PCList.size(); i++) {
            added[i] = true;
            buttons[i].setText("PC" + (i + 1));
            buttons[i].setFont(new Font("Arial", Font.BOLD, 9));
            if (laboratory.PCList.get(i).isTurnedOn()) {
                buttons[i].setIcon(new ImageIcon("src/images/turned_on.png"));
            } else {
                buttons[i].setIcon(new ImageIcon("src/images/turned_off.png"));
            }

            if (i < 15) {
                changeColor(buttons[i + 1], green);
            }
            changeColor(buttons[i], Color.white);
        }
        if (i == 0) {
            changeColor(buttons[0], green);
        }
    }

    void changeColor(JButton b, Color c) {
        b.setBackground(c);
    }

    void pushButton(int i) {
        if (added[i]) {
            PCWindow vent = new PCWindow(laboratory.PCList.get(i), this, centralWindow);
            vent.setVisible(true);
        } else {
            addPC(i);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pc1 = new javax.swing.JButton();
        pc2 = new javax.swing.JButton();
        pc3 = new javax.swing.JButton();
        pc4 = new javax.swing.JButton();
        pc5 = new javax.swing.JButton();
        pc6 = new javax.swing.JButton();
        pc7 = new javax.swing.JButton();
        pc8 = new javax.swing.JButton();
        pc10 = new javax.swing.JButton();
        pc9 = new javax.swing.JButton();
        pc11 = new javax.swing.JButton();
        pc12 = new javax.swing.JButton();
        botonVolver = new javax.swing.JButton();
        pc13 = new javax.swing.JButton();
        pc14 = new javax.swing.JButton();
        pc15 = new javax.swing.JButton();
        pc16 = new javax.swing.JButton();
        labelTotalConsumptionLaboratory = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(208, 243, 253));
        setLocationByPlatform(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(214, 246, 252));

        titulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(51, 51, 51));
        titulo.setText("Laboratory 1");

        pc1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        pc1.setText("+");
        pc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pc1ActionPerformed(evt);
            }
        });

        pc2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        pc2.setText("+");
        pc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pc2ActionPerformed(evt);
            }
        });

        pc3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        pc3.setText("+");
        pc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pc3ActionPerformed(evt);
            }
        });

        pc4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        pc4.setText("+");
        pc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pc4ActionPerformed(evt);
            }
        });

        pc5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        pc5.setText("+");
        pc5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pc5ActionPerformed(evt);
            }
        });

        pc6.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        pc6.setText("+");
        pc6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pc6ActionPerformed(evt);
            }
        });

        pc7.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        pc7.setText("+");
        pc7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pc7ActionPerformed(evt);
            }
        });

        pc8.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        pc8.setText("+");
        pc8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pc8ActionPerformed(evt);
            }
        });

        pc10.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        pc10.setText("+");
        pc10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pc10ActionPerformed(evt);
            }
        });

        pc9.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        pc9.setText("+");
        pc9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pc9ActionPerformed(evt);
            }
        });

        pc11.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        pc11.setText("+");
        pc11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pc11ActionPerformed(evt);
            }
        });

        pc12.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        pc12.setText("+");
        pc12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pc12ActionPerformed(evt);
            }
        });

        botonVolver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonVolver.setText("BACK");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        pc13.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        pc13.setText("+");
        pc13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pc13ActionPerformed(evt);
            }
        });

        pc14.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        pc14.setText("+");
        pc14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pc14ActionPerformed(evt);
            }
        });

        pc15.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        pc15.setText("+");
        pc15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pc15ActionPerformed(evt);
            }
        });

        pc16.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        pc16.setText("+");
        pc16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pc16ActionPerformed(evt);
            }
        });

        labelTotalConsumptionLaboratory.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        labelTotalConsumptionLaboratory.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(396, Short.MAX_VALUE)
                .addComponent(botonVolver)
                .addGap(112, 112, 112))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pc2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pc3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pc4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pc8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pc7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pc6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(pc11, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(pc15, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(pc10, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(pc14, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(pc12, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(pc16, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(labelTotalConsumptionLaboratory, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(pc1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(pc5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(pc9, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(pc13, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(215, 215, 215)
                            .addComponent(titulo)))
                    .addContainerGap(42, Short.MAX_VALUE))
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(431, Short.MAX_VALUE)
                .addComponent(botonVolver)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(titulo)
                    .addGap(5, 5, 5)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(36, 36, 36)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pc1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pc5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pc9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pc13, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pc2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pc6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pc10, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pc14, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(7, 7, 7)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pc3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pc7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pc11, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pc15, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pc4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pc8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pc12, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pc16, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                    .addComponent(labelTotalConsumptionLaboratory, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void pc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pc1ActionPerformed
        pushButton(0);
    }//GEN-LAST:event_pc1ActionPerformed

    private void pc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pc2ActionPerformed
        pushButton(1);
    }//GEN-LAST:event_pc2ActionPerformed

    private void pc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pc3ActionPerformed
        pushButton(2);
    }//GEN-LAST:event_pc3ActionPerformed

    private void pc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pc4ActionPerformed
        pushButton(3);
    }//GEN-LAST:event_pc4ActionPerformed

    private void pc5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pc5ActionPerformed
        pushButton(4);
    }//GEN-LAST:event_pc5ActionPerformed

    private void pc6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pc6ActionPerformed
        pushButton(5);
    }//GEN-LAST:event_pc6ActionPerformed

    private void pc7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pc7ActionPerformed
        pushButton(6);
    }//GEN-LAST:event_pc7ActionPerformed

    private void pc8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pc8ActionPerformed
        pushButton(7);
    }//GEN-LAST:event_pc8ActionPerformed

    private void pc9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pc9ActionPerformed
        pushButton(8);
    }//GEN-LAST:event_pc9ActionPerformed

    private void pc10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pc10ActionPerformed
        pushButton(9);
    }//GEN-LAST:event_pc10ActionPerformed

    private void pc11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pc11ActionPerformed
        pushButton(10);
    }//GEN-LAST:event_pc11ActionPerformed

    private void pc12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pc12ActionPerformed
        pushButton(11);
    }//GEN-LAST:event_pc12ActionPerformed

    private void pc13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pc13ActionPerformed
        pushButton(12);
    }//GEN-LAST:event_pc13ActionPerformed

    private void pc14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pc14ActionPerformed
        pushButton(13);
    }//GEN-LAST:event_pc14ActionPerformed

    private void pc15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pc15ActionPerformed
        pushButton(14);
    }//GEN-LAST:event_pc15ActionPerformed

    private void pc16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pc16ActionPerformed
        pushButton(15);
    }//GEN-LAST:event_pc16ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelTotalConsumptionLaboratory;
    private javax.swing.JButton pc1;
    private javax.swing.JButton pc10;
    private javax.swing.JButton pc11;
    private javax.swing.JButton pc12;
    private javax.swing.JButton pc13;
    private javax.swing.JButton pc14;
    private javax.swing.JButton pc15;
    private javax.swing.JButton pc16;
    private javax.swing.JButton pc2;
    private javax.swing.JButton pc3;
    private javax.swing.JButton pc4;
    private javax.swing.JButton pc5;
    private javax.swing.JButton pc6;
    private javax.swing.JButton pc7;
    private javax.swing.JButton pc8;
    private javax.swing.JButton pc9;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
