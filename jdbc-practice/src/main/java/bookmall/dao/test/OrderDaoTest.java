package bookmall.dao.test;

import java.util.List;

import bookmall.dao.OrderDao;
import bookmall.vo.OrderVo;

public class OrderDaoTest {

	public static void main(String[] args) {
		testInsert();
		testFindAll();
	}

	private static void testInsert() {
		OrderVo vo = null;
		OrderDao dao = new OrderDao();
		
		vo = new OrderVo();
		vo.setOrder_no("20230113-00001");
		vo.setOrder_name("둘리");
		vo.setOrder_email("msh372@daum.net");
		vo.setPrice(17000);
		vo.setReceive("부산광역시 남구");
		vo.setUserno(1L);
		dao.insert(vo);
		
	}
	
	private static void testFindAll() {
		List<OrderVo> list = new OrderDao().findAll();
		for (OrderVo vo : list) {
			System.out.println(vo);	
		}
	}
}
