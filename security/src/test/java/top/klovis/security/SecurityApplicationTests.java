package top.klovis.security;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import top.klovis.security.controller.IndexController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SecurityApplicationTests {
    MockMvc mvc;

    @Before
    public void setUp() {
        mvc = MockMvcBuilders.standaloneSetup(new IndexController()).build();
    }

	@Test
	public void contextLoads() {
	}

	@Test
	public void getHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hello2").accept(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.content().string(Matchers.equalTo("Hello World")));
    }

}
