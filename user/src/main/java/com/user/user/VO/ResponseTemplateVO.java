package com.user.user.VO;

import com.user.user.Entity.userDetails;

public class ResponseTemplateVO {

	
	private userDetails ud;
	private DeptEntity de;
	public ResponseTemplateVO(userDetails ud, DeptEntity de) {
		super();
		this.ud = ud;
		this.de = de;
	}
	
	public ResponseTemplateVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public userDetails getUd() {
		return ud;
	}
	public void setUd(userDetails ud) {
		this.ud = ud;
	}
	public DeptEntity getDe() {
		return de;
	}
	public void setDe(DeptEntity de) {
		this.de = de;
	}
}
