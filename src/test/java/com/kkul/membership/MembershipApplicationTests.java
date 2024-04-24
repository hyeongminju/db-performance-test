package com.kkul.membership;

import java.time.LocalDateTime;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.reactive.function.BodyInserters;

import com.kkul.membership.model.Membership;

import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class MembershipApplicationTests {
	@Autowired
	private WebTestClient webClient;

	@Test
	@DisplayName("Get All membership")
	@Order(1)
	void existMembership_WhenUserRequestAllMembership_returnMembershipList() {
		webClient.get()
		.uri("/v1/membership")
		.exchange()
		.expectStatus().is2xxSuccessful();
	}
}
