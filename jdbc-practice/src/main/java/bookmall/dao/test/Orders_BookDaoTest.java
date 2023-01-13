package bookmall.dao.test;

import java.util.List;

import bookmall.dao.Orders_BookDao;
import bookmall.vo.Orders_BookVo;

public class Orders_BookDaoTest {

	public static void main(String[] args) {
		testInsert();
		testFindAll();
	}
	private static void testInsert() {
		Orders_BookVo vo = null;
		Orders_BookDao dao = new Orders_BookDao();
		
		vo = new Orders_BookVo();
		vo.setBook_title("트렌드 코리아23");
		vo.setCnt(1);
		vo.setBook_no(1L);
		vo.setOreders_no(1L);
		dao.insert(vo);
		
		vo = new Orders_BookVo();
		vo.setBook_title("불편한 편의점");
		vo.setCnt(2);
		vo.setBook_no(2L);
		vo.setOreders_no(1L);
		dao.insert(vo);
		
	}
	
	private static void testFindAll() {
		List<Orders_BookVo> list = new Orders_BookDao().findAll();
		for (Orders_BookVo vo : list) {
			System.out.println(vo);	
		}
	}

}
