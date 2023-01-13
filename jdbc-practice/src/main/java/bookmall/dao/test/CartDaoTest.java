package bookmall.dao.test;

import java.util.List;

import bookmall.dao.BookDao;
import bookmall.dao.CartDao;
import bookmall.vo.BookVo;
import bookmall.vo.CartVo;



public class CartDaoTest {

	public static void main(String[] args) {
		testInsert();
		testFindAll();
	}

	private static void testInsert() {
		CartVo vo = null;
		CartDao dao = new CartDao();
		
		vo = new CartVo();
		vo.setTitle("트렌드 코리아23");
		vo.setCnt(2);
		vo.setUserno(1L);
		vo.setBookno(1L);
		dao.insert(vo);
		
		vo.setTitle("불편한 편의점");
		vo.setCnt(1);
		vo.setUserno(2L);
		vo.setBookno(2L);
		dao.insert(vo);
	}
	
	private static void testFindAll() {
		List<CartVo> list = new CartDao().findAll();
		for (CartVo vo : list) {
			System.out.println(vo);	
		}
	}
}
