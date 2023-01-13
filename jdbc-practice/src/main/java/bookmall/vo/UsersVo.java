package bookmall.vo;

public class UsersVo {
	private Long no;
	private String name;
	private String phone_number;
	private String email;
	private String pwd;
	
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "UsersVo [no=" + no + ", name=" + name + ", phone_number=" + phone_number + ", email=" + email + ", pwd="
				+ pwd + "]";
	}

	
	
	
}
