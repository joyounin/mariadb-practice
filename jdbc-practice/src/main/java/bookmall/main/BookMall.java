package bookmall.main;

import java.util.List;

import bookmall.dao.BookDao;
import bookmall.dao.CartDao;
import bookmall.dao.CategoryDao;
import bookmall.dao.OrderDao;
import bookmall.dao.Orders_BookDao;
import bookmall.dao.UsersDao;
import bookmall.vo.BookVo;
import bookmall.vo.CartVo;
import bookmall.vo.CategoryVo;
import bookmall.vo.OrderVo;
import bookmall.vo.Orders_BookVo;
import bookmall.vo.UsersVo;

public class BookMall {

	public static void main(String[] args) {
		
		System.out.println("## 회원리스트");
		UserInsert();
		displayusersInfo();
		
		System.out.println("## 카테고리");
		CategoryInsert();
		displaycategoryInfo();
		
		System.out.println("## 상품리스트");
		BookInsert();
		displaybookInfo();
		
		System.out.println("## 카트");
		CartInsert();
		displaycartInfo();
		
		System.out.println("## 주문 리스트");
		OrderInsert();
		displayorderInfo();
		
		System.out.println("## 주문 도서 리스트");
		Order_BookInsert();
		displayorder_bookInfo();
		
		
	}
	private static void UserInsert() {
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
	
	private static void displayusersInfo() {
		List<UsersVo> list = new UsersDao().findAll();
		for(UsersVo vo : list) {
			System.out.println(vo.getNo() + "." + " 이름: " + vo.getName() + 
					" 번호: " + vo.getPhone_number() + " email: " + vo.getEmail()
					+ " 비밀번호: " + vo.getPwd());
		}
	}
	private static void CategoryInsert() {
		CategoryVo vo = null;
		CategoryDao dao = new CategoryDao();
		
		vo = new CategoryVo();
		vo.setCategory_name("인문");
		dao.insert(vo);
		
		vo = new CategoryVo();
		vo.setCategory_name("소설");
		dao.insert(vo);
		
		vo = new CategoryVo();
		vo.setCategory_name("수필");
		dao.insert(vo);
	}
	
	private static void displaycategoryInfo() {
		List<CategoryVo> list = new CategoryDao().findAll();
		for(CategoryVo vo : list) {
			System.out.println(vo.getNo() + "." + " 카테고리 리스트: " + vo.getCategory_name());
		}
	}
	
	private static void BookInsert() {
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
	private static void displaybookInfo() {
		List<BookVo> list = new BookDao().findAll();
		for(BookVo vo : list) {
			System.out.println(vo.getNo() + "." + " 카테고리: " + vo.getCname() +" 책 이름: " + vo.getTitle() + " 가격: " + vo.getPrice());
		}
	}
	
	private static void CartInsert() {
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
	private static void displaycartInfo() {
		List<CartVo> list = new CartDao().findAll();
		for(CartVo vo : list) {
			System.out.println(vo.getNo() + "." + " 카트에 넣은 책: " + vo.getTitle() + " 수량:" + vo.getCnt() + " 가격: " + vo.getCprice());
		}
	}
	
	private static void OrderInsert() {
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
	private static void displayorderInfo() {
		List<OrderVo> list = new OrderDao().findAll();
		for(OrderVo vo : list) {
			System.out.println(vo.getNo() + "." + " 주문번호: " + vo.getOrder_no() + " 주문자 이름:" + vo.getOrder_name() 
			                   + " 주문자 이름: " + vo.getOrder_name() +" 책 이름: " + vo.getBtitle() + " 수량: " + vo.getCount() +" 가격: " + vo.getPrice() + " 주소: " + vo.getReceive());
		}
	}
	private static void Order_BookInsert() {
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
	private static void displayorder_bookInfo() {
		List<Orders_BookVo> list = new Orders_BookDao().findAll();
		for(Orders_BookVo vo : list) {
			System.out.println(vo.getNo() + "." + " 도서번호 : " + vo.getBook_no() + " 도서제목: " + vo.getBook_title() + " 수량: " + vo.getCnt());
		}
	}

}
