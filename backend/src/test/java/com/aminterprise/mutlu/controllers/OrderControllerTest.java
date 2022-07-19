
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

import com.aminterprise.mutlu.dto.OrderDTO;
import com.aminterprise.mutlu.entities.Order;
import com.aminterprise.mutlu.repositories.OrderRepository;
import com.aminterprise.mutlu.services.OrderService;



@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class OrderControllerTest {
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testFindAllOrders() throws Exception {
		mockMvc
				.perform(MockMvcRequestBuilders.get("/orders"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON));
	}
	
	@Test
	public void testSetConclusedOrder() throws Exception {
		mockMvc
				.perform(MockMvcRequestBuilders.put("/orders/2/conclused"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON));
	}
	
	@Test
	public void testSetPendingOrder() throws Exception {
		mockMvc
				.perform(MockMvcRequestBuilders.put("/orders/2/pending"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON));
	}
}



























