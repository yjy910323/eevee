package org.yan.eevee.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.yan.eevee.Constants;
import org.yan.eevee.kit.HttpKit;
import org.yan.eevee.model.dto.CodeToSessionDTO;

import com.alibaba.fastjson.JSON;

@Service
public class WxServiceImpl implements WxService {
	private static final String CODE_TO_SESSION = "https://api.weixin.qq.com/sns/jscode2session";

	public CodeToSessionDTO codeToSession(String code) {

		// https://api.weixin.qq.com/sns/jscode2session?appid=APPID&secret=SECRET&js_code=JSCODE&grant_type=authorization_code

		Map<String, String> params = new HashMap<String, String>(4);
		params.put("appid", Constants.APP_ID);
		params.put("secret", Constants.APP_SECRET);
		params.put("js_code", code);
		params.put("grant_type", "authorization_code");

		String resp = HttpKit.get(CODE_TO_SESSION, params);
		CodeToSessionDTO codeToSessionResp = JSON.parseObject(resp, CodeToSessionDTO.class);
		return codeToSessionResp;
	}

}
