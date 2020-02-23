package com.liuhuan.math.service.impl;

import com.liuhuan.math.service.CalulateService;

public class CalulateServiceImpl implements CalulateService{

	/**
	 * 实现加法
	 * @param a
	 * @param b
	 * @return
	 */
	@Override
	public int add(int a, int b) {
		return a+b;
	}

	/**
	 * 实现乘法
	 * @param a
	 * @param b
	 * @return
	 */
	@Override
	public int multiply(int a, int b) {
		return a*b;
	}

}
