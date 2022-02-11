package com.whatsapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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

	public List<WhatsappUser> viewAllProfileDAO() {
		List<WhatsappUser> ll=new ArrayList<WhatsappUser>();
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			Connection con=DriverManager.getConnection("jdbc:derby:c:/db/Dldb","","");
			PreparedStatement ps=con.prepareStatement("select * from facebookuser");
						
			ResultSet res=ps.executeQuery();
			
			while(res.next()) {
				String n1=res.getString(1);
				String n2=res.getString(2);
				String n3=res.getString(3);
				String n4=res.getString(4);
				
				WhatsappUser w=new WhatsappUser();
				w.setName(n1);
				w.setPassword(n2);
				w.setEmail(n3);
				w.setAddress(n4);
				
				ll.add(w);
				
			}
			
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		return ll;
	}

	public WhatsappUser viewProfileDAO(WhatsappUser ws) {
		WhatsappUser w=null;
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			Connection con=DriverManager.getConnection("jdbc:derby:c:/db/Dldb","","");
			PreparedStatement ps=con.prepareStatement("select * from facebookuser where name=?");
			ps.setString(1, ws.getName());
						
			ResultSet res=ps.executeQuery();
			
			while(res.next()) {
				String n1=res.getString(1);
				String n2=res.getString(2);
				String n3=res.getString(3);
				String n4=res.getString(4);
				
				w=new WhatsappUser();
				w.setName(n1);
				w.setPassword(n2);
				w.setEmail(n3);
				w.setAddress(n4);
				
				
			}
			
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		return w;
	}

	public int deleteProfileDAO(WhatsappUser wu) {
		int i=0;
		try {
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		Connection con=DriverManager.getConnection("jdbc:derby:c:/db/Dldb","","");
		PreparedStatement ps=con.prepareStatement("delete from facebookuser where name=?");
		ps.setString(1, wu.getName());
		
		
		i=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

}








