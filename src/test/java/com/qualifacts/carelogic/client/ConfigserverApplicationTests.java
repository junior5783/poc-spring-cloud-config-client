package com.qualifacts.carelogic.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.qualifacts.carelogic.client.ConfigclientApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ConfigclientApplication.class)
@WebAppConfiguration
public class ConfigserverApplicationTests {

	@Test
	public void contextLoads() {
	}

}
