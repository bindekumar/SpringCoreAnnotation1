package com.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {

	public static void main(String[] args) {
    ApplicationContext cs=new ClassPathXmlApplicationContext("TestCfg.xml");
   // Test t=cs.getBean("testbean",TestBean.class);
    Test t=(Test) cs.getBean("testBean");
    t.display();
	}

}
