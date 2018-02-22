package org.yan.eevee.model.dto;

public class LoginDTO {
	public static final LoginDTO ERROR = new LoginDTO();
	
	private String sessionId;
	private Integer errCode;
	
	public LoginDTO(String sessionId) {
		this.sessionId = sessionId;
		this.setErrCode(0);
	}
	
	public LoginDTO() {
		this.sessionId = "";
		this.setErrCode(1);
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public Integer getErrCode() {
		return errCode;
	}

	public void setErrCode(Integer errCode) {
		this.errCode = errCode;
	}
}
