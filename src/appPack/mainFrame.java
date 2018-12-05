
package appPack;

import static appPack.newOrder.oName;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class mainFrame extends javax.swing.JFrame {
    
    static String id = "";
    static String name = "";
    static String surname = "";
    static String phone = "";
    static String address = "";
    static int row = 0;
    String oid = "";
    String oName = "";
    String oSurname = "";
    String status = "";
    String oAddress = "";
    String amount = "";
    
    
    DB db = new DB();
    static public DefaultTableModel dtm = new DefaultTableModel();
    static public DefaultTableModel dtmo = new DefaultTableModel();
    newOrder nwo = new newOrder(this);

    public mainFrame() {       
        initComponents();
        setIcon();
        dtm.addColumn("ID");
        dtm.addColumn("Name");
        dtm.addColumn("Surname");
        dtm.addColumn("Phone");
        dtm.addColumn("Address");
        dtmo.addColumn("ID");
        dtmo.addColumn("Name");
        dtmo.addColumn("Surname");
        dtmo.addColumn("Statu");
        dtmo.addColumn("Address");
        dtmo.addColumn("Amount");
        tableDisplay();
        nwo.orderDisplay();
        
        
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
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSurname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnDeleteSelected = new javax.swing.JButton();
        btnDeleteAll = new javax.swing.JButton();
        btnTodaysOrders = new javax.swing.JButton();
        btnoRefresh = new javax.swing.JButton();
        btnNewOrder = new javax.swing.JButton();
        bnDelivered = new javax.swing.JButton();
        btnShipped = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Water Sales Automation");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));

        jLabel1.setText("Customer Name");

        jLabel2.setText("Customer Surname");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/search.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSurname)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Customer"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Surname", "Phone", "Address"
            }
        ));
        jTable1.setRowHeight(22);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/add_customers.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/refresh.png"))); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/update.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/delete.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Order"));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Surname", "Statu", "Address", "Amount ($)"
            }
        ));
        jTable2.setRowHeight(22);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Order Actions"));

        btnDeleteSelected.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDeleteSelected.setText("Delete");
        btnDeleteSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSelectedActionPerformed(evt);
            }
        });

        btnDeleteAll.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDeleteAll.setText("Delete All");
        btnDeleteAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAllActionPerformed(evt);
            }
        });

        btnTodaysOrders.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnTodaysOrders.setText("Todays Orders");
        btnTodaysOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodaysOrdersActionPerformed(evt);
            }
        });

        btnoRefresh.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnoRefresh.setText("Refresh");
        btnoRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnoRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDeleteSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteAll, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTodaysOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnoRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeleteSelected, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTodaysOrders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeleteAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnoRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnNewOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/new_order.png"))); // NOI18N
        btnNewOrder.setText("New Order");
        btnNewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewOrderActionPerformed(evt);
            }
        });

        bnDelivered.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/delivered.png"))); // NOI18N
        bnDelivered.setText("Delivered");
        bnDelivered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnDeliveredActionPerformed(evt);
            }
        });

        btnShipped.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/shipped.png"))); // NOI18N
        btnShipped.setText("Shipped");
        btnShipped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShippedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnNewOrder)
                        .addGap(47, 47, 47)
                        .addComponent(btnShipped, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(bnDelivered, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNewOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnShipped, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bnDelivered, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdd)
                        .addComponent(btnRefresh)
                        .addComponent(btnUpdate)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel dtm_query = new DefaultTableModel();
        dtm_query.addColumn("ID");
        dtm_query.addColumn("Name");
        dtm_query.addColumn("Surname");
        dtm_query.addColumn("Phone");
        dtm_query.addColumn("Address");
        id = "";
        name = "";
        surname = "";
        phone = "";
        address = "";
        
        name = txtName.getText().trim();
        surname = txtSurname.getText().trim();
        
        if(name.equals("") && surname.equals(""))
       {
           JOptionPane.showMessageDialog(rootPane, "Please enter the valid name/surname!");
           requestFocus();
       } 
        
        else 
        {
            String query = "SELECT * FROM `customer` WHERE `cName` = '"+name+"' OR `cSurname` = '"+surname+"' ";
             
            try 
            {
                ResultSet rs = db.baglan().executeQuery(query);
                while(rs.next())
                {
                    //there is at least one customer in db
                    id = rs.getString("cid");
                    name = rs.getString("cName");
                    surname = rs.getString("cSurname");
                    phone = rs.getString("cPhone");
                    address = rs.getString("cAddress");

                    dtm_query.addRow(new String[]{id, name, surname, phone, address}); 
                } 
                if(id=="")
                {
                    JOptionPane.showMessageDialog(rootPane, "This customer is not in the database!");
                }
                else
                {
                    jTable1.setModel(dtm_query); // fill the content of jtable with data model adaptor
                }
           }catch (Exception e) 
           {
               System.err.println("DB connection error"+e);
           }              
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
   
        newCustomer nc = new newCustomer(this);
        nc.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        tableDisplay();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        updateCustomer uc = new updateCustomer(this);
        uc.setVisible(true);

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        row = jTable1.getSelectedRow();
        id = ""+jTable1.getValueAt(row, 0); //Returns the selected rows 0.column. The 0.column is id.
        //getValueAt returns object type, therefore we cast it to string.
        name = ""+jTable1.getValueAt(row, 1); //1.column is name in the selected row.
        surname = ""+jTable1.getValueAt(row, 2);
        phone = ""+jTable1.getValueAt(row, 3);
        address = ""+jTable1.getValueAt(row, 4);
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
         
        int answer = JOptionPane.showConfirmDialog(rootPane, "Are you sure delete this customer?","Info Message",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
        if(answer == 0)
        {
        try {
            
            String query =  "DELETE FROM `customer` WHERE `customer`.`cid` = '"+id+"'";
            
            int result = db.baglan().executeUpdate(query);
            if (result>0){ // returns the number of selected rows
            jTable1.setModel(dtm); 
            tableDisplay();
            }
        } catch (Exception e) {
            System.err.println("delete error: "+e);
        }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        row = jTable2.getSelectedRow();
        oid = ""+jTable2.getValueAt(row, 0);
        oName = ""+jTable2.getValueAt(row, 1);
        oSurname = ""+jTable2.getValueAt(row, 2);
        status = ""+jTable2.getValueAt(row, 3);
        oAddress = ""+jTable2.getValueAt(row, 4);
        amount = ""+jTable2.getValueAt(row, 5);
        
    }//GEN-LAST:event_jTable2MouseClicked

    private void btnNewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewOrderActionPerformed

        newOrder no = new newOrder(this);
        no.setVisible(true);
       
    }//GEN-LAST:event_btnNewOrderActionPerformed

    private void btnShippedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShippedActionPerformed
        try {
            
            String query = "UPDATE `orders` SET `oName` = '"+oName+"', `oSurname` = '"+oSurname+"', "
                    + "`oStatus` = '"+"Shipped"+"', `oAddress` = '"+oAddress+"', `oCost` = '"+amount+"' WHERE `orders`.`oid` = '"+oid+"' ";
            
            int result = db.baglan().executeUpdate(query);
            if (result>0){ // degistirilen satır sayısını verir
            
                jTable2.setModel(dtmo); 
                nwo.orderDisplay();
            }
        } catch (Exception e) {
            System.err.println("Shipped error: "+e);
        }      
    }//GEN-LAST:event_btnShippedActionPerformed

    private void bnDeliveredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnDeliveredActionPerformed
        try 
        {          
            String query = "UPDATE `orders` SET `oName` = '"+oName+"', `oSurname` = '"+oSurname+"', "
                    + "`oStatus` = '"+"Delivered"+"', `oAddress` = '"+oAddress+"', `oCost` = '"+amount+"' WHERE `orders`.`oid` = '"+oid+"' ";
            
            int result = db.baglan().executeUpdate(query);
            if (result>0)
            { 
                jTable2.setModel(dtmo); 
                nwo.orderDisplay();
            }
        } catch (Exception e) {
            System.err.println("Shipped error: "+e);
        }
        
    }//GEN-LAST:event_bnDeliveredActionPerformed

    private void btnDeleteSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSelectedActionPerformed

        int answer = JOptionPane.showConfirmDialog(rootPane, "Are you sure delete this order?","Info Message",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
        if(answer == 0)
        {
        try {
            
            String query =  "DELETE FROM `orders` WHERE `orders`.`oid` = '"+oid+"'";
            
            int result = db.baglan().executeUpdate(query);
            if (result>0)
            { 
            jTable2.setModel(dtmo); 
            nwo.orderDisplay();
            }
        } catch (Exception e) {
            System.err.println("delete error: "+e);
        }
        }
    }//GEN-LAST:event_btnDeleteSelectedActionPerformed

    private void btnDeleteAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAllActionPerformed
        
        int answer = JOptionPane.showConfirmDialog(rootPane, "Are you sure delete all orders?","Info Message",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
        if(answer == 0)
        {
        try {
            
            String query =  "DELETE FROM `orders`";
            
            int result = db.baglan().executeUpdate(query);
            if (result>0)
            { // returns the number of changed rows
            jTable2.setModel(dtmo); 
            nwo.orderDisplay();
            }
        } catch (Exception e) {
            System.err.println("delete error: "+e);
        }
        }
        
    }//GEN-LAST:event_btnDeleteAllActionPerformed

    private void btnTodaysOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodaysOrdersActionPerformed

        try
        {
            while(dtmo.getRowCount() > 0)
            {
                dtmo.removeRow(0);
            }

            String query = "SELECT * FROM `orders` WHERE `orders`.`oDate` = CURDATE()";
            ResultSet rs = db.baglan().executeQuery(query);
            while(rs.next())
            {
                oid = rs.getString("oid");
                oName = rs.getString("oName");
                oSurname = rs.getString("oSurname");
                status = rs.getString("oStatus");
                oAddress = rs.getString("oAddress");
                amount = rs.getString("oCost");

                dtmo.addRow(new String[]{oid, oName, oSurname, status, oAddress, amount });

            }
            jTable2.setModel(dtmo);

        }
        catch (Exception e)
        {
            System.err.println("Data getirme hatası"+e);
        }

    }//GEN-LAST:event_btnTodaysOrdersActionPerformed

    private void btnoRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnoRefreshActionPerformed
        nwo.orderDisplay();
    }//GEN-LAST:event_btnoRefreshActionPerformed

    
    public void tableDisplay()
    {
        try 
        {
            while(dtm.getRowCount() > 0)
            {
                dtm.removeRow(0);
            }
            
            String query = "SELECT * FROM `customer`";    
            ResultSet rs = db.baglan().executeQuery(query);
            while(rs.next())
            {
                id = rs.getString("cid");
                name = rs.getString("cName");
                surname = rs.getString("cSurname");
                phone = rs.getString("cPhone");
                address = rs.getString("cAddress");
                
                dtm.addRow(new String[]{id, name, surname, phone, address}); 
            }
                jTable1.setModel(dtm); 
        } 
        catch (Exception e) 
        {
            System.err.println("Data getirme hatası"+e);
        }
    }
 
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        }); 
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/media/icon.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnDelivered;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteAll;
    private javax.swing.JButton btnDeleteSelected;
    private javax.swing.JButton btnNewOrder;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnShipped;
    private javax.swing.JButton btnTodaysOrders;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnoRefresh;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable1;
    public javax.swing.JTable jTable2;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables

}
