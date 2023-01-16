package bookmall.vo;

public class Orders_BookVo {
	private Long no;
	private String book_title;
	private Integer cnt;
	private Long book_no;
	private Long oreders_no;
	private Integer bprice;
	
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	public Integer getCnt() {
		return cnt;
	}
	public void setCnt(Integer cnt) {
		this.cnt = cnt;
	}
	public Long getBook_no() {
		return book_no;
	}
	public void setBook_no(Long book_no) {
		this.book_no = book_no;
	}
	public Long getOreders_no() {
		return oreders_no;
	}
	public void setOreders_no(Long oreders_no) {
		this.oreders_no = oreders_no;
	}
	public Integer getBprice() {
		return bprice;
	}
	public void setBprice(Integer bprice) {
		this.bprice = bprice;
	}
	@Override
	public String toString() {
		return "Orders_BookVo [no=" + no + ", book_title=" + book_title + ", cnt=" + cnt + ", book_no=" + book_no
				+ ", oreders_no=" + oreders_no + ", bprice=" + bprice + "]";
	}
	
}
