package com.example.demo.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="TELUSKOAPP1")
public interface TeluskoFeignClient {

	@GetMapping("/info")
	public String invokeGetCourseInfo();
}
