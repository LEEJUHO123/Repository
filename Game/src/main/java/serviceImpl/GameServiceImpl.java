package serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Service.GameService;
import Start.Login;
import VO.CharacterVO;
import co.yee.Game.dao.DataSource;




public class GameServiceImpl implements GameService{
	
	DataSource dao = DataSource.getInstance();
	private DataSource dataSource = DataSource.getInstance(); //Dao instance 생성
	private Connection conn = dataSource.getConnection(); //connection 
	private PreparedStatement psmt; //sql 명령 실행
	private ResultSet rs; //select 결과를 담음
	CharacterVO vo;
	
	//캐릭생성
	
	@Override
	public int insertChar(String name) {
		int n = 0;
		String sql = "insert into character values(?, ?, default, default, default, default, default, default, default, default)";
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, Login.loginMember.getId());
			psmt.setString(2, name);
			n = psmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return n;
	}

	//닉네임 중복
	@Override
	public String nameCheck(String name) {
		String checkName = null;
		String sql = "select name from character where id = ?";
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			rs=psmt.executeQuery();
			if(rs.next()) {
				checkName = rs.getString("name");
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
		return checkName;
	}

	//현재상태보기
	@Override
	public CharacterVO selectChar(String name) {
		CharacterVO character = new CharacterVO();
		
		try {
			conn = dao.getConnection();
			String sql = "select * from character where name = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			rs = psmt.executeQuery();
			if(rs.next()) {
				
				character.setName(rs.getString("name"));
				character.setHp(rs.getDouble("HP"));
				character.setMaxHp(rs.getDouble("MaxHP"));
				character.setStrength(rs.getDouble("strength"));
				character.setDefense(rs.getDouble("defence"));
				character.setMoney(rs.getInt("money"));
				character.setExp(rs.getInt("exp"));
				character.setLev(rs.getInt("lev"));
				character.setDefaultAttackName(rs.getString("defaultAttackName"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
		return character;
	}
	
	
	
	
	private void close() {
		//연결순서 : conn > psmt > rs
		//닫는순서 : rs > psmt > conn
		try {
			if(rs != null) rs.close();
			if(psmt != null) psmt.close();
			if(conn != null) conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	
	
}
