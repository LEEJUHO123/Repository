package serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Service.MemberService;
import VO.MemberVO;
import co.yee.Game.dao.DataSource;

public class MemberServiceImpl implements MemberService{

	//데이터소스 객체 연결
	DataSource dao = DataSource.getInstance();
	//커넥션 연결
	private Connection conn;
	//sql문 실행 시키기 위함
	private PreparedStatement psmt;
	//sql문이 select일때 결과 받기 위함
	private ResultSet rs;
	
	
	
	//회원가입
	@Override
	public int insertMember(MemberVO member) {
		String sql = "insert into member values(?,?,?)";
		int n = 0;
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, member.getId());
			psmt.setString(2, member.getPw());
			psmt.setString(3, member.getName());
			n = psmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return n;
	}

	@Override
	//전체조회
	public List<MemberVO> selectListMember() {
		List<MemberVO> list = new ArrayList<MemberVO>();
		MemberVO vo;
		String sql = "select * from member";
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				vo = new MemberVO();
				vo.setId(rs.getString("id"));
				vo.setPw(rs.getString("pw"));
				vo.setName(rs.getString("name"));
				list.add(vo);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return list;
	}

	@Override
	//중복체크
	public String[] check(String id) {
		String[] checkIdPw = new String[2];
		String sql = "select id, pw from member where id = ?";
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			if(rs.next()) {
				checkIdPw[0] = rs.getString("id");
				checkIdPw[1] = rs.getString("pw");
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return checkIdPw;
	}

	@Override
	public MemberVO selectMember(String id) {
		//로그인된 ID정보 넘기기
		MemberVO vo = new MemberVO();
		String sql = "select * from member where id = ?";
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, "id");
			rs = psmt.executeQuery();
			if(rs.next()) {
				vo.setId(rs.getString("id"));;
				vo.setPw(rs.getString("pw"));
				vo.setName(rs.getString("name"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
		return vo;
	}

	@Override
	public int updateMember(MemberVO member) {
		String sql = "update member set pw = ?, name = ? where id = ?";
		int n = 0;
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, member.getPw());
			psmt.setString(2, member.getName());
			psmt.setString(3, member.getId());
			n = psmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return n;
	}

	

	@Override
	public int deleteMember(MemberVO member) {
		String sql = "DELETE FROM member WHERE ID = ?";
		int n = 0;
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, member.getId());
			n = psmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return n;
	}
	
	private void close() {
		// 연결 순서 : conn > psmt > rs
		// 닫는 순서 : rs > psmt > conn
		try {
			if(rs != null) rs.close();
			if(psmt != null) psmt.close();
			if(conn != null) conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}


	

}
