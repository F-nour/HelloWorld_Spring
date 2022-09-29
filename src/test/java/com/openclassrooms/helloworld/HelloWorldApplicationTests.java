package com.openclassrooms.helloworld;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.openclassrooms.helloworld.model.HelloWorld;
import com.openclassrooms.helloworld.service.BusinessService;

@SpringBootTest
class HelloWorldApplicationTests {
    
    @Autowired
    private BusinessService bs;

	@Test
	void contextLoads() {
	}
	
	@Test
	void testGetHelloWorld() {
	    String expected = "Hello World!";
	    
	    String result = bs.getHelloWorld().getValue();
	    
 	    Assertions.assertEquals(expected, result);
    }

}
