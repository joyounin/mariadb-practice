package bookmall.vo;

public class OrderVo {
	private Long no;
	private String order_no;
	private String order_name;
	private String order_email;
	private Integer price;
	private String receive;
	private Long userno;
	private String btitle;
	private Integer count;
	
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getOrder_no() {
		return order_no;
	}
	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}
	public String getOrder_name() {
		return order_name;
	}
	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}
	public String getOrder_email() {
		return order_email;
	}
	public void setOrder_email(String order_email) {
		this.order_email = order_email;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getReceive() {
		return receive;
	}
	public void setReceive(String receive) {
		this.receive = receive;
	}
	public Long getUserno() {
		return userno;
	}
	public void setUserno(Long userno) {
		this.userno = userno;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "OrderVo [no=" + no + ", order_no=" + order_no + ", order_name=" + order_name + ", order_email="
				+ order_email + ", price=" + price + ", receive=" + receive + ", userno=" + userno + ", btitle="
				+ btitle + ", count=" + count + "]";
	}
	
	
}
