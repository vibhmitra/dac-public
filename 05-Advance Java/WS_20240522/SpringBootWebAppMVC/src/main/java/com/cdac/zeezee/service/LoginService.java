package com.cdac.zeezee.service;

import org.springframework.stereotype.Service;

import com.cdac.zeezee.bean.LoginBean;

@Service
public class LoginService {
	public boolean validate(LoginBean bean) {
		return bean.getUserName().equalsIgnoreCase(bean.getUserPassword());
	}
}