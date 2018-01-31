package org.fuys.ownservice;

import com.alibaba.dubbo.container.Main;

public class DubboStart {

	public static void main(String[] args) {
		// start dubbo service
		// method 1
		Main.main(args);
		// method 2
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                new String[] {"META-INF/spring/spring-dubbo.xml","META-INF/spring/spring-common.xml"});
//        context.start();
//        context.close();
	}

}
