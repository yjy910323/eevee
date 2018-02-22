package org.yan.eevee.service;

import org.yan.eevee.model.dto.SessionDO;


public interface SessionService {

	String createSession(String openId, String seesionKey);
	
	void storgeSession(SessionDO session);
	
	SessionDO getSession(String sessionId);

}
