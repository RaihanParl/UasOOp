/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uasoop;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author curut
 */
public class PanelGakKepake extends javax.swing.JPanel {

	/**
	 * Creates new form ShowDataPanel
	 */
	public PanelGakKepake() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jScrollPane1 = new javax.swing.JScrollPane();
                showDataTable = new javax.swing.JTable();
                showDatabtn = new javax.swing.JButton();

                showDataTable.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "ID", "BuyerName", "MatressType", "MatressFeel", "Size", "Qty", "TotalPrice"
                        }
                ));
                jScrollPane1.setViewportView(showDataTable);

                showDatabtn.setText("Show Data");
                showDatabtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                showDatabtnActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(211, 211, 211)
                                                .addComponent(showDatabtn)))
                                .addContainerGap(52, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(showDatabtn)
                                .addContainerGap(60, Short.MAX_VALUE))
                );
        }// </editor-fold>//GEN-END:initComponents

        private void showDatabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDatabtnActionPerformed
                // TODO add your handling code here:
		System.out.println("hallo");
		Connect conn = new Connect();
		ResultSet rs = conn.executeQuery("select * from mattress;");
		try{
			while(rs.next()){
				String id = rs.getString("ID");
				String buyerName= rs.getString("BuyerName");
				String matressType= rs.getString("MatressType");
				String matressFeel= rs.getString("MatressFeel");
				String size= rs.getString("size");
				String qty= String.valueOf(rs.getString("Qty"));
				String totalPrice= String.valueOf(rs.getString("TotalPrice"));
				String tableData[] = {id, buyerName, matressType, matressFeel, size, qty, totalPrice};
				DefaultTableModel tableModel= (DefaultTableModel)showDataTable.getModel();
				tableModel.addRow(tableData);
			}
		}catch(Exception e){
			System.out.println("" + e); 
		}




        }//GEN-LAST:event_showDatabtnActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTable showDataTable;
        private javax.swing.JButton showDatabtn;
        // End of variables declaration//GEN-END:variables
}