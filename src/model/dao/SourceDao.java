package model.dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.bean.Source;
import utils.ConnectionProvider;

public class SourceDao {
	private Connection connection;
	private ResultSet rs;
	private Statement st;
	private PreparedStatement pst;

	public SourceDao() {
		connection = ConnectionProvider.getConnection();
	}

	public List<Source> getAll() {
		List<Source> sources = new ArrayList<Source>();
		String query = "select * from source";
		try {
			st = connection.createStatement();
			rs = st.executeQuery(query);
			while (rs.next()) {
				Source source = new Source(rs.getString("filename"), rs.getString("username"));
				System.out.println(source);
				sources.add(source);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return sources;
	}

	public boolean save(String filename,InputStream is) {
		try {
			pst = connection.prepareStatement("insert into source(filename,pdf_text,username) values(?,?,'giabao')");
			pst.setString(1, filename);
			pst.setBlob(2, is);
			int affectesRows = pst.executeUpdate();
			System.out.println("Inserting Successfully!");
			return affectesRows > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

}
