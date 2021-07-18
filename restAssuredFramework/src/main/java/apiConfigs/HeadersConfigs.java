package apiConfigs;

import java.util.HashMap;
import java.util.Map;

public class HeadersConfigs {
	public Map<String, String> defaultHeaders(){
		Map<String, String> defaultHeaders = new HashMap<String, String>();
		defaultHeaders.put("Content-Type", "application/json");
		
		return defaultHeaders;
		
	}
	
//	public static void main(String[] args) {
//		HeadersConfigs hed = new HeadersConfigs();
//		System.out.println(hed.defaultHeaders());
//	}
//	
}
