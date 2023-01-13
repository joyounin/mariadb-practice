package bookshop.vo;

public class BookVo {
	private Long authorno;
	private Long no;
	private String title;
	private String rent;
	private String authorname;
	
	public Long getAuthorno() {
		return authorno;
	}
	public void setAuthorno(Long authorno) {
		this.authorno = authorno;
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
	public String getRent() {
		return rent;
	}
	public void setRent(String rent) {
		this.rent = rent;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	@Override
	public String toString() {
		return "BookVo [authorno=" + authorno + ", no=" + no + ", title=" + title + ", rent=" + rent + ", authorname="
				+ authorname + "]";
	}


	
	

}
