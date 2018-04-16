package com.rannn.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * JDBC使用示例
 * 
 * @author 哓哓
 *
 */
public class TestJDBCToMySQL {
	public static void main(String[] args) throws Exception {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		// JDBC Url
		String url = "jdbc:mysql://localhost:3306/tinymooc";

		String user = "root";
		String password = "root";

		try {
			// 加载MySQL驱动
			Class.forName("com.mysql.jdbc.Driver");
			// 获取数据库连接
			conn = DriverManager.getConnection(url, user, password);
			// 定义查询SQL语句
			String sql = "select * from user";
			// 创建PreparedStatement对象
			ps = conn.prepareStatement(sql);
			// 执行查询并获取结果集
			rs = ps.executeQuery();

			// 遍历结果集
			while (rs.next()) {
				System.out.println(rs.getString("userName") + " "+ rs.getInt("password"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 关闭连接 释放资源
			if (null != rs) {
				rs.close();
			}
			if (null != ps) {
				ps.close();
			}
			if (null != conn) {
				conn.close();
			}
		}
	}
}