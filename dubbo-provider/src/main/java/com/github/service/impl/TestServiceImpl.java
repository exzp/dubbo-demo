package com.github.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.github.api.service.TestService;

public class TestServiceImpl implements TestService {

	public String queryUserInfo(String userId) {
		Map map = new HashMap();
		if("admin".equals(userId)){
			map.put("userName", "����Ա");
			map.put("sex", "��");
			map.put("flag", true);
		}else if("superadmin".equals(userId)){
			map.put("userName", "��������Ա");
			map.put("sex", "Ů");
			map.put("flag", true);
		}else {
			map.put("flag", false);
			map.put("msg", "���޴��û�");
		}
		return map.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(new TestServiceImpl().queryUserInfo("admin"));
	}

}
