package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.DBUtil;
public class GeographicAreaDAO {


	private DBUtil dbUtil;

	public GeographicAreaDAO() {
		this.dbUtil = new DBUtil();
	}


	public List<GeographicArea> getAllGeographicAreas() throws ClassNotFoundException, SQLException{
		List<GeographicArea> geographicAreas = new ArrayList<>();
		String sql = "SELECT geographicAreaID, code, level, name, alternativeCode FROM geographicarea";

		try (Connection conn = DBUtil.getConnection();
	             PreparedStatement statement = conn.prepareStatement(sql);
	             ResultSet resultSet = statement.executeQuery()) {

	            while (resultSet.next()) {
	                GeographicArea geographicArea = new GeographicArea();
	                geographicArea.setGeographicAreaID(resultSet.getInt("geographicAreaID"));
	                geographicArea.setCode(resultSet.getInt("code"));
	                geographicArea.setLevel(resultSet.getInt("level"));
	                geographicArea.setName(resultSet.getString("name"));
	                geographicArea.setAlternativeCode(resultSet.getInt("alternativeCode"));
	                geographicAreas.add(geographicArea);
	            }
	        }
	        return geographicAreas;
	}
}
