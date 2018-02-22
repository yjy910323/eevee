package org.yan.eevee.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.yan.eevee.model.dto.SessionDO;

@Service
public class SessionSerivceImpl implements SessionService {
	Map<String, SessionDO> sessions = new HashMap<String, SessionDO>();

	@Override
	public String createSession(String openId, String seesionKey) {
		SessionDO session = new SessionDO(openId, seesionKey);
		storgeSession(session);
		return session.getSessionId();
	}

	@Override
	public void storgeSession(SessionDO session) {
		sessions.put(session.getSessionId(), session);
	}

	@Override
	public SessionDO getSession(String sessionId) {
		return sessions.get(sessionId);
	}

}
