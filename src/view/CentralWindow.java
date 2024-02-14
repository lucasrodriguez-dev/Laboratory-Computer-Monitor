package view;

import logic.Laboratory;
import logic.Central;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class CentralWindow extends javax.swing.JFrame {

    //variables
    boolean[] added;
    JButton[] buttons;
    Color green;
    Central central = new Central();

    //constructor
    public CentralWindow() {
        buttons = new JButton[12];
        green = new Color(178, 248, 160);
        added = new boolean[12];
        initComponents();
        buttons[0] = lab1;
        buttons[1] = lab2;
        buttons[2] = lab3;
        buttons[3] = lab4;
        buttons[4] = lab5;
        buttons[5] = lab6;
        buttons[6] = lab7;
        buttons[7] = lab8;
        buttons[8] = lab9;
        buttons[9] = lab10;
        buttons[10] = lab11;
        buttons[11] = lab12;
        changeColor(lab1, green);
        try {
            consumoTotalInstitucion.setText("TOTAL CONSUMPTION: " + central.totalConsumptionCentral(central.getLaboratoriesList()) + "W/h");
        } catch (Exception e) {
            consumoTotalInstitucion.setText("TOTAL CONSUMPTION: 0W/h");
        }
    }

    //methods
    void addLaboratory(int i) {
        Laboratory lab = new Laboratory(central.getLaboratoriesList().size() + 1);
        try {
            central.add(lab, i);
        } catch (Exception e) {
            System.out.print(e);
        }
        if (central.has(lab)) {
            changeText(i);
            added[i] = true;
            changeColor(buttons[i], Color.white);
            if (i < 11) {
                changeColor(buttons[i + 1], green);
            }
        }
    }

    void changeText(int i) {
        buttons[i].setText("Lab " + (i + 1));
        buttons[i].setFont(new Font("Arial", Font.BOLD, 18));
    }

    void changeColor(JButton b, Color c) {
        b.setBackground(c);
    }

    void pushButton(int i) {
        if (added[i]) {
            LaboratoryWindow vent = new LaboratoryWindow(central.getLaboratoriesList().get(i), this);
            vent.setVisible(true);
        } else {
            addLaboratory(i);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lab11 = new javax.swing.JButton();
        lab10 = new javax.swing.JButton();
        lab1 = new javax.swing.JButton();
        lab8 = new javax.swing.JButton();
        lab12 = new javax.swing.JButton();
        lab4 = new javax.swing.JButton();
        lab3 = new javax.swing.JButton();
        lab2 = new javax.swing.JButton();
        lab6 = new javax.swing.JButton();
        lab5 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lab7 = new javax.swing.JButton();
        lab9 = new javax.swing.JButton();
        consumoTotalInstitucion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(212, 248, 255));
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(214, 246, 252));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Laboratory Computer Monitor");
        jLabel1.setToolTipText("");

        lab11.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lab11.setText("+");
        lab11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lab11ActionPerformed(evt);
            }
        });

        lab10.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lab10.setText("+");
        lab10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lab10ActionPerformed(evt);
            }
        });

        lab1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lab1.setText("+");
        lab1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lab1ActionPerformed(evt);
            }
        });

        lab8.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lab8.setText("+");
        lab8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lab8ActionPerformed(evt);
            }
        });

        lab12.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lab12.setText("+");
        lab12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lab12ActionPerformed(evt);
            }
        });

        lab4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lab4.setText("+");
        lab4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lab4ActionPerformed(evt);
            }
        });

        lab3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lab3.setText("+");
        lab3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lab3ActionPerformed(evt);
            }
        });

        lab2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lab2.setText("+");
        lab2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lab2ActionPerformed(evt);
            }
        });

        lab6.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lab6.setText("+");
        lab6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lab6ActionPerformed(evt);
            }
        });

        lab5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lab5.setText("+");
        lab5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lab5ActionPerformed(evt);
            }
        });

        lab7.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lab7.setText("+");
        lab7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lab7ActionPerformed(evt);
            }
        });

        lab9.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lab9.setText("+");
        lab9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lab9ActionPerformed(evt);
            }
        });

        consumoTotalInstitucion.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        consumoTotalInstitucion.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(454, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lab10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lab12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lab11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(consumoTotalInstitucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lab2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lab1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(45, 45, 45)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lab5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lab4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lab3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lab6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(38, 38, 38)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lab8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lab7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lab9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addComponent(lab10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(lab11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(lab12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lab1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lab4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lab7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lab2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lab5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lab8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(41, 41, 41)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lab3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lab6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lab9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(consumoTotalInstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void lab1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lab1ActionPerformed
        pushButton(0);
    }//GEN-LAST:event_lab1ActionPerformed

    private void lab4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lab4ActionPerformed
        pushButton(3);
    }//GEN-LAST:event_lab4ActionPerformed

    private void lab2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lab2ActionPerformed
        pushButton(1);
    }//GEN-LAST:event_lab2ActionPerformed

    private void lab3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lab3ActionPerformed
        pushButton(2);
    }//GEN-LAST:event_lab3ActionPerformed

    private void lab5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lab5ActionPerformed
        pushButton(4);
    }//GEN-LAST:event_lab5ActionPerformed

    private void lab6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lab6ActionPerformed
        pushButton(5);
    }//GEN-LAST:event_lab6ActionPerformed

    private void lab7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lab7ActionPerformed
        pushButton(6);
    }//GEN-LAST:event_lab7ActionPerformed

    private void lab8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lab8ActionPerformed
        pushButton(7);
    }//GEN-LAST:event_lab8ActionPerformed

    private void lab9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lab9ActionPerformed
        pushButton(8);
    }//GEN-LAST:event_lab9ActionPerformed

    private void lab10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lab10ActionPerformed
        pushButton(9);
    }//GEN-LAST:event_lab10ActionPerformed

    private void lab11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lab11ActionPerformed
        pushButton(10);
    }//GEN-LAST:event_lab11ActionPerformed

    private void lab12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lab12ActionPerformed
        pushButton(11);
    }//GEN-LAST:event_lab12ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CentralWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel consumoTotalInstitucion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton lab1;
    private javax.swing.JButton lab10;
    private javax.swing.JButton lab11;
    private javax.swing.JButton lab12;
    private javax.swing.JButton lab2;
    private javax.swing.JButton lab3;
    private javax.swing.JButton lab4;
    private javax.swing.JButton lab5;
    private javax.swing.JButton lab6;
    private javax.swing.JButton lab7;
    private javax.swing.JButton lab8;
    private javax.swing.JButton lab9;
    // End of variables declaration//GEN-END:variables
}
