package bookmall.dao.test;

import java.util.List;

import bookmall.dao.BookDao;
import bookmall.vo.BookVo;

public class BookDaoTest {

	public static void main(String[] args) {
		testInsert();
		testFindAll();
	}

	private static void testInsert() {
		BookVo vo = null;
		BookDao dao = new BookDao();
		
		vo = new BookVo();
		vo.setTitle("트렌드 코리아23");
		vo.setPrice(17000);
		vo.setCno(1L);
		dao.insert(vo);
		
		vo = new BookVo();
		vo.setTitle("불편한 편의점");
		vo.setPrice(12000);
		vo.setCno(2L);
		dao.insert(vo);
		
		vo = new BookVo();
		vo.setTitle("하얼빈");
		vo.setPrice(14400);
		vo.setCno(3L);
		dao.insert(vo);
		
	}
	
	private static void testFindAll() {
		List<BookVo> list = new BookDao().findAll();
		for (BookVo vo : list) {
			System.out.println(vo);
		
		}
	}
}
