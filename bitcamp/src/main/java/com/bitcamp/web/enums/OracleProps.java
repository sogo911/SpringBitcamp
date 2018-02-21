package com.bitcamp.web.enums;

public enum OracleProps {
	ORACLE_DRIVER("oracle.jdbc.driver.OracleDriver"),
	ORACLE_CONNECTION_URL("jdbc:oracle:thin:@localhost:1521:xe"),
	ORACLE_USERNAME("bitcamp"),
	ORACLE_PASSWORD("bitcamp");
	
	public final String value;
	
	private OracleProps(String value) {
		this.value = value;
		System.out.println("벨류 : " +value);
	}
	public String getValue() {
		return value;
	}
}
