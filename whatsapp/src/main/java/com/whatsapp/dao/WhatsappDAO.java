package com.whatsapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.whatsapp.entity.WhatsappUser;

public class WhatsappDAO implements WhatsappDAOInterface {

	public int createProfileDAO(WhatsappUser wu) {
		int i=0;
		try {
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		Connection con=DriverManager.getConnection("jdbc:derby:c:/db/Dldb","","");
		PreparedStatement ps=con.prepareStatement("insert into facebookuser values(?,?,?,?)");
		ps.setString(1, wu.getName());
		ps.setString(2, wu.getPassword());
		ps.setString(3, wu.getEmail());
		ps.setString(4, wu.getAddress());
		
		i=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

}
