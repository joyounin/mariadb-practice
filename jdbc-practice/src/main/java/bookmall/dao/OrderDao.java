package bookmall.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bookmall.vo.OrderVo;

public class OrderDao {

	public List<OrderVo> findAll() {
		List<OrderVo> result = new ArrayList<>();
	
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			
			String sql = 
					  "  select a.no, a.order_no, a.order_name, a.order_email, b.title, d.cnt , a.price * d.cnt, a.receive, a.user_no"
					  + "  from orders a, book b, user c, cart d"
					  + " where a.no = b.no"
					  + "   and c.no = a.no"
					  + "   and d.no = a.no";
			
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();
			while(rs.next()) {
				OrderVo vo = new OrderVo();
				vo.setNo(rs.getLong(1));
				vo.setOrder_no(rs.getString(2));
				vo.setOrder_name(rs.getString(3));
				vo.setOrder_email(rs.getString(4));
				vo.setBtitle(rs.getString(5));
				vo.setCount(rs.getInt(6));
				vo.setPrice(rs.getInt(7));
				vo.setReceive(rs.getString(8));
				vo.setUserno(rs.getLong(9));
	
				result.add(vo);
			}
			
		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				
				if(pstmt != null) {
					pstmt.close();
				}
				
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

	public void insert(OrderVo vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = getConnection();
			
			String sql = "insert into orders values(no, ?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getOrder_no());
			pstmt.setString(2, vo.getOrder_name());
			pstmt.setString(3, vo.getOrder_email());
			pstmt.setInt(4, vo.getPrice());
			pstmt.setString(5, vo.getReceive());
			pstmt.setLong(6, vo.getUserno());
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				if(pstmt != null) {
					pstmt.close();
				}
				
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	
	private Connection getConnection() throws SQLException {
		Connection conn = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			String url = "jdbc:mariadb://192.168.10.107:3307/bookmall?charset=utf8";
			conn = DriverManager.getConnection(url, "bookmall", "bookmall");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패:" + e);
		}
		
		return conn;

	}

}
