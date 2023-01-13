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
		displayusersInfo();
		
		System.out.println("## 카테고리");
		displaycategoryInfo();
		
		System.out.println("## 상품리스트");
		displaybookInfo();
		
		System.out.println("## 카트");
		displaycartInfo();
		
		System.out.println("## 주문 리스트");
		displayorderInfo();
		
		System.out.println("## 주문 도서 리스트");
		displayorder_bookInfo();
		
		
	}
	private static void displaycategoryInfo() {
		List<CategoryVo> list = new CategoryDao().findAll();
		for(CategoryVo vo : list) {
			System.out.println(vo.getNo() + "." + " 카테고리 리스트: " + vo.getCategory_name());
		}
	}
	
	private static void displayusersInfo() {
		List<UsersVo> list = new UsersDao().findAll();
		for(UsersVo vo : list) {
			System.out.println(vo.getNo() + "." + " 이름: " + vo.getName() + 
					" 번호: " + vo.getPhone_number() + " email: " + vo.getEmail()
					+ " 비밀번호: " + vo.getPwd());
		}
	}
	private static void displaybookInfo() {
		List<BookVo> list = new BookDao().findAll();
		for(BookVo vo : list) {
			System.out.println(vo.getNo() + "." + " 카테고리: " + vo.getCname() +" 책 이름: " + vo.getTitle() + " 가격: " + vo.getPrice());
		}
	}
	private static void displaycartInfo() {
		List<CartVo> list = new CartDao().findAll();
		for(CartVo vo : list) {
			System.out.println(vo.getNo() + "." + " 카트에 넣은 책: " + vo.getTitle() + " 수량:" + vo.getCnt() + " 가격: " + vo.getCprice());
		}
	}
	private static void displayorderInfo() {
		List<OrderVo> list = new OrderDao().findAll();
		for(OrderVo vo : list) {
			System.out.println(vo.getNo() + "." + " 주문번호: " + vo.getOrder_no() + " 주문자 이름:" + vo.getOrder_name() 
			                   + " 주문자 이름: " + vo.getOrder_name() +" 책 이름: " + vo.getBtitle() + " 수량: " + vo.getCount() +" 가격: " + vo.getPrice() + " 주소: " + vo.getReceive());
		}
	}private static void displayorder_bookInfo() {
		List<Orders_BookVo> list = new Orders_BookDao().findAll();
		for(Orders_BookVo vo : list) {
			System.out.println(vo.getNo() + "." + " 도서번호 : " + vo.getBook_no() + " 도서제목: " + vo.getBook_title() + " 수량: " + vo.getCnt());
		}
	}

}
