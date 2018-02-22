package org.yan.eevee.model.dto;

import java.util.Date;
import java.util.UUID;

public class SessionDO {
	
	private final int expired = 1000 * 60 * 60 * 1;
	private final String openId;
	private final String sessionKey;
	private final String sessionId;
	private final Date expireDate;

	public SessionDO(String openId, String seesionKey) {
		this.openId = openId;
		this.sessionKey = seesionKey;
		this.sessionId = UUID.randomUUID().toString();
		this.expireDate = new Date(System.currentTimeMillis() + expired);
	}

	public String getOpenId() {
		return openId;
	}

	public String getSessionKey() {
		return sessionKey;
	}

	public String getSessionId() {
		return sessionId;
	}

	public Date getExpireDate() {
		return expireDate;
	}

}
