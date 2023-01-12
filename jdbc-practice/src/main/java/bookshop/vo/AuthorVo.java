package bookshop.vo;

public class AuthorVo {
	private String name;
	private Long authorno;

	
	public Long getAuthorNo() {
		return authorno;
	}
	public void setAuthorNo(Long authorno) {
		this.authorno = authorno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "AuthorVo [name=" + name + "]";
	}

}
