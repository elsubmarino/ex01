package org.zerock.controller;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class test {
	@Inject
	private WebApplicationContext wac;
	private MockMvc mvc;
	
	@Before
	public void setup(){
		this.mvc=MockMvcBuilders.webAppContextSetup(this.wac).build();
	}
	
	@Test
	public test(){
		mvc.perform(MockMvcRequestBuilders.get("/mac"));
	}
}
