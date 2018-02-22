package org.yan.eevee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.yan.eevee.model.dto.CodeToSessionDTO;
import org.yan.eevee.model.dto.LoginDTO;
import org.yan.eevee.service.SessionService;
import org.yan.eevee.service.WxService;

@RestController
@RequestMapping("/api/wx")
public class WxController {

	@Autowired
	WxService wxService;

	@Autowired
	SessionService sessionService;

	@RequestMapping("/login")
	@ResponseBody
	public LoginDTO login(@RequestHeader("x-wechat-code") String code) {
		LoginDTO loginDTO;
		try {
			CodeToSessionDTO s = wxService.codeToSession(code);
			String sessionId = sessionService.createSession(s.getOpenId(), s.getSessionKey());
			loginDTO = new LoginDTO(sessionId);
		} catch (Exception e) {
			e.printStackTrace();
			loginDTO = LoginDTO.ERROR;
		}
		return loginDTO;
	}
}
