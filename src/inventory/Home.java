/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

/**
 *
 * @author root
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        products = new javax.swing.JButton();
        productadd = new javax.swing.JButton();
        dashboard = new javax.swing.JButton();
        customers = new javax.swing.JButton();
        customeradd = new javax.swing.JButton();
        invoices = new javax.swing.JButton();
        invoicenew = new javax.swing.JButton();
        purchasenew = new javax.swing.JButton();
        purchases = new javax.swing.JButton();
        stockreport = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        mainpanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventory Management System - Admin Panel");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(166, 40, 40));

        products.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        products.setText("Products");
        products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productsActionPerformed(evt);
            }
        });

        productadd.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        productadd.setText("Add Product");
        productadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productaddActionPerformed(evt);
            }
        });

        dashboard.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        dashboard.setText("Dashboard");
        dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardActionPerformed(evt);
            }
        });

        customers.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        customers.setText("Customers");
        customers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customersActionPerformed(evt);
            }
        });

        customeradd.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        customeradd.setText("Add Customer");
        customeradd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customeraddActionPerformed(evt);
            }
        });

        invoices.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        invoices.setText("Invoices");
        invoices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoicesActionPerformed(evt);
            }
        });

        invoicenew.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        invoicenew.setText("New Invoice");
        invoicenew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoicenewActionPerformed(evt);
            }
        });

        purchasenew.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        purchasenew.setText("New Purchase");
        purchasenew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchasenewActionPerformed(evt);
            }
        });

        purchases.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        purchases.setText("Purchases");
        purchases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchasesActionPerformed(evt);
            }
        });

        stockreport.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        stockreport.setText("Stock Report");
        stockreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockreportActionPerformed(evt);
            }
        });

        logout.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Inventory Management System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(products, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(productadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(customers, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(purchases, javax.swing.GroupLayout.PREFERRED_SIZE, 91, Short.MAX_VALUE)
                                        .addComponent(invoices, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(customeradd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(invoicenew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(purchasenew, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stockreport, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(24, 24, 24)
                .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(products, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productadd, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customers, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customeradd, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invoices, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invoicenew, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(purchases, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(purchasenew, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stockreport, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainpanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void productsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productsActionPerformed
        // TODO add your handling code here:
        mainpanel.removeAll();
        mainpanel.repaint();
        mainpanel.revalidate();
        
        mainpanel.add(new Products());
        mainpanel.repaint();
        mainpanel.revalidate();
    }//GEN-LAST:event_productsActionPerformed

    private void productaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productaddActionPerformed
        // TODO add your handling code here:
        mainpanel.removeAll();
        mainpanel.repaint();
        mainpanel.revalidate();
        
        mainpanel.add(new ProductAdd());
        mainpanel.repaint();
        mainpanel.revalidate();
    }//GEN-LAST:event_productaddActionPerformed

    private void dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardActionPerformed
        // TODO add your handling code here:
        mainpanel.removeAll();
        mainpanel.repaint();
        mainpanel.revalidate();
        
        mainpanel.add(new Dashboard());
        mainpanel.repaint();
        mainpanel.revalidate();
    }//GEN-LAST:event_dashboardActionPerformed

    private void customersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customersActionPerformed
        // TODO add your handling code here:
        mainpanel.removeAll();
        mainpanel.repaint();
        mainpanel.revalidate();
        
        mainpanel.add(new Customers());
        mainpanel.repaint();
        mainpanel.revalidate();
    }//GEN-LAST:event_customersActionPerformed

    private void customeraddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customeraddActionPerformed
        // TODO add your handling code here:
        mainpanel.removeAll();
        mainpanel.repaint();
        mainpanel.revalidate();
        
        mainpanel.add(new CustomerAdd());
        mainpanel.repaint();
        mainpanel.revalidate();
    }//GEN-LAST:event_customeraddActionPerformed

    private void invoicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoicesActionPerformed
        // TODO add your handling code here:
        mainpanel.removeAll();
        mainpanel.repaint();
        mainpanel.revalidate();
        
        mainpanel.add(new Invoices());
        mainpanel.repaint();
        mainpanel.revalidate();
    }//GEN-LAST:event_invoicesActionPerformed

    private void invoicenewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoicenewActionPerformed
        // TODO add your handling code here:
        mainpanel.removeAll();
        mainpanel.repaint();
        mainpanel.revalidate();
        
        mainpanel.add(new InvoiceAdd());
        mainpanel.repaint();
        mainpanel.revalidate();
    }//GEN-LAST:event_invoicenewActionPerformed

    private void purchasenewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchasenewActionPerformed
        // TODO add your handling code here:
        mainpanel.removeAll();
        mainpanel.repaint();
        mainpanel.revalidate();
        
        mainpanel.add(new PurchaseAdd());
        mainpanel.repaint();
        mainpanel.revalidate();
    }//GEN-LAST:event_purchasenewActionPerformed

    private void purchasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchasesActionPerformed
        // TODO add your handling code here:
        mainpanel.removeAll();
        mainpanel.repaint();
        mainpanel.revalidate();
        
        mainpanel.add(new Purchases());
        mainpanel.repaint();
        mainpanel.revalidate();
    }//GEN-LAST:event_purchasesActionPerformed

    private void stockreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockreportActionPerformed
        // TODO add your handling code here:
        mainpanel.removeAll();
        mainpanel.repaint();
        mainpanel.revalidate();
        
        mainpanel.add(new StockReports());
        mainpanel.repaint();
        mainpanel.revalidate();
    }//GEN-LAST:event_stockreportActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton customeradd;
    private javax.swing.JButton customers;
    private javax.swing.JButton dashboard;
    private javax.swing.JButton invoicenew;
    private javax.swing.JButton invoices;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JButton productadd;
    private javax.swing.JButton products;
    private javax.swing.JButton purchasenew;
    private javax.swing.JButton purchases;
    private javax.swing.JButton stockreport;
    // End of variables declaration//GEN-END:variables
}