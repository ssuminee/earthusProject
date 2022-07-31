package com.us.order.model.service;

import static com.us.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import com.us.order.model.dao.OrderDao;
import com.us.order.model.vo.Order;

public class OrderService {
	
	// 주문내역 조회
	public ArrayList<Order> selectOrderList(int userNo){
		Connection conn = getConnection();
		ArrayList<Order> list = new OrderDao().selectOrderList(conn, userNo);
		close(conn);
		return list;
	}
}
