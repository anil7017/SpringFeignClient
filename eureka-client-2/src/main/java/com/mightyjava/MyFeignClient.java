package com.mightyjava;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eurekaclient-3" ,url = "http://localhost:8003/")
public interface MyFeignClient {

	@GetMapping
	public String client3response(); 
	
}
