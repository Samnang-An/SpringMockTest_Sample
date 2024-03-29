package com.lab9.oddeven;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.verifier.messaging.boot.AutoConfigureMessageVerifier;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@DirtiesContext
@AutoConfigureMessageVerifier
class OddEvenApplicationTests {
	@Autowired
	private EvenOddController evenOddController;
	@BeforeEach
	public void setup() {
		StandaloneMockMvcBuilder standaloneMockMvcBuilder =
				MockMvcBuilders.standaloneSetup(evenOddController);
		RestAssuredMockMvc.standaloneSetup(standaloneMockMvcBuilder);
	}

}
