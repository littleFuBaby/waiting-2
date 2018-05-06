package org.fuys.owndbservice.provider;

import org.fuys.owndbapi.service.SampleService;
import org.springframework.stereotype.Component;

@Component("sampleService")
public class SampleServiceImpl implements SampleService{

	@Override
	public String sayHello(String name) {
		return "Hello " + name;
	}

}
