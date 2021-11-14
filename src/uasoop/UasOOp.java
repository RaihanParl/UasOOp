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
public class UasOOp {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		// TODO add your handling code here:
		System.out.println("hallo");
		Connect conn = new Connect();
		ResultSet rs = conn.executeQuery("select * from mattress;");
		try {
			while (rs.next()) {
				String id = rs.getString("ID");
				System.out.println(id + " ini adalah idnya");
			}
		} catch (Exception e) {
			System.out.println("" + e);
		}

	}
	
}
