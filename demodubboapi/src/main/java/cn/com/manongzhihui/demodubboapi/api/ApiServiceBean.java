package cn.com.manongzhihui.demodubboapi.api;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import com.alibaba.dubbo.common.json.JSON;

public class ApiServiceBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2848355587580169757L;

	String id;
	
	List<String> list;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
	
	
	public static void main(String[] args) throws Exception{
		ApiServiceBean bean = new ApiServiceBean();
		bean.id = "123";
		bean.list = Arrays.asList("a","b","c");
		System.out.println(JSON.json(bean));
	}
}
