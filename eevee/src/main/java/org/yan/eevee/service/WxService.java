package org.yan.eevee.service;

import org.yan.eevee.model.dto.CodeToSessionDTO;

public interface WxService {

	public CodeToSessionDTO codeToSession(String code);
}
