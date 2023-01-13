package bookmall.vo;

public class BookVo {
	private Long no;
	private Long cno;
	private String title;
	private Integer price;
	private String cname;
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public Long getCno() {
		return cno;
	}
	public void setCno(Long cno) {
		this.cno = cno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "BookVo [no=" + no + ", cno=" + cno + ", title=" + title + ", price=" + price + ", cname=" + cname + "]";
	}
	
	
}
