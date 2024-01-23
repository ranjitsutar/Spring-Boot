package com.ranjit.SpringCore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//@Component("ob") // for change the name of bean
public class Student {

	@Value("Ranjit")
	private String sNmae;
	@Value("Rourkela")
	private String sAddress;
	@Value("#{frinds}")
	private List<String> friends;
	public String getsNmae() {
		return sNmae;
	}
	public void setsNmae(String sNmae) {
		this.sNmae = sNmae;
	}
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	@Override
	public String toString() {
		return "Student [sNmae=" + sNmae + ", sAddress=" + sAddress + ", friends=" + friends + "]";
	}

}
