package com.example.demo.control;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("test1")
	public void test1(int num) {
		String str = "";
		long begin = System.currentTimeMillis();
		Random random = new Random();
		for (int i = 0; i < num; i++) {
			str += random.nextInt();
		}
		long end = System.currentTimeMillis();
		System.err.println("总共耗时" + (end - begin) + "ms");
		System.err.println(str.length());
	}


}