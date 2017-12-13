/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectwithgui;

/**
 *
 * @author Reyan Sheikh
 */
public class PathFinder extends javax.swing.JFrame {

    /**
     * Creates new form PathFinder
     */
    public PathFinder() {
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

        Heading = new javax.swing.JLabel();
        selectarea = new javax.swing.JLabel();
        area1 = new javax.swing.JComboBox<>();
        to = new javax.swing.JComboBox<>();
        from = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        route = new javax.swing.JTextArea();
        show = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Heading.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        Heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heading.setText("Path Finder");

        selectarea.setFont(new java.awt.Font("Bebas", 0, 18)); // NOI18N
        selectarea.setText("Select area");

        area1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Area", "Gulshan e Iqbal", "PECHS", "Clifton", "Bahadrabad" }));
        area1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                area1ActionPerformed(evt);
            }
        });

        to.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        to.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toActionPerformed(evt);
            }
        });

        from.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        route.setColumns(20);
        route.setRows(5);
        jScrollPane1.setViewportView(route);

        show.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        show.setText("Show Route");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(selectarea, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(area1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(show))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectarea, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(area1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(show)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void area1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_area1ActionPerformed
        // TODO add your handling code here:

        List list = new List();
        list.InsertInOrderdistance("Patel Hospital", "ST-18, Block-4, Gulshan-e-Iqbal,Karachi - 75300, Pakistan.، Karachi, Pakistan", 3.6, 5.8);
        list.InsertInOrderdistance("Ibn-Sina Hospital", "St-22-B,, University Rd, Block 6, Gulshan-e-Iqbal, Sindh، Karachi, Pakistan", 3.8, 4.2);
        list.InsertInOrderdistance("Samdani Hospital", "a 560 block, Street No 5, Karachi, Pakistan", 2.3, 5.3);
        list.InsertInOrderdistance("AL Mustafa Medical", "ST-1 Block 13-C Gulshan-e-Iqbal، University Road، Karachi, Pakistan", 4.1, 17);
        list.InsertInOrderdistance("Haji Rang Elahi Hospital", "St 4B, Block-4, Gulshan E Iqbal, Karachi, Karachi, Pakistan", 4.6, 5.4);
        list.InsertInOrderdistance("NIBD Hospital", "Gulshan-e-Iqbal, Karachi, Pakistan", 4.2, 7.5);
        list.InsertInOrderdistance("T.O Clinic Hospital", "no, Street 1, Karachi, Pakistan", 3.1, 5.4);

        AreaArray arr = new AreaArray();

        Graph g = new Graph(6);
        g.AddVertex(new vertex("Patel Hospital", "ST-18, Block-4, Gulshan-e-Iqbal,Karachi - 75300, Pakistan.، Karachi, Pakistan", 3.6, 5.8)); // v0
        g.AddVertex(new vertex("Ibn-Sina Hospital", "St-22-B,, University Rd, Block 6, Gulshan-e-Iqbal, Sindh، Karachi, Pakistan", 3.8, 4.2)); // v1
        g.AddVertex(new vertex("Samdani Hospital", "a 560 block, Street No 5, Karachi, Pakistan", 2.3, 5.3)); // v2
        g.AddVertex(new vertex("AL Mustafa Medical", "ST-1 Block 13-C Gulshan-e-Iqbal، University Road، Karachi, Pakistan", 4.1, 17)); // v3
        g.AddVertex(new vertex("Haji Rang Elahi Hospital", "St 4B, Block-4, Gulshan E Iqbal, Karachi, Karachi, Pakistan", 4.6, 5.4)); // v4
        g.AddVertex(new vertex("NIBD Hospital", "Gulshan-e-Iqbal, Karachi, Pakistan", 4.2, 7.5));// v5
        g.AddVertex(new vertex("T.O Clinic Hospital", "no, Street 1, Karachi, Pakistan", 3.1, 5.4));// v5

        g.AddEdge(g.AdjList.get(0), g.AdjList.get(4));
        g.AddEdge(g.AdjList.get(0), g.AdjList.get(1));
        g.AddEdge(g.AdjList.get(0), g.AdjList.get(2));
        g.AddEdge(g.AdjList.get(2), g.AdjList.get(0));
        g.AddEdge(g.AdjList.get(2), g.AdjList.get(1));
        g.AddEdge(g.AdjList.get(1), g.AdjList.get(2));
        g.AddEdge(g.AdjList.get(1), g.AdjList.get(0));
        g.AddEdge(g.AdjList.get(2), g.AdjList.get(3));
        g.AddEdge(g.AdjList.get(3), g.AdjList.get(4));
        g.AddEdge(g.AdjList.get(4), g.AdjList.get(5));
        g.AddEdge(g.AdjList.get(4), g.AdjList.get(5));
        g.AddEdge(g.AdjList.get(4), g.AdjList.get(3));

        arr.AddData("Gulshan", list, g);

        List PECHSlist = new List();
        PECHSlist.InsertInOrderdistance("Shehroz Medical Centre", "NOT ENTERED", 3.6, 5.8);
        PECHSlist.InsertInOrderdistance("Karim Clinic", "NOT ENTERED", 4.5, 3.2);
        PECHSlist.InsertInOrderdistance("Gupta Memorial Hospital", "NOT ENTERED", 3.8, 7.2);
        PECHSlist.InsertInOrderdistance("Aisha's Dental Clinic", "NOT ENTERED", 4.1, 1.9);
        PECHSlist.InsertInOrderdistance("Asghar National Hospital", "NOT ENTERED", 3.2, 4.2);

        Graph PECHSgraph = new Graph(15);
        PECHSgraph.AddVertex(new vertex("Shehroz Medical Centre", "NOT ENTERED", 3.6, 5.8));//v0
        PECHSgraph.AddVertex(new vertex("Karim Clinic", "NOT ENTERED", 4.5, 3.7));//v1
        PECHSgraph.AddVertex(new vertex("Gupta Memorial Hospital", "NOT ENTERED", 3.8, 7.2)); //v2
        PECHSgraph.AddVertex(new vertex("Aisha's Dental Clinic", "NOT ENTERED", 4.1, 1.9)); //v3
        PECHSgraph.AddVertex(new vertex("Asghar National Hospital", "NOT ENTERED", 3.2, 4.2)); //v4

        PECHSgraph.AddEdge(PECHSgraph.AdjList.get(0), PECHSgraph.AdjList.get(1));
        PECHSgraph.AddEdge(PECHSgraph.AdjList.get(0), PECHSgraph.AdjList.get(3));
        PECHSgraph.AddEdge(PECHSgraph.AdjList.get(1), PECHSgraph.AdjList.get(1));
        PECHSgraph.AddEdge(PECHSgraph.AdjList.get(1), PECHSgraph.AdjList.get(2));
        PECHSgraph.AddEdge(PECHSgraph.AdjList.get(1), PECHSgraph.AdjList.get(4));
        PECHSgraph.AddEdge(PECHSgraph.AdjList.get(2), PECHSgraph.AdjList.get(3));
        PECHSgraph.AddEdge(PECHSgraph.AdjList.get(2), PECHSgraph.AdjList.get(1));
        PECHSgraph.AddEdge(PECHSgraph.AdjList.get(3), PECHSgraph.AdjList.get(4));
        PECHSgraph.AddEdge(PECHSgraph.AdjList.get(4), PECHSgraph.AdjList.get(2));
        PECHSgraph.AddEdge(PECHSgraph.AdjList.get(4), PECHSgraph.AdjList.get(3));

        arr.AddData("PECHS", PECHSlist, PECHSgraph);

        int x = area1.getSelectedIndex();
      
        if (x==1) {
          Node Temp = list.Head;
        while (Temp != null) {
           to.addItem(Temp.name);
           from.addItem(Temp.name);
            Temp = Temp.next;
        }
        }
        if (x==2) {
            Node Temp = PECHSlist.Head;
        while (Temp != null) {
           to.addItem(Temp.name);
           from.addItem(Temp.name);
           Temp = Temp.next;
        }
        }
    }//GEN-LAST:event_area1ActionPerformed

    private void toActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
List list = new List();
        list.InsertInOrderdistance("Patel Hospital", "ST-18, Block-4, Gulshan-e-Iqbal,Karachi - 75300, Pakistan.، Karachi, Pakistan", 3.6, 5.8);
        list.InsertInOrderdistance("Ibn-Sina Hospital", "St-22-B,, University Rd, Block 6, Gulshan-e-Iqbal, Sindh، Karachi, Pakistan", 3.8, 4.2);
        list.InsertInOrderdistance("Samdani Hospital", "a 560 block, Street No 5, Karachi, Pakistan", 2.3, 5.3);
        list.InsertInOrderdistance("AL Mustafa Medical", "ST-1 Block 13-C Gulshan-e-Iqbal، University Road، Karachi, Pakistan", 4.1, 17);
        list.InsertInOrderdistance("Haji Rang Elahi Hospital", "St 4B, Block-4, Gulshan E Iqbal, Karachi, Karachi, Pakistan", 4.6, 5.4);
        list.InsertInOrderdistance("NIBD Hospital", "Gulshan-e-Iqbal, Karachi, Pakistan", 4.2, 7.5);
        list.InsertInOrderdistance("T.O Clinic Hospital", "no, Street 1, Karachi, Pakistan", 3.1, 5.4);

        AreaArray arr = new AreaArray();

        Graph g = new Graph(6);
        g.AddVertex(new vertex("Patel Hospital", "ST-18, Block-4, Gulshan-e-Iqbal,Karachi - 75300, Pakistan.، Karachi, Pakistan", 3.6, 5.8)); // v0
        g.AddVertex(new vertex("Ibn-Sina Hospital", "St-22-B,, University Rd, Block 6, Gulshan-e-Iqbal, Sindh، Karachi, Pakistan", 3.8, 4.2)); // v1
        g.AddVertex(new vertex("Samdani Hospital", "a 560 block, Street No 5, Karachi, Pakistan", 2.3, 5.3)); // v2
        g.AddVertex(new vertex("AL Mustafa Medical", "ST-1 Block 13-C Gulshan-e-Iqbal، University Road، Karachi, Pakistan", 4.1, 17)); // v3
        g.AddVertex(new vertex("Haji Rang Elahi Hospital", "St 4B, Block-4, Gulshan E Iqbal, Karachi, Karachi, Pakistan", 4.6, 5.4)); // v4
        g.AddVertex(new vertex("NIBD Hospital", "Gulshan-e-Iqbal, Karachi, Pakistan", 4.2, 7.5));// v5
        g.AddVertex(new vertex("T.O Clinic Hospital", "no, Street 1, Karachi, Pakistan", 3.1, 5.4));// v5

        g.AddEdge(g.AdjList.get(0), g.AdjList.get(4));
        g.AddEdge(g.AdjList.get(0), g.AdjList.get(1));
        g.AddEdge(g.AdjList.get(0), g.AdjList.get(2));
        g.AddEdge(g.AdjList.get(2), g.AdjList.get(0));
        g.AddEdge(g.AdjList.get(2), g.AdjList.get(1));
        g.AddEdge(g.AdjList.get(1), g.AdjList.get(2));
        g.AddEdge(g.AdjList.get(1), g.AdjList.get(0));
        g.AddEdge(g.AdjList.get(2), g.AdjList.get(3));
        g.AddEdge(g.AdjList.get(3), g.AdjList.get(4));
        g.AddEdge(g.AdjList.get(4), g.AdjList.get(5));
        
        g.AddEdge(g.AdjList.get(4), g.AdjList.get(3));

        arr.AddData("Gulshan", list, g);

        List PECHSlist = new List();
        PECHSlist.InsertInOrderdistance("Shehroz Medical Centre", "NOT ENTERED", 3.6, 5.8);
        PECHSlist.InsertInOrderdistance("Karim Clinic", "NOT ENTERED", 4.5, 3.2);
        PECHSlist.InsertInOrderdistance("Gupta Memorial Hospital", "NOT ENTERED", 3.8, 7.2);
        PECHSlist.InsertInOrderdistance("Aisha's Dental Clinic", "NOT ENTERED", 4.1, 1.9);
        PECHSlist.InsertInOrderdistance("Asghar National Hospital", "NOT ENTERED", 3.2, 4.2);

        Graph PECHSgraph = new Graph(15);
        PECHSgraph.AddVertex(new vertex("Shehroz Medical Centre", "NOT ENTERED", 3.6, 5.8));//v0
        PECHSgraph.AddVertex(new vertex("Karim Clinic", "NOT ENTERED", 4.5, 3.7));//v1
        PECHSgraph.AddVertex(new vertex("Gupta Memorial Hospital", "NOT ENTERED", 3.8, 7.2)); //v2
        PECHSgraph.AddVertex(new vertex("Aisha's Dental Clinic", "NOT ENTERED", 4.1, 1.9)); //v3
        PECHSgraph.AddVertex(new vertex("Asghar National Hospital", "NOT ENTERED", 3.2, 4.2)); //v4

        PECHSgraph.AddEdge(PECHSgraph.AdjList.get(0), PECHSgraph.AdjList.get(1));
        PECHSgraph.AddEdge(PECHSgraph.AdjList.get(0), PECHSgraph.AdjList.get(3));
        PECHSgraph.AddEdge(PECHSgraph.AdjList.get(1), PECHSgraph.AdjList.get(1));
        PECHSgraph.AddEdge(PECHSgraph.AdjList.get(1), PECHSgraph.AdjList.get(2));
        PECHSgraph.AddEdge(PECHSgraph.AdjList.get(1), PECHSgraph.AdjList.get(4));
        PECHSgraph.AddEdge(PECHSgraph.AdjList.get(2), PECHSgraph.AdjList.get(3));
        PECHSgraph.AddEdge(PECHSgraph.AdjList.get(2), PECHSgraph.AdjList.get(1));
        PECHSgraph.AddEdge(PECHSgraph.AdjList.get(3), PECHSgraph.AdjList.get(4));
        PECHSgraph.AddEdge(PECHSgraph.AdjList.get(4), PECHSgraph.AdjList.get(2));
        PECHSgraph.AddEdge(PECHSgraph.AdjList.get(4), PECHSgraph.AdjList.get(3));

        arr.AddData("PECHS", PECHSlist, PECHSgraph);
        int ar = area1.getSelectedIndex();
int x = to.getSelectedIndex();
int y = from.getSelectedIndex();
        if (ar==1) {
            if (x==1) {
                
            }
   
            
            
        }
        if (ar==2) {
            
        }
        if (ar==3) {
            
        }
        if (ar==4) {
            
        }

    }//GEN-LAST:event_showActionPerformed

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
            java.util.logging.Logger.getLogger(PathFinder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PathFinder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PathFinder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PathFinder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PathFinder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Heading;
    private javax.swing.JComboBox<String> area1;
    private javax.swing.JComboBox<String> from;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea route;
    private javax.swing.JLabel selectarea;
    private javax.swing.JButton show;
    private javax.swing.JComboBox<String> to;
    // End of variables declaration//GEN-END:variables
}