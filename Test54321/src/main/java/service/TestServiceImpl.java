package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import service.TestVO;

import dataSource.DataSource;

public class TestServiceImpl implements TestService {

	private DataSource dao = DataSource.getInstance();
	private Connection conn;
//	private Connection conn = DataSource.getInstance().getConnection();
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private void close() {
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	@Override
	public void insertTest(TestVO test) {
		try {
			conn = dao.getConnection();
			String sql = "INSERT INTO test VALUES(?,?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, test.getNum());
			pstmt.setString(2, test.getTitle());
			pstmt.setString(3, test.getWriter());
			pstmt.setString(4, test.getContent());
			int result = pstmt.executeUpdate();
		
			if(result >0) {
				System.out.println("1건이 등록됐습니다.");
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
	}

	// 수정기능
	@Override
	public void updateTest(TestVO test) {
	
		
		
		
		
		try {
			conn = dao.getConnection();	
			String sql = "update test set content = ? where num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, test.getContent());
			pstmt.setString(2, test.getNum());
			int result = pstmt.executeUpdate();
			if(result >0) {
				System.out.println("1건이 수정되었습니다.");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
	}
	
	
	//삭제기능
	@Override
	public void deleteTest(String name) {
		int result = 0;
		
		try {
			conn = dao.getConnection();
			String sql = "DELETE FROM Test WHERE num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);  
			result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("1건이 삭제됏스빈다");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
	}
	
//전제조회기능
	@Override
	public List<TestVO> selectAllList() {
		List<TestVO> list = new ArrayList<TestVO>();
		try {
			conn = dao.getConnection();
			String sql = "select * from test";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {   //해당되는 정보를 가져오는것
				TestVO test = new TestVO();
				test.setNum(rs.getString("num"));
				test.setTitle(rs.getString("title"));
				test.setWriter(rs.getString("writer"));
				test.setContent(rs.getString("content"));
				
				list.add(test);
			}
			
		}catch(SQLException e){
			
		}finally {
			close();
		}
		
		return list;
		
		
	}

//단건 조회기능

	@Override
	public TestVO selectTestInfo(String name) {
		
		TestVO test = new TestVO();
		try {
			conn = dao.getConnection();
			String sql = "select * from test where num = ?";
			pstmt = conn.prepareStatement(sql);  // 
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while(rs.next()) {   //해당되는 정보를 가져오는것
				
				test.setNum(rs.getString("num"));
				test.setTitle(rs.getString("title"));
				test.setWriter(rs.getString("writer"));
				test.setContent(rs.getString("content"));
				
				
			}
			
		}catch(SQLException e){
			
		}finally {
			close();
		}
		
		return test;
	}

	
}
