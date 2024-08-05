
package com.mycompany.mavenproject7;

import javax.swing.JOptionPane;

public class tamquitos extends javax.swing.JFrame {


    public tamquitos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cabeza = new javax.swing.JLabel();
        RealizarPedido = new javax.swing.JButton();
        Bistek = new javax.swing.JLabel();
        NumBis = new javax.swing.JLabel();
        Asada = new javax.swing.JLabel();
        NumAsa = new javax.swing.JLabel();
        Costilla = new javax.swing.JLabel();
        NumCos = new javax.swing.JLabel();
        SBotonBistek = new javax.swing.JButton();
        NumCab = new javax.swing.JLabel();
        RBotonBistek = new javax.swing.JButton();
        EtiquetaTotal = new javax.swing.JLabel();
        TacosTotal = new javax.swing.JLabel();
        RBotonAsada = new javax.swing.JButton();
        TacosDonBartolo = new javax.swing.JLabel();
        SBotonCostilla = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        TacosPrecio = new javax.swing.JLabel();
        SBotonCabeza = new javax.swing.JButton();
        RBotonCostilla = new javax.swing.JButton();
        RBotonCabeza = new javax.swing.JButton();
        SBotonAsada = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tacos Don Bartolo");
        setBackground(new java.awt.Color(242, 185, 128));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(400,400);

