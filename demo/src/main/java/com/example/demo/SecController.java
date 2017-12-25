package com.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author DELL
 * 实现一个定时器的类
 */
@Component
public class SecController {
	 private final Logger logger = LoggerFactory.getLogger(this.getClass());
	 private static int num=0;
	 @Scheduled(fixedRate=1000)  
	 public void testit1() {
		 num++;
		 logger.info("执行的代码:"+num);
	 }
}
