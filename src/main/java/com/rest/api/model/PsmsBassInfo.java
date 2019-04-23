package com.rest.api.model;

/**
 * @author SAMUEL
 *
 */
public class PsmsBassInfo {
	
	//건축물대장번호
	String psmsBassInfoPk;
	//건물번호
	String bildngNo;
	//건물명
	String bildngNm;
	//PNU
	String pnu;
	
	public String getPsmsBassInfoPk() {
		return psmsBassInfoPk;
	}
	public void setPsmsBassInfoPk(String psmsBassInfoPk) {
		this.psmsBassInfoPk = psmsBassInfoPk;
	}
	public String getBildngNo() {
		return bildngNo;
	}
	public void setBildngNo(String bildngNo) {
		this.bildngNo = bildngNo;
	}
	public String getBildngNm() {
		return bildngNm;
	}
	public void setBildngNm(String bildngNm) {
		this.bildngNm = bildngNm;
	}
	public String getPnu() {
		return pnu;
	}
	public void setPnu(String pnu) {
		this.pnu = pnu;
	}

}
