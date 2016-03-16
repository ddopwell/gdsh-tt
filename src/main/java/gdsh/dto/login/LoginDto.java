package gdsh.dto.login;

public class LoginDto {

	
	private String username;
	private String fisrtname;
	private String lastname;
	private String email;
	private String password;
	
	
	@Override
	public String toString() {
		return "LoginDto [username=" + username + ", fisrtname=" + fisrtname + ", lastname=" + lastname + ", email="
				+ email + ", password=" + password + "]";
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFisrtname() {
		return fisrtname;
	}
	public void setFisrtname(String fisrtname) {
		this.fisrtname = fisrtname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
