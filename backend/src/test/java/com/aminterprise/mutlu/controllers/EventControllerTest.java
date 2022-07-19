
package com.aminterprise.mutlu.controllers;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;



@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class EventControllerTest {
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testFindAllEvents() throws Exception {
		mockMvc
				.perform(MockMvcRequestBuilders.get("/events/all"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON));
	}
	
	@Test
	public void testSetConclusedEvent() throws Exception {
		mockMvc
				.perform(MockMvcRequestBuilders.put("/events/1/conclused"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON));
	}
	
	@Test
	public void testSetPendingEvent() throws Exception {
		mockMvc
				.perform(MockMvcRequestBuilders.put("/events/1/pending"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON));
	}
}



























