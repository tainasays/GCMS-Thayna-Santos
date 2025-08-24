package com.example.WebApp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class WebAppApplicationTests {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void shouldReturnDefaultMessage() throws Exception {
		this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("Hello, World!")));
	}
	
	@Test
	public void shouldReturnDefaultMessage2() throws Exception {
		this.mockMvc.perform(get("/thayna")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("Hello, Thayna!")));
	}
	
	@Test
	public void shouldReturnDefaultMessage3() throws Exception {
		this.mockMvc.perform(get("/user")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("Hello, User!")));
	}
	
	@Test
	public void shouldReturnDefaultHotfix() throws Exception {
		this.mockMvc.perform(get("/hotfix")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("Hotfix")));
	}
	
}
