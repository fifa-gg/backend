package gg.fifa.backend.controller

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content

@SpringBootTest
@AutoConfigureMockMvc
class BackendApplicationTests {

	@Autowired
	private lateinit var mockMvc: MockMvc

	@Test
	fun `test getPlayersInfoByPosition`() {
		mockMvc.perform(get("/api/playersInfoByPosition/1"))
			.andExpect(status().isOk)
			.andExpect { content().string("Success for 1") }
	}

	@Test
	fun `test getPlayerDetailInfo`() {
		mockMvc.perform(get("/api/playerDetailInfo/11"))
			.andExpect(status().isOk)
			.andExpect { content().string("Success for 11") }
	}

}
