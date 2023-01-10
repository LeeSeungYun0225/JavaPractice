package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			// 문자열로 주어진 클래스를  Build Path에서 찾아 메모리로 로딩하는 기능을 수행 //
			// 예외가 발생하지 않으면 클래스를 잘 찾아오고 있는것 // 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			
			String url = "jdbc:mysql://localhost:3306/dbmstest";
			String id = "root";
			String pass = "!Ekdma0607";
			// DB Connection
			// 매개값 :: jdbc::사용dbms://ip주소:포트넘버/데이터베이스이름, db id, db 패스워드 
			// getConnection 메소드는 Connection 구현객체 리턴 
			Connection conn = DriverManager.getConnection(url, id, pass);
			System.out.println("데이터베이스와 연결되었습니다.");
			
			
			
			
			// db에 데이터 삽입 // 
//			String sql = "INSERT INTO java VALUES(null,?,?)";
//			
//			PreparedStatement statement = conn.prepareStatement(sql);
//			statement.setString(1, "김개똥");
//			statement.setString(2, "1234567");
//			
//			int rows = statement.executeUpdate();
//			System.out.println(rows + "개의 데이터가 삽입되었습니다");
//			
//			
//			
//			// db에 데이터 삽입하고 삽입한 데이터의 특정 칼럼 가져오기 // 
//			statement = conn.prepareStatement(sql,new String[] {"id"});
//			statement.setString(1, "가져와");
//			statement.setString(2, "비밀번호");
//			
//			rows = statement.executeUpdate();
//			ResultSet rs = statement.getGeneratedKeys();
//			if(rs.next()) {
//				int i = rs.getInt(1);
//				System.out.println("저장된 번호 : " + i);
//			}
//			
			
//			// 데이터 수정하기 // 
//			String sql = "UPDATE java "
//					+ "SET name = ?, "
//					+ "password = ? "
//					+ "WHERE id = ?";
//			
//			PreparedStatement statement = conn.prepareStatement(sql);
//			statement.setString(1, "김규동");
//			statement.setString(2, "비밀번호규동이");
//			statement.setInt(3, 1);
//			int rows= statement.executeUpdate();
			
			
//			//데이터 삭제하기 //
//			String sql = "DELETE FROM java WHERE id > 5";
//			
//			PreparedStatement statement = conn.prepareStatement(sql);
//			
//			int rows = statement.executeUpdate();
//			System.out.println(rows +  "개의 행 삭제 됨");
			
//			String sql = "SELECT name FROM java WHERE id < 5";
//			PreparedStatement statement = conn.prepareStatement(sql);
//			
//			ResultSet rs = statement.executeQuery();
//			
//			while(rs.next())
//			{
//				System.out.println(rs.getString(1)); // 매개값 1은 첫번째 칼럼을 의미 
//			}
//			
//			rs.close();
			
//			// 프로시저 호출 // 
//			Scanner scan = new Scanner(System.in);
//			System.out.print("이름 입력 : " );
//			
//			String user_id = scan.nextLine();
//			
//			System.out.print("패스워드 입력 : " );
//			String user_pass = scan.nextLine();
//			
//			String sql = "{call USER_CREATE(?,?)}";
//			CallableStatement cs = (CallableStatement) conn.prepareCall(sql);
//			cs.setString(1, user_id);
//			cs.setString(2, user_pass);
//			
//			
//			cs.execute();
//			System.out.println("프로시저 호출 완료");
//			cs.close();
			
			
			// 트랜잭션 처리 ///
			
			String sql = "UPDATE java SET id = id+1000";
			String sql2 = "UPDATE java SET password = 0000";
			
			
			
			try {
				conn.setAutoCommit(false);
				PreparedStatement statement = conn.prepareStatement(sql);
				statement.executeUpdate();
				
				statement = conn.prepareStatement(sql2);
				statement.executeUpdate();
				
				System.out.println("커밋됨");
				conn.commit();
			}catch(Exception e)
			{
				
				conn.rollback();
			}
			finally {
				conn.setAutoCommit(true);
			}
			
			
			
			
			// DB 연결 끊기 
			conn.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
