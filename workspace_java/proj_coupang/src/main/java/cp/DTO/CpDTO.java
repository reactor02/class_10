package cp.DTO;

import java.sql.Date;

public class CpDTO {
	String id;
	String password;
	String phoneNum;
	String name;
	Date joinDate;
	int rTerm1;
	int rTerm2;
	int rTerm3;
	int rTerm4;
	int oTerm1;
	int oTerm2;
	int oTerm3;
	int oTerm4;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getrTerm1() {
		return rTerm1;
	}
	public void setrTerm1(int rTerm1) {
		this.rTerm1 = rTerm1;
	}
	public int getrTerm2() {
		return rTerm2;
	}
	public void setrTerm2(int rTerm2) {
		this.rTerm2 = rTerm2;
	}
	public int getrTerm3() {
		return rTerm3;
	}
	public void setrTerm3(int rTerm3) {
		this.rTerm3 = rTerm3;
	}
	public int getrTerm4() {
		return rTerm4;
	}
	public void setrTerm4(int rTerm4) {
		this.rTerm4 = rTerm4;
	}
	public int getoTerm1() {
		return oTerm1;
	}
	public void setoTerm1(int oTerm1) {
		this.oTerm1 = oTerm1;
	}
	public int getoTerm2() {
		return oTerm2;
	}
	public void setoTerm2(int oTerm2) {
		this.oTerm2 = oTerm2;
	}
	public int getoTerm3() {
		return oTerm3;
	}
	public void setoTerm3(int oTerm3) {
		this.oTerm3 = oTerm3;
	}
	public int getoTerm4() {
		return oTerm4;
	}
	public void setoTerm4(int oTerm4) {
		this.oTerm4 = oTerm4;
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
	
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	@Override
	public String toString() {
		return "CpDTO [id=" + id + ", password=" + password + ", phoneNum=" + phoneNum + ", name=" + name
				+ ", joinDate=" + joinDate + ", rTerm1=" + rTerm1 + ", rTerm2=" + rTerm2 + ", rTerm3=" + rTerm3
				+ ", rTerm4=" + rTerm4 + ", oTerm1=" + oTerm1 + ", oTerm2=" + oTerm2 + ", oTerm3=" + oTerm3
				+ ", oTerm4=" + oTerm4 + "]";
	}
}
