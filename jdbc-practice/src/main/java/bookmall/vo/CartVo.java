package bookmall.vo;

public class CartVo {
	private Long no;
	private String title;
	private Integer cnt;
	private Long bookno;
	private Long userno;
	private Integer cprice;
	
	public Long getBookno() {
		return bookno;
	}
	public void setBookno(Long bookno) {
		this.bookno = bookno;
	}
	public Long getUserno() {
		return userno;
	}
	public void setUserno(Long userno) {
		this.userno = userno;
	}
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getCnt() {
		return cnt;
	}
	public void setCnt(Integer cnt) {
		this.cnt = cnt;
	}
	public Integer getCprice() {
		return cprice;
	}
	public void setCprice(Integer cprice) {
		this.cprice = cprice;
	}
	@Override
	public String toString() {
		return "CartVo [no=" + no + ", title=" + title + ", cnt=" + cnt + ", bookno=" + bookno + ", userno=" + userno
				+ ", cprice=" + cprice + "]";
	}
	

	
}
