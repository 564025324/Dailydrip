package com.Dailydrip.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * @author ECClijw3
 * @Description 自定义相应数据结构
 * 
 */
public class LeeJsonResult {
	/**
	 * 200:表示成功 500:表示错误，返回信息更新msg 501:bean验证错误，不管多少错误都以map形式返回 502:拦截器拦截用户token错误
	 * 555:异常抛出信息
	 */
//	定义jackson对象
	private static final ObjectMapper MAPPER = new ObjectMapper();
//	响应业务状态
	private int status;
//	响应消息
	private String msg;
//	响应中数据
	private Object data;

	public LeeJsonResult(Integer status, String msg, Object data) {
		this.status = status;
		this.msg = msg;
		this.data = data;
	}

	public LeeJsonResult(Object data) {
		this.status = 200;
		this.msg = "OK";
		this.data = data;
	}

	public static LeeJsonResult ok(Object data) {
		return new LeeJsonResult(data);
	}

	public static LeeJsonResult build(Integer status, String msg, Object data) {
		return new LeeJsonResult(status, msg, data);
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