        Cabeza.setBackground(new java.awt.Color(240, 228, 200));
        Cabeza.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Cabeza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cabeza.setText("Cabeza");
        Cabeza.setToolTipText("");
        Cabeza.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        RealizarPedido.setText("Realizar pedido");
        RealizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarPedidoActionPerformed(evt);
            }
        });

        Bistek.setBackground(new java.awt.Color(240, 228, 200));
        Bistek.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Bistek.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bistek.setText("Bistek");
        Bistek.setToolTipText("");
        Bistek.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        NumBis.setText("0");
        NumBis.setToolTipText("");
        NumBis.setAlignmentY(0.0F);
        NumBis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NumBis.setPreferredSize(new java.awt.Dimension(25, 30));

        Asada.setBackground(new java.awt.Color(240, 228, 200));
        Asada.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Asada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Asada.setText("Asada");
        Asada.setToolTipText("");
        Asada.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        NumAsa.setText("0");
        NumAsa.setToolTipText("");
        NumAsa.setAlignmentY(0.0F);
        NumAsa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NumAsa.setMaximumSize(new java.awt.Dimension(26, 20));
        NumAsa.setMinimumSize(new java.awt.Dimension(26, 20));
        NumAsa.setPreferredSize(new java.awt.Dimension(25, 30));

        Costilla.setBackground(new java.awt.Color(240, 228, 200));
        Costilla.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Costilla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Costilla.setText("Costilla");
        Costilla.setToolTipText("");
        Costilla.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        NumCos.setText("0");
        NumCos.setToolTipText("");
        NumCos.setAlignmentY(0.0F);
        NumCos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NumCos.setPreferredSize(new java.awt.Dimension(25, 30));

        SBotonBistek.setText("+");
        SBotonBistek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SBotonBistekActionPerformed(evt);
            }
        });

        NumCab.setText("0");
        NumCab.setToolTipText("");
        NumCab.setAlignmentY(0.0F);
        NumCab.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NumCab.setPreferredSize(new java.awt.Dimension(25, 30));

        RBotonBistek.setText("-");
        RBotonBistek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBotonBistekActionPerformed(evt);
            }
        });

        EtiquetaTotal.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        EtiquetaTotal.setText("Total: $");

        TacosTotal.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        TacosTotal.setText("0");

        RBotonAsada.setText("-");
        RBotonAsada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBotonAsadaActionPerformed(evt);
            }
        });

        TacosDonBartolo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        TacosDonBartolo.setText("Tacos Don Bartolo");
        TacosDonBartolo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TacosDonBartolo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        SBotonCostilla.setText("+");
        SBotonCostilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SBotonCostillaActionPerformed(evt);
            }
        });

        Salir.setText("Salir");

        TacosPrecio.setBackground(new java.awt.Color(255, 209, 130));
        TacosPrecio.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        TacosPrecio.setText("Tacos: $15.00");
        TacosPrecio.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(224, 133, 58)));

        SBotonCabeza.setText("+");
        SBotonCabeza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SBotonCabezaActionPerformed(evt);
            }
        });

        RBotonCostilla.setText("-");
        RBotonCostilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBotonCostillaActionPerformed(evt);
            }
        });

        RBotonCabeza.setText("-");
        RBotonCabeza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBotonCabezaActionPerformed(evt);
            }
        });

        SBotonAsada.setLabel("+");
        SBotonAsada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SBotonAsadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EtiquetaTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TacosTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TacosPrecio)
                            .addComponent(RealizarPedido))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, Short.MAX_VALUE)))
                .addGap(239, 239, 239)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(RBotonCostilla)
                        .addGap(18, 18, 18)
                        .addComponent(NumCos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)
                        .addComponent(SBotonCostilla))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(Salir))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Costilla, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(RBotonAsada)
                                        .addGap(18, 18, 18)
                                        .addComponent(NumAsa, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Asada, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SBotonAsada))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Cabeza)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(RBotonCabeza)
                                        .addGap(18, 18, 18)
                                        .addComponent(NumCab, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SBotonCabeza))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Bistek, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(RBotonBistek)
                                        .addGap(18, 18, 18)
                                        .addComponent(NumBis, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SBotonBistek)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(TacosDonBartolo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(TacosDonBartolo)
                .addGap(46, 46, 46)
                .addComponent(Bistek)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SBotonBistek)
                    .addComponent(RBotonBistek)
                    .addComponent(NumBis, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TacosPrecio)
                    .addComponent(Asada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBotonAsada)
                    .addComponent(NumAsa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SBotonAsada))
                .addGap(18, 18, 18)
                .addComponent(Costilla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SBotonCostilla, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NumCos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(RBotonCostilla)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cabeza)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 31, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EtiquetaTotal)
                            .addComponent(TacosTotal)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NumCab, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SBotonCabeza)
                            .addComponent(RBotonCabeza))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RealizarPedido)
                    .addComponent(Salir))
                .addGap(22, 22, 22))
        );

        setBounds(0, 0, 545, 439);
    }// </editor-fold>//GEN-END:initComponents

    private void SBotonBistekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SBotonBistekActionPerformed

        String x = this.NumBis.getText();
        int numero = Integer.parseInt(x);
        numero++;
        x=String.valueOf(numero);
        NumBis.setText(x);
        int total = Integer.parseInt(TacosTotal.getText());
        total = total+15;
        TacosTotal.setText(String.valueOf(total));

    }//GEN-LAST:event_SBotonBistekActionPerformed

    private void SBotonCostillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SBotonCostillaActionPerformed

       String x = this.NumCos.getText();
        int numero = Integer.parseInt(x);
        numero++;
        x=String.valueOf(numero);
        NumCos.setText(x);
        int total = Integer.parseInt(TacosTotal.getText());
        total = total+15;
        TacosTotal.setText(String.valueOf(total));
        
    }//GEN-LAST:event_SBotonCostillaActionPerformed

    private void SBotonCabezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SBotonCabezaActionPerformed
        
         String x = this.NumCab.getText();
        int numero = Integer.parseInt(x);
        numero++;
        x=String.valueOf(numero);
        NumCab.setText(x);
        int total = Integer.parseInt(TacosTotal.getText());
        total = total+15;
        TacosTotal.setText(String.valueOf(total));
        
    }//GEN-LAST:event_SBotonCabezaActionPerformed

    private void RBotonBistekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBotonBistekActionPerformed
        
        String x = this.NumBis.getText();
        int numero=Integer.parseInt(x);
        if(numero>=1)
        {
            numero--;
            x=String.valueOf(numero);
            NumBis.setText(x);
            int total=Integer.parseInt(TacosTotal.getText());
            total=total-15;
            TacosTotal.setText(String.valueOf(total));
        }
        
    }//GEN-LAST:event_RBotonBistekActionPerformed

    private void RBotonAsadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBotonAsadaActionPerformed
       
        String x = this.NumAsa.getText();
        int numero=Integer.parseInt(x);
        if(numero>=1)
        {
            numero--;
            x=String.valueOf(numero);
            NumAsa.setText(x);
            int total=Integer.parseInt(TacosTotal.getText());
            total=total-15;
            TacosTotal.setText(String.valueOf(total));
        }
    }//GEN-LAST:event_RBotonAsadaActionPerformed

    private void SBotonAsadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SBotonAsadaActionPerformed

        String x = this.NumAsa.getText();
        int numero = Integer.parseInt(x);
        numero++;
        x=String.valueOf(numero);
        NumAsa.setText(x);
        int total = Integer.parseInt(TacosTotal.getText());
        total = total+15;
        TacosTotal.setText(String.valueOf(total));

    }//GEN-LAST:event_SBotonAsadaActionPerformed

    private void RBotonCabezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBotonCabezaActionPerformed
       
         String x = this.NumCab.getText();
        int numero=Integer.parseInt(x);
        if(numero>=1)
        {
            numero--;
            x=String.valueOf(numero);
            NumCab.setText(x);
            int total=Integer.parseInt(TacosTotal.getText());
            total=total-15;
            TacosTotal.setText(String.valueOf(total));
        }
    }//GEN-LAST:event_RBotonCabezaActionPerformed

    private void RBotonCostillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBotonCostillaActionPerformed
      
         String x = this.NumCos.getText();
        int numero=Integer.parseInt(x);
        if(numero>=1)
        {
            numero--;
            x=String.valueOf(numero);
            NumCos.setText(x);
            int total=Integer.parseInt(TacosTotal.getText());
            total=total-15;
            TacosTotal.setText(String.valueOf(total));
        }
    }//GEN-LAST:event_RBotonCostillaActionPerformed

    private void RealizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealizarPedidoActionPerformed
        String valor = JOptionPane.showInputDialog(null,"Ingresa el número de mesa");
        JOptionPane.showMessageDialog(null, "Mesa asginada con éxito");
        this.NumBis.setText("0");
        this.NumAsa.setText("0");       
        this.NumCos.setText("0");  
        this.NumCab.setText("0");  
        this.TacosTotal.setText("0");
    }//GEN-LAST:event_RealizarPedidoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tamquitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tamquitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tamquitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tamquitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tamquitos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Asada;
    private javax.swing.JLabel Bistek;
    private javax.swing.JLabel Cabeza;
    private javax.swing.JLabel Costilla;
    private javax.swing.JLabel EtiquetaTotal;
    private javax.swing.JLabel NumAsa;
    private javax.swing.JLabel NumBis;
    private javax.swing.JLabel NumCab;
    private javax.swing.JLabel NumCos;
    private javax.swing.JButton RBotonAsada;
    private javax.swing.JButton RBotonBistek;
    private javax.swing.JButton RBotonCabeza;
    private javax.swing.JButton RBotonCostilla;
    private javax.swing.JButton RealizarPedido;
    private javax.swing.JButton SBotonAsada;
    private javax.swing.JButton SBotonBistek;
    private javax.swing.JButton SBotonCabeza;
    private javax.swing.JButton SBotonCostilla;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel TacosDonBartolo;
    private javax.swing.JLabel TacosPrecio;
    private javax.swing.JLabel TacosTotal;
    // End of variables declaration//GEN-END:variables
}
