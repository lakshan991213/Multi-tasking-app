/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Sithum Jayasekara
 */

public class dbconnect {
	
	//this is used to connect this application with the mysql database.
	
	public static Connection connect() {
		Connection conn = null;
		
		try {
            Class.forName("com.mysql.jdbc.Driver");					//this is the code to make the connection with the database.
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/itproject","root", "");
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,
            		  "You are not connected to the server"
            		+ "\n"
            		+ "\n- Start xampp server"
            		+ "\n- Add the relevent dabase to mysql"
            		+ "\n- Close the app and open it again "
            		+ "\n");
        }
		return conn;
	}
}
