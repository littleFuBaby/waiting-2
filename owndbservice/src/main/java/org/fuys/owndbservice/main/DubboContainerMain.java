package org.fuys.owndbservice.main;

import java.io.IOException;

import com.alibaba.dubbo.container.Main;

public class DubboContainerMain {

	public static void main(String[] args) throws IOException {
		Main.main(args);
		//com.alibaba.dubbo.container.Main
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//				new String[] { "META-INF/config/spring-dubbo.xml", "META-INF/config/spring-common.xml" });
//		context.start();
//		// press any key to exit
//        System.in.read();
	}

}
