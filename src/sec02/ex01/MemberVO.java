package sec02.ex01;

import java.sql.Date;

public class MemberVO {
	private String MNO;
	private String MNAME;
	private String EMAIL;
	private String CRE_DATE;

	
	public MemberVO() {
		System.out.println("MemberVO 생성자 호출");
	}


	public String getMNO() {
		return MNO;
	}


	public void setMNO(String mNO) {
		MNO = mNO;
	}


	public String getMNAME() {
		return MNAME;
	}


	public void setMNAME(String mNAME) {
		MNAME = mNAME;
	}


	public String getEMAIL() {
		return EMAIL;
	}


	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}


	public String getCRE_DATE() {
		return CRE_DATE;
	}


	public void setCRE_DATE(String cRE_DATE) {
		CRE_DATE = cRE_DATE;
	}

	

	
}
