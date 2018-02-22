package org.yan.eevee.model.dto;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;

public class CodeToSessionDTO {

	@JSONField(name = "openid")
	private String openId;
	@JSONField(name = "session_key")
	private String sessionKey;
	@JSONField(name = "unionid")
	private String unionId;
	@JSONField(name = "errcode")
	private Integer errCode;
	@JSONField(name = "errmsg")
	private String errMsg;
	
	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSessionKey() {
		return sessionKey;
	}

	public void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
	}

	public String getUnionId() {
		return unionId;
	}

	public void setUnionId(String unionId) {
		this.unionId = unionId;
	}

	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}
}
