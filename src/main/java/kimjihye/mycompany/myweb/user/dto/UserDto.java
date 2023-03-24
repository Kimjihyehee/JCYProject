package kimjihye.mycompany.myweb.user.dto;

import java.util.Date;

public class UserDto {
	
	private int idx;  
	private String id, password, email, name, role, phone_num, address;
	private Date create_date;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPhone_num() {
		return phone_num;
	}
	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	
	
	@Override
	public String toString() {
		return "UserDto [idx=" + idx + ", id=" + id + ", password=" + password + ", email=" + email + ", name=" + name
				+ ", role=" + role + ", phone_num=" + phone_num + ", address=" + address + ", create_date="
				+ create_date + "]";
	}
	
	
	
}


