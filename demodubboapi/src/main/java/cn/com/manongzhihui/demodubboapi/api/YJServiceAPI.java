package cn.com.manongzhihui.demodubboapi.api;

import java.util.List;
import java.util.Map;

import com.alibaba.dubbo.common.serialize.support.kryo.RestRequest;
import com.alibaba.dubbo.common.serialize.support.kryo.RestResponse;

/**
 * 对外提供的dubbo接口
 * @author Administrator
 *
 */
public interface YJServiceAPI {
	public String demoService(String param);
	
	public String demoService(ApiServiceBean bean) ;
	
	public List<String> demoService2(String str,Map<String,String> param);
	  
	public RestResponse<String> demoService3(String str,RestRequest<ApiServiceBean> param);
	
	public RestResponse<List<String>> demoServiceBean(RestRequest<ApiServiceBean> param1,List<ApiServiceBean> param2);
}
