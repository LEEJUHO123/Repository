package serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;


import Service.RingService;
import Start.Login;
import VO.CharacterVO;
import co.yee.Game.dao.DataSource;

public class RingServiceImpl implements RingService{
	DataSource dao = DataSource.getInstance();
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	
	
	
	@Override
	public int attack(CharacterVO character) {
		
		 int n = 0;
		 	
		  String sql = "select * from character where id = ?";
		 	try {
	        	conn = dao.getConnection();
	        	psmt = conn.prepareStatement(sql);
	        	psmt.setString(1, Login.loginMember.getId());
	        	rs = psmt.executeQuery();
	        	while(rs.next()) {
	        		character.setStrength(rs.getDouble("strength"));
	        		character.setDefense(rs.getDouble("defense"));
	        		character.setHp(rs.getDouble("hp"));
	        	}
	        	}catch(SQLException e) {
	        		e.printStackTrace();
	        	}finally {
	        		close();
	        		
	        	}
				return n;
			}
	
		
		
	        			
	private void close() {
		try {
			if(rs != null) rs.close();
			if(psmt != null) psmt.close();
			if(conn != null) conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}



//공격력 증가(지건연습)
	@Override
	public void increStrength(CharacterVO strength) {
		
		String sql = "update character set strength = strength + 10 where id = ? and name = ?";
				try {
					conn = dao.getConnection();
					psmt = conn.prepareStatement(sql);
					psmt.setString(1, Login.loginMember.getId());
					psmt.setString(2, Login.loginCharacter.getName());
					int result = psmt.executeUpdate();
				}catch(SQLException e) {
					e.printStackTrace();
				}finally {
					close();
				}
		
	}

	

//방어력증가(텟카이)

	@Override
	public void increDefense(CharacterVO defense) {
		String sql = "update character set defense = defense + 10 where id = ? and name = ?";
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, Login.loginMember.getId());
			psmt.setString(2, Login.loginCharacter.getName());
			int result = psmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
	
	}
	




	//캐릭터 상태창
	@Override
	public CharacterVO characterSelect(String id) {
		CharacterVO character = new CharacterVO();
		String sql = "select * from character where id = ?";
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			if(rs.next()) {
				character.setId(id);
				character.setName(rs.getString("name"));
				character.setHp(rs.getDouble("hp"));
				character.setMaxHp(rs.getDouble("maxhp"));
				character.setStrength(rs.getDouble("strength"));
				character.setDefense(rs.getDouble("defense"));
				character.setMoney(rs.getInt("money"));
				character.setExp(rs.getInt("exp"));
				character.setLev(rs.getInt("lev"));
				character.setDefaultAttackName(rs.getString("defaultAttackName"));
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
		return character;
	}



//살크업(생명력)
	@Override
	public void increHp(CharacterVO hp) {
		String sql = "update character set hp = hp + 100 ,maxhp = maxhp + 100 where id = ? and name = ?";
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, Login.loginMember.getId());
			psmt.setString(2, Login.loginCharacter.getName());
			int result = psmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
	}








	
	
}
