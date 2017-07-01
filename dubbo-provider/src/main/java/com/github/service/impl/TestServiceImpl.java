package com.github.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.github.api.service.TestService;

public class TestServiceImpl implements TestService {

	public String queryUserInfo(String userId) {
		Map map = new HashMap();
		if("admin".equals(userId)){
			map.put("userName", "管理员");
			map.put("sex", "男");
			map.put("flag", true);
		}else if("superadmin".equals(userId)){
			map.put("userName", "超级管理员");
			map.put("sex", "女");
			map.put("flag", true);
		}else {
			map.put("flag", false);
			map.put("msg", "查无此用户");
		}
		return map.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(new TestServiceImpl().queryUserInfo("admin"));
	}

}
