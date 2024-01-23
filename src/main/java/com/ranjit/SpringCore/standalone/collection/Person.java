package com.ranjit.SpringCore.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	
	private List<String> friends;
	private Map<String, Integer> feeStracture;
	private Properties properties;
	

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, Integer> getFeeStracture() {
		return feeStracture;
	}

	public void setFeeStracture(Map<String, Integer> feeStracture) {
		this.feeStracture = feeStracture;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feeStracture=" + feeStracture + ", properties=" + properties + "]";
	}

	

}
