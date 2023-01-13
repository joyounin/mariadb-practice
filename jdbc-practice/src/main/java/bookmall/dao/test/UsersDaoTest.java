package bookmall.dao.test;

import java.util.List;

import bookmall.dao.UsersDao;
import bookmall.vo.UsersVo;

public class UsersDaoTest {

	public static void main(String[] args) {
		testInsert();
		testFindAll();
	}

	private static void testInsert() {
		UsersVo vo = null;
		UsersDao dao = new UsersDao();
		
		vo = new UsersVo();
		vo.setName("둘리");
		vo.setPhone_number("010-1111-2222");
		vo.setEmail("msh372@daum.net");
		vo.setPwd("1234");
		dao.insert(vo);
		
		vo = new UsersVo();
		vo.setName("또치");
		vo.setPhone_number("010-1234-5678");
		vo.setEmail("msh1401@gmail.com");
		vo.setPwd("12345678");
		dao.insert(vo);
		
	}
	
	private static void testFindAll() {
		List<UsersVo> list = new UsersDao().findAll();
		for (UsersVo vo : list) {
			System.out.println(vo);	
		}
	}

}
